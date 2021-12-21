// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AllocateIpamPoolCidrRequest
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.client.idempotencyTokenProvider
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


internal class AllocateIpamPoolCidrOperationSerializer: HttpSerialize<AllocateIpamPoolCidrRequest> {
    override suspend fun serialize(context: ExecutionContext, input: AllocateIpamPoolCidrRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeAllocateIpamPoolCidrOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeAllocateIpamPoolCidrOperationBody(context: ExecutionContext, input: AllocateIpamPoolCidrRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val CIDR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Cidr"))
    val CLIENTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ClientToken"))
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Description"))
    val DISALLOWEDCIDRS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("DisallowedCidr"), FormUrlFlattened)
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val IPAMPOOLID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("IpamPoolId"))
    val NETMASKLENGTH_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("NetmaskLength"))
    val PREVIEWNEXTCIDR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("PreviewNextCidr"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("AllocateIpamPoolCidrRequest"))
        trait(QueryLiteral("Action", "AllocateIpamPoolCidr"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(CIDR_DESCRIPTOR)
        field(CLIENTTOKEN_DESCRIPTOR)
        field(DESCRIPTION_DESCRIPTOR)
        field(DISALLOWEDCIDRS_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(IPAMPOOLID_DESCRIPTOR)
        field(NETMASKLENGTH_DESCRIPTOR)
        field(PREVIEWNEXTCIDR_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.cidr?.let { field(CIDR_DESCRIPTOR, it) }
        input.clientToken?.let { field(CLIENTTOKEN_DESCRIPTOR, it) } ?: field(CLIENTTOKEN_DESCRIPTOR, context.idempotencyTokenProvider.generateToken())
        input.description?.let { field(DESCRIPTION_DESCRIPTOR, it) }
        if (input.disallowedCidrs != null) {
            listField(DISALLOWEDCIDRS_DESCRIPTOR) {
                for (el0 in input.disallowedCidrs) {
                    serializeString(el0)
                }
            }
        }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.ipamPoolId?.let { field(IPAMPOOLID_DESCRIPTOR, it) }
        input.netmaskLength?.let { field(NETMASKLENGTH_DESCRIPTOR, it) }
        input.previewNextCidr?.let { field(PREVIEWNEXTCIDR_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}