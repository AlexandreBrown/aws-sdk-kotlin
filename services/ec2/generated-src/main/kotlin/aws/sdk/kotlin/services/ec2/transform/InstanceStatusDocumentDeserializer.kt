// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.InstanceStatus
import aws.sdk.kotlin.services.ec2.model.InstanceStatusEvent
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


internal fun deserializeInstanceStatusDocument(deserializer: Deserializer): InstanceStatus {
    val builder = InstanceStatus.Builder()
    val AVAILABILITYZONE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("availabilityZone"))
    val EVENTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("eventsSet"), XmlCollectionName("item"))
    val INSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceId"))
    val INSTANCESTATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("instanceState"))
    val INSTANCESTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("instanceStatus"))
    val OUTPOSTARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("outpostArn"))
    val SYSTEMSTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("systemStatus"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("InstanceStatus"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(AVAILABILITYZONE_DESCRIPTOR)
        field(EVENTS_DESCRIPTOR)
        field(INSTANCEID_DESCRIPTOR)
        field(INSTANCESTATE_DESCRIPTOR)
        field(INSTANCESTATUS_DESCRIPTOR)
        field(OUTPOSTARN_DESCRIPTOR)
        field(SYSTEMSTATUS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                AVAILABILITYZONE_DESCRIPTOR.index -> builder.availabilityZone = deserializeString()
                EVENTS_DESCRIPTOR.index -> builder.events =
                    deserializer.deserializeList(EVENTS_DESCRIPTOR) {
                        val col0 = mutableListOf<InstanceStatusEvent>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeInstanceStatusEventDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                INSTANCEID_DESCRIPTOR.index -> builder.instanceId = deserializeString()
                INSTANCESTATE_DESCRIPTOR.index -> builder.instanceState = deserializeInstanceStateDocument(deserializer)
                INSTANCESTATUS_DESCRIPTOR.index -> builder.instanceStatus = deserializeInstanceStatusSummaryDocument(deserializer)
                OUTPOSTARN_DESCRIPTOR.index -> builder.outpostArn = deserializeString()
                SYSTEMSTATUS_DESCRIPTOR.index -> builder.systemStatus = deserializeInstanceStatusSummaryDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
