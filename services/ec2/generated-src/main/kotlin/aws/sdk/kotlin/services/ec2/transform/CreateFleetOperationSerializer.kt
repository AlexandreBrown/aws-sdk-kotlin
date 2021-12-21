// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CreateFleetRequest
import aws.sdk.kotlin.services.ec2.model.FleetExcessCapacityTerminationPolicy
import aws.sdk.kotlin.services.ec2.model.FleetLaunchTemplateConfigRequest
import aws.sdk.kotlin.services.ec2.model.FleetType
import aws.sdk.kotlin.services.ec2.model.OnDemandOptionsRequest
import aws.sdk.kotlin.services.ec2.model.SpotOptionsRequest
import aws.sdk.kotlin.services.ec2.model.TagSpecification
import aws.sdk.kotlin.services.ec2.model.TargetCapacitySpecificationRequest
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
import aws.smithy.kotlin.runtime.time.Instant
import aws.smithy.kotlin.runtime.time.TimestampFormat


internal class CreateFleetOperationSerializer: HttpSerialize<CreateFleetRequest> {
    override suspend fun serialize(context: ExecutionContext, input: CreateFleetRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeCreateFleetOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeCreateFleetOperationBody(context: ExecutionContext, input: CreateFleetRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val CLIENTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ClientToken"))
    val CONTEXT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Context"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val EXCESSCAPACITYTERMINATIONPOLICY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ExcessCapacityTerminationPolicy"))
    val LAUNCHTEMPLATECONFIGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("LaunchTemplateConfigs"), FormUrlFlattened)
    val ONDEMANDOPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("OnDemandOptions"))
    val REPLACEUNHEALTHYINSTANCES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("ReplaceUnhealthyInstances"))
    val SPOTOPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("SpotOptions"))
    val TAGSPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("TagSpecification"), FormUrlFlattened)
    val TARGETCAPACITYSPECIFICATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("TargetCapacitySpecification"))
    val TERMINATEINSTANCESWITHEXPIRATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("TerminateInstancesWithExpiration"))
    val TYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Type"))
    val VALIDFROM_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, FormUrlSerialName("ValidFrom"))
    val VALIDUNTIL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, FormUrlSerialName("ValidUntil"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("CreateFleetRequest"))
        trait(QueryLiteral("Action", "CreateFleet"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(CLIENTTOKEN_DESCRIPTOR)
        field(CONTEXT_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(EXCESSCAPACITYTERMINATIONPOLICY_DESCRIPTOR)
        field(LAUNCHTEMPLATECONFIGS_DESCRIPTOR)
        field(ONDEMANDOPTIONS_DESCRIPTOR)
        field(REPLACEUNHEALTHYINSTANCES_DESCRIPTOR)
        field(SPOTOPTIONS_DESCRIPTOR)
        field(TAGSPECIFICATIONS_DESCRIPTOR)
        field(TARGETCAPACITYSPECIFICATION_DESCRIPTOR)
        field(TERMINATEINSTANCESWITHEXPIRATION_DESCRIPTOR)
        field(TYPE_DESCRIPTOR)
        field(VALIDFROM_DESCRIPTOR)
        field(VALIDUNTIL_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.clientToken?.let { field(CLIENTTOKEN_DESCRIPTOR, it) }
        input.context?.let { field(CONTEXT_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.excessCapacityTerminationPolicy?.let { field(EXCESSCAPACITYTERMINATIONPOLICY_DESCRIPTOR, it.value) }
        if (input.launchTemplateConfigs != null) {
            listField(LAUNCHTEMPLATECONFIGS_DESCRIPTOR) {
                for (el0 in input.launchTemplateConfigs) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeFleetLaunchTemplateConfigRequestDocument))
                }
            }
        }
        input.onDemandOptions?.let { field(ONDEMANDOPTIONS_DESCRIPTOR, it, ::serializeOnDemandOptionsRequestDocument) }
        input.replaceUnhealthyInstances?.let { field(REPLACEUNHEALTHYINSTANCES_DESCRIPTOR, it) }
        input.spotOptions?.let { field(SPOTOPTIONS_DESCRIPTOR, it, ::serializeSpotOptionsRequestDocument) }
        if (input.tagSpecifications != null) {
            listField(TAGSPECIFICATIONS_DESCRIPTOR) {
                for (el0 in input.tagSpecifications) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeTagSpecificationDocument))
                }
            }
        }
        input.targetCapacitySpecification?.let { field(TARGETCAPACITYSPECIFICATION_DESCRIPTOR, it, ::serializeTargetCapacitySpecificationRequestDocument) }
        input.terminateInstancesWithExpiration?.let { field(TERMINATEINSTANCESWITHEXPIRATION_DESCRIPTOR, it) }
        input.type?.let { field(TYPE_DESCRIPTOR, it.value) }
        input.validFrom?.let { field(VALIDFROM_DESCRIPTOR, it, TimestampFormat.ISO_8601) }
        input.validUntil?.let { field(VALIDUNTIL_DESCRIPTOR, it, TimestampFormat.ISO_8601) }
    }
    return serializer.toByteArray()
}