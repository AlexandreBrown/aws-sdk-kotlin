// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.Tag
import aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachmentState
import aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachment
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


internal fun deserializeTransitGatewayVpcAttachmentDocument(deserializer: Deserializer): TransitGatewayVpcAttachment {
    val builder = TransitGatewayVpcAttachment.Builder()
    val CREATIONTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("creationTime"))
    val OPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("options"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val SUBNETIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("subnetIds"), XmlCollectionName("item"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val TRANSITGATEWAYATTACHMENTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("transitGatewayAttachmentId"))
    val TRANSITGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("transitGatewayId"))
    val VPCID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vpcId"))
    val VPCOWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vpcOwnerId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("TransitGatewayVpcAttachment"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CREATIONTIME_DESCRIPTOR)
        field(OPTIONS_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(SUBNETIDS_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(TRANSITGATEWAYATTACHMENTID_DESCRIPTOR)
        field(TRANSITGATEWAYID_DESCRIPTOR)
        field(VPCID_DESCRIPTOR)
        field(VPCOWNERID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CREATIONTIME_DESCRIPTOR.index -> builder.creationTime = deserializeString().let { Instant.fromIso8601(it) }
                OPTIONS_DESCRIPTOR.index -> builder.options = deserializeTransitGatewayVpcAttachmentOptionsDocument(deserializer)
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { TransitGatewayAttachmentState.fromValue(it) }
                SUBNETIDS_DESCRIPTOR.index -> builder.subnetIds =
                    deserializer.deserializeList(SUBNETIDS_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
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
                TRANSITGATEWAYID_DESCRIPTOR.index -> builder.transitGatewayId = deserializeString()
                VPCID_DESCRIPTOR.index -> builder.vpcId = deserializeString()
                VPCOWNERID_DESCRIPTOR.index -> builder.vpcOwnerId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
