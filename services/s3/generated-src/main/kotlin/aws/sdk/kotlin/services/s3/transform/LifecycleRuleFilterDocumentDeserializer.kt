// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.LifecycleRuleFilter
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


internal fun deserializeLifecycleRuleFilterDocument(deserializer: Deserializer): LifecycleRuleFilter {
    var value: LifecycleRuleFilter? = null
    val AND_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("And"))
    val OBJECTSIZEGREATERTHAN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, XmlSerialName("ObjectSizeGreaterThan"))
    val OBJECTSIZELESSTHAN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, XmlSerialName("ObjectSizeLessThan"))
    val PREFIX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Prefix"))
    val TAG_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Tag"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("LifecycleRuleFilter"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(AND_DESCRIPTOR)
        field(OBJECTSIZEGREATERTHAN_DESCRIPTOR)
        field(OBJECTSIZELESSTHAN_DESCRIPTOR)
        field(PREFIX_DESCRIPTOR)
        field(TAG_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while(true) {
            when(findNextFieldIndex()) {
                AND_DESCRIPTOR.index -> value = LifecycleRuleFilter.And(deserializeLifecycleRuleAndOperatorDocument(deserializer))
                OBJECTSIZEGREATERTHAN_DESCRIPTOR.index -> value = LifecycleRuleFilter.ObjectSizeGreaterThan(deserializeLong())
                OBJECTSIZELESSTHAN_DESCRIPTOR.index -> value = LifecycleRuleFilter.ObjectSizeLessThan(deserializeLong())
                PREFIX_DESCRIPTOR.index -> value = LifecycleRuleFilter.Prefix(deserializeString())
                TAG_DESCRIPTOR.index -> value = LifecycleRuleFilter.Tag(deserializeTagDocument(deserializer))
                null -> break@loop
                else -> value = LifecycleRuleFilter.SdkUnknown.also { skipValue() }
            }
        }
    }
    return value ?: throw DeserializationException("Deserialized value unexpectedly null: LifecycleRuleFilter")
}