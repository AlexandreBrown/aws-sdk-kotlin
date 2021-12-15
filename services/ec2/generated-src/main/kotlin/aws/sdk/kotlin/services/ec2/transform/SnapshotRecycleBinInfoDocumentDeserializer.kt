// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.SnapshotRecycleBinInfo
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
import aws.smithy.kotlin.runtime.time.Instant


internal fun deserializeSnapshotRecycleBinInfoDocument(deserializer: Deserializer): SnapshotRecycleBinInfo {
    val builder = SnapshotRecycleBinInfo.Builder()
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val RECYCLEBINENTERTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("recycleBinEnterTime"))
    val RECYCLEBINEXITTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("recycleBinExitTime"))
    val SNAPSHOTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("snapshotId"))
    val VOLUMEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("volumeId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("SnapshotRecycleBinInfo"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DESCRIPTION_DESCRIPTOR)
        field(RECYCLEBINENTERTIME_DESCRIPTOR)
        field(RECYCLEBINEXITTIME_DESCRIPTOR)
        field(SNAPSHOTID_DESCRIPTOR)
        field(VOLUMEID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                RECYCLEBINENTERTIME_DESCRIPTOR.index -> builder.recycleBinEnterTime = deserializeString().let { Instant.fromIso8601(it) }
                RECYCLEBINEXITTIME_DESCRIPTOR.index -> builder.recycleBinExitTime = deserializeString().let { Instant.fromIso8601(it) }
                SNAPSHOTID_DESCRIPTOR.index -> builder.snapshotId = deserializeString()
                VOLUMEID_DESCRIPTOR.index -> builder.volumeId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
