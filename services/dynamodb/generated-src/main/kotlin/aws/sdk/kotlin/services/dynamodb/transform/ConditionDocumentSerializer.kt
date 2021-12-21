// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.AttributeValue
import aws.sdk.kotlin.services.dynamodb.model.ComparisonOperator
import aws.sdk.kotlin.services.dynamodb.model.Condition
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


internal fun serializeConditionDocument(serializer: Serializer, input: Condition) {
    val ATTRIBUTEVALUELIST_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("AttributeValueList"))
    val COMPARISONOPERATOR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ComparisonOperator"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(ATTRIBUTEVALUELIST_DESCRIPTOR)
        field(COMPARISONOPERATOR_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.attributeValueList != null) {
            listField(ATTRIBUTEVALUELIST_DESCRIPTOR) {
                for (el0 in input.attributeValueList) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeAttributeValueDocument))
                }
            }
        }
        input.comparisonOperator?.let { field(COMPARISONOPERATOR_DESCRIPTOR, it.value) }
    }
}
