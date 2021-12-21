// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ScheduledInstancesIpv6Address
import aws.sdk.kotlin.services.ec2.model.ScheduledInstancesNetworkInterface
import aws.sdk.kotlin.services.ec2.model.ScheduledInstancesPrivateIpAddressConfig
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


internal fun serializeScheduledInstancesNetworkInterfaceDocument(serializer: Serializer, input: ScheduledInstancesNetworkInterface) {
    val ASSOCIATEPUBLICIPADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("AssociatePublicIpAddress"))
    val DELETEONTERMINATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DeleteOnTermination"))
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Description"))
    val DEVICEINDEX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("DeviceIndex"))
    val GROUPS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Group"), FormUrlFlattened)
    val IPV6ADDRESSCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("Ipv6AddressCount"))
    val IPV6ADDRESSES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Ipv6Address"), FormUrlFlattened)
    val NETWORKINTERFACEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("NetworkInterfaceId"))
    val PRIVATEIPADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("PrivateIpAddress"))
    val PRIVATEIPADDRESSCONFIGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("PrivateIpAddressConfig"), FormUrlFlattened)
    val SECONDARYPRIVATEIPADDRESSCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("SecondaryPrivateIpAddressCount"))
    val SUBNETID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("SubnetId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ScheduledInstancesNetworkInterface"))
        field(ASSOCIATEPUBLICIPADDRESS_DESCRIPTOR)
        field(DELETEONTERMINATION_DESCRIPTOR)
        field(DESCRIPTION_DESCRIPTOR)
        field(DEVICEINDEX_DESCRIPTOR)
        field(GROUPS_DESCRIPTOR)
        field(IPV6ADDRESSCOUNT_DESCRIPTOR)
        field(IPV6ADDRESSES_DESCRIPTOR)
        field(NETWORKINTERFACEID_DESCRIPTOR)
        field(PRIVATEIPADDRESS_DESCRIPTOR)
        field(PRIVATEIPADDRESSCONFIGS_DESCRIPTOR)
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
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeScheduledInstancesIpv6AddressDocument))
                }
            }
        }
        input.networkInterfaceId?.let { field(NETWORKINTERFACEID_DESCRIPTOR, it) }
        input.privateIpAddress?.let { field(PRIVATEIPADDRESS_DESCRIPTOR, it) }
        if (input.privateIpAddressConfigs != null) {
            listField(PRIVATEIPADDRESSCONFIGS_DESCRIPTOR) {
                for (el0 in input.privateIpAddressConfigs) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeScheduledInstancesPrivateIpAddressConfigDocument))
                }
            }
        }
        input.secondaryPrivateIpAddressCount?.let { field(SECONDARYPRIVATEIPADDRESSCOUNT_DESCRIPTOR, it) }
        input.subnetId?.let { field(SUBNETID_DESCRIPTOR, it) }
    }
}