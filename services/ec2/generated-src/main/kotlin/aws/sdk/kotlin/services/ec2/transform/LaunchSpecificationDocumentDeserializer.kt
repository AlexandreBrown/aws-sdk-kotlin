// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.BlockDeviceMapping
import aws.sdk.kotlin.services.ec2.model.GroupIdentifier
import aws.sdk.kotlin.services.ec2.model.InstanceNetworkInterfaceSpecification
import aws.sdk.kotlin.services.ec2.model.InstanceType
import aws.sdk.kotlin.services.ec2.model.LaunchSpecification
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


internal fun deserializeLaunchSpecificationDocument(deserializer: Deserializer): LaunchSpecification {
    val builder = LaunchSpecification.Builder()
    val ADDRESSINGTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("addressingType"))
    val BLOCKDEVICEMAPPINGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("blockDeviceMapping"), XmlCollectionName("item"))
    val EBSOPTIMIZED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("ebsOptimized"))
    val IAMINSTANCEPROFILE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("iamInstanceProfile"))
    val IMAGEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("imageId"))
    val INSTANCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceType"))
    val KERNELID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("kernelId"))
    val KEYNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("keyName"))
    val MONITORING_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("monitoring"))
    val NETWORKINTERFACES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("networkInterfaceSet"), XmlCollectionName("item"))
    val PLACEMENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("placement"))
    val RAMDISKID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ramdiskId"))
    val SECURITYGROUPS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("groupSet"), XmlCollectionName("item"))
    val SUBNETID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("subnetId"))
    val USERDATA_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("userData"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("LaunchSpecification"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ADDRESSINGTYPE_DESCRIPTOR)
        field(BLOCKDEVICEMAPPINGS_DESCRIPTOR)
        field(EBSOPTIMIZED_DESCRIPTOR)
        field(IAMINSTANCEPROFILE_DESCRIPTOR)
        field(IMAGEID_DESCRIPTOR)
        field(INSTANCETYPE_DESCRIPTOR)
        field(KERNELID_DESCRIPTOR)
        field(KEYNAME_DESCRIPTOR)
        field(MONITORING_DESCRIPTOR)
        field(NETWORKINTERFACES_DESCRIPTOR)
        field(PLACEMENT_DESCRIPTOR)
        field(RAMDISKID_DESCRIPTOR)
        field(SECURITYGROUPS_DESCRIPTOR)
        field(SUBNETID_DESCRIPTOR)
        field(USERDATA_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ADDRESSINGTYPE_DESCRIPTOR.index -> builder.addressingType = deserializeString()
                BLOCKDEVICEMAPPINGS_DESCRIPTOR.index -> builder.blockDeviceMappings =
                    deserializer.deserializeList(BLOCKDEVICEMAPPINGS_DESCRIPTOR) {
                        val col0 = mutableListOf<BlockDeviceMapping>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeBlockDeviceMappingDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                EBSOPTIMIZED_DESCRIPTOR.index -> builder.ebsOptimized = deserializeBoolean()
                IAMINSTANCEPROFILE_DESCRIPTOR.index -> builder.iamInstanceProfile = deserializeIamInstanceProfileSpecificationDocument(deserializer)
                IMAGEID_DESCRIPTOR.index -> builder.imageId = deserializeString()
                INSTANCETYPE_DESCRIPTOR.index -> builder.instanceType = deserializeString().let { InstanceType.fromValue(it) }
                KERNELID_DESCRIPTOR.index -> builder.kernelId = deserializeString()
                KEYNAME_DESCRIPTOR.index -> builder.keyName = deserializeString()
                MONITORING_DESCRIPTOR.index -> builder.monitoring = deserializeRunInstancesMonitoringEnabledDocument(deserializer)
                NETWORKINTERFACES_DESCRIPTOR.index -> builder.networkInterfaces =
                    deserializer.deserializeList(NETWORKINTERFACES_DESCRIPTOR) {
                        val col0 = mutableListOf<InstanceNetworkInterfaceSpecification>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeInstanceNetworkInterfaceSpecificationDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                PLACEMENT_DESCRIPTOR.index -> builder.placement = deserializeSpotPlacementDocument(deserializer)
                RAMDISKID_DESCRIPTOR.index -> builder.ramdiskId = deserializeString()
                SECURITYGROUPS_DESCRIPTOR.index -> builder.securityGroups =
                    deserializer.deserializeList(SECURITYGROUPS_DESCRIPTOR) {
                        val col0 = mutableListOf<GroupIdentifier>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeGroupIdentifierDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                SUBNETID_DESCRIPTOR.index -> builder.subnetId = deserializeString()
                USERDATA_DESCRIPTOR.index -> builder.userData = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
