// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.services.s3.internal.S3ErrorDetails
import aws.sdk.kotlin.services.s3.internal.parseS3ErrorResponse
import aws.sdk.kotlin.services.s3.internal.setS3ErrorMetadata
import aws.sdk.kotlin.services.s3.model.Initiator
import aws.sdk.kotlin.services.s3.model.ListPartsResponse
import aws.sdk.kotlin.services.s3.model.Owner
import aws.sdk.kotlin.services.s3.model.Part
import aws.sdk.kotlin.services.s3.model.RequestCharged
import aws.sdk.kotlin.services.s3.model.S3Exception
import aws.sdk.kotlin.services.s3.model.StorageClass
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpStatusCode
import aws.smithy.kotlin.runtime.http.isSuccess
import aws.smithy.kotlin.runtime.http.operation.HttpDeserialize
import aws.smithy.kotlin.runtime.http.readAll
import aws.smithy.kotlin.runtime.http.response.HttpResponse
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
import aws.smithy.kotlin.runtime.serde.xml.Flattened
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName
import aws.smithy.kotlin.runtime.time.Instant


internal class ListPartsOperationDeserializer: HttpDeserialize<ListPartsResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): ListPartsResponse {
        if (!response.status.isSuccess()) {
            throwListPartsError(context, response)
        }
        val builder = ListPartsResponse.Builder()

        builder.abortDate = response.headers["x-amz-abort-date"]?.let { Instant.fromRfc5322(it) }
        builder.abortRuleId = response.headers["x-amz-abort-rule-id"]
        builder.requestCharged = response.headers["x-amz-request-charged"]?.let { RequestCharged.fromValue(it) }

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeListPartsOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private fun deserializeListPartsOperationBody(builder: ListPartsResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val BUCKET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Bucket"))
    val INITIATOR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Initiator"))
    val ISTRUNCATED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("IsTruncated"))
    val KEY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Key"))
    val MAXPARTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("MaxParts"))
    val NEXTPARTNUMBERMARKER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("NextPartNumberMarker"))
    val OWNER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Owner"))
    val PARTNUMBERMARKER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("PartNumberMarker"))
    val PARTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("Part"), Flattened)
    val STORAGECLASS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("StorageClass"))
    val UPLOADID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("UploadId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ListPartsResult"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(BUCKET_DESCRIPTOR)
        field(INITIATOR_DESCRIPTOR)
        field(ISTRUNCATED_DESCRIPTOR)
        field(KEY_DESCRIPTOR)
        field(MAXPARTS_DESCRIPTOR)
        field(NEXTPARTNUMBERMARKER_DESCRIPTOR)
        field(OWNER_DESCRIPTOR)
        field(PARTNUMBERMARKER_DESCRIPTOR)
        field(PARTS_DESCRIPTOR)
        field(STORAGECLASS_DESCRIPTOR)
        field(UPLOADID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                BUCKET_DESCRIPTOR.index -> builder.bucket = deserializeString()
                INITIATOR_DESCRIPTOR.index -> builder.initiator = deserializeInitiatorDocument(deserializer)
                ISTRUNCATED_DESCRIPTOR.index -> builder.isTruncated = deserializeBoolean()
                KEY_DESCRIPTOR.index -> builder.key = deserializeString()
                MAXPARTS_DESCRIPTOR.index -> builder.maxParts = deserializeInt()
                NEXTPARTNUMBERMARKER_DESCRIPTOR.index -> builder.nextPartNumberMarker = deserializeString()
                OWNER_DESCRIPTOR.index -> builder.owner = deserializeOwnerDocument(deserializer)
                PARTNUMBERMARKER_DESCRIPTOR.index -> builder.partNumberMarker = deserializeString()
                PARTS_DESCRIPTOR.index -> builder.parts =
                    deserializer.deserializeList(PARTS_DESCRIPTOR) {
                        val col0 = mutableListOf<Part>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializePartDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                STORAGECLASS_DESCRIPTOR.index -> builder.storageClass = deserializeString().let { StorageClass.fromValue(it) }
                UPLOADID_DESCRIPTOR.index -> builder.uploadId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwListPartsError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
    val payload = response.body.readAll()
    val wrappedResponse = response.withPayload(payload)

    val errorDetails = try {
        if (payload == null && response.status == HttpStatusCode.NotFound) {
            S3ErrorDetails(code = "NotFound")
        } else {
            checkNotNull(payload){ "unable to parse error from empty response" }
            parseS3ErrorResponse(payload)
        }
    } catch (ex: Exception) {
        throw UnknownServiceErrorException("failed to parse response as restXml error", ex).also {
            setS3ErrorMetadata(it, wrappedResponse, null)
        }
    }

    throw S3Exception(errorDetails.message)
}
