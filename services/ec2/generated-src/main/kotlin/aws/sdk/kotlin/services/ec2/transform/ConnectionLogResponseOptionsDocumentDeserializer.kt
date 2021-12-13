// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ConnectionLogResponseOptions
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


internal fun deserializeConnectionLogResponseOptionsDocument(deserializer: Deserializer): ConnectionLogResponseOptions {
    val builder = ConnectionLogResponseOptions.Builder()
    val CLOUDWATCHLOGGROUP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("CloudwatchLogGroup"))
    val CLOUDWATCHLOGSTREAM_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("CloudwatchLogStream"))
    val ENABLED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("Enabled"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ConnectionLogResponseOptions"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CLOUDWATCHLOGGROUP_DESCRIPTOR)
        field(CLOUDWATCHLOGSTREAM_DESCRIPTOR)
        field(ENABLED_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CLOUDWATCHLOGGROUP_DESCRIPTOR.index -> builder.cloudwatchLogGroup = deserializeString()
                CLOUDWATCHLOGSTREAM_DESCRIPTOR.index -> builder.cloudwatchLogStream = deserializeString()
                ENABLED_DESCRIPTOR.index -> builder.enabled = deserializeBoolean()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
