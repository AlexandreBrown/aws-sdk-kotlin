// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DeleteVpnConnectionRouteRequest
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


internal class DeleteVpnConnectionRouteOperationSerializer: HttpSerialize<DeleteVpnConnectionRouteRequest> {
    override suspend fun serialize(context: ExecutionContext, input: DeleteVpnConnectionRouteRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeDeleteVpnConnectionRouteOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeDeleteVpnConnectionRouteOperationBody(context: ExecutionContext, input: DeleteVpnConnectionRouteRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DESTINATIONCIDRBLOCK_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("DestinationCidrBlock"))
    val VPNCONNECTIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("VpnConnectionId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("DeleteVpnConnectionRouteRequest"))
        trait(QueryLiteral("Action", "DeleteVpnConnectionRoute"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DESTINATIONCIDRBLOCK_DESCRIPTOR)
        field(VPNCONNECTIONID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.destinationCidrBlock?.let { field(DESTINATIONCIDRBLOCK_DESCRIPTOR, it) }
        input.vpnConnectionId?.let { field(VPNCONNECTIONID_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}