// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.EnableFastSnapshotRestoreErrorItem
import aws.sdk.kotlin.services.ec2.model.EnableFastSnapshotRestoreStateErrorItem
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


internal fun deserializeEnableFastSnapshotRestoreErrorItemDocument(deserializer: Deserializer): EnableFastSnapshotRestoreErrorItem {
    val builder = EnableFastSnapshotRestoreErrorItem.Builder()
    val FASTSNAPSHOTRESTORESTATEERRORS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("fastSnapshotRestoreStateErrorSet"), XmlCollectionName("item"))
    val SNAPSHOTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("snapshotId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("EnableFastSnapshotRestoreErrorItem"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(FASTSNAPSHOTRESTORESTATEERRORS_DESCRIPTOR)
        field(SNAPSHOTID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                FASTSNAPSHOTRESTORESTATEERRORS_DESCRIPTOR.index -> builder.fastSnapshotRestoreStateErrors =
                    deserializer.deserializeList(FASTSNAPSHOTRESTORESTATEERRORS_DESCRIPTOR) {
                        val col0 = mutableListOf<EnableFastSnapshotRestoreStateErrorItem>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeEnableFastSnapshotRestoreStateErrorItemDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                SNAPSHOTID_DESCRIPTOR.index -> builder.snapshotId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
