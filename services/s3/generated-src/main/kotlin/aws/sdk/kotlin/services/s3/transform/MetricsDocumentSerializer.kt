// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.Metrics
import aws.sdk.kotlin.services.s3.model.MetricsStatus
import aws.sdk.kotlin.services.s3.model.ReplicationTimeValue
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


internal fun serializeMetricsDocument(serializer: Serializer, input: Metrics) {
    val EVENTTHRESHOLD_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("EventThreshold"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Status"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("Metrics"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(EVENTTHRESHOLD_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.eventThreshold?.let { field(EVENTTHRESHOLD_DESCRIPTOR, it, ::serializeReplicationTimeValueDocument) }
        input.status?.let { field(STATUS_DESCRIPTOR, it.value) }
    }
}
