// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.LifecycleExpiration
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
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
import aws.smithy.kotlin.runtime.time.TimestampFormat


internal fun serializeLifecycleExpirationDocument(serializer: Serializer, input: LifecycleExpiration) {
    val DATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("Date"))
    val DAYS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("Days"))
    val EXPIREDOBJECTDELETEMARKER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("ExpiredObjectDeleteMarker"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("LifecycleExpiration"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(DATE_DESCRIPTOR)
        field(DAYS_DESCRIPTOR)
        field(EXPIREDOBJECTDELETEMARKER_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.date?.let { field(DATE_DESCRIPTOR, it, TimestampFormat.ISO_8601) }
        if (input.days != 0) field(DAYS_DESCRIPTOR, input.days)
        if (input.expiredObjectDeleteMarker != false) field(EXPIREDOBJECTDELETEMARKER_DESCRIPTOR, input.expiredObjectDeleteMarker)
    }
}
