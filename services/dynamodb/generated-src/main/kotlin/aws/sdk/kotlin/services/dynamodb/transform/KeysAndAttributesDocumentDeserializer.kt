// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.AttributeValue
import aws.sdk.kotlin.services.dynamodb.model.KeysAndAttributes
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


internal fun deserializeKeysAndAttributesDocument(deserializer: Deserializer): KeysAndAttributes {
    val builder = KeysAndAttributes.Builder()
    val ATTRIBUTESTOGET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("AttributesToGet"))
    val CONSISTENTREAD_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, JsonSerialName("ConsistentRead"))
    val EXPRESSIONATTRIBUTENAMES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Map, JsonSerialName("ExpressionAttributeNames"))
    val KEYS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("Keys"))
    val KEYS_C0_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Map)
    val PROJECTIONEXPRESSION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ProjectionExpression"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(ATTRIBUTESTOGET_DESCRIPTOR)
        field(CONSISTENTREAD_DESCRIPTOR)
        field(EXPRESSIONATTRIBUTENAMES_DESCRIPTOR)
        field(KEYS_DESCRIPTOR)
        field(PROJECTIONEXPRESSION_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ATTRIBUTESTOGET_DESCRIPTOR.index -> builder.attributesToGet =
                    deserializer.deserializeList(ATTRIBUTESTOGET_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                CONSISTENTREAD_DESCRIPTOR.index -> builder.consistentRead = deserializeBoolean()
                EXPRESSIONATTRIBUTENAMES_DESCRIPTOR.index -> builder.expressionAttributeNames =
                    deserializer.deserializeMap(EXPRESSIONATTRIBUTENAMES_DESCRIPTOR) {
                        val map0 = mutableMapOf<String, String>()
                        while (hasNextEntry()) {
                            val k0 = key()
                            val v0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            map0[k0] = v0
                        }
                        map0
                    }
                KEYS_DESCRIPTOR.index -> builder.keys =
                    deserializer.deserializeList(KEYS_DESCRIPTOR) {
                        val col0 = mutableListOf<Map<String, AttributeValue>>()
                        while (hasNextElement()) {
                            val el0 = deserializer.deserializeMap(KEYS_C0_DESCRIPTOR) {
                                val map1 = mutableMapOf<String, AttributeValue>()
                                while (hasNextEntry()) {
                                    val k1 = key()
                                    val v1 = if (nextHasValue()) { deserializeAttributeValueDocument(deserializer) } else { deserializeNull(); continue }
                                    map1[k1] = v1
                                }
                                map1
                            }
                            col0.add(el0)
                        }
                        col0
                    }
                PROJECTIONEXPRESSION_DESCRIPTOR.index -> builder.projectionExpression = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
