// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CreateVolumeRequest
import aws.sdk.kotlin.services.ec2.model.TagSpecification
import aws.sdk.kotlin.services.ec2.model.VolumeType
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.client.idempotencyTokenProvider
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


internal class CreateVolumeOperationSerializer: HttpSerialize<CreateVolumeRequest> {
    override suspend fun serialize(context: ExecutionContext, input: CreateVolumeRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeCreateVolumeOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeCreateVolumeOperationBody(context: ExecutionContext, input: CreateVolumeRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val AVAILABILITYZONE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("AvailabilityZone"))
    val CLIENTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ClientToken"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val ENCRYPTED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("Encrypted"))
    val IOPS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("Iops"))
    val KMSKEYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("KmsKeyId"))
    val MULTIATTACHENABLED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("MultiAttachEnabled"))
    val OUTPOSTARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("OutpostArn"))
    val SIZE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("Size"))
    val SNAPSHOTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("SnapshotId"))
    val TAGSPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("TagSpecification"), FormUrlFlattened)
    val THROUGHPUT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("Throughput"))
    val VOLUMETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("VolumeType"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("CreateVolumeRequest"))
        trait(QueryLiteral("Action", "CreateVolume"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(AVAILABILITYZONE_DESCRIPTOR)
        field(CLIENTTOKEN_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(ENCRYPTED_DESCRIPTOR)
        field(IOPS_DESCRIPTOR)
        field(KMSKEYID_DESCRIPTOR)
        field(MULTIATTACHENABLED_DESCRIPTOR)
        field(OUTPOSTARN_DESCRIPTOR)
        field(SIZE_DESCRIPTOR)
        field(SNAPSHOTID_DESCRIPTOR)
        field(TAGSPECIFICATIONS_DESCRIPTOR)
        field(THROUGHPUT_DESCRIPTOR)
        field(VOLUMETYPE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.availabilityZone?.let { field(AVAILABILITYZONE_DESCRIPTOR, it) }
        input.clientToken?.let { field(CLIENTTOKEN_DESCRIPTOR, it) } ?: field(CLIENTTOKEN_DESCRIPTOR, context.idempotencyTokenProvider.generateToken())
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.encrypted?.let { field(ENCRYPTED_DESCRIPTOR, it) }
        input.iops?.let { field(IOPS_DESCRIPTOR, it) }
        input.kmsKeyId?.let { field(KMSKEYID_DESCRIPTOR, it) }
        input.multiAttachEnabled?.let { field(MULTIATTACHENABLED_DESCRIPTOR, it) }
        input.outpostArn?.let { field(OUTPOSTARN_DESCRIPTOR, it) }
        input.size?.let { field(SIZE_DESCRIPTOR, it) }
        input.snapshotId?.let { field(SNAPSHOTID_DESCRIPTOR, it) }
        if (input.tagSpecifications != null) {
            listField(TAGSPECIFICATIONS_DESCRIPTOR) {
                for (el0 in input.tagSpecifications) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeTagSpecificationDocument))
                }
            }
        }
        input.throughput?.let { field(THROUGHPUT_DESCRIPTOR, it) }
        input.volumeType?.let { field(VOLUMETYPE_DESCRIPTOR, it.value) }
    }
    return serializer.toByteArray()
}
