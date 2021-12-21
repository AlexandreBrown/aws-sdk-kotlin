// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.PublicIpv4Pool
import aws.sdk.kotlin.services.ec2.model.PublicIpv4PoolRange
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


internal fun deserializePublicIpv4PoolDocument(deserializer: Deserializer): PublicIpv4Pool {
    val builder = PublicIpv4Pool.Builder()
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val NETWORKBORDERGROUP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkBorderGroup"))
    val POOLADDRESSRANGES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("poolAddressRangeSet"), XmlCollectionName("item"))
    val POOLID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("poolId"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val TOTALADDRESSCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("totalAddressCount"))
    val TOTALAVAILABLEADDRESSCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("totalAvailableAddressCount"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("PublicIpv4Pool"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DESCRIPTION_DESCRIPTOR)
        field(NETWORKBORDERGROUP_DESCRIPTOR)
        field(POOLADDRESSRANGES_DESCRIPTOR)
        field(POOLID_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(TOTALADDRESSCOUNT_DESCRIPTOR)
        field(TOTALAVAILABLEADDRESSCOUNT_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                NETWORKBORDERGROUP_DESCRIPTOR.index -> builder.networkBorderGroup = deserializeString()
                POOLADDRESSRANGES_DESCRIPTOR.index -> builder.poolAddressRanges =
                    deserializer.deserializeList(POOLADDRESSRANGES_DESCRIPTOR) {
                        val col0 = mutableListOf<PublicIpv4PoolRange>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializePublicIpv4PoolRangeDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                POOLID_DESCRIPTOR.index -> builder.poolId = deserializeString()
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                TOTALADDRESSCOUNT_DESCRIPTOR.index -> builder.totalAddressCount = deserializeInt()
                TOTALAVAILABLEADDRESSCOUNT_DESCRIPTOR.index -> builder.totalAvailableAddressCount = deserializeInt()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}