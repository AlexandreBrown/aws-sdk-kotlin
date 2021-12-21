// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CurrencyCodeValues
import aws.sdk.kotlin.services.ec2.model.ReservedInstanceLimitPrice
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


internal fun serializeReservedInstanceLimitPriceDocument(serializer: Serializer, input: ReservedInstanceLimitPrice) {
    val AMOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Double, FormUrlSerialName("Amount"))
    val CURRENCYCODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("CurrencyCode"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ReservedInstanceLimitPrice"))
        field(AMOUNT_DESCRIPTOR)
        field(CURRENCYCODE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.amount?.let { field(AMOUNT_DESCRIPTOR, it) }
        input.currencyCode?.let { field(CURRENCYCODE_DESCRIPTOR, it.value) }
    }
}
