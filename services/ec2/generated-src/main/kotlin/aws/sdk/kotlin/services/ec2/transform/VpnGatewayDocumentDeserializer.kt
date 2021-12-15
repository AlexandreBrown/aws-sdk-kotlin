// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.GatewayType
import aws.sdk.kotlin.services.ec2.model.Tag
import aws.sdk.kotlin.services.ec2.model.VpcAttachment
import aws.sdk.kotlin.services.ec2.model.VpnGateway
import aws.sdk.kotlin.services.ec2.model.VpnState
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


internal fun deserializeVpnGatewayDocument(deserializer: Deserializer): VpnGateway {
    val builder = VpnGateway.Builder()
    val AMAZONSIDEASN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, XmlSerialName("amazonSideAsn"))
    val AVAILABILITYZONE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("availabilityZone"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val TYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("type"))
    val VPCATTACHMENTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("attachments"), XmlCollectionName("item"))
    val VPNGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vpnGatewayId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("VpnGateway"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(AMAZONSIDEASN_DESCRIPTOR)
        field(AVAILABILITYZONE_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(TYPE_DESCRIPTOR)
        field(VPCATTACHMENTS_DESCRIPTOR)
        field(VPNGATEWAYID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                AMAZONSIDEASN_DESCRIPTOR.index -> builder.amazonSideAsn = deserializeLong()
                AVAILABILITYZONE_DESCRIPTOR.index -> builder.availabilityZone = deserializeString()
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { VpnState.fromValue(it) }
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                TYPE_DESCRIPTOR.index -> builder.type = deserializeString().let { GatewayType.fromValue(it) }
                VPCATTACHMENTS_DESCRIPTOR.index -> builder.vpcAttachments =
                    deserializer.deserializeList(VPCATTACHMENTS_DESCRIPTOR) {
                        val col0 = mutableListOf<VpcAttachment>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeVpcAttachmentDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                VPNGATEWAYID_DESCRIPTOR.index -> builder.vpnGatewayId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
