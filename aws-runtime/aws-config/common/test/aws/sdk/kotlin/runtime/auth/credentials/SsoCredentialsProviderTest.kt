/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0.
 */

package aws.sdk.kotlin.runtime.auth.credentials

import aws.sdk.kotlin.runtime.testing.TestPlatformProvider
import aws.sdk.kotlin.runtime.testing.runSuspendTest
import aws.smithy.kotlin.runtime.http.Headers
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpStatusCode
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.response.HttpResponse
import aws.smithy.kotlin.runtime.httptest.TestConnection
import aws.smithy.kotlin.runtime.httptest.buildTestConnection
import aws.smithy.kotlin.runtime.time.Instant
import aws.smithy.kotlin.runtime.time.ManualClock
import io.kotest.matchers.string.shouldContain
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class SsoCredentialsProviderTest {

    @Test
    fun testCacheFilename() {
        val expected = "13f9d35043871d073ab260e020f0ffde092cb14b.json"
        val actual = getCacheFilename("https://d-92671207e4.awsapps.com/start")
        assertEquals(expected, actual)
    }

    @Test
    fun testDeserializeToken() {
        val ts = Instant.fromIso8601("2020-10-16T03:56:45Z")

        val t1 = """
        {
            "accessToken": "a-token",
            "expiresAt": "2020-10-16T03:56:45Z"
        }
        """.encodeToByteArray()
        assertEquals(SsoToken("a-token", ts), deserializeSsoToken(t1))

        val t2 = """
        {
            "accessToken": "a-token",
            "expiresAt": "2020-10-16T03:56:45Z",
            "region": "us-west-2",
            "startUrl": "https://start-url"
        }
        """.encodeToByteArray()
        assertEquals(
            SsoToken("a-token", ts, "us-west-2", "https://start-url"),
            deserializeSsoToken(t2)
        )

        val t3 = """
        {
            "expiresAt": "2020-10-16T03:56:45Z"
        }
        """.encodeToByteArray()
        assertFailsWith<InvalidSsoTokenException> {
            deserializeSsoToken(t3)
        }.message.shouldContain("missing `accessToken`")

        val t4 = """
        {
            "accessToken": "a-token"
        }
        """.encodeToByteArray()
        assertFailsWith<InvalidSsoTokenException> {
            deserializeSsoToken(t4)
        }.message.shouldContain("missing `expiresAt`")
    }

    @Test
    fun testExpiredToken(): Unit = runSuspendTest {
        val engine = TestConnection()

        val epoch = "2020-10-16T03:56:00Z"
        val testClock = ManualClock(epoch = Instant.fromIso8601(epoch))
        val contents = """
        {
            "accessToken": "a-token",
            "expiresAt": "2020-10-16T03:51:00Z"
        }
        """

        val key = getCacheFilename("https://expired-token")

        val testPlatform = TestPlatformProvider(
            env = mapOf("HOME" to "/home"),
            fs = mapOf("/home/.aws/sso/cache/$key" to contents)
        )

        val provider = SsoCredentialsProvider(
            accountId = "123456789",
            roleName = "TestRole",
            startUrl = "https://expired-token",
            ssoRegion = "us-east-2",
            httpClientEngine = engine,
            platformProvider = testPlatform,
            clock = testClock
        )

        assertFailsWith<ProviderConfigurationException> {
            provider.getCredentials()
        }.message.shouldContain("The SSO session has expired")
    }

    @Test
    fun testErrorResponse(): Unit = runSuspendTest {
        val engine = buildTestConnection {
            expect(
                HttpResponse(HttpStatusCode.Unauthorized, Headers.Empty, HttpBody.Empty)
            )
        }

        val epoch = "2020-10-16T03:56:00Z"
        val testClock = ManualClock(epoch = Instant.fromIso8601(epoch))
        val contents = """
        {
            "accessToken": "a-token",
            "expiresAt": "2020-10-16T05:20:00Z",
            "startUrl": "https://error-response"
        }
        """

        val key = getCacheFilename("https://error-response")

        val testPlatform = TestPlatformProvider(
            env = mapOf("HOME" to "/home"),
            fs = mapOf("/home/.aws/sso/cache/$key" to contents)
        )

        val provider = SsoCredentialsProvider(
            accountId = "123456789",
            roleName = "TestRole",
            startUrl = "https://error-response",
            ssoRegion = "us-east-2",
            httpClientEngine = engine,
            platformProvider = testPlatform,
            clock = testClock
        )

        assertFailsWith<CredentialsNotLoadedException> {
            provider.getCredentials()
        }.message.shouldContain("GetRoleCredentials operation failed")
    }

    @Test
    fun testSuccess(): Unit = runSuspendTest {
        val expectedExpiration = Instant.fromIso8601("2020-10-16T04:30:00Z")

        // https://docs.aws.amazon.com/singlesignon/latest/PortalAPIReference/API_GetRoleCredentials.html#API_GetRoleCredentials_ResponseSyntax
        val serviceResp = """
        {
           "roleCredentials": { 
              "accessKeyId": "AKID",
              "secretAccessKey": "secret",
              "sessionToken": "session-token",
              "expiration": ${expectedExpiration.epochSeconds}
           }
        } 
        """

        val engine = buildTestConnection {
            expect(
                HttpResponse(HttpStatusCode.OK, Headers.Empty, ByteArrayContent(serviceResp.encodeToByteArray()))
            )
        }

        val epoch = "2020-10-16T03:56:00Z"
        val testClock = ManualClock(epoch = Instant.fromIso8601(epoch))

        val contents = """
        {
            "accessToken": "a-token",
            "expiresAt": "2020-10-16T05:20:00Z",
            "startUrl": "https://success-response"
        }
        """

        val key = getCacheFilename("https://success-response")

        val testPlatform = TestPlatformProvider(
            env = mapOf("HOME" to "/home"),
            fs = mapOf("/home/.aws/sso/cache/$key" to contents)
        )

        val provider = SsoCredentialsProvider(
            accountId = "123456789",
            roleName = "TestRole",
            startUrl = "https://success-response",
            ssoRegion = "us-east-2",
            httpClientEngine = engine,
            platformProvider = testPlatform,
            clock = testClock
        )

        val actual = provider.getCredentials()
        val expected = Credentials("AKID", "secret", "session-token", expectedExpiration, "SSO")
        assertEquals(expected, actual)
    }
}
