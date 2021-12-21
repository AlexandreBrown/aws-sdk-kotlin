// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ContainerFormat
import aws.sdk.kotlin.services.ec2.model.DiskImageFormat
import aws.sdk.kotlin.services.ec2.model.ExportToS3TaskSpecification
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal fun serializeExportToS3TaskSpecificationDocument(serializer: Serializer, input: ExportToS3TaskSpecification) {
    val CONTAINERFORMAT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ContainerFormat"))
    val DISKIMAGEFORMAT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("DiskImageFormat"))
    val S3BUCKET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("S3Bucket"))
    val S3PREFIX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("S3Prefix"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ExportToS3TaskSpecification"))
        field(CONTAINERFORMAT_DESCRIPTOR)
        field(DISKIMAGEFORMAT_DESCRIPTOR)
        field(S3BUCKET_DESCRIPTOR)
        field(S3PREFIX_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.containerFormat?.let { field(CONTAINERFORMAT_DESCRIPTOR, it.value) }
        input.diskImageFormat?.let { field(DISKIMAGEFORMAT_DESCRIPTOR, it.value) }
        input.s3Bucket?.let { field(S3BUCKET_DESCRIPTOR, it) }
        input.s3Prefix?.let { field(S3PREFIX_DESCRIPTOR, it) }
    }
}