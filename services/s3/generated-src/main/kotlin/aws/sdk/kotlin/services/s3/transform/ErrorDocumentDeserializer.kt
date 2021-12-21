// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.Error
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


internal fun deserializeErrorDocument(deserializer: Deserializer): Error {
    val builder = Error.Builder()
    val CODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Code"))
    val KEY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Key"))
    val MESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Message"))
    val VERSIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("VersionId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("Error"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(CODE_DESCRIPTOR)
        field(KEY_DESCRIPTOR)
        field(MESSAGE_DESCRIPTOR)
        field(VERSIONID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CODE_DESCRIPTOR.index -> builder.code = deserializeString()
                KEY_DESCRIPTOR.index -> builder.key = deserializeString()
                MESSAGE_DESCRIPTOR.index -> builder.message = deserializeString()
                VERSIONID_DESCRIPTOR.index -> builder.versionId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}