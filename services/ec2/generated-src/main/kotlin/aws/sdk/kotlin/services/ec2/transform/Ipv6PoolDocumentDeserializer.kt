// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.Ipv6Pool
import aws.sdk.kotlin.services.ec2.model.PoolCidrBlock
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


internal fun deserializeIpv6PoolDocument(deserializer: Deserializer): Ipv6Pool {
    val builder = Ipv6Pool.Builder()
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val POOLCIDRBLOCKS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("poolCidrBlockSet"), XmlCollectionName("item"))
    val POOLID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("poolId"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("Ipv6Pool"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DESCRIPTION_DESCRIPTOR)
        field(POOLCIDRBLOCKS_DESCRIPTOR)
        field(POOLID_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                POOLCIDRBLOCKS_DESCRIPTOR.index -> builder.poolCidrBlocks =
                    deserializer.deserializeList(POOLCIDRBLOCKS_DESCRIPTOR) {
                        val col0 = mutableListOf<PoolCidrBlock>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializePoolCidrBlockDocument(deserializer) } else { deserializeNull(); continue }
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
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}