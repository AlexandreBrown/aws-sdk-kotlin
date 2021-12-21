// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.services.s3.internal.S3ErrorDetails
import aws.sdk.kotlin.services.s3.internal.parseS3ErrorResponse
import aws.sdk.kotlin.services.s3.internal.setS3ErrorMetadata
import aws.sdk.kotlin.services.s3.model.BucketVersioningStatus
import aws.sdk.kotlin.services.s3.model.GetBucketVersioningResponse
import aws.sdk.kotlin.services.s3.model.MfaDeleteStatus
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
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal class GetBucketVersioningOperationDeserializer: HttpDeserialize<GetBucketVersioningResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): GetBucketVersioningResponse {
        if (!response.status.isSuccess()) {
            throwGetBucketVersioningError(context, response)
        }
        val builder = GetBucketVersioningResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeGetBucketVersioningOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private fun deserializeGetBucketVersioningOperationBody(builder: GetBucketVersioningResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val MFADELETE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("MfaDelete"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Status"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("VersioningConfiguration"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(MFADELETE_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                MFADELETE_DESCRIPTOR.index -> builder.mfaDelete = deserializeString().let { MfaDeleteStatus.fromValue(it) }
                STATUS_DESCRIPTOR.index -> builder.status = deserializeString().let { BucketVersioningStatus.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwGetBucketVersioningError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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