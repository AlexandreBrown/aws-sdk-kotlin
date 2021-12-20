// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterfaceSpecification
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlFlattened
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal fun serializeInstanceNetworkInterfaceSpecificationDocument(serializer: Serializer, input: InstanceNetworkInterfaceSpecification) {
    val ASSOCIATECARRIERIPADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("AssociateCarrierIpAddress"))
    val ASSOCIATEPUBLICIPADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("AssociatePublicIpAddress"))
    val DELETEONTERMINATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DeleteOnTermination"))
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Description"))
    val DEVICEINDEX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("DeviceIndex"))
    val GROUPS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("SecurityGroupId"), FormUrlFlattened)
    val INTERFACETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InterfaceType"))
    val IPV4PREFIXCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("Ipv4PrefixCount"))
    val IPV4PREFIXES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Ipv4Prefix"), FormUrlFlattened)
    val IPV6ADDRESSCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("Ipv6AddressCount"))
    val IPV6ADDRESSES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Ipv6Addresses"), FormUrlFlattened)
    val IPV6PREFIXCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("Ipv6PrefixCount"))
    val IPV6PREFIXES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Ipv6Prefix"), FormUrlFlattened)
    val NETWORKCARDINDEX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("NetworkCardIndex"))
    val NETWORKINTERFACEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("NetworkInterfaceId"))
    val PRIVATEIPADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("PrivateIpAddress"))
    val PRIVATEIPADDRESSES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("PrivateIpAddresses"), FormUrlFlattened)
    val SECONDARYPRIVATEIPADDRESSCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("SecondaryPrivateIpAddressCount"))
    val SUBNETID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("SubnetId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("InstanceNetworkInterfaceSpecification"))
        field(ASSOCIATECARRIERIPADDRESS_DESCRIPTOR)
        field(ASSOCIATEPUBLICIPADDRESS_DESCRIPTOR)
        field(DELETEONTERMINATION_DESCRIPTOR)
        field(DESCRIPTION_DESCRIPTOR)
        field(DEVICEINDEX_DESCRIPTOR)
        field(GROUPS_DESCRIPTOR)
        field(INTERFACETYPE_DESCRIPTOR)
        field(IPV4PREFIXCOUNT_DESCRIPTOR)
        field(IPV4PREFIXES_DESCRIPTOR)
        field(IPV6ADDRESSCOUNT_DESCRIPTOR)
        field(IPV6ADDRESSES_DESCRIPTOR)
        field(IPV6PREFIXCOUNT_DESCRIPTOR)
        field(IPV6PREFIXES_DESCRIPTOR)
        field(NETWORKCARDINDEX_DESCRIPTOR)
        field(NETWORKINTERFACEID_DESCRIPTOR)
        field(PRIVATEIPADDRESS_DESCRIPTOR)
        field(PRIVATEIPADDRESSES_DESCRIPTOR)
        field(SECONDARYPRIVATEIPADDRESSCOUNT_DESCRIPTOR)
        field(SUBNETID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.associatePublicIpAddress?.let { field(ASSOCIATEPUBLICIPADDRESS_DESCRIPTOR, it) }
        input.deleteOnTermination?.let { field(DELETEONTERMINATION_DESCRIPTOR, it) }
        input.description?.let { field(DESCRIPTION_DESCRIPTOR, it) }
        input.deviceIndex?.let { field(DEVICEINDEX_DESCRIPTOR, it) }
        if (input.groups != null) {
            listField(GROUPS_DESCRIPTOR) {
                for (el0 in input.groups) {
                    serializeString(el0)
                }
            }
        }
        input.ipv6AddressCount?.let { field(IPV6ADDRESSCOUNT_DESCRIPTOR, it) }
        if (input.ipv6Addresses != null) {
            listField(IPV6ADDRESSES_DESCRIPTOR) {
                for (el0 in input.ipv6Addresses) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeInstanceIpv6AddressDocument))
                }
            }
        }
        input.networkInterfaceId?.let { field(NETWORKINTERFACEID_DESCRIPTOR, it) }
        input.privateIpAddress?.let { field(PRIVATEIPADDRESS_DESCRIPTOR, it) }
        if (input.privateIpAddresses != null) {
            listField(PRIVATEIPADDRESSES_DESCRIPTOR) {
                for (el0 in input.privateIpAddresses) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializePrivateIpAddressSpecificationDocument))
                }
            }
        }
        input.secondaryPrivateIpAddressCount?.let { field(SECONDARYPRIVATEIPADDRESSCOUNT_DESCRIPTOR, it) }
        input.subnetId?.let { field(SUBNETID_DESCRIPTOR, it) }
        input.associateCarrierIpAddress?.let { field(ASSOCIATECARRIERIPADDRESS_DESCRIPTOR, it) }
        input.interfaceType?.let { field(INTERFACETYPE_DESCRIPTOR, it) }
        input.networkCardIndex?.let { field(NETWORKCARDINDEX_DESCRIPTOR, it) }
        if (input.ipv4Prefixes != null) {
            listField(IPV4PREFIXES_DESCRIPTOR) {
                for (el0 in input.ipv4Prefixes) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeIpv4PrefixSpecificationRequestDocument))
                }
            }
        }
        input.ipv4PrefixCount?.let { field(IPV4PREFIXCOUNT_DESCRIPTOR, it) }
        if (input.ipv6Prefixes != null) {
            listField(IPV6PREFIXES_DESCRIPTOR) {
                for (el0 in input.ipv6Prefixes) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeIpv6PrefixSpecificationRequestDocument))
                }
            }
        }
        input.ipv6PrefixCount?.let { field(IPV6PREFIXCOUNT_DESCRIPTOR, it) }
    }
}