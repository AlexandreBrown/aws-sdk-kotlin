// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ScheduledInstance
import aws.sdk.kotlin.services.ec2.model.ScheduledInstanceRecurrence
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
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName
import aws.smithy.kotlin.runtime.time.Instant


internal fun deserializeScheduledInstanceDocument(deserializer: Deserializer): ScheduledInstance {
    val builder = ScheduledInstance.Builder()
    val AVAILABILITYZONE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("availabilityZone"))
    val CREATEDATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("createDate"))
    val HOURLYPRICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("hourlyPrice"))
    val INSTANCECOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("instanceCount"))
    val INSTANCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceType"))
    val NETWORKPLATFORM_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkPlatform"))
    val NEXTSLOTSTARTTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("nextSlotStartTime"))
    val PLATFORM_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("platform"))
    val PREVIOUSSLOTENDTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("previousSlotEndTime"))
    val RECURRENCE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("recurrence"))
    val SCHEDULEDINSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("scheduledInstanceId"))
    val SLOTDURATIONINHOURS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("slotDurationInHours"))
    val TERMENDDATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("termEndDate"))
    val TERMSTARTDATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("termStartDate"))
    val TOTALSCHEDULEDINSTANCEHOURS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("totalScheduledInstanceHours"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ScheduledInstance"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(AVAILABILITYZONE_DESCRIPTOR)
        field(CREATEDATE_DESCRIPTOR)
        field(HOURLYPRICE_DESCRIPTOR)
        field(INSTANCECOUNT_DESCRIPTOR)
        field(INSTANCETYPE_DESCRIPTOR)
        field(NETWORKPLATFORM_DESCRIPTOR)
        field(NEXTSLOTSTARTTIME_DESCRIPTOR)
        field(PLATFORM_DESCRIPTOR)
        field(PREVIOUSSLOTENDTIME_DESCRIPTOR)
        field(RECURRENCE_DESCRIPTOR)
        field(SCHEDULEDINSTANCEID_DESCRIPTOR)
        field(SLOTDURATIONINHOURS_DESCRIPTOR)
        field(TERMENDDATE_DESCRIPTOR)
        field(TERMSTARTDATE_DESCRIPTOR)
        field(TOTALSCHEDULEDINSTANCEHOURS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                AVAILABILITYZONE_DESCRIPTOR.index -> builder.availabilityZone = deserializeString()
                CREATEDATE_DESCRIPTOR.index -> builder.createDate = deserializeString().let { Instant.fromIso8601(it) }
                HOURLYPRICE_DESCRIPTOR.index -> builder.hourlyPrice = deserializeString()
                INSTANCECOUNT_DESCRIPTOR.index -> builder.instanceCount = deserializeInt()
                INSTANCETYPE_DESCRIPTOR.index -> builder.instanceType = deserializeString()
                NETWORKPLATFORM_DESCRIPTOR.index -> builder.networkPlatform = deserializeString()
                NEXTSLOTSTARTTIME_DESCRIPTOR.index -> builder.nextSlotStartTime = deserializeString().let { Instant.fromIso8601(it) }
                PLATFORM_DESCRIPTOR.index -> builder.platform = deserializeString()
                PREVIOUSSLOTENDTIME_DESCRIPTOR.index -> builder.previousSlotEndTime = deserializeString().let { Instant.fromIso8601(it) }
                RECURRENCE_DESCRIPTOR.index -> builder.recurrence = deserializeScheduledInstanceRecurrenceDocument(deserializer)
                SCHEDULEDINSTANCEID_DESCRIPTOR.index -> builder.scheduledInstanceId = deserializeString()
                SLOTDURATIONINHOURS_DESCRIPTOR.index -> builder.slotDurationInHours = deserializeInt()
                TERMENDDATE_DESCRIPTOR.index -> builder.termEndDate = deserializeString().let { Instant.fromIso8601(it) }
                TERMSTARTDATE_DESCRIPTOR.index -> builder.termStartDate = deserializeString().let { Instant.fromIso8601(it) }
                TOTALSCHEDULEDINSTANCEHOURS_DESCRIPTOR.index -> builder.totalScheduledInstanceHours = deserializeInt()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
