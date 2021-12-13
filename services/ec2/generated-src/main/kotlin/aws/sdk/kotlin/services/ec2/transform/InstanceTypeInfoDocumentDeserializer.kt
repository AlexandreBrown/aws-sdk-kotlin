// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.BootModeType
import aws.sdk.kotlin.services.ec2.model.InstanceType
import aws.sdk.kotlin.services.ec2.model.InstanceTypeHypervisor
import aws.sdk.kotlin.services.ec2.model.InstanceTypeInfo
import aws.sdk.kotlin.services.ec2.model.RootDeviceType
import aws.sdk.kotlin.services.ec2.model.UsageClassType
import aws.sdk.kotlin.services.ec2.model.VirtualizationType
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


internal fun deserializeInstanceTypeInfoDocument(deserializer: Deserializer): InstanceTypeInfo {
    val builder = InstanceTypeInfo.Builder()
    val AUTORECOVERYSUPPORTED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("autoRecoverySupported"))
    val BAREMETAL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("bareMetal"))
    val BURSTABLEPERFORMANCESUPPORTED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("burstablePerformanceSupported"))
    val CURRENTGENERATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("currentGeneration"))
    val DEDICATEDHOSTSSUPPORTED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("dedicatedHostsSupported"))
    val EBSINFO_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("ebsInfo"))
    val FPGAINFO_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("fpgaInfo"))
    val FREETIERELIGIBLE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("freeTierEligible"))
    val GPUINFO_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("gpuInfo"))
    val HIBERNATIONSUPPORTED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("hibernationSupported"))
    val HYPERVISOR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("hypervisor"))
    val INFERENCEACCELERATORINFO_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("inferenceAcceleratorInfo"))
    val INSTANCESTORAGEINFO_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("instanceStorageInfo"))
    val INSTANCESTORAGESUPPORTED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("instanceStorageSupported"))
    val INSTANCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceType"))
    val MEMORYINFO_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("memoryInfo"))
    val NETWORKINFO_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("networkInfo"))
    val PLACEMENTGROUPINFO_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("placementGroupInfo"))
    val PROCESSORINFO_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("processorInfo"))
    val SUPPORTEDBOOTMODES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("supportedBootModes"), XmlCollectionName("item"))
    val SUPPORTEDROOTDEVICETYPES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("supportedRootDeviceTypes"), XmlCollectionName("item"))
    val SUPPORTEDUSAGECLASSES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("supportedUsageClasses"), XmlCollectionName("item"))
    val SUPPORTEDVIRTUALIZATIONTYPES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("supportedVirtualizationTypes"), XmlCollectionName("item"))
    val VCPUINFO_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("vCpuInfo"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("InstanceTypeInfo"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(AUTORECOVERYSUPPORTED_DESCRIPTOR)
        field(BAREMETAL_DESCRIPTOR)
        field(BURSTABLEPERFORMANCESUPPORTED_DESCRIPTOR)
        field(CURRENTGENERATION_DESCRIPTOR)
        field(DEDICATEDHOSTSSUPPORTED_DESCRIPTOR)
        field(EBSINFO_DESCRIPTOR)
        field(FPGAINFO_DESCRIPTOR)
        field(FREETIERELIGIBLE_DESCRIPTOR)
        field(GPUINFO_DESCRIPTOR)
        field(HIBERNATIONSUPPORTED_DESCRIPTOR)
        field(HYPERVISOR_DESCRIPTOR)
        field(INFERENCEACCELERATORINFO_DESCRIPTOR)
        field(INSTANCESTORAGEINFO_DESCRIPTOR)
        field(INSTANCESTORAGESUPPORTED_DESCRIPTOR)
        field(INSTANCETYPE_DESCRIPTOR)
        field(MEMORYINFO_DESCRIPTOR)
        field(NETWORKINFO_DESCRIPTOR)
        field(PLACEMENTGROUPINFO_DESCRIPTOR)
        field(PROCESSORINFO_DESCRIPTOR)
        field(SUPPORTEDBOOTMODES_DESCRIPTOR)
        field(SUPPORTEDROOTDEVICETYPES_DESCRIPTOR)
        field(SUPPORTEDUSAGECLASSES_DESCRIPTOR)
        field(SUPPORTEDVIRTUALIZATIONTYPES_DESCRIPTOR)
        field(VCPUINFO_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                AUTORECOVERYSUPPORTED_DESCRIPTOR.index -> builder.autoRecoverySupported = deserializeBoolean()
                BAREMETAL_DESCRIPTOR.index -> builder.bareMetal = deserializeBoolean()
                BURSTABLEPERFORMANCESUPPORTED_DESCRIPTOR.index -> builder.burstablePerformanceSupported = deserializeBoolean()
                CURRENTGENERATION_DESCRIPTOR.index -> builder.currentGeneration = deserializeBoolean()
                DEDICATEDHOSTSSUPPORTED_DESCRIPTOR.index -> builder.dedicatedHostsSupported = deserializeBoolean()
                EBSINFO_DESCRIPTOR.index -> builder.ebsInfo = deserializeEbsInfoDocument(deserializer)
                FPGAINFO_DESCRIPTOR.index -> builder.fpgaInfo = deserializeFpgaInfoDocument(deserializer)
                FREETIERELIGIBLE_DESCRIPTOR.index -> builder.freeTierEligible = deserializeBoolean()
                GPUINFO_DESCRIPTOR.index -> builder.gpuInfo = deserializeGpuInfoDocument(deserializer)
                HIBERNATIONSUPPORTED_DESCRIPTOR.index -> builder.hibernationSupported = deserializeBoolean()
                HYPERVISOR_DESCRIPTOR.index -> builder.hypervisor = deserializeString().let { InstanceTypeHypervisor.fromValue(it) }
                INFERENCEACCELERATORINFO_DESCRIPTOR.index -> builder.inferenceAcceleratorInfo = deserializeInferenceAcceleratorInfoDocument(deserializer)
                INSTANCESTORAGEINFO_DESCRIPTOR.index -> builder.instanceStorageInfo = deserializeInstanceStorageInfoDocument(deserializer)
                INSTANCESTORAGESUPPORTED_DESCRIPTOR.index -> builder.instanceStorageSupported = deserializeBoolean()
                INSTANCETYPE_DESCRIPTOR.index -> builder.instanceType = deserializeString().let { InstanceType.fromValue(it) }
                MEMORYINFO_DESCRIPTOR.index -> builder.memoryInfo = deserializeMemoryInfoDocument(deserializer)
                NETWORKINFO_DESCRIPTOR.index -> builder.networkInfo = deserializeNetworkInfoDocument(deserializer)
                PLACEMENTGROUPINFO_DESCRIPTOR.index -> builder.placementGroupInfo = deserializePlacementGroupInfoDocument(deserializer)
                PROCESSORINFO_DESCRIPTOR.index -> builder.processorInfo = deserializeProcessorInfoDocument(deserializer)
                SUPPORTEDBOOTMODES_DESCRIPTOR.index -> builder.supportedBootModes =
                    deserializer.deserializeList(SUPPORTEDBOOTMODES_DESCRIPTOR) {
                        val col0 = mutableListOf<BootModeType>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString().let { BootModeType.fromValue(it) } } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                SUPPORTEDROOTDEVICETYPES_DESCRIPTOR.index -> builder.supportedRootDeviceTypes =
                    deserializer.deserializeList(SUPPORTEDROOTDEVICETYPES_DESCRIPTOR) {
                        val col0 = mutableListOf<RootDeviceType>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString().let { RootDeviceType.fromValue(it) } } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                SUPPORTEDUSAGECLASSES_DESCRIPTOR.index -> builder.supportedUsageClasses =
                    deserializer.deserializeList(SUPPORTEDUSAGECLASSES_DESCRIPTOR) {
                        val col0 = mutableListOf<UsageClassType>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString().let { UsageClassType.fromValue(it) } } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                SUPPORTEDVIRTUALIZATIONTYPES_DESCRIPTOR.index -> builder.supportedVirtualizationTypes =
                    deserializer.deserializeList(SUPPORTEDVIRTUALIZATIONTYPES_DESCRIPTOR) {
                        val col0 = mutableListOf<VirtualizationType>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString().let { VirtualizationType.fromValue(it) } } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                VCPUINFO_DESCRIPTOR.index -> builder.vCpuInfo = deserializeVCpuInfoDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
