// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ScheduledInstanceRecurrenceRequest
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


internal fun serializeScheduledInstanceRecurrenceRequestDocument(serializer: Serializer, input: ScheduledInstanceRecurrenceRequest) {
    val FREQUENCY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Frequency"))
    val INTERVAL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("Interval"))
    val OCCURRENCEDAYS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("OccurrenceDay"), FormUrlFlattened)
    val OCCURRENCERELATIVETOEND_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("OccurrenceRelativeToEnd"))
    val OCCURRENCEUNIT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("OccurrenceUnit"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ScheduledInstanceRecurrenceRequest"))
        field(FREQUENCY_DESCRIPTOR)
        field(INTERVAL_DESCRIPTOR)
        field(OCCURRENCEDAYS_DESCRIPTOR)
        field(OCCURRENCERELATIVETOEND_DESCRIPTOR)
        field(OCCURRENCEUNIT_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.frequency?.let { field(FREQUENCY_DESCRIPTOR, it) }
        input.interval?.let { field(INTERVAL_DESCRIPTOR, it) }
        if (input.occurrenceDays != null) {
            listField(OCCURRENCEDAYS_DESCRIPTOR) {
                for (el0 in input.occurrenceDays) {
                    serializeInt(el0)
                }
            }
        }
        input.occurrenceRelativeToEnd?.let { field(OCCURRENCERELATIVETOEND_DESCRIPTOR, it) }
        input.occurrenceUnit?.let { field(OCCURRENCEUNIT_DESCRIPTOR, it) }
    }
}