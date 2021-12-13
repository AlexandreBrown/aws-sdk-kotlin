// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.GroupIdentifier
import aws.sdk.kotlin.services.ec2.model.Ipv4PrefixSpecification
import aws.sdk.kotlin.services.ec2.model.Ipv6PrefixSpecification
import aws.sdk.kotlin.services.ec2.model.NetworkInterface
import aws.sdk.kotlin.services.ec2.model.NetworkInterfaceIpv6Address
import aws.sdk.kotlin.services.ec2.model.NetworkInterfacePrivateIpAddress
import aws.sdk.kotlin.services.ec2.model.NetworkInterfaceStatus
import aws.sdk.kotlin.services.ec2.model.NetworkInterfaceType
import aws.sdk.kotlin.services.ec2.model.Tag
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


internal fun deserializeNetworkInterfaceDocument(deserializer: Deserializer): NetworkInterface {
    val builder = NetworkInterface.Builder()
    val ASSOCIATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("association"))
    val ATTACHMENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("attachment"))
    val AVAILABILITYZONE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("availabilityZone"))
    val DENYALLIGWTRAFFIC_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("denyAllIgwTraffic"))
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val GROUPS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("groupSet"), XmlCollectionName("item"))
    val INTERFACETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("interfaceType"))
    val IPV4PREFIXES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("ipv4PrefixSet"), XmlCollectionName("item"))
    val IPV6ADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ipv6Address"))
    val IPV6ADDRESSES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("ipv6AddressesSet"), XmlCollectionName("item"))
    val IPV6NATIVE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("ipv6Native"))
    val IPV6PREFIXES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("ipv6PrefixSet"), XmlCollectionName("item"))
    val MACADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("macAddress"))
    val NETWORKINTERFACEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkInterfaceId"))
    val OUTPOSTARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("outpostArn"))
    val OWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ownerId"))
    val PRIVATEDNSNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("privateDnsName"))
    val PRIVATEIPADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("privateIpAddress"))
    val PRIVATEIPADDRESSES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("privateIpAddressesSet"), XmlCollectionName("item"))
    val REQUESTERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("requesterId"))
    val REQUESTERMANAGED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("requesterManaged"))
    val SOURCEDESTCHECK_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("sourceDestCheck"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("status"))
    val SUBNETID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("subnetId"))
    val TAGSET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val VPCID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vpcId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("NetworkInterface"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ASSOCIATION_DESCRIPTOR)
        field(ATTACHMENT_DESCRIPTOR)
        field(AVAILABILITYZONE_DESCRIPTOR)
        field(DENYALLIGWTRAFFIC_DESCRIPTOR)
        field(DESCRIPTION_DESCRIPTOR)
        field(GROUPS_DESCRIPTOR)
        field(INTERFACETYPE_DESCRIPTOR)
        field(IPV4PREFIXES_DESCRIPTOR)
        field(IPV6ADDRESS_DESCRIPTOR)
        field(IPV6ADDRESSES_DESCRIPTOR)
        field(IPV6NATIVE_DESCRIPTOR)
        field(IPV6PREFIXES_DESCRIPTOR)
        field(MACADDRESS_DESCRIPTOR)
        field(NETWORKINTERFACEID_DESCRIPTOR)
        field(OUTPOSTARN_DESCRIPTOR)
        field(OWNERID_DESCRIPTOR)
        field(PRIVATEDNSNAME_DESCRIPTOR)
        field(PRIVATEIPADDRESS_DESCRIPTOR)
        field(PRIVATEIPADDRESSES_DESCRIPTOR)
        field(REQUESTERID_DESCRIPTOR)
        field(REQUESTERMANAGED_DESCRIPTOR)
        field(SOURCEDESTCHECK_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
        field(SUBNETID_DESCRIPTOR)
        field(TAGSET_DESCRIPTOR)
        field(VPCID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ASSOCIATION_DESCRIPTOR.index -> builder.association = deserializeNetworkInterfaceAssociationDocument(deserializer)
                ATTACHMENT_DESCRIPTOR.index -> builder.attachment = deserializeNetworkInterfaceAttachmentDocument(deserializer)
                AVAILABILITYZONE_DESCRIPTOR.index -> builder.availabilityZone = deserializeString()
                DENYALLIGWTRAFFIC_DESCRIPTOR.index -> builder.denyAllIgwTraffic = deserializeBoolean()
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                GROUPS_DESCRIPTOR.index -> builder.groups =
                    deserializer.deserializeList(GROUPS_DESCRIPTOR) {
                        val col0 = mutableListOf<GroupIdentifier>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeGroupIdentifierDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                INTERFACETYPE_DESCRIPTOR.index -> builder.interfaceType = deserializeString().let { NetworkInterfaceType.fromValue(it) }
                IPV4PREFIXES_DESCRIPTOR.index -> builder.ipv4Prefixes =
                    deserializer.deserializeList(IPV4PREFIXES_DESCRIPTOR) {
                        val col0 = mutableListOf<Ipv4PrefixSpecification>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeIpv4PrefixSpecificationDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                IPV6ADDRESS_DESCRIPTOR.index -> builder.ipv6Address = deserializeString()
                IPV6ADDRESSES_DESCRIPTOR.index -> builder.ipv6Addresses =
                    deserializer.deserializeList(IPV6ADDRESSES_DESCRIPTOR) {
                        val col0 = mutableListOf<NetworkInterfaceIpv6Address>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeNetworkInterfaceIpv6AddressDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                IPV6NATIVE_DESCRIPTOR.index -> builder.ipv6Native = deserializeBoolean()
                IPV6PREFIXES_DESCRIPTOR.index -> builder.ipv6Prefixes =
                    deserializer.deserializeList(IPV6PREFIXES_DESCRIPTOR) {
                        val col0 = mutableListOf<Ipv6PrefixSpecification>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeIpv6PrefixSpecificationDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                MACADDRESS_DESCRIPTOR.index -> builder.macAddress = deserializeString()
                NETWORKINTERFACEID_DESCRIPTOR.index -> builder.networkInterfaceId = deserializeString()
                OUTPOSTARN_DESCRIPTOR.index -> builder.outpostArn = deserializeString()
                OWNERID_DESCRIPTOR.index -> builder.ownerId = deserializeString()
                PRIVATEDNSNAME_DESCRIPTOR.index -> builder.privateDnsName = deserializeString()
                PRIVATEIPADDRESS_DESCRIPTOR.index -> builder.privateIpAddress = deserializeString()
                PRIVATEIPADDRESSES_DESCRIPTOR.index -> builder.privateIpAddresses =
                    deserializer.deserializeList(PRIVATEIPADDRESSES_DESCRIPTOR) {
                        val col0 = mutableListOf<NetworkInterfacePrivateIpAddress>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeNetworkInterfacePrivateIpAddressDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                REQUESTERID_DESCRIPTOR.index -> builder.requesterId = deserializeString()
                REQUESTERMANAGED_DESCRIPTOR.index -> builder.requesterManaged = deserializeBoolean()
                SOURCEDESTCHECK_DESCRIPTOR.index -> builder.sourceDestCheck = deserializeBoolean()
                STATUS_DESCRIPTOR.index -> builder.status = deserializeString().let { NetworkInterfaceStatus.fromValue(it) }
                SUBNETID_DESCRIPTOR.index -> builder.subnetId = deserializeString()
                TAGSET_DESCRIPTOR.index -> builder.tagSet =
                    deserializer.deserializeList(TAGSET_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                VPCID_DESCRIPTOR.index -> builder.vpcId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
