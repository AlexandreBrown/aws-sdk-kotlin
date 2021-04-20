/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0.
 */
package aws.sdk.kotlin.runtime.protocol.xml

import aws.sdk.kotlin.runtime.testing.runSuspendTest
import software.aws.clientrt.client.ExecutionContext
import software.aws.clientrt.serde.DeserializationException
import software.aws.clientrt.serde.SerdeAttributes
import software.aws.clientrt.serde.xml.XmlSerdeProvider
import kotlin.test.*

class RestXmlErrorDeserializerTest {

    @Test
    fun `it deserializes aws restXml errors`() = runSuspendTest {
        val tests = listOf(
            """
                <ErrorResponse>
                    <Error>
                        <Type>Sender</Type>
                        <Code>InvalidGreeting</Code>
                        <Message>Hi</Message>
                        <AnotherSetting>setting</AnotherSetting>
                    </Error>
                    <RequestId>foo-id</RequestId>
                </ErrorResponse>
            """.trimIndent().encodeToByteArray(),
            """
                <Error>
                    <Type>Sender</Type>
                    <Code>InvalidGreeting</Code>
                    <Message>Hi</Message>
                    <AnotherSetting>setting</AnotherSetting>
                    <RequestId>foo-id</RequestId>
                </Error>
            """.trimIndent().encodeToByteArray()
        )

        val executionContext = ExecutionContext.build { attributes[SerdeAttributes.SerdeProvider] = XmlSerdeProvider() }

        for (payload in tests) {
            val actual = executionContext.parseErrorResponse(payload)
            assertEquals("InvalidGreeting", actual.code)
            assertEquals("Hi", actual.message)
            assertEquals("foo-id", actual.requestId)
        }
    }

    @Test
    fun `it fails to deserialize invalid aws restXml errors`() = runSuspendTest {
        val tests = listOf(
            """
                <SomeRandomThing>
                    <Error>
                        <Type>Sender</Type>
                        <Code>InvalidGreeting</Code>
                        <Message>Hi</Message>
                        <AnotherSetting>setting</AnotherSetting>
                    </Error>
                    <RequestId>foo-id</RequestId>
                </SomeRandomThing>
            """.trimIndent().encodeToByteArray(),
            """
                <SomeRandomThing>
                    <Type>Sender</Type>
                    <Code>InvalidGreeting</Code>
                    <Message>Hi</Message>
                    <AnotherSetting>setting</AnotherSetting>
                    <RequestId>foo-id</RequestId>
                </SomeRandomThing>
            """.trimIndent().encodeToByteArray()
        )

        val executionContext = ExecutionContext.build { attributes[SerdeAttributes.SerdeProvider] = XmlSerdeProvider() }

        for (payload in tests) {
            assertFailsWith<DeserializationException>() {
                executionContext.parseErrorResponse(payload)
            }
        }
    }

    @Test
    fun `it partially deserializes aws restXml errors`() = runSuspendTest {
        val tests = listOf(
            """
                <ErrorResponse>
                    <SomeRandomThing>
                        <Type>Sender</Type>
                        <Code>InvalidGreeting</Code>
                        <Message>Hi</Message>
                        <AnotherSetting>setting</AnotherSetting>
                    </SomeRandomThing>
                    <RequestId>foo-id</RequestId>
                </ErrorResponse>
            """.trimIndent().encodeToByteArray()
        )

        val executionContext = ExecutionContext.build { attributes[SerdeAttributes.SerdeProvider] = XmlSerdeProvider() }

        for (payload in tests) {
            val error = executionContext.parseErrorResponse(payload)
            assertEquals("foo-id", error.requestId)
            assertNull(error.code)
            assertNull(error.message)
        }
    }
}
