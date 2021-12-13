// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.SnapshotState
import aws.sdk.kotlin.services.ec2.model.SnapshotTierStatus
import aws.sdk.kotlin.services.ec2.model.StorageTier
import aws.sdk.kotlin.services.ec2.model.Tag
import aws.sdk.kotlin.services.ec2.model.TieringOperationStatus
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
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName
import aws.smithy.kotlin.runtime.time.Instant


internal fun deserializeSnapshotTierStatusDocument(deserializer: Deserializer): SnapshotTierStatus {
    val builder = SnapshotTierStatus.Builder()
    val ARCHIVALCOMPLETETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("archivalCompleteTime"))
    val LASTTIERINGOPERATIONSTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("lastTieringOperationStatus"))
    val LASTTIERINGOPERATIONSTATUSDETAIL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("lastTieringOperationStatusDetail"))
    val LASTTIERINGPROGRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("lastTieringProgress"))
    val LASTTIERINGSTARTTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("lastTieringStartTime"))
    val OWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ownerId"))
    val RESTOREEXPIRYTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("restoreExpiryTime"))
    val SNAPSHOTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("snapshotId"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("status"))
    val STORAGETIER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("storageTier"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val VOLUMEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("volumeId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("SnapshotTierStatus"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ARCHIVALCOMPLETETIME_DESCRIPTOR)
        field(LASTTIERINGOPERATIONSTATUS_DESCRIPTOR)
        field(LASTTIERINGOPERATIONSTATUSDETAIL_DESCRIPTOR)
        field(LASTTIERINGPROGRESS_DESCRIPTOR)
        field(LASTTIERINGSTARTTIME_DESCRIPTOR)
        field(OWNERID_DESCRIPTOR)
        field(RESTOREEXPIRYTIME_DESCRIPTOR)
        field(SNAPSHOTID_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
        field(STORAGETIER_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(VOLUMEID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ARCHIVALCOMPLETETIME_DESCRIPTOR.index -> builder.archivalCompleteTime = deserializeString().let { Instant.fromIso8601(it) }
                LASTTIERINGOPERATIONSTATUS_DESCRIPTOR.index -> builder.lastTieringOperationStatus = deserializeString().let { TieringOperationStatus.fromValue(it) }
                LASTTIERINGOPERATIONSTATUSDETAIL_DESCRIPTOR.index -> builder.lastTieringOperationStatusDetail = deserializeString()
                LASTTIERINGPROGRESS_DESCRIPTOR.index -> builder.lastTieringProgress = deserializeInt()
                LASTTIERINGSTARTTIME_DESCRIPTOR.index -> builder.lastTieringStartTime = deserializeString().let { Instant.fromIso8601(it) }
                OWNERID_DESCRIPTOR.index -> builder.ownerId = deserializeString()
                RESTOREEXPIRYTIME_DESCRIPTOR.index -> builder.restoreExpiryTime = deserializeString().let { Instant.fromIso8601(it) }
                SNAPSHOTID_DESCRIPTOR.index -> builder.snapshotId = deserializeString()
                STATUS_DESCRIPTOR.index -> builder.status = deserializeString().let { SnapshotState.fromValue(it) }
                STORAGETIER_DESCRIPTOR.index -> builder.storageTier = deserializeString().let { StorageTier.fromValue(it) }
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                VOLUMEID_DESCRIPTOR.index -> builder.volumeId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
