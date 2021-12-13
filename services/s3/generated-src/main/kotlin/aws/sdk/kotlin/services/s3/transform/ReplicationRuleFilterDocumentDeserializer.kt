// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.ReplicationRuleFilter
import aws.smithy.kotlin.runtime.serde.DeserializationException
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


internal fun deserializeReplicationRuleFilterDocument(deserializer: Deserializer): ReplicationRuleFilter {
    var value: ReplicationRuleFilter? = null
    val AND_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("And"))
    val PREFIX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Prefix"))
    val TAG_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Tag"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ReplicationRuleFilter"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(AND_DESCRIPTOR)
        field(PREFIX_DESCRIPTOR)
        field(TAG_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while(true) {
            when(findNextFieldIndex()) {
                AND_DESCRIPTOR.index -> value = ReplicationRuleFilter.And(deserializeReplicationRuleAndOperatorDocument(deserializer))
                PREFIX_DESCRIPTOR.index -> value = ReplicationRuleFilter.Prefix(deserializeString())
                TAG_DESCRIPTOR.index -> value = ReplicationRuleFilter.Tag(deserializeTagDocument(deserializer))
                null -> break@loop
                else -> value = ReplicationRuleFilter.SdkUnknown.also { skipValue() }
            }
        }
    }
    return value ?: throw DeserializationException("Deserialized value unexpectedly null: ReplicationRuleFilter")
}
