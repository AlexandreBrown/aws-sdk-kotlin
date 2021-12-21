// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.GatewayAssociationState
import aws.sdk.kotlin.services.ec2.model.GatewayType
import aws.sdk.kotlin.services.ec2.model.Tag
import aws.sdk.kotlin.services.ec2.model.VgwTelemetry
import aws.sdk.kotlin.services.ec2.model.VpnConnection
import aws.sdk.kotlin.services.ec2.model.VpnConnectionOptions
import aws.sdk.kotlin.services.ec2.model.VpnState
import aws.sdk.kotlin.services.ec2.model.VpnStaticRoute
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


internal fun deserializeVpnConnectionDocument(deserializer: Deserializer): VpnConnection {
    val builder = VpnConnection.Builder()
    val CATEGORY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("category"))
    val CORENETWORKARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("coreNetworkArn"))
    val CORENETWORKATTACHMENTARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("coreNetworkAttachmentArn"))
    val CUSTOMERGATEWAYCONFIGURATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("customerGatewayConfiguration"))
    val CUSTOMERGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("customerGatewayId"))
    val GATEWAYASSOCIATIONSTATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("gatewayAssociationState"))
    val OPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("options"))
    val ROUTES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("routes"), XmlCollectionName("item"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val TRANSITGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("transitGatewayId"))
    val TYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("type"))
    val VGWTELEMETRY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("vgwTelemetry"), XmlCollectionName("item"))
    val VPNCONNECTIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vpnConnectionId"))
    val VPNGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vpnGatewayId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("VpnConnection"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CATEGORY_DESCRIPTOR)
        field(CORENETWORKARN_DESCRIPTOR)
        field(CORENETWORKATTACHMENTARN_DESCRIPTOR)
        field(CUSTOMERGATEWAYCONFIGURATION_DESCRIPTOR)
        field(CUSTOMERGATEWAYID_DESCRIPTOR)
        field(GATEWAYASSOCIATIONSTATE_DESCRIPTOR)
        field(OPTIONS_DESCRIPTOR)
        field(ROUTES_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(TRANSITGATEWAYID_DESCRIPTOR)
        field(TYPE_DESCRIPTOR)
        field(VGWTELEMETRY_DESCRIPTOR)
        field(VPNCONNECTIONID_DESCRIPTOR)
        field(VPNGATEWAYID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CATEGORY_DESCRIPTOR.index -> builder.category = deserializeString()
                CORENETWORKARN_DESCRIPTOR.index -> builder.coreNetworkArn = deserializeString()
                CORENETWORKATTACHMENTARN_DESCRIPTOR.index -> builder.coreNetworkAttachmentArn = deserializeString()
                CUSTOMERGATEWAYCONFIGURATION_DESCRIPTOR.index -> builder.customerGatewayConfiguration = deserializeString()
                CUSTOMERGATEWAYID_DESCRIPTOR.index -> builder.customerGatewayId = deserializeString()
                GATEWAYASSOCIATIONSTATE_DESCRIPTOR.index -> builder.gatewayAssociationState = deserializeString().let { GatewayAssociationState.fromValue(it) }
                OPTIONS_DESCRIPTOR.index -> builder.options = deserializeVpnConnectionOptionsDocument(deserializer)
                ROUTES_DESCRIPTOR.index -> builder.routes =
                    deserializer.deserializeList(ROUTES_DESCRIPTOR) {
                        val col0 = mutableListOf<VpnStaticRoute>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeVpnStaticRouteDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
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
                TRANSITGATEWAYID_DESCRIPTOR.index -> builder.transitGatewayId = deserializeString()
                TYPE_DESCRIPTOR.index -> builder.type = deserializeString().let { GatewayType.fromValue(it) }
                VGWTELEMETRY_DESCRIPTOR.index -> builder.vgwTelemetry =
                    deserializer.deserializeList(VGWTELEMETRY_DESCRIPTOR) {
                        val col0 = mutableListOf<VgwTelemetry>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeVgwTelemetryDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                VPNCONNECTIONID_DESCRIPTOR.index -> builder.vpnConnectionId = deserializeString()
                VPNGATEWAYID_DESCRIPTOR.index -> builder.vpnGatewayId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
