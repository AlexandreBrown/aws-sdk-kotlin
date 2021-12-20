// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.ObjectLockConfiguration
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


internal fun serializeObjectLockConfigurationDocument(serializer: Serializer, input: ObjectLockConfiguration) {
    val OBJECTLOCKENABLED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ObjectLockEnabled"))
    val RULE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Rule"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ObjectLockConfiguration"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(OBJECTLOCKENABLED_DESCRIPTOR)
        field(RULE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.objectLockEnabled?.let { field(OBJECTLOCKENABLED_DESCRIPTOR, it.value) }
        input.rule?.let { field(RULE_DESCRIPTOR, it, ::serializeObjectLockRuleDocument) }
    }
}