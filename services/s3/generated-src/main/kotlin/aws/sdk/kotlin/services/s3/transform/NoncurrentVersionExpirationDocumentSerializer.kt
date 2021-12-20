// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.NoncurrentVersionExpiration
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


internal fun serializeNoncurrentVersionExpirationDocument(serializer: Serializer, input: NoncurrentVersionExpiration) {
    val NEWERNONCURRENTVERSIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("NewerNoncurrentVersions"))
    val NONCURRENTDAYS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("NoncurrentDays"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("NoncurrentVersionExpiration"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(NEWERNONCURRENTVERSIONS_DESCRIPTOR)
        field(NONCURRENTDAYS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.newerNoncurrentVersions != 0) field(NEWERNONCURRENTVERSIONS_DESCRIPTOR, input.newerNoncurrentVersions)
        if (input.noncurrentDays != 0) field(NONCURRENTDAYS_DESCRIPTOR, input.noncurrentDays)
    }
}