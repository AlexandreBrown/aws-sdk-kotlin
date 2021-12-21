// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ImportSnapshotTask
import aws.sdk.kotlin.services.ec2.model.SnapshotTaskDetail
import aws.sdk.kotlin.services.ec2.model.Tag
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


internal fun deserializeImportSnapshotTaskDocument(deserializer: Deserializer): ImportSnapshotTask {
    val builder = ImportSnapshotTask.Builder()
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val IMPORTTASKID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("importTaskId"))
    val SNAPSHOTTASKDETAIL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("snapshotTaskDetail"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ImportSnapshotTask"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DESCRIPTION_DESCRIPTOR)
        field(IMPORTTASKID_DESCRIPTOR)
        field(SNAPSHOTTASKDETAIL_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                IMPORTTASKID_DESCRIPTOR.index -> builder.importTaskId = deserializeString()
                SNAPSHOTTASKDETAIL_DESCRIPTOR.index -> builder.snapshotTaskDetail = deserializeSnapshotTaskDetailDocument(deserializer)
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
