// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.MetricsConfiguration
import aws.sdk.kotlin.services.s3.model.MetricsFilter
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


internal fun serializeMetricsConfigurationDocument(serializer: Serializer, input: MetricsConfiguration) {
    val FILTER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Filter"))
    val ID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Id"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("MetricsConfiguration"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(FILTER_DESCRIPTOR)
        field(ID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.filter?.let { field(FILTER_DESCRIPTOR, it, ::serializeMetricsFilterDocument) }
        input.id?.let { field(ID_DESCRIPTOR, it) }
    }
}
