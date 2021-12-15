// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ImportImageRequest
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


internal class ImportImageOperationSerializer: HttpSerialize<ImportImageRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ImportImageRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeImportImageOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeImportImageOperationBody(context: ExecutionContext, input: ImportImageRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val ARCHITECTURE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Architecture"))
    val BOOTMODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("BootMode"))
    val CLIENTDATA_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("ClientData"))
    val CLIENTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ClientToken"))
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Description"))
    val DISKCONTAINERS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("DiskContainer"), FormUrlFlattened)
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val ENCRYPTED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("Encrypted"))
    val HYPERVISOR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Hypervisor"))
    val KMSKEYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("KmsKeyId"))
    val LICENSESPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("LicenseSpecifications"), FormUrlFlattened)
    val LICENSETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("LicenseType"))
    val PLATFORM_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Platform"))
    val ROLENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("RoleName"))
    val TAGSPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("TagSpecification"), FormUrlFlattened)
    val USAGEOPERATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("UsageOperation"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ImportImageRequest"))
        trait(QueryLiteral("Action", "ImportImage"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(ARCHITECTURE_DESCRIPTOR)
        field(BOOTMODE_DESCRIPTOR)
        field(CLIENTDATA_DESCRIPTOR)
        field(CLIENTTOKEN_DESCRIPTOR)
        field(DESCRIPTION_DESCRIPTOR)
        field(DISKCONTAINERS_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(ENCRYPTED_DESCRIPTOR)
        field(HYPERVISOR_DESCRIPTOR)
        field(KMSKEYID_DESCRIPTOR)
        field(LICENSESPECIFICATIONS_DESCRIPTOR)
        field(LICENSETYPE_DESCRIPTOR)
        field(PLATFORM_DESCRIPTOR)
        field(ROLENAME_DESCRIPTOR)
        field(TAGSPECIFICATIONS_DESCRIPTOR)
        field(USAGEOPERATION_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.architecture?.let { field(ARCHITECTURE_DESCRIPTOR, it) }
        input.bootMode?.let { field(BOOTMODE_DESCRIPTOR, it.value) }
        input.clientData?.let { field(CLIENTDATA_DESCRIPTOR, it, ::serializeClientDataDocument) }
        input.clientToken?.let { field(CLIENTTOKEN_DESCRIPTOR, it) }
        input.description?.let { field(DESCRIPTION_DESCRIPTOR, it) }
        if (input.diskContainers != null) {
            listField(DISKCONTAINERS_DESCRIPTOR) {
                for (el0 in input.diskContainers) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeImageDiskContainerDocument))
                }
            }
        }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.encrypted?.let { field(ENCRYPTED_DESCRIPTOR, it) }
        input.hypervisor?.let { field(HYPERVISOR_DESCRIPTOR, it) }
        input.kmsKeyId?.let { field(KMSKEYID_DESCRIPTOR, it) }
        if (input.licenseSpecifications != null) {
            listField(LICENSESPECIFICATIONS_DESCRIPTOR) {
                for (el0 in input.licenseSpecifications) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeImportImageLicenseConfigurationRequestDocument))
                }
            }
        }
        input.licenseType?.let { field(LICENSETYPE_DESCRIPTOR, it) }
        input.platform?.let { field(PLATFORM_DESCRIPTOR, it) }
        input.roleName?.let { field(ROLENAME_DESCRIPTOR, it) }
        if (input.tagSpecifications != null) {
            listField(TAGSPECIFICATIONS_DESCRIPTOR) {
                for (el0 in input.tagSpecifications) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeTagSpecificationDocument))
                }
            }
        }
        input.usageOperation?.let { field(USAGEOPERATION_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
