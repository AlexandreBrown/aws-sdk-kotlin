// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3

import aws.sdk.kotlin.runtime.auth.credentials.Credentials
import aws.sdk.kotlin.runtime.auth.credentials.StaticCredentialsProvider
import aws.sdk.kotlin.runtime.endpoint.AwsEndpoint
import aws.sdk.kotlin.runtime.endpoint.AwsEndpointResolver
import aws.sdk.kotlin.services.s3.model.*
import aws.smithy.kotlin.runtime.config.IdempotencyTokenProvider
import aws.smithy.kotlin.runtime.content.ByteArrayContent
import aws.smithy.kotlin.runtime.content.ByteStream
import aws.smithy.kotlin.runtime.content.StringContent
import aws.smithy.kotlin.runtime.content.toByteArray
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.smithy.test.*
import kotlin.test.Test


class PutObjectRequestTest {
    /**
     * This test case validates default content-type behavior when not specified in the request
     */
    @Test
    fun `PutObjectDefaultContentType`() = httpRequestTest {
        expected {
            method = HttpMethod.PUT
            uri = "/mybucket/mykey"
            headers = mapOf(
                "Content-Type" to "application/octet-stream"
            )
            bodyMediaType = "application/octet-stream"
            body = """foobar"""
            bodyAssert = ::assertBytesEqual

        }

        operation { mockEngine ->

            val input = PutObjectRequest {
                    bucket = "mybucket"
                    key = "mykey"
                    body = StringContent("foobar")
                }

            val service = S3Client {
                httpClientEngine = mockEngine
                val credentials = Credentials("AKID", "SECRET")
                credentialsProvider = StaticCredentialsProvider(credentials)
                region = "us-east-1"
                endpointResolver = AwsEndpointResolver { _, _ -> AwsEndpoint("https://s3.us-west-2.amazonaws.com") }
            }
            service.putObject(input)
        }
    }
    /**
     * This test case validates https://github.com/awslabs/aws-sdk-kotlin/issues/193
     */
    @Test
    fun `PutObjectExplicitContentType`() = httpRequestTest {
        expected {
            method = HttpMethod.PUT
            uri = "/mybucket/mykey"
            headers = mapOf(
                "Content-Type" to "application/json"
            )
            body = """{"foo":"bar"}"""
            bodyAssert = ::assertBytesEqual

        }

        operation { mockEngine ->

            val input = PutObjectRequest {
                    bucket = "mybucket"
                    key = "mykey"
                    contentType = "application/json"
                    body = StringContent("{\"foo\":\"bar\"}")
                }

            val service = S3Client {
                httpClientEngine = mockEngine
                val credentials = Credentials("AKID", "SECRET")
                credentialsProvider = StaticCredentialsProvider(credentials)
                region = "us-east-1"
                endpointResolver = AwsEndpointResolver { _, _ -> AwsEndpoint("https://s3.us-west-2.amazonaws.com") }
            }
            service.putObject(input)
        }
    }
}