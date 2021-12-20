// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AssociateAddressRequest
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


internal class AssociateAddressOperationSerializer: HttpSerialize<AssociateAddressRequest> {
    override suspend fun serialize(context: ExecutionContext, input: AssociateAddressRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeAssociateAddressOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeAssociateAddressOperationBody(context: ExecutionContext, input: AssociateAddressRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val ALLOCATIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("AllocationId"))
    val ALLOWREASSOCIATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("AllowReassociation"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val INSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstanceId"))
    val NETWORKINTERFACEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("NetworkInterfaceId"))
    val PRIVATEIPADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("PrivateIpAddress"))
    val PUBLICIP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("PublicIp"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("AssociateAddressRequest"))
        trait(QueryLiteral("Action", "AssociateAddress"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(ALLOCATIONID_DESCRIPTOR)
        field(ALLOWREASSOCIATION_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(INSTANCEID_DESCRIPTOR)
        field(NETWORKINTERFACEID_DESCRIPTOR)
        field(PRIVATEIPADDRESS_DESCRIPTOR)
        field(PUBLICIP_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.allocationId?.let { field(ALLOCATIONID_DESCRIPTOR, it) }
        input.allowReassociation?.let { field(ALLOWREASSOCIATION_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.instanceId?.let { field(INSTANCEID_DESCRIPTOR, it) }
        input.networkInterfaceId?.let { field(NETWORKINTERFACEID_DESCRIPTOR, it) }
        input.privateIpAddress?.let { field(PRIVATEIPADDRESS_DESCRIPTOR, it) }
        input.publicIp?.let { field(PUBLICIP_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}