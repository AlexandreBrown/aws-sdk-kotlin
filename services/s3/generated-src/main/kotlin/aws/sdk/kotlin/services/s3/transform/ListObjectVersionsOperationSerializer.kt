// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.ListObjectVersionsRequest
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


internal class ListObjectVersionsOperationSerializer: HttpSerialize<ListObjectVersionsRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ListObjectVersionsRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.GET

        builder.url {
            val pathSegments = listOf(
                "${input.bucket}".encodeLabel(),
            )
            path = pathSegments.joinToString(separator = "/", prefix = "/")
            parameters {
                append("versions", "")
                if (input.delimiter != null) append("delimiter", input.delimiter)
                if (input.encodingType != null) append("encoding-type", input.encodingType.value)
                if (input.keyMarker != null) append("key-marker", input.keyMarker)
                if (input.maxKeys != 0) append("max-keys", "${input.maxKeys}")
                if (input.prefix != null) append("prefix", input.prefix)
                if (input.versionIdMarker != null) append("version-id-marker", input.versionIdMarker)
            }
        }

        builder.headers {
            if (input.expectedBucketOwner?.isNotEmpty() == true) append("x-amz-expected-bucket-owner", input.expectedBucketOwner)
        }

        return builder
    }
}
