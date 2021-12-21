// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.ObjectLockLegalHold
import aws.sdk.kotlin.services.s3.model.PutObjectLegalHoldRequest
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


internal class PutObjectLegalHoldOperationSerializer: HttpSerialize<PutObjectLegalHoldRequest> {
    override suspend fun serialize(context: ExecutionContext, input: PutObjectLegalHoldRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.PUT

        builder.url {
            val pathSegments = listOf(
                "${input.bucket}".encodeLabel(),
                "${input.key}".encodeLabel(greedy = true),
            )
            path = pathSegments.joinToString(separator = "/", prefix = "/")
            parameters {
                append("legal-hold", "")
                if (input.versionId != null) append("versionId", input.versionId)
            }
        }

        builder.headers {
            if (input.contentMd5?.isNotEmpty() == true) append("Content-MD5", input.contentMd5)
            if (input.expectedBucketOwner?.isNotEmpty() == true) append("x-amz-expected-bucket-owner", input.expectedBucketOwner)
            if (input.requestPayer != null) append("x-amz-request-payer", input.requestPayer.value)
        }

        if (input.legalHold != null) {
            val payload = serializePutObjectLegalHoldOperationBody(context, input)
            builder.body = ByteArrayContent(payload)
        }
        builder.headers.setMissing("Content-Type", "application/xml")
        return builder
    }
}

private fun serializePutObjectLegalHoldOperationBody(context: ExecutionContext, input: PutObjectLegalHoldRequest): ByteArray {
    val serializer = XmlSerializer()
    val input = requireNotNull(input.legalHold)
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Status"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("LegalHold"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(STATUS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.status?.let { field(STATUS_DESCRIPTOR, it.value) }
    }
    return serializer.toByteArray()
}
