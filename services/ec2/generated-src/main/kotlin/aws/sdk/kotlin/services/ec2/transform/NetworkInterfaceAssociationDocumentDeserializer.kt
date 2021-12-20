// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.NetworkInterfaceAssociation
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


internal fun deserializeNetworkInterfaceAssociationDocument(deserializer: Deserializer): NetworkInterfaceAssociation {
    val builder = NetworkInterfaceAssociation.Builder()
    val ALLOCATIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("allocationId"))
    val ASSOCIATIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("associationId"))
    val CARRIERIP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("carrierIp"))
    val CUSTOMEROWNEDIP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("customerOwnedIp"))
    val IPOWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ipOwnerId"))
    val PUBLICDNSNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("publicDnsName"))
    val PUBLICIP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("publicIp"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("NetworkInterfaceAssociation"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ALLOCATIONID_DESCRIPTOR)
        field(ASSOCIATIONID_DESCRIPTOR)
        field(CARRIERIP_DESCRIPTOR)
        field(CUSTOMEROWNEDIP_DESCRIPTOR)
        field(IPOWNERID_DESCRIPTOR)
        field(PUBLICDNSNAME_DESCRIPTOR)
        field(PUBLICIP_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ALLOCATIONID_DESCRIPTOR.index -> builder.allocationId = deserializeString()
                ASSOCIATIONID_DESCRIPTOR.index -> builder.associationId = deserializeString()
                CARRIERIP_DESCRIPTOR.index -> builder.carrierIp = deserializeString()
                CUSTOMEROWNEDIP_DESCRIPTOR.index -> builder.customerOwnedIp = deserializeString()
                IPOWNERID_DESCRIPTOR.index -> builder.ipOwnerId = deserializeString()
                PUBLICDNSNAME_DESCRIPTOR.index -> builder.publicDnsName = deserializeString()
                PUBLICIP_DESCRIPTOR.index -> builder.publicIp = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}