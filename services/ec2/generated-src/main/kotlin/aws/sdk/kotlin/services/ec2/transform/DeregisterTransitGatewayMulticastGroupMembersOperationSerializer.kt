// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DeregisterTransitGatewayMulticastGroupMembersRequest
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
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlFlattened
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer
import aws.smithy.kotlin.runtime.serde.formurl.QueryLiteral
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class DeregisterTransitGatewayMulticastGroupMembersOperationSerializer: HttpSerialize<DeregisterTransitGatewayMulticastGroupMembersRequest> {
    override suspend fun serialize(context: ExecutionContext, input: DeregisterTransitGatewayMulticastGroupMembersRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeDeregisterTransitGatewayMulticastGroupMembersOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeDeregisterTransitGatewayMulticastGroupMembersOperationBody(context: ExecutionContext, input: DeregisterTransitGatewayMulticastGroupMembersRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val GROUPIPADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("GroupIpAddress"))
    val NETWORKINTERFACEIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("NetworkInterfaceIds"), FormUrlFlattened)
    val TRANSITGATEWAYMULTICASTDOMAINID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("TransitGatewayMulticastDomainId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("DeregisterTransitGatewayMulticastGroupMembersRequest"))
        trait(QueryLiteral("Action", "DeregisterTransitGatewayMulticastGroupMembers"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DRYRUN_DESCRIPTOR)
        field(GROUPIPADDRESS_DESCRIPTOR)
        field(NETWORKINTERFACEIDS_DESCRIPTOR)
        field(TRANSITGATEWAYMULTICASTDOMAINID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.groupIpAddress?.let { field(GROUPIPADDRESS_DESCRIPTOR, it) }
        if (input.networkInterfaceIds != null) {
            listField(NETWORKINTERFACEIDS_DESCRIPTOR) {
                for (el0 in input.networkInterfaceIds) {
                    serializeString(el0)
                }
            }
        }
        input.transitGatewayMulticastDomainId?.let { field(TRANSITGATEWAYMULTICASTDOMAINID_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
