// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.Tag
import aws.sdk.kotlin.services.ec2.model.TrafficMirrorTarget
import aws.sdk.kotlin.services.ec2.model.TrafficMirrorTargetType
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


internal fun deserializeTrafficMirrorTargetDocument(deserializer: Deserializer): TrafficMirrorTarget {
    val builder = TrafficMirrorTarget.Builder()
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val NETWORKINTERFACEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkInterfaceId"))
    val NETWORKLOADBALANCERARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkLoadBalancerArn"))
    val OWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ownerId"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val TRAFFICMIRRORTARGETID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("trafficMirrorTargetId"))
    val TYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("type"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("TrafficMirrorTarget"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DESCRIPTION_DESCRIPTOR)
        field(NETWORKINTERFACEID_DESCRIPTOR)
        field(NETWORKLOADBALANCERARN_DESCRIPTOR)
        field(OWNERID_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(TRAFFICMIRRORTARGETID_DESCRIPTOR)
        field(TYPE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                NETWORKINTERFACEID_DESCRIPTOR.index -> builder.networkInterfaceId = deserializeString()
                NETWORKLOADBALANCERARN_DESCRIPTOR.index -> builder.networkLoadBalancerArn = deserializeString()
                OWNERID_DESCRIPTOR.index -> builder.ownerId = deserializeString()
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                TRAFFICMIRRORTARGETID_DESCRIPTOR.index -> builder.trafficMirrorTargetId = deserializeString()
                TYPE_DESCRIPTOR.index -> builder.type = deserializeString().let { TrafficMirrorTargetType.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
