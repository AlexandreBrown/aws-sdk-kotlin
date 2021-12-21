// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CreateVpcEndpointServiceConfigurationRequest
import aws.sdk.kotlin.services.ec2.model.TagSpecification
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


internal class CreateVpcEndpointServiceConfigurationOperationSerializer: HttpSerialize<CreateVpcEndpointServiceConfigurationRequest> {
    override suspend fun serialize(context: ExecutionContext, input: CreateVpcEndpointServiceConfigurationRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeCreateVpcEndpointServiceConfigurationOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeCreateVpcEndpointServiceConfigurationOperationBody(context: ExecutionContext, input: CreateVpcEndpointServiceConfigurationRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val ACCEPTANCEREQUIRED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("AcceptanceRequired"))
    val CLIENTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ClientToken"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val GATEWAYLOADBALANCERARNS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("GatewayLoadBalancerArn"), FormUrlFlattened)
    val NETWORKLOADBALANCERARNS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("NetworkLoadBalancerArn"), FormUrlFlattened)
    val PRIVATEDNSNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("PrivateDnsName"))
    val TAGSPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("TagSpecification"), FormUrlFlattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("CreateVpcEndpointServiceConfigurationRequest"))
        trait(QueryLiteral("Action", "CreateVpcEndpointServiceConfiguration"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(ACCEPTANCEREQUIRED_DESCRIPTOR)
        field(CLIENTTOKEN_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(GATEWAYLOADBALANCERARNS_DESCRIPTOR)
        field(NETWORKLOADBALANCERARNS_DESCRIPTOR)
        field(PRIVATEDNSNAME_DESCRIPTOR)
        field(TAGSPECIFICATIONS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.acceptanceRequired?.let { field(ACCEPTANCEREQUIRED_DESCRIPTOR, it) }
        input.clientToken?.let { field(CLIENTTOKEN_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        if (input.gatewayLoadBalancerArns != null) {
            listField(GATEWAYLOADBALANCERARNS_DESCRIPTOR) {
                for (el0 in input.gatewayLoadBalancerArns) {
                    serializeString(el0)
                }
            }
        }
        if (input.networkLoadBalancerArns != null) {
            listField(NETWORKLOADBALANCERARNS_DESCRIPTOR) {
                for (el0 in input.networkLoadBalancerArns) {
                    serializeString(el0)
                }
            }
        }
        input.privateDnsName?.let { field(PRIVATEDNSNAME_DESCRIPTOR, it) }
        if (input.tagSpecifications != null) {
            listField(TAGSPECIFICATIONS_DESCRIPTOR) {
                for (el0 in input.tagSpecifications) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeTagSpecificationDocument))
                }
            }
        }
    }
    return serializer.toByteArray()
}
