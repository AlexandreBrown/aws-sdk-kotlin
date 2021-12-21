// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.BackupDescription
import aws.sdk.kotlin.services.dynamodb.model.BackupDetails
import aws.sdk.kotlin.services.dynamodb.model.SourceTableDetails
import aws.sdk.kotlin.services.dynamodb.model.SourceTableFeatureDetails
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


internal fun deserializeBackupDescriptionDocument(deserializer: Deserializer): BackupDescription {
    val builder = BackupDescription.Builder()
    val BACKUPDETAILS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("BackupDetails"))
    val SOURCETABLEDETAILS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("SourceTableDetails"))
    val SOURCETABLEFEATUREDETAILS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("SourceTableFeatureDetails"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(BACKUPDETAILS_DESCRIPTOR)
        field(SOURCETABLEDETAILS_DESCRIPTOR)
        field(SOURCETABLEFEATUREDETAILS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                BACKUPDETAILS_DESCRIPTOR.index -> builder.backupDetails = deserializeBackupDetailsDocument(deserializer)
                SOURCETABLEDETAILS_DESCRIPTOR.index -> builder.sourceTableDetails = deserializeSourceTableDetailsDocument(deserializer)
                SOURCETABLEFEATUREDETAILS_DESCRIPTOR.index -> builder.sourceTableFeatureDetails = deserializeSourceTableFeatureDetailsDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
