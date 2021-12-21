// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.KeySchemaElement
import aws.sdk.kotlin.services.dynamodb.model.LocalSecondaryIndex
import aws.sdk.kotlin.services.dynamodb.model.Projection
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
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


internal fun serializeLocalSecondaryIndexDocument(serializer: Serializer, input: LocalSecondaryIndex) {
    val INDEXNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("IndexName"))
    val KEYSCHEMA_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("KeySchema"))
    val PROJECTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("Projection"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(INDEXNAME_DESCRIPTOR)
        field(KEYSCHEMA_DESCRIPTOR)
        field(PROJECTION_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.indexName?.let { field(INDEXNAME_DESCRIPTOR, it) }
        if (input.keySchema != null) {
            listField(KEYSCHEMA_DESCRIPTOR) {
                for (el0 in input.keySchema) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeKeySchemaElementDocument))
                }
            }
        }
        input.projection?.let { field(PROJECTION_DESCRIPTOR, it, ::serializeProjectionDocument) }
    }
}
