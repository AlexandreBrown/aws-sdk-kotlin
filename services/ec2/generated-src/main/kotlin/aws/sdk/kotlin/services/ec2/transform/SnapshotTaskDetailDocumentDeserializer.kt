// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.SnapshotTaskDetail
import aws.smithy.kotlin.runtime.serde.Deserializer
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal fun deserializeSnapshotTaskDetailDocument(deserializer: Deserializer): SnapshotTaskDetail {
    val builder = SnapshotTaskDetail.Builder()
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val DISKIMAGESIZE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Double, XmlSerialName("diskImageSize"))
    val ENCRYPTED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("encrypted"))
    val FORMAT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("format"))
    val KMSKEYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("kmsKeyId"))
    val PROGRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("progress"))
    val SNAPSHOTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("snapshotId"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("status"))
    val STATUSMESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("statusMessage"))
    val URL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("url"))
    val USERBUCKET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("userBucket"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("SnapshotTaskDetail"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DESCRIPTION_DESCRIPTOR)
        field(DISKIMAGESIZE_DESCRIPTOR)
        field(ENCRYPTED_DESCRIPTOR)
        field(FORMAT_DESCRIPTOR)
        field(KMSKEYID_DESCRIPTOR)
        field(PROGRESS_DESCRIPTOR)
        field(SNAPSHOTID_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
        field(STATUSMESSAGE_DESCRIPTOR)
        field(URL_DESCRIPTOR)
        field(USERBUCKET_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                DISKIMAGESIZE_DESCRIPTOR.index -> builder.diskImageSize = deserializeDouble()
                ENCRYPTED_DESCRIPTOR.index -> builder.encrypted = deserializeBoolean()
                FORMAT_DESCRIPTOR.index -> builder.format = deserializeString()
                KMSKEYID_DESCRIPTOR.index -> builder.kmsKeyId = deserializeString()
                PROGRESS_DESCRIPTOR.index -> builder.progress = deserializeString()
                SNAPSHOTID_DESCRIPTOR.index -> builder.snapshotId = deserializeString()
                STATUS_DESCRIPTOR.index -> builder.status = deserializeString()
                STATUSMESSAGE_DESCRIPTOR.index -> builder.statusMessage = deserializeString()
                URL_DESCRIPTOR.index -> builder.url = deserializeString()
                USERBUCKET_DESCRIPTOR.index -> builder.userBucket = deserializeUserBucketDetailsDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
