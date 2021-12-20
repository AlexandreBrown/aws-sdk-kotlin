// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.VpnConnectionDeviceType
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


internal fun deserializeVpnConnectionDeviceTypeDocument(deserializer: Deserializer): VpnConnectionDeviceType {
    val builder = VpnConnectionDeviceType.Builder()
    val PLATFORM_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("platform"))
    val SOFTWARE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("software"))
    val VENDOR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vendor"))
    val VPNCONNECTIONDEVICETYPEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vpnConnectionDeviceTypeId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("VpnConnectionDeviceType"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(PLATFORM_DESCRIPTOR)
        field(SOFTWARE_DESCRIPTOR)
        field(VENDOR_DESCRIPTOR)
        field(VPNCONNECTIONDEVICETYPEID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                PLATFORM_DESCRIPTOR.index -> builder.platform = deserializeString()
                SOFTWARE_DESCRIPTOR.index -> builder.software = deserializeString()
                VENDOR_DESCRIPTOR.index -> builder.vendor = deserializeString()
                VPNCONNECTIONDEVICETYPEID_DESCRIPTOR.index -> builder.vpnConnectionDeviceTypeId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}