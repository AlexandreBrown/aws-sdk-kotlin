// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.services.s3.internal.S3ErrorDetails
import aws.sdk.kotlin.services.s3.internal.parseS3ErrorResponse
import aws.sdk.kotlin.services.s3.internal.setS3ErrorMetadata
import aws.sdk.kotlin.services.s3.model.ListBucketMetricsConfigurationsResponse
import aws.sdk.kotlin.services.s3.model.MetricsConfiguration
import aws.sdk.kotlin.services.s3.model.S3Exception
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpStatusCode
import aws.smithy.kotlin.runtime.http.isSuccess
import aws.smithy.kotlin.runtime.http.operation.HttpDeserialize
import aws.smithy.kotlin.runtime.http.readAll
import aws.smithy.kotlin.runtime.http.response.HttpResponse
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
import aws.smithy.kotlin.runtime.serde.xml.Flattened
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal class ListBucketMetricsConfigurationsOperationDeserializer: HttpDeserialize<ListBucketMetricsConfigurationsResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): ListBucketMetricsConfigurationsResponse {
        if (!response.status.isSuccess()) {
            throwListBucketMetricsConfigurationsError(context, response)
        }
        val builder = ListBucketMetricsConfigurationsResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeListBucketMetricsConfigurationsOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private fun deserializeListBucketMetricsConfigurationsOperationBody(builder: ListBucketMetricsConfigurationsResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val CONTINUATIONTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ContinuationToken"))
    val ISTRUNCATED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("IsTruncated"))
    val METRICSCONFIGURATIONLIST_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("MetricsConfiguration"), Flattened)
    val NEXTCONTINUATIONTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("NextContinuationToken"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ListMetricsConfigurationsResult"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(CONTINUATIONTOKEN_DESCRIPTOR)
        field(ISTRUNCATED_DESCRIPTOR)
        field(METRICSCONFIGURATIONLIST_DESCRIPTOR)
        field(NEXTCONTINUATIONTOKEN_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CONTINUATIONTOKEN_DESCRIPTOR.index -> builder.continuationToken = deserializeString()
                ISTRUNCATED_DESCRIPTOR.index -> builder.isTruncated = deserializeBoolean()
                METRICSCONFIGURATIONLIST_DESCRIPTOR.index -> builder.metricsConfigurationList =
                    deserializer.deserializeList(METRICSCONFIGURATIONLIST_DESCRIPTOR) {
                        val col0 = mutableListOf<MetricsConfiguration>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeMetricsConfigurationDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                NEXTCONTINUATIONTOKEN_DESCRIPTOR.index -> builder.nextContinuationToken = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwListBucketMetricsConfigurationsError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
    val payload = response.body.readAll()
    val wrappedResponse = response.withPayload(payload)

    val errorDetails = try {
        if (payload == null && response.status == HttpStatusCode.NotFound) {
            S3ErrorDetails(code = "NotFound")
        } else {
            checkNotNull(payload){ "unable to parse error from empty response" }
            parseS3ErrorResponse(payload)
        }
    } catch (ex: Exception) {
        throw UnknownServiceErrorException("failed to parse response as restXml error", ex).also {
            setS3ErrorMetadata(it, wrappedResponse, null)
        }
    }

    throw S3Exception(errorDetails.message)
}
