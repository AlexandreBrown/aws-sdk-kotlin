// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ByoipCidr
import aws.sdk.kotlin.services.ec2.model.ByoipCidrState
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


internal fun deserializeByoipCidrDocument(deserializer: Deserializer): ByoipCidr {
    val builder = ByoipCidr.Builder()
    val CIDR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("cidr"))
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val STATUSMESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("statusMessage"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ByoipCidr"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CIDR_DESCRIPTOR)
        field(DESCRIPTION_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(STATUSMESSAGE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CIDR_DESCRIPTOR.index -> builder.cidr = deserializeString()
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { ByoipCidrState.fromValue(it) }
                STATUSMESSAGE_DESCRIPTOR.index -> builder.statusMessage = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
