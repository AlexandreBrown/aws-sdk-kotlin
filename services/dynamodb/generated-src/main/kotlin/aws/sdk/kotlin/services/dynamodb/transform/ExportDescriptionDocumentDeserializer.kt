// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.ExportDescription
import aws.sdk.kotlin.services.dynamodb.model.ExportFormat
import aws.sdk.kotlin.services.dynamodb.model.ExportStatus
import aws.sdk.kotlin.services.dynamodb.model.S3SseAlgorithm
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
import aws.smithy.kotlin.runtime.time.Instant


internal fun deserializeExportDescriptionDocument(deserializer: Deserializer): ExportDescription {
    val builder = ExportDescription.Builder()
    val BILLEDSIZEBYTES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, JsonSerialName("BilledSizeBytes"))
    val CLIENTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ClientToken"))
    val ENDTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, JsonSerialName("EndTime"))
    val EXPORTARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ExportArn"))
    val EXPORTFORMAT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ExportFormat"))
    val EXPORTMANIFEST_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ExportManifest"))
    val EXPORTSTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ExportStatus"))
    val EXPORTTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, JsonSerialName("ExportTime"))
    val FAILURECODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("FailureCode"))
    val FAILUREMESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("FailureMessage"))
    val ITEMCOUNT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, JsonSerialName("ItemCount"))
    val S3BUCKET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("S3Bucket"))
    val S3BUCKETOWNER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("S3BucketOwner"))
    val S3PREFIX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("S3Prefix"))
    val S3SSEALGORITHM_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("S3SseAlgorithm"))
    val S3SSEKMSKEYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("S3SseKmsKeyId"))
    val STARTTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, JsonSerialName("StartTime"))
    val TABLEARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TableArn"))
    val TABLEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TableId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(BILLEDSIZEBYTES_DESCRIPTOR)
        field(CLIENTTOKEN_DESCRIPTOR)
        field(ENDTIME_DESCRIPTOR)
        field(EXPORTARN_DESCRIPTOR)
        field(EXPORTFORMAT_DESCRIPTOR)
        field(EXPORTMANIFEST_DESCRIPTOR)
        field(EXPORTSTATUS_DESCRIPTOR)
        field(EXPORTTIME_DESCRIPTOR)
        field(FAILURECODE_DESCRIPTOR)
        field(FAILUREMESSAGE_DESCRIPTOR)
        field(ITEMCOUNT_DESCRIPTOR)
        field(S3BUCKET_DESCRIPTOR)
        field(S3BUCKETOWNER_DESCRIPTOR)
        field(S3PREFIX_DESCRIPTOR)
        field(S3SSEALGORITHM_DESCRIPTOR)
        field(S3SSEKMSKEYID_DESCRIPTOR)
        field(STARTTIME_DESCRIPTOR)
        field(TABLEARN_DESCRIPTOR)
        field(TABLEID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                BILLEDSIZEBYTES_DESCRIPTOR.index -> builder.billedSizeBytes = deserializeLong()
                CLIENTTOKEN_DESCRIPTOR.index -> builder.clientToken = deserializeString()
                ENDTIME_DESCRIPTOR.index -> builder.endTime = deserializeString().let { Instant.fromEpochSeconds(it) }
                EXPORTARN_DESCRIPTOR.index -> builder.exportArn = deserializeString()
                EXPORTFORMAT_DESCRIPTOR.index -> builder.exportFormat = deserializeString().let { ExportFormat.fromValue(it) }
                EXPORTMANIFEST_DESCRIPTOR.index -> builder.exportManifest = deserializeString()
                EXPORTSTATUS_DESCRIPTOR.index -> builder.exportStatus = deserializeString().let { ExportStatus.fromValue(it) }
                EXPORTTIME_DESCRIPTOR.index -> builder.exportTime = deserializeString().let { Instant.fromEpochSeconds(it) }
                FAILURECODE_DESCRIPTOR.index -> builder.failureCode = deserializeString()
                FAILUREMESSAGE_DESCRIPTOR.index -> builder.failureMessage = deserializeString()
                ITEMCOUNT_DESCRIPTOR.index -> builder.itemCount = deserializeLong()
                S3BUCKET_DESCRIPTOR.index -> builder.s3Bucket = deserializeString()
                S3BUCKETOWNER_DESCRIPTOR.index -> builder.s3BucketOwner = deserializeString()
                S3PREFIX_DESCRIPTOR.index -> builder.s3Prefix = deserializeString()
                S3SSEALGORITHM_DESCRIPTOR.index -> builder.s3SseAlgorithm = deserializeString().let { S3SseAlgorithm.fromValue(it) }
                S3SSEKMSKEYID_DESCRIPTOR.index -> builder.s3SseKmsKeyId = deserializeString()
                STARTTIME_DESCRIPTOR.index -> builder.startTime = deserializeString().let { Instant.fromEpochSeconds(it) }
                TABLEARN_DESCRIPTOR.index -> builder.tableArn = deserializeString()
                TABLEID_DESCRIPTOR.index -> builder.tableId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}