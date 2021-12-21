// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.ListExportsRequest
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


internal class ListExportsOperationSerializer: HttpSerialize<ListExportsRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ListExportsRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeListExportsOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-amz-json-1.0")
        return builder
    }
}

private fun serializeListExportsOperationBody(context: ExecutionContext, input: ListExportsRequest): ByteArray {
    val serializer = JsonSerializer()
    val MAXRESULTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, JsonSerialName("MaxResults"))
    val NEXTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("NextToken"))
    val TABLEARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TableArn"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(MAXRESULTS_DESCRIPTOR)
        field(NEXTTOKEN_DESCRIPTOR)
        field(TABLEARN_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.maxResults?.let { field(MAXRESULTS_DESCRIPTOR, it) }
        input.nextToken?.let { field(NEXTTOKEN_DESCRIPTOR, it) }
        input.tableArn?.let { field(TABLEARN_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}