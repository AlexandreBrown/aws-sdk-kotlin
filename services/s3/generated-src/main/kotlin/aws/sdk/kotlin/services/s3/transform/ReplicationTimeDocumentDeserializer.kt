// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.ReplicationTime
import aws.sdk.kotlin.services.s3.model.ReplicationTimeStatus
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


internal fun deserializeReplicationTimeDocument(deserializer: Deserializer): ReplicationTime {
    val builder = ReplicationTime.Builder()
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Status"))
    val TIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Time"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ReplicationTime"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(STATUS_DESCRIPTOR)
        field(TIME_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                STATUS_DESCRIPTOR.index -> builder.status = deserializeString().let { ReplicationTimeStatus.fromValue(it) }
                TIME_DESCRIPTOR.index -> builder.time = deserializeReplicationTimeValueDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}