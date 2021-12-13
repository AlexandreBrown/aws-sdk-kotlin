// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.services.s3.internal.S3ErrorDetails
import aws.sdk.kotlin.services.s3.internal.parseS3ErrorResponse
import aws.sdk.kotlin.services.s3.internal.setS3ErrorMetadata
import aws.sdk.kotlin.services.s3.model.CopyObjectResponse
import aws.sdk.kotlin.services.s3.model.RequestCharged
import aws.sdk.kotlin.services.s3.model.S3Exception
import aws.sdk.kotlin.services.s3.model.ServerSideEncryption
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpStatusCode
import aws.smithy.kotlin.runtime.http.isSuccess
import aws.smithy.kotlin.runtime.http.operation.HttpDeserialize
import aws.smithy.kotlin.runtime.http.readAll
import aws.smithy.kotlin.runtime.http.response.HttpResponse
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer


internal class CopyObjectOperationDeserializer: HttpDeserialize<CopyObjectResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): CopyObjectResponse {
        if (!response.status.isSuccess()) {
            throwCopyObjectError(context, response)
        }
        val builder = CopyObjectResponse.Builder()

        builder.bucketKeyEnabled = response.headers["x-amz-server-side-encryption-bucket-key-enabled"]?.toBoolean() ?: false
        builder.copySourceVersionId = response.headers["x-amz-copy-source-version-id"]
        builder.expiration = response.headers["x-amz-expiration"]
        builder.requestCharged = response.headers["x-amz-request-charged"]?.let { RequestCharged.fromValue(it) }
        builder.sseCustomerAlgorithm = response.headers["x-amz-server-side-encryption-customer-algorithm"]
        builder.sseCustomerKeyMd5 = response.headers["x-amz-server-side-encryption-customer-key-MD5"]
        builder.ssekmsEncryptionContext = response.headers["x-amz-server-side-encryption-context"]
        builder.ssekmsKeyId = response.headers["x-amz-server-side-encryption-aws-kms-key-id"]
        builder.serverSideEncryption = response.headers["x-amz-server-side-encryption"]?.let { ServerSideEncryption.fromValue(it) }
        builder.versionId = response.headers["x-amz-version-id"]

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeCopyObjectOperationBody(builder, payload)
        }

        return builder.build()
    }
}

private fun deserializeCopyObjectOperationBody(builder: CopyObjectResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    builder.copyObjectResult = deserializeCopyObjectResultDocument(deserializer)
}

private suspend fun throwCopyObjectError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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

    val modeledExceptionDeserializer = when(errorDetails.code) {
        "ObjectNotInActiveTierError" -> ObjectNotInActiveTierErrorDeserializer()
        else -> throw S3Exception(errorDetails.message)
    }

    val modeledException = modeledExceptionDeserializer.deserialize(context, wrappedResponse)
    setS3ErrorMetadata(modeledException, wrappedResponse, errorDetails)
    throw modeledException
}
