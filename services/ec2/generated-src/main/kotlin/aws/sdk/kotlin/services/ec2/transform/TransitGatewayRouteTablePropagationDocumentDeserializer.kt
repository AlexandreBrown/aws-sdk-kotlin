// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachmentResourceType
import aws.sdk.kotlin.services.ec2.model.TransitGatewayPropagationState
import aws.sdk.kotlin.services.ec2.model.TransitGatewayRouteTablePropagation
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
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal fun deserializeTransitGatewayRouteTablePropagationDocument(deserializer: Deserializer): TransitGatewayRouteTablePropagation {
    val builder = TransitGatewayRouteTablePropagation.Builder()
    val RESOURCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("resourceId"))
    val RESOURCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("resourceType"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val TRANSITGATEWAYATTACHMENTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("transitGatewayAttachmentId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("TransitGatewayRouteTablePropagation"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(RESOURCEID_DESCRIPTOR)
        field(RESOURCETYPE_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(TRANSITGATEWAYATTACHMENTID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                RESOURCEID_DESCRIPTOR.index -> builder.resourceId = deserializeString()
                RESOURCETYPE_DESCRIPTOR.index -> builder.resourceType = deserializeString().let { TransitGatewayAttachmentResourceType.fromValue(it) }
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { TransitGatewayPropagationState.fromValue(it) }
                TRANSITGATEWAYATTACHMENTID_DESCRIPTOR.index -> builder.transitGatewayAttachmentId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}