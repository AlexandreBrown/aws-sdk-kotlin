// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.LaunchTemplate
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
import aws.smithy.kotlin.runtime.time.Instant


internal fun deserializeLaunchTemplateDocument(deserializer: Deserializer): LaunchTemplate {
    val builder = LaunchTemplate.Builder()
    val CREATETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("createTime"))
    val CREATEDBY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("createdBy"))
    val DEFAULTVERSIONNUMBER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, XmlSerialName("defaultVersionNumber"))
    val LATESTVERSIONNUMBER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, XmlSerialName("latestVersionNumber"))
    val LAUNCHTEMPLATEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("launchTemplateId"))
    val LAUNCHTEMPLATENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("launchTemplateName"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("LaunchTemplate"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CREATETIME_DESCRIPTOR)
        field(CREATEDBY_DESCRIPTOR)
        field(DEFAULTVERSIONNUMBER_DESCRIPTOR)
        field(LATESTVERSIONNUMBER_DESCRIPTOR)
        field(LAUNCHTEMPLATEID_DESCRIPTOR)
        field(LAUNCHTEMPLATENAME_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CREATETIME_DESCRIPTOR.index -> builder.createTime = deserializeString().let { Instant.fromIso8601(it) }
                CREATEDBY_DESCRIPTOR.index -> builder.createdBy = deserializeString()
                DEFAULTVERSIONNUMBER_DESCRIPTOR.index -> builder.defaultVersionNumber = deserializeLong()
                LATESTVERSIONNUMBER_DESCRIPTOR.index -> builder.latestVersionNumber = deserializeLong()
                LAUNCHTEMPLATEID_DESCRIPTOR.index -> builder.launchTemplateId = deserializeString()
                LAUNCHTEMPLATENAME_DESCRIPTOR.index -> builder.launchTemplateName = deserializeString()
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
