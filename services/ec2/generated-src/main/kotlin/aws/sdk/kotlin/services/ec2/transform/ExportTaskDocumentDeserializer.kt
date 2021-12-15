// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ExportTask
import aws.sdk.kotlin.services.ec2.model.ExportTaskState
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


internal fun deserializeExportTaskDocument(deserializer: Deserializer): ExportTask {
    val builder = ExportTask.Builder()
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val EXPORTTASKID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("exportTaskId"))
    val EXPORTTOS3TASK_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("exportToS3"))
    val INSTANCEEXPORTDETAILS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("instanceExport"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val STATUSMESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("statusMessage"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ExportTask"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DESCRIPTION_DESCRIPTOR)
        field(EXPORTTASKID_DESCRIPTOR)
        field(EXPORTTOS3TASK_DESCRIPTOR)
        field(INSTANCEEXPORTDETAILS_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(STATUSMESSAGE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                EXPORTTASKID_DESCRIPTOR.index -> builder.exportTaskId = deserializeString()
                EXPORTTOS3TASK_DESCRIPTOR.index -> builder.exportToS3Task = deserializeExportToS3TaskDocument(deserializer)
                INSTANCEEXPORTDETAILS_DESCRIPTOR.index -> builder.instanceExportDetails = deserializeInstanceExportDetailsDocument(deserializer)
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { ExportTaskState.fromValue(it) }
                STATUSMESSAGE_DESCRIPTOR.index -> builder.statusMessage = deserializeString()
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
