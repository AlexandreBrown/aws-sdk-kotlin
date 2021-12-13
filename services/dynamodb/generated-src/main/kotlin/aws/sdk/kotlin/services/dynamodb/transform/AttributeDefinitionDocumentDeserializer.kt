// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.AttributeDefinition
import aws.sdk.kotlin.services.dynamodb.model.ScalarAttributeType
import aws.smithy.kotlin.runtime.serde.Deserializer
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.json.JsonDeserializer
import aws.smithy.kotlin.runtime.serde.json.JsonSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal fun deserializeAttributeDefinitionDocument(deserializer: Deserializer): AttributeDefinition {
    val builder = AttributeDefinition.Builder()
    val ATTRIBUTENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("AttributeName"))
    val ATTRIBUTETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("AttributeType"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(ATTRIBUTENAME_DESCRIPTOR)
        field(ATTRIBUTETYPE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ATTRIBUTENAME_DESCRIPTOR.index -> builder.attributeName = deserializeString()
                ATTRIBUTETYPE_DESCRIPTOR.index -> builder.attributeType = deserializeString().let { ScalarAttributeType.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
