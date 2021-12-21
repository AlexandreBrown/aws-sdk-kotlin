// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.ReplicationRuleAndOperator
import aws.sdk.kotlin.services.s3.model.ReplicationRuleFilter
import aws.sdk.kotlin.services.s3.model.Tag
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


internal fun serializeReplicationRuleFilterDocument(serializer: Serializer, input: ReplicationRuleFilter) {
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

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        when (input) {
            is ReplicationRuleFilter.And -> field(AND_DESCRIPTOR, input.value, ::serializeReplicationRuleAndOperatorDocument)
            is ReplicationRuleFilter.Prefix -> field(PREFIX_DESCRIPTOR, input.value)
            is ReplicationRuleFilter.Tag -> field(TAG_DESCRIPTOR, input.value, ::serializeTagDocument)
        }
    }
}
