// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.ServerSideEncryption
import aws.sdk.kotlin.services.s3.model.ServerSideEncryptionByDefault
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


internal fun serializeServerSideEncryptionByDefaultDocument(serializer: Serializer, input: ServerSideEncryptionByDefault) {
    val KMSMASTERKEYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("KMSMasterKeyID"))
    val SSEALGORITHM_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("SSEAlgorithm"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ServerSideEncryptionByDefault"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(KMSMASTERKEYID_DESCRIPTOR)
        field(SSEALGORITHM_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.kmsMasterKeyId?.let { field(KMSMASTERKEYID_DESCRIPTOR, it) }
        input.sseAlgorithm?.let { field(SSEALGORITHM_DESCRIPTOR, it.value) }
    }
}