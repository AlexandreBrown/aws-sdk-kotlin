// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DescribeNetworkInterfacePermissionsRequest
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


internal class DescribeNetworkInterfacePermissionsOperationSerializer: HttpSerialize<DescribeNetworkInterfacePermissionsRequest> {
    override suspend fun serialize(context: ExecutionContext, input: DescribeNetworkInterfacePermissionsRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeDescribeNetworkInterfacePermissionsOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeDescribeNetworkInterfacePermissionsOperationBody(context: ExecutionContext, input: DescribeNetworkInterfacePermissionsRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val FILTERS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Filter"), FormUrlFlattened)
    val MAXRESULTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("MaxResults"))
    val NETWORKINTERFACEPERMISSIONIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("NetworkInterfacePermissionId"), FormUrlFlattened)
    val NEXTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("NextToken"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("DescribeNetworkInterfacePermissionsRequest"))
        trait(QueryLiteral("Action", "DescribeNetworkInterfacePermissions"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(FILTERS_DESCRIPTOR)
        field(MAXRESULTS_DESCRIPTOR)
        field(NETWORKINTERFACEPERMISSIONIDS_DESCRIPTOR)
        field(NEXTTOKEN_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.filters != null) {
            listField(FILTERS_DESCRIPTOR) {
                for (el0 in input.filters) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeFilterDocument))
                }
            }
        }
        input.maxResults?.let { field(MAXRESULTS_DESCRIPTOR, it) }
        if (input.networkInterfacePermissionIds != null) {
            listField(NETWORKINTERFACEPERMISSIONIDS_DESCRIPTOR) {
                for (el0 in input.networkInterfacePermissionIds) {
                    serializeString(el0)
                }
            }
        }
        input.nextToken?.let { field(NEXTTOKEN_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
