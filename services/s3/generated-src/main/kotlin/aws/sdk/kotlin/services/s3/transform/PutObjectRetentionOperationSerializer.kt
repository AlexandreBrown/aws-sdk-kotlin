// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.ObjectLockRetention
import aws.sdk.kotlin.services.s3.model.PutObjectRetentionRequest
import aws.sdk.kotlin.services.s3.model.RequestPayer
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
import aws.smithy.kotlin.runtime.serde.xml.XmlSerializer
import aws.smithy.kotlin.runtime.time.TimestampFormat


internal class PutObjectRetentionOperationSerializer: HttpSerialize<PutObjectRetentionRequest> {
    override suspend fun serialize(context: ExecutionContext, input: PutObjectRetentionRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.PUT

        builder.url {
            val pathSegments = listOf(
                "${input.bucket}".encodeLabel(),
                "${input.key}".encodeLabel(greedy = true),
            )
            path = pathSegments.joinToString(separator = "/", prefix = "/")
            parameters {
                append("retention", "")
                if (input.versionId != null) append("versionId", input.versionId)
            }
        }

        builder.headers {
            if (input.bypassGovernanceRetention != false) append("x-amz-bypass-governance-retention", "${input.bypassGovernanceRetention}")
            if (input.contentMd5?.isNotEmpty() == true) append("Content-MD5", input.contentMd5)
            if (input.expectedBucketOwner?.isNotEmpty() == true) append("x-amz-expected-bucket-owner", input.expectedBucketOwner)
            if (input.requestPayer != null) append("x-amz-request-payer", input.requestPayer.value)
        }

        if (input.retention != null) {
            val payload = serializePutObjectRetentionOperationBody(context, input)
            builder.body = ByteArrayContent(payload)
        }
        builder.headers.setMissing("Content-Type", "application/xml")
        return builder
    }
}

private fun serializePutObjectRetentionOperationBody(context: ExecutionContext, input: PutObjectRetentionRequest): ByteArray {
    val serializer = XmlSerializer()
    val input = requireNotNull(input.retention)
    val MODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Mode"))
    val RETAINUNTILDATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("RetainUntilDate"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("Retention"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(MODE_DESCRIPTOR)
        field(RETAINUNTILDATE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.mode?.let { field(MODE_DESCRIPTOR, it.value) }
        input.retainUntilDate?.let { field(RETAINUNTILDATE_DESCRIPTOR, it, TimestampFormat.ISO_8601) }
    }
    return serializer.toByteArray()
}
