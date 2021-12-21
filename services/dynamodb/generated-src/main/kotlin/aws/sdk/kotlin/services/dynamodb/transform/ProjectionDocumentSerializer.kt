// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.Projection
import aws.sdk.kotlin.services.dynamodb.model.ProjectionType
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


internal fun serializeProjectionDocument(serializer: Serializer, input: Projection) {
    val NONKEYATTRIBUTES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("NonKeyAttributes"))
    val PROJECTIONTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ProjectionType"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(NONKEYATTRIBUTES_DESCRIPTOR)
        field(PROJECTIONTYPE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.projectionType?.let { field(PROJECTIONTYPE_DESCRIPTOR, it.value) }
        if (input.nonKeyAttributes != null) {
            listField(NONKEYATTRIBUTES_DESCRIPTOR) {
                for (el0 in input.nonKeyAttributes) {
                    serializeString(el0)
                }
            }
        }
    }
}