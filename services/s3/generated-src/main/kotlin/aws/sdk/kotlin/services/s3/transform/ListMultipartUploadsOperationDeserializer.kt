// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.services.s3.internal.S3ErrorDetails
import aws.sdk.kotlin.services.s3.internal.parseS3ErrorResponse
import aws.sdk.kotlin.services.s3.internal.setS3ErrorMetadata
import aws.sdk.kotlin.services.s3.model.CommonPrefix
import aws.sdk.kotlin.services.s3.model.EncodingType
import aws.sdk.kotlin.services.s3.model.ListMultipartUploadsResponse
import aws.sdk.kotlin.services.s3.model.MultipartUpload
import aws.sdk.kotlin.services.s3.model.S3Exception
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


internal class ListMultipartUploadsOperationDeserializer: HttpDeserialize<ListMultipartUploadsResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): ListMultipartUploadsResponse {
        if (!response.status.isSuccess()) {
            throwListMultipartUploadsError(context, response)
        }
        val builder = ListMultipartUploadsResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeListMultipartUploadsOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private fun deserializeListMultipartUploadsOperationBody(builder: ListMultipartUploadsResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val BUCKET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Bucket"))
    val COMMONPREFIXES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("CommonPrefixes"), Flattened)
    val DELIMITER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Delimiter"))
    val ENCODINGTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("EncodingType"))
    val ISTRUNCATED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("IsTruncated"))
    val KEYMARKER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("KeyMarker"))
    val MAXUPLOADS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("MaxUploads"))
    val NEXTKEYMARKER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("NextKeyMarker"))
    val NEXTUPLOADIDMARKER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("NextUploadIdMarker"))
    val PREFIX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Prefix"))
    val UPLOADIDMARKER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("UploadIdMarker"))
    val UPLOADS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("Upload"), Flattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ListMultipartUploadsResult"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(BUCKET_DESCRIPTOR)
        field(COMMONPREFIXES_DESCRIPTOR)
        field(DELIMITER_DESCRIPTOR)
        field(ENCODINGTYPE_DESCRIPTOR)
        field(ISTRUNCATED_DESCRIPTOR)
        field(KEYMARKER_DESCRIPTOR)
        field(MAXUPLOADS_DESCRIPTOR)
        field(NEXTKEYMARKER_DESCRIPTOR)
        field(NEXTUPLOADIDMARKER_DESCRIPTOR)
        field(PREFIX_DESCRIPTOR)
        field(UPLOADIDMARKER_DESCRIPTOR)
        field(UPLOADS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                BUCKET_DESCRIPTOR.index -> builder.bucket = deserializeString()
                COMMONPREFIXES_DESCRIPTOR.index -> builder.commonPrefixes =
                    deserializer.deserializeList(COMMONPREFIXES_DESCRIPTOR) {
                        val col0 = mutableListOf<CommonPrefix>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeCommonPrefixDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                DELIMITER_DESCRIPTOR.index -> builder.delimiter = deserializeString()
                ENCODINGTYPE_DESCRIPTOR.index -> builder.encodingType = deserializeString().let { EncodingType.fromValue(it) }
                ISTRUNCATED_DESCRIPTOR.index -> builder.isTruncated = deserializeBoolean()
                KEYMARKER_DESCRIPTOR.index -> builder.keyMarker = deserializeString()
                MAXUPLOADS_DESCRIPTOR.index -> builder.maxUploads = deserializeInt()
                NEXTKEYMARKER_DESCRIPTOR.index -> builder.nextKeyMarker = deserializeString()
                NEXTUPLOADIDMARKER_DESCRIPTOR.index -> builder.nextUploadIdMarker = deserializeString()
                PREFIX_DESCRIPTOR.index -> builder.prefix = deserializeString()
                UPLOADIDMARKER_DESCRIPTOR.index -> builder.uploadIdMarker = deserializeString()
                UPLOADS_DESCRIPTOR.index -> builder.uploads =
                    deserializer.deserializeList(UPLOADS_DESCRIPTOR) {
                        val col0 = mutableListOf<MultipartUpload>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeMultipartUploadDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwListMultipartUploadsError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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
