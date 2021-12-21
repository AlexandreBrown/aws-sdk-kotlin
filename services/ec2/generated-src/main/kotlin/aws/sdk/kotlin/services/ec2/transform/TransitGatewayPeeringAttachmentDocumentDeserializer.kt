// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.PeeringAttachmentStatus
import aws.sdk.kotlin.services.ec2.model.PeeringTgwInfo
import aws.sdk.kotlin.services.ec2.model.Tag
import aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachmentState
import aws.sdk.kotlin.services.ec2.model.TransitGatewayPeeringAttachment
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


internal fun deserializeTransitGatewayPeeringAttachmentDocument(deserializer: Deserializer): TransitGatewayPeeringAttachment {
    val builder = TransitGatewayPeeringAttachment.Builder()
    val ACCEPTERTGWINFO_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("accepterTgwInfo"))
    val CREATIONTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("creationTime"))
    val REQUESTERTGWINFO_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("requesterTgwInfo"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("status"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val TRANSITGATEWAYATTACHMENTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("transitGatewayAttachmentId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("TransitGatewayPeeringAttachment"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ACCEPTERTGWINFO_DESCRIPTOR)
        field(CREATIONTIME_DESCRIPTOR)
        field(REQUESTERTGWINFO_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(TRANSITGATEWAYATTACHMENTID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ACCEPTERTGWINFO_DESCRIPTOR.index -> builder.accepterTgwInfo = deserializePeeringTgwInfoDocument(deserializer)
                CREATIONTIME_DESCRIPTOR.index -> builder.creationTime = deserializeString().let { Instant.fromIso8601(it) }
                REQUESTERTGWINFO_DESCRIPTOR.index -> builder.requesterTgwInfo = deserializePeeringTgwInfoDocument(deserializer)
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { TransitGatewayAttachmentState.fromValue(it) }
                STATUS_DESCRIPTOR.index -> builder.status = deserializePeeringAttachmentStatusDocument(deserializer)
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                TRANSITGATEWAYATTACHMENTID_DESCRIPTOR.index -> builder.transitGatewayAttachmentId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
