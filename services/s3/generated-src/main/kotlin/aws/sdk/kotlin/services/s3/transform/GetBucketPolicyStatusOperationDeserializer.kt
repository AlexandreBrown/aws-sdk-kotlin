// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.services.s3.internal.S3ErrorDetails
import aws.sdk.kotlin.services.s3.internal.parseS3ErrorResponse
import aws.sdk.kotlin.services.s3.internal.setS3ErrorMetadata
import aws.sdk.kotlin.services.s3.model.GetBucketPolicyStatusResponse
import aws.sdk.kotlin.services.s3.model.S3Exception
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpStatusCode
import aws.smithy.kotlin.runtime.http.isSuccess
import aws.smithy.kotlin.runtime.http.operation.HttpDeserialize
import aws.smithy.kotlin.runtime.http.readAll
import aws.smithy.kotlin.runtime.http.response.HttpResponse
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer


internal class GetBucketPolicyStatusOperationDeserializer: HttpDeserialize<GetBucketPolicyStatusResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): GetBucketPolicyStatusResponse {
        if (!response.status.isSuccess()) {
            throwGetBucketPolicyStatusError(context, response)
        }
        val builder = GetBucketPolicyStatusResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeGetBucketPolicyStatusOperationBody(builder, payload)
        }

        return builder.build()
    }
}

private fun deserializeGetBucketPolicyStatusOperationBody(builder: GetBucketPolicyStatusResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    builder.policyStatus = deserializePolicyStatusDocument(deserializer)
}

private suspend fun throwGetBucketPolicyStatusError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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
