// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.BatchState
import aws.sdk.kotlin.services.ec2.model.CancelSpotFleetRequestsSuccessItem
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


internal fun deserializeCancelSpotFleetRequestsSuccessItemDocument(deserializer: Deserializer): CancelSpotFleetRequestsSuccessItem {
    val builder = CancelSpotFleetRequestsSuccessItem.Builder()
    val CURRENTSPOTFLEETREQUESTSTATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("currentSpotFleetRequestState"))
    val PREVIOUSSPOTFLEETREQUESTSTATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("previousSpotFleetRequestState"))
    val SPOTFLEETREQUESTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("spotFleetRequestId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("CancelSpotFleetRequestsSuccessItem"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CURRENTSPOTFLEETREQUESTSTATE_DESCRIPTOR)
        field(PREVIOUSSPOTFLEETREQUESTSTATE_DESCRIPTOR)
        field(SPOTFLEETREQUESTID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CURRENTSPOTFLEETREQUESTSTATE_DESCRIPTOR.index -> builder.currentSpotFleetRequestState = deserializeString().let { BatchState.fromValue(it) }
                PREVIOUSSPOTFLEETREQUESTSTATE_DESCRIPTOR.index -> builder.previousSpotFleetRequestState = deserializeString().let { BatchState.fromValue(it) }
                SPOTFLEETREQUESTID_DESCRIPTOR.index -> builder.spotFleetRequestId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
