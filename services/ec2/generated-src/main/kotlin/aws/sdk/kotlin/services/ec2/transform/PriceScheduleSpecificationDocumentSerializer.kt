// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.PriceScheduleSpecification
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal fun serializePriceScheduleSpecificationDocument(serializer: Serializer, input: PriceScheduleSpecification) {
    val CURRENCYCODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("CurrencyCode"))
    val PRICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Double, FormUrlSerialName("Price"))
    val TERM_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, FormUrlSerialName("Term"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("PriceScheduleSpecification"))
        field(CURRENCYCODE_DESCRIPTOR)
        field(PRICE_DESCRIPTOR)
        field(TERM_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.currencyCode?.let { field(CURRENCYCODE_DESCRIPTOR, it.value) }
        input.price?.let { field(PRICE_DESCRIPTOR, it) }
        input.term?.let { field(TERM_DESCRIPTOR, it) }
    }
}