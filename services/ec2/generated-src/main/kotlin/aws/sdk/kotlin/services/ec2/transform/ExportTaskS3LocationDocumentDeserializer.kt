// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ExportTaskS3Location
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


internal fun deserializeExportTaskS3LocationDocument(deserializer: Deserializer): ExportTaskS3Location {
    val builder = ExportTaskS3Location.Builder()
    val S3BUCKET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("s3Bucket"))
    val S3PREFIX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("s3Prefix"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ExportTaskS3Location"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(S3BUCKET_DESCRIPTOR)
        field(S3PREFIX_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                S3BUCKET_DESCRIPTOR.index -> builder.s3Bucket = deserializeString()
                S3PREFIX_DESCRIPTOR.index -> builder.s3Prefix = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
