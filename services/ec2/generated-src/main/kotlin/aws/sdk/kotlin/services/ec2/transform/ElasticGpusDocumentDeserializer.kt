// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ElasticGpuState
import aws.sdk.kotlin.services.ec2.model.ElasticGpus
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


internal fun deserializeElasticGpusDocument(deserializer: Deserializer): ElasticGpus {
    val builder = ElasticGpus.Builder()
    val AVAILABILITYZONE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("availabilityZone"))
    val ELASTICGPUHEALTH_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("elasticGpuHealth"))
    val ELASTICGPUID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("elasticGpuId"))
    val ELASTICGPUSTATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("elasticGpuState"))
    val ELASTICGPUTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("elasticGpuType"))
    val INSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceId"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ElasticGpus"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(AVAILABILITYZONE_DESCRIPTOR)
        field(ELASTICGPUHEALTH_DESCRIPTOR)
        field(ELASTICGPUID_DESCRIPTOR)
        field(ELASTICGPUSTATE_DESCRIPTOR)
        field(ELASTICGPUTYPE_DESCRIPTOR)
        field(INSTANCEID_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                AVAILABILITYZONE_DESCRIPTOR.index -> builder.availabilityZone = deserializeString()
                ELASTICGPUHEALTH_DESCRIPTOR.index -> builder.elasticGpuHealth = deserializeElasticGpuHealthDocument(deserializer)
                ELASTICGPUID_DESCRIPTOR.index -> builder.elasticGpuId = deserializeString()
                ELASTICGPUSTATE_DESCRIPTOR.index -> builder.elasticGpuState = deserializeString().let { ElasticGpuState.fromValue(it) }
                ELASTICGPUTYPE_DESCRIPTOR.index -> builder.elasticGpuType = deserializeString()
                INSTANCEID_DESCRIPTOR.index -> builder.instanceId = deserializeString()
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
