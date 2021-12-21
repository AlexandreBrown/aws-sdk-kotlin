// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DescribeIpamPoolsRequest
import aws.sdk.kotlin.services.ec2.model.Filter
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


internal class DescribeIpamPoolsOperationSerializer: HttpSerialize<DescribeIpamPoolsRequest> {
    override suspend fun serialize(context: ExecutionContext, input: DescribeIpamPoolsRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeDescribeIpamPoolsOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeDescribeIpamPoolsOperationBody(context: ExecutionContext, input: DescribeIpamPoolsRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val FILTERS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Filter"), FormUrlFlattened)
    val IPAMPOOLIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("IpamPoolId"), FormUrlFlattened)
    val MAXRESULTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("MaxResults"))
    val NEXTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("NextToken"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("DescribeIpamPoolsRequest"))
        trait(QueryLiteral("Action", "DescribeIpamPools"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DRYRUN_DESCRIPTOR)
        field(FILTERS_DESCRIPTOR)
        field(IPAMPOOLIDS_DESCRIPTOR)
        field(MAXRESULTS_DESCRIPTOR)
        field(NEXTTOKEN_DESCRIPTOR)
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
        if (input.ipamPoolIds != null) {
            listField(IPAMPOOLIDS_DESCRIPTOR) {
                for (el0 in input.ipamPoolIds) {
                    serializeString(el0)
                }
            }
        }
        input.maxResults?.let { field(MAXRESULTS_DESCRIPTOR, it) }
        input.nextToken?.let { field(NEXTTOKEN_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
