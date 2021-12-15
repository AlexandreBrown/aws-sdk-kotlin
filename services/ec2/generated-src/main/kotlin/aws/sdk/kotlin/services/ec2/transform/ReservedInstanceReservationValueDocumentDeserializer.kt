// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ReservedInstanceReservationValue
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


internal fun deserializeReservedInstanceReservationValueDocument(deserializer: Deserializer): ReservedInstanceReservationValue {
    val builder = ReservedInstanceReservationValue.Builder()
    val RESERVATIONVALUE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("reservationValue"))
    val RESERVEDINSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("reservedInstanceId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ReservedInstanceReservationValue"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(RESERVATIONVALUE_DESCRIPTOR)
        field(RESERVEDINSTANCEID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                RESERVATIONVALUE_DESCRIPTOR.index -> builder.reservationValue = deserializeReservationValueDocument(deserializer)
                RESERVEDINSTANCEID_DESCRIPTOR.index -> builder.reservedInstanceId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
