// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.TelemetryStatus
import aws.sdk.kotlin.services.ec2.model.VgwTelemetry
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


internal fun deserializeVgwTelemetryDocument(deserializer: Deserializer): VgwTelemetry {
    val builder = VgwTelemetry.Builder()
    val ACCEPTEDROUTECOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("acceptedRouteCount"))
    val CERTIFICATEARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("certificateArn"))
    val LASTSTATUSCHANGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("lastStatusChange"))
    val OUTSIDEIPADDRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("outsideIpAddress"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("status"))
    val STATUSMESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("statusMessage"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("VgwTelemetry"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ACCEPTEDROUTECOUNT_DESCRIPTOR)
        field(CERTIFICATEARN_DESCRIPTOR)
        field(LASTSTATUSCHANGE_DESCRIPTOR)
        field(OUTSIDEIPADDRESS_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
        field(STATUSMESSAGE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ACCEPTEDROUTECOUNT_DESCRIPTOR.index -> builder.acceptedRouteCount = deserializeInt()
                CERTIFICATEARN_DESCRIPTOR.index -> builder.certificateArn = deserializeString()
                LASTSTATUSCHANGE_DESCRIPTOR.index -> builder.lastStatusChange = deserializeString().let { Instant.fromIso8601(it) }
                OUTSIDEIPADDRESS_DESCRIPTOR.index -> builder.outsideIpAddress = deserializeString()
                STATUS_DESCRIPTOR.index -> builder.status = deserializeString().let { TelemetryStatus.fromValue(it) }
                STATUSMESSAGE_DESCRIPTOR.index -> builder.statusMessage = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
