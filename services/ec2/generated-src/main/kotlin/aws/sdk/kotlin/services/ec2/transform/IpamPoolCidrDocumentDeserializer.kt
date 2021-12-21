// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.IpamPoolCidr
import aws.sdk.kotlin.services.ec2.model.IpamPoolCidrFailureReason
import aws.sdk.kotlin.services.ec2.model.IpamPoolCidrState
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


internal fun deserializeIpamPoolCidrDocument(deserializer: Deserializer): IpamPoolCidr {
    val builder = IpamPoolCidr.Builder()
    val CIDR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("cidr"))
    val FAILUREREASON_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("failureReason"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("IpamPoolCidr"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CIDR_DESCRIPTOR)
        field(FAILUREREASON_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CIDR_DESCRIPTOR.index -> builder.cidr = deserializeString()
                FAILUREREASON_DESCRIPTOR.index -> builder.failureReason = deserializeIpamPoolCidrFailureReasonDocument(deserializer)
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { IpamPoolCidrState.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}