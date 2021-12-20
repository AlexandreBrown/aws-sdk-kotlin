// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DescribeScheduledInstancesRequest
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


internal class DescribeScheduledInstancesOperationSerializer: HttpSerialize<DescribeScheduledInstancesRequest> {
    override suspend fun serialize(context: ExecutionContext, input: DescribeScheduledInstancesRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeDescribeScheduledInstancesOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeDescribeScheduledInstancesOperationBody(context: ExecutionContext, input: DescribeScheduledInstancesRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val FILTERS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Filter"), FormUrlFlattened)
    val MAXRESULTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("MaxResults"))
    val NEXTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("NextToken"))
    val SCHEDULEDINSTANCEIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("ScheduledInstanceId"), FormUrlFlattened)
    val SLOTSTARTTIMERANGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("SlotStartTimeRange"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("DescribeScheduledInstancesRequest"))
        trait(QueryLiteral("Action", "DescribeScheduledInstances"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DRYRUN_DESCRIPTOR)
        field(FILTERS_DESCRIPTOR)
        field(MAXRESULTS_DESCRIPTOR)
        field(NEXTTOKEN_DESCRIPTOR)
        field(SCHEDULEDINSTANCEIDS_DESCRIPTOR)
        field(SLOTSTARTTIMERANGE_DESCRIPTOR)
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
        input.nextToken?.let { field(NEXTTOKEN_DESCRIPTOR, it) }
        if (input.scheduledInstanceIds != null) {
            listField(SCHEDULEDINSTANCEIDS_DESCRIPTOR) {
                for (el0 in input.scheduledInstanceIds) {
                    serializeString(el0)
                }
            }
        }
        input.slotStartTimeRange?.let { field(SLOTSTARTTIMERANGE_DESCRIPTOR, it, ::serializeSlotStartTimeRangeRequestDocument) }
    }
    return serializer.toByteArray()
}