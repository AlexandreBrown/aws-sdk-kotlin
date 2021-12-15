// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DescribeNetworkInsightsPathsRequest
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


internal class DescribeNetworkInsightsPathsOperationSerializer: HttpSerialize<DescribeNetworkInsightsPathsRequest> {
    override suspend fun serialize(context: ExecutionContext, input: DescribeNetworkInsightsPathsRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeDescribeNetworkInsightsPathsOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeDescribeNetworkInsightsPathsOperationBody(context: ExecutionContext, input: DescribeNetworkInsightsPathsRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val FILTERS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Filter"), FormUrlFlattened)
    val MAXRESULTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("MaxResults"))
    val NETWORKINSIGHTSPATHIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("NetworkInsightsPathId"), FormUrlFlattened)
    val NEXTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("NextToken"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("DescribeNetworkInsightsPathsRequest"))
        trait(QueryLiteral("Action", "DescribeNetworkInsightsPaths"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DRYRUN_DESCRIPTOR)
        field(FILTERS_DESCRIPTOR)
        field(MAXRESULTS_DESCRIPTOR)
        field(NETWORKINSIGHTSPATHIDS_DESCRIPTOR)
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
        input.maxResults?.let { field(MAXRESULTS_DESCRIPTOR, it) }
        if (input.networkInsightsPathIds != null) {
            listField(NETWORKINSIGHTSPATHIDS_DESCRIPTOR) {
                for (el0 in input.networkInsightsPathIds) {
                    serializeString(el0)
                }
            }
        }
        input.nextToken?.let { field(NEXTTOKEN_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
