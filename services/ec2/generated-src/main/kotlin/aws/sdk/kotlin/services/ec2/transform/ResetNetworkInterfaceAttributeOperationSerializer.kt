// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ResetNetworkInterfaceAttributeRequest
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
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer
import aws.smithy.kotlin.runtime.serde.formurl.QueryLiteral
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class ResetNetworkInterfaceAttributeOperationSerializer: HttpSerialize<ResetNetworkInterfaceAttributeRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ResetNetworkInterfaceAttributeRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeResetNetworkInterfaceAttributeOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeResetNetworkInterfaceAttributeOperationBody(context: ExecutionContext, input: ResetNetworkInterfaceAttributeRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val NETWORKINTERFACEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("NetworkInterfaceId"))
    val SOURCEDESTCHECK_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("SourceDestCheck"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ResetNetworkInterfaceAttributeRequest"))
        trait(QueryLiteral("Action", "ResetNetworkInterfaceAttribute"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DRYRUN_DESCRIPTOR)
        field(NETWORKINTERFACEID_DESCRIPTOR)
        field(SOURCEDESTCHECK_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.networkInterfaceId?.let { field(NETWORKINTERFACEID_DESCRIPTOR, it) }
        input.sourceDestCheck?.let { field(SOURCEDESTCHECK_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
