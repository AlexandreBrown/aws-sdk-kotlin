// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.GetObjectAclRequest
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.operation.HttpSerialize
import aws.smithy.kotlin.runtime.http.parameters
import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilder
import aws.smithy.kotlin.runtime.http.request.headers
import aws.smithy.kotlin.runtime.http.request.url
import aws.smithy.kotlin.runtime.http.util.encodeLabel


internal class GetObjectAclOperationSerializer: HttpSerialize<GetObjectAclRequest> {
    override suspend fun serialize(context: ExecutionContext, input: GetObjectAclRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.GET

        builder.url {
            val pathSegments = listOf(
                "${input.bucket}".encodeLabel(),
                "${input.key}".encodeLabel(greedy = true),
            )
            path = pathSegments.joinToString(separator = "/", prefix = "/")
            parameters {
                append("acl", "")
                if (input.versionId != null) append("versionId", input.versionId)
            }
        }

        builder.headers {
            if (input.expectedBucketOwner?.isNotEmpty() == true) append("x-amz-expected-bucket-owner", input.expectedBucketOwner)
            if (input.requestPayer != null) append("x-amz-request-payer", input.requestPayer.value)
        }

        return builder
    }
}
