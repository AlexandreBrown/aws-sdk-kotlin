// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ModifyVolumeRequest
import aws.sdk.kotlin.services.ec2.model.VolumeType
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


internal class ModifyVolumeOperationSerializer: HttpSerialize<ModifyVolumeRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ModifyVolumeRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeModifyVolumeOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeModifyVolumeOperationBody(context: ExecutionContext, input: ModifyVolumeRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val IOPS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("Iops"))
    val MULTIATTACHENABLED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("MultiAttachEnabled"))
    val SIZE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("Size"))
    val THROUGHPUT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("Throughput"))
    val VOLUMEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("VolumeId"))
    val VOLUMETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("VolumeType"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ModifyVolumeRequest"))
        trait(QueryLiteral("Action", "ModifyVolume"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DRYRUN_DESCRIPTOR)
        field(IOPS_DESCRIPTOR)
        field(MULTIATTACHENABLED_DESCRIPTOR)
        field(SIZE_DESCRIPTOR)
        field(THROUGHPUT_DESCRIPTOR)
        field(VOLUMEID_DESCRIPTOR)
        field(VOLUMETYPE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.iops?.let { field(IOPS_DESCRIPTOR, it) }
        input.multiAttachEnabled?.let { field(MULTIATTACHENABLED_DESCRIPTOR, it) }
        input.size?.let { field(SIZE_DESCRIPTOR, it) }
        input.throughput?.let { field(THROUGHPUT_DESCRIPTOR, it) }
        input.volumeId?.let { field(VOLUMEID_DESCRIPTOR, it) }
        input.volumeType?.let { field(VOLUMETYPE_DESCRIPTOR, it.value) }
    }
    return serializer.toByteArray()
}
