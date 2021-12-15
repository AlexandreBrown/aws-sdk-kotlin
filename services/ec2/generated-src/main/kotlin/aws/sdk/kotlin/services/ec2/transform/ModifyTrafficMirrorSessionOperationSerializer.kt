// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ModifyTrafficMirrorSessionRequest
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


internal class ModifyTrafficMirrorSessionOperationSerializer: HttpSerialize<ModifyTrafficMirrorSessionRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ModifyTrafficMirrorSessionRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeModifyTrafficMirrorSessionOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeModifyTrafficMirrorSessionOperationBody(context: ExecutionContext, input: ModifyTrafficMirrorSessionRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Description"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val PACKETLENGTH_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("PacketLength"))
    val REMOVEFIELDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("RemoveField"), FormUrlFlattened)
    val SESSIONNUMBER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("SessionNumber"))
    val TRAFFICMIRRORFILTERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("TrafficMirrorFilterId"))
    val TRAFFICMIRRORSESSIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("TrafficMirrorSessionId"))
    val TRAFFICMIRRORTARGETID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("TrafficMirrorTargetId"))
    val VIRTUALNETWORKID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("VirtualNetworkId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ModifyTrafficMirrorSessionRequest"))
        trait(QueryLiteral("Action", "ModifyTrafficMirrorSession"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DESCRIPTION_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(PACKETLENGTH_DESCRIPTOR)
        field(REMOVEFIELDS_DESCRIPTOR)
        field(SESSIONNUMBER_DESCRIPTOR)
        field(TRAFFICMIRRORFILTERID_DESCRIPTOR)
        field(TRAFFICMIRRORSESSIONID_DESCRIPTOR)
        field(TRAFFICMIRRORTARGETID_DESCRIPTOR)
        field(VIRTUALNETWORKID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.description?.let { field(DESCRIPTION_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.packetLength?.let { field(PACKETLENGTH_DESCRIPTOR, it) }
        if (input.removeFields != null) {
            listField(REMOVEFIELDS_DESCRIPTOR) {
                for (el0 in input.removeFields) {
                    serializeString(el0.value)
                }
            }
        }
        input.sessionNumber?.let { field(SESSIONNUMBER_DESCRIPTOR, it) }
        input.trafficMirrorFilterId?.let { field(TRAFFICMIRRORFILTERID_DESCRIPTOR, it) }
        input.trafficMirrorSessionId?.let { field(TRAFFICMIRRORSESSIONID_DESCRIPTOR, it) }
        input.trafficMirrorTargetId?.let { field(TRAFFICMIRRORTARGETID_DESCRIPTOR, it) }
        input.virtualNetworkId?.let { field(VIRTUALNETWORKID_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
