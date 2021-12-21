// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.Tag
import aws.sdk.kotlin.services.ec2.model.TransitGatewayConnectPeer
import aws.sdk.kotlin.services.ec2.model.TransitGatewayConnectPeerConfiguration
import aws.sdk.kotlin.services.ec2.model.TransitGatewayConnectPeerState
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


internal fun deserializeTransitGatewayConnectPeerDocument(deserializer: Deserializer): TransitGatewayConnectPeer {
    val builder = TransitGatewayConnectPeer.Builder()
    val CONNECTPEERCONFIGURATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("connectPeerConfiguration"))
    val CREATIONTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("creationTime"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val TRANSITGATEWAYATTACHMENTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("transitGatewayAttachmentId"))
    val TRANSITGATEWAYCONNECTPEERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("transitGatewayConnectPeerId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("TransitGatewayConnectPeer"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CONNECTPEERCONFIGURATION_DESCRIPTOR)
        field(CREATIONTIME_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(TRANSITGATEWAYATTACHMENTID_DESCRIPTOR)
        field(TRANSITGATEWAYCONNECTPEERID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CONNECTPEERCONFIGURATION_DESCRIPTOR.index -> builder.connectPeerConfiguration = deserializeTransitGatewayConnectPeerConfigurationDocument(deserializer)
                CREATIONTIME_DESCRIPTOR.index -> builder.creationTime = deserializeString().let { Instant.fromIso8601(it) }
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { TransitGatewayConnectPeerState.fromValue(it) }
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
                TRANSITGATEWAYCONNECTPEERID_DESCRIPTOR.index -> builder.transitGatewayConnectPeerId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
