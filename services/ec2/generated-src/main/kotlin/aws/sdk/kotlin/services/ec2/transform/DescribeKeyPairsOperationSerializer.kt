// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DescribeKeyPairsRequest
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.operation.HttpSerialize
import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilder
import aws.smithy.kotlin.runtime.http.request.url
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlFlattened
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer
import aws.smithy.kotlin.runtime.serde.formurl.QueryLiteral
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class DescribeKeyPairsOperationSerializer: HttpSerialize<DescribeKeyPairsRequest> {
    override suspend fun serialize(context: ExecutionContext, input: DescribeKeyPairsRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeDescribeKeyPairsOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeDescribeKeyPairsOperationBody(context: ExecutionContext, input: DescribeKeyPairsRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val FILTERS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Filter"), FormUrlFlattened)
    val KEYNAMES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("KeyName"), FormUrlFlattened)
    val KEYPAIRIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("KeyPairId"), FormUrlFlattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("DescribeKeyPairsRequest"))
        trait(QueryLiteral("Action", "DescribeKeyPairs"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DRYRUN_DESCRIPTOR)
        field(FILTERS_DESCRIPTOR)
        field(KEYNAMES_DESCRIPTOR)
        field(KEYPAIRIDS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        if (input.filters != null) {
            listField(FILTERS_DESCRIPTOR) {
                for (el0 in input.filters) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeFilterDocument))
                }
            }
        }
        if (input.keyNames != null) {
            listField(KEYNAMES_DESCRIPTOR) {
                for (el0 in input.keyNames) {
                    serializeString(el0)
                }
            }
        }
        if (input.keyPairIds != null) {
            listField(KEYPAIRIDS_DESCRIPTOR) {
                for (el0 in input.keyPairIds) {
                    serializeString(el0)
                }
            }
        }
    }
    return serializer.toByteArray()
}