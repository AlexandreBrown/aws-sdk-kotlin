// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.PutBucketInventoryConfigurationRequest
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.operation.HttpSerialize
import aws.smithy.kotlin.runtime.http.parameters
import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilder
import aws.smithy.kotlin.runtime.http.request.headers
import aws.smithy.kotlin.runtime.http.request.url
import aws.smithy.kotlin.runtime.http.util.encodeLabel
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName
import aws.smithy.kotlin.runtime.serde.xml.XmlSerializer


internal class PutBucketInventoryConfigurationOperationSerializer: HttpSerialize<PutBucketInventoryConfigurationRequest> {
    override suspend fun serialize(context: ExecutionContext, input: PutBucketInventoryConfigurationRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.PUT

        builder.url {
            val pathSegments = listOf(
                "${input.bucket}".encodeLabel(),
            )
            path = pathSegments.joinToString(separator = "/", prefix = "/")
            parameters {
                append("inventory", "")
                if (input.id != null) append("id", input.id)
            }
        }

        builder.headers {
            if (input.expectedBucketOwner?.isNotEmpty() == true) append("x-amz-expected-bucket-owner", input.expectedBucketOwner)
        }

        if (input.inventoryConfiguration != null) {
            val payload = serializePutBucketInventoryConfigurationOperationBody(context, input)
            builder.body = ByteArrayContent(payload)
        }
        builder.headers.setMissing("Content-Type", "application/xml")
        return builder
    }
}

private fun serializePutBucketInventoryConfigurationOperationBody(context: ExecutionContext, input: PutBucketInventoryConfigurationRequest): ByteArray {
    val serializer = XmlSerializer()
    val input = requireNotNull(input.inventoryConfiguration)
    val DESTINATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Destination"))
    val FILTER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Filter"))
    val ID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Id"))
    val INCLUDEDOBJECTVERSIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("IncludedObjectVersions"))
    val ISENABLED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("IsEnabled"))
    val OPTIONALFIELDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("OptionalFields"), XmlCollectionName("Field"))
    val SCHEDULE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Schedule"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("InventoryConfiguration"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(DESTINATION_DESCRIPTOR)
        field(FILTER_DESCRIPTOR)
        field(ID_DESCRIPTOR)
        field(INCLUDEDOBJECTVERSIONS_DESCRIPTOR)
        field(ISENABLED_DESCRIPTOR)
        field(OPTIONALFIELDS_DESCRIPTOR)
        field(SCHEDULE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.destination?.let { field(DESTINATION_DESCRIPTOR, it, ::serializeInventoryDestinationDocument) }
        input.filter?.let { field(FILTER_DESCRIPTOR, it, ::serializeInventoryFilterDocument) }
        input.id?.let { field(ID_DESCRIPTOR, it) }
        input.includedObjectVersions?.let { field(INCLUDEDOBJECTVERSIONS_DESCRIPTOR, it.value) }
        field(ISENABLED_DESCRIPTOR, input.isEnabled)
        if (input.optionalFields != null) {
            listField(OPTIONALFIELDS_DESCRIPTOR) {
                for (el0 in input.optionalFields) {
                    serializeString(el0.value)
                }
            }
        }
        input.schedule?.let { field(SCHEDULE_DESCRIPTOR, it, ::serializeInventoryScheduleDocument) }
    }
    return serializer.toByteArray()
}