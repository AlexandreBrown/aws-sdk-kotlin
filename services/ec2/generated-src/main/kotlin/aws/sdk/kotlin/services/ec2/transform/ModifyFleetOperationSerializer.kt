// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ModifyFleetRequest
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


internal class ModifyFleetOperationSerializer: HttpSerialize<ModifyFleetRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ModifyFleetRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeModifyFleetOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeModifyFleetOperationBody(context: ExecutionContext, input: ModifyFleetRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val CONTEXT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Context"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val EXCESSCAPACITYTERMINATIONPOLICY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ExcessCapacityTerminationPolicy"))
    val FLEETID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("FleetId"))
    val LAUNCHTEMPLATECONFIGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("LaunchTemplateConfig"), FormUrlFlattened)
    val TARGETCAPACITYSPECIFICATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("TargetCapacitySpecification"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ModifyFleetRequest"))
        trait(QueryLiteral("Action", "ModifyFleet"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(CONTEXT_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(EXCESSCAPACITYTERMINATIONPOLICY_DESCRIPTOR)
        field(FLEETID_DESCRIPTOR)
        field(LAUNCHTEMPLATECONFIGS_DESCRIPTOR)
        field(TARGETCAPACITYSPECIFICATION_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.context?.let { field(CONTEXT_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.excessCapacityTerminationPolicy?.let { field(EXCESSCAPACITYTERMINATIONPOLICY_DESCRIPTOR, it.value) }
        input.fleetId?.let { field(FLEETID_DESCRIPTOR, it) }
        if (input.launchTemplateConfigs != null) {
            listField(LAUNCHTEMPLATECONFIGS_DESCRIPTOR) {
                for (el0 in input.launchTemplateConfigs) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeFleetLaunchTemplateConfigRequestDocument))
                }
            }
        }
        input.targetCapacitySpecification?.let { field(TARGETCAPACITYSPECIFICATION_DESCRIPTOR, it, ::serializeTargetCapacitySpecificationRequestDocument) }
    }
    return serializer.toByteArray()
}