// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.ContinuousBackupsDescription
import aws.sdk.kotlin.services.dynamodb.model.ContinuousBackupsStatus
import aws.sdk.kotlin.services.dynamodb.model.PointInTimeRecoveryDescription
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


internal fun deserializeContinuousBackupsDescriptionDocument(deserializer: Deserializer): ContinuousBackupsDescription {
    val builder = ContinuousBackupsDescription.Builder()
    val CONTINUOUSBACKUPSSTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ContinuousBackupsStatus"))
    val POINTINTIMERECOVERYDESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("PointInTimeRecoveryDescription"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(CONTINUOUSBACKUPSSTATUS_DESCRIPTOR)
        field(POINTINTIMERECOVERYDESCRIPTION_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CONTINUOUSBACKUPSSTATUS_DESCRIPTOR.index -> builder.continuousBackupsStatus = deserializeString().let { ContinuousBackupsStatus.fromValue(it) }
                POINTINTIMERECOVERYDESCRIPTION_DESCRIPTOR.index -> builder.pointInTimeRecoveryDescription = deserializePointInTimeRecoveryDescriptionDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
