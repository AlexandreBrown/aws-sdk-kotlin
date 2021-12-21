// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ReplaceRootVolumeTask
import aws.sdk.kotlin.services.ec2.model.ReplaceRootVolumeTaskState
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


internal fun deserializeReplaceRootVolumeTaskDocument(deserializer: Deserializer): ReplaceRootVolumeTask {
    val builder = ReplaceRootVolumeTask.Builder()
    val COMPLETETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("completeTime"))
    val INSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceId"))
    val REPLACEROOTVOLUMETASKID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("replaceRootVolumeTaskId"))
    val STARTTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("startTime"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val TASKSTATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("taskState"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ReplaceRootVolumeTask"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(COMPLETETIME_DESCRIPTOR)
        field(INSTANCEID_DESCRIPTOR)
        field(REPLACEROOTVOLUMETASKID_DESCRIPTOR)
        field(STARTTIME_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(TASKSTATE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                COMPLETETIME_DESCRIPTOR.index -> builder.completeTime = deserializeString()
                INSTANCEID_DESCRIPTOR.index -> builder.instanceId = deserializeString()
                REPLACEROOTVOLUMETASKID_DESCRIPTOR.index -> builder.replaceRootVolumeTaskId = deserializeString()
                STARTTIME_DESCRIPTOR.index -> builder.startTime = deserializeString()
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                TASKSTATE_DESCRIPTOR.index -> builder.taskState = deserializeString().let { ReplaceRootVolumeTaskState.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}