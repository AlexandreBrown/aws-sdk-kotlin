// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.DeletedObject
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


internal fun deserializeDeletedObjectDocument(deserializer: Deserializer): DeletedObject {
    val builder = DeletedObject.Builder()
    val DELETEMARKER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("DeleteMarker"))
    val DELETEMARKERVERSIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("DeleteMarkerVersionId"))
    val KEY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Key"))
    val VERSIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("VersionId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("DeletedObject"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(DELETEMARKER_DESCRIPTOR)
        field(DELETEMARKERVERSIONID_DESCRIPTOR)
        field(KEY_DESCRIPTOR)
        field(VERSIONID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DELETEMARKER_DESCRIPTOR.index -> builder.deleteMarker = deserializeBoolean()
                DELETEMARKERVERSIONID_DESCRIPTOR.index -> builder.deleteMarkerVersionId = deserializeString()
                KEY_DESCRIPTOR.index -> builder.key = deserializeString()
                VERSIONID_DESCRIPTOR.index -> builder.versionId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
