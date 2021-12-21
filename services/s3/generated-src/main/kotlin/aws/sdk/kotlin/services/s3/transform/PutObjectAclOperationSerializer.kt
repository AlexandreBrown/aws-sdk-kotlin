// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.AccessControlPolicy
import aws.sdk.kotlin.services.s3.model.ObjectCannedAcl
import aws.sdk.kotlin.services.s3.model.PutObjectAclRequest
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
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName
import aws.smithy.kotlin.runtime.serde.xml.XmlSerializer


internal class PutObjectAclOperationSerializer: HttpSerialize<PutObjectAclRequest> {
    override suspend fun serialize(context: ExecutionContext, input: PutObjectAclRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.PUT

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
            if (input.acl != null) append("x-amz-acl", input.acl.value)
            if (input.contentMd5?.isNotEmpty() == true) append("Content-MD5", input.contentMd5)
            if (input.expectedBucketOwner?.isNotEmpty() == true) append("x-amz-expected-bucket-owner", input.expectedBucketOwner)
            if (input.grantFullControl?.isNotEmpty() == true) append("x-amz-grant-full-control", input.grantFullControl)
            if (input.grantRead?.isNotEmpty() == true) append("x-amz-grant-read", input.grantRead)
            if (input.grantReadAcp?.isNotEmpty() == true) append("x-amz-grant-read-acp", input.grantReadAcp)
            if (input.grantWrite?.isNotEmpty() == true) append("x-amz-grant-write", input.grantWrite)
            if (input.grantWriteAcp?.isNotEmpty() == true) append("x-amz-grant-write-acp", input.grantWriteAcp)
            if (input.requestPayer != null) append("x-amz-request-payer", input.requestPayer.value)
        }

        if (input.accessControlPolicy != null) {
            val payload = serializePutObjectAclOperationBody(context, input)
            builder.body = ByteArrayContent(payload)
        }
        builder.headers.setMissing("Content-Type", "application/xml")
        return builder
    }
}

private fun serializePutObjectAclOperationBody(context: ExecutionContext, input: PutObjectAclRequest): ByteArray {
    val serializer = XmlSerializer()
    val input = requireNotNull(input.accessControlPolicy)
    val GRANTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("AccessControlList"), XmlCollectionName("Grant"))
    val OWNER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Owner"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("AccessControlPolicy"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(GRANTS_DESCRIPTOR)
        field(OWNER_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.grants != null) {
            listField(GRANTS_DESCRIPTOR) {
                for (el0 in input.grants) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeGrantDocument))
                }
            }
        }
        input.owner?.let { field(OWNER_DESCRIPTOR, it, ::serializeOwnerDocument) }
    }
    return serializer.toByteArray()
}
