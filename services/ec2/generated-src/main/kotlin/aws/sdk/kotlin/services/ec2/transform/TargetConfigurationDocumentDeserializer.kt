// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.TargetConfiguration
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


internal fun deserializeTargetConfigurationDocument(deserializer: Deserializer): TargetConfiguration {
    val builder = TargetConfiguration.Builder()
    val INSTANCECOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("instanceCount"))
    val OFFERINGID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("offeringId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("TargetConfiguration"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(INSTANCECOUNT_DESCRIPTOR)
        field(OFFERINGID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                INSTANCECOUNT_DESCRIPTOR.index -> builder.instanceCount = deserializeInt()
                OFFERINGID_DESCRIPTOR.index -> builder.offeringId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}