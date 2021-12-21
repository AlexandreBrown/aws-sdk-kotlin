// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.BatchExecuteStatementRequest
import aws.sdk.kotlin.services.dynamodb.model.BatchStatementRequest
import aws.sdk.kotlin.services.dynamodb.model.ReturnConsumedCapacity
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.operation.HttpSerialize
import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilder
import aws.smithy.kotlin.runtime.http.request.url
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.json.JsonDeserializer
import aws.smithy.kotlin.runtime.serde.json.JsonSerialName
import aws.smithy.kotlin.runtime.serde.json.JsonSerializer
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class BatchExecuteStatementOperationSerializer: HttpSerialize<BatchExecuteStatementRequest> {
    override suspend fun serialize(context: ExecutionContext, input: BatchExecuteStatementRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeBatchExecuteStatementOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-amz-json-1.0")
        return builder
    }
}

private fun serializeBatchExecuteStatementOperationBody(context: ExecutionContext, input: BatchExecuteStatementRequest): ByteArray {
    val serializer = JsonSerializer()
    val RETURNCONSUMEDCAPACITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ReturnConsumedCapacity"))
    val STATEMENTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("Statements"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(RETURNCONSUMEDCAPACITY_DESCRIPTOR)
        field(STATEMENTS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.returnConsumedCapacity?.let { field(RETURNCONSUMEDCAPACITY_DESCRIPTOR, it.value) }
        if (input.statements != null) {
            listField(STATEMENTS_DESCRIPTOR) {
                for (el0 in input.statements) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeBatchStatementRequestDocument))
                }
            }
        }
    }
    return serializer.toByteArray()
}