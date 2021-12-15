// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AllowedPrincipal
import aws.sdk.kotlin.services.ec2.model.PrincipalType
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


internal fun deserializeAllowedPrincipalDocument(deserializer: Deserializer): AllowedPrincipal {
    val builder = AllowedPrincipal.Builder()
    val PRINCIPAL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("principal"))
    val PRINCIPALTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("principalType"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("AllowedPrincipal"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(PRINCIPAL_DESCRIPTOR)
        field(PRINCIPALTYPE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                PRINCIPAL_DESCRIPTOR.index -> builder.principal = deserializeString()
                PRINCIPALTYPE_DESCRIPTOR.index -> builder.principalType = deserializeString().let { PrincipalType.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
