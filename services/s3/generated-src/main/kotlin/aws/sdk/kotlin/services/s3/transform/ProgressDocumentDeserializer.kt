// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.Progress
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


internal fun deserializeProgressDocument(deserializer: Deserializer): Progress {
    val builder = Progress.Builder()
    val BYTESPROCESSED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, XmlSerialName("BytesProcessed"))
    val BYTESRETURNED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, XmlSerialName("BytesReturned"))
    val BYTESSCANNED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, XmlSerialName("BytesScanned"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("Progress"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(BYTESPROCESSED_DESCRIPTOR)
        field(BYTESRETURNED_DESCRIPTOR)
        field(BYTESSCANNED_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                BYTESPROCESSED_DESCRIPTOR.index -> builder.bytesProcessed = deserializeLong()
                BYTESRETURNED_DESCRIPTOR.index -> builder.bytesReturned = deserializeLong()
                BYTESSCANNED_DESCRIPTOR.index -> builder.bytesScanned = deserializeLong()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
