// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.StreamSpecification
import aws.sdk.kotlin.services.dynamodb.model.StreamViewType
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


internal fun serializeStreamSpecificationDocument(serializer: Serializer, input: StreamSpecification) {
    val STREAMENABLED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, JsonSerialName("StreamEnabled"))
    val STREAMVIEWTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("StreamViewType"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(STREAMENABLED_DESCRIPTOR)
        field(STREAMVIEWTYPE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.streamEnabled?.let { field(STREAMENABLED_DESCRIPTOR, it) }
        input.streamViewType?.let { field(STREAMVIEWTYPE_DESCRIPTOR, it.value) }
    }
}
