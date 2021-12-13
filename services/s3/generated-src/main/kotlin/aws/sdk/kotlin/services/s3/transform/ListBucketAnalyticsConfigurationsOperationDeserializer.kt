// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.services.s3.internal.S3ErrorDetails
import aws.sdk.kotlin.services.s3.internal.parseS3ErrorResponse
import aws.sdk.kotlin.services.s3.internal.setS3ErrorMetadata
import aws.sdk.kotlin.services.s3.model.AnalyticsConfiguration
import aws.sdk.kotlin.services.s3.model.ListBucketAnalyticsConfigurationsResponse
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


internal class ListBucketAnalyticsConfigurationsOperationDeserializer: HttpDeserialize<ListBucketAnalyticsConfigurationsResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): ListBucketAnalyticsConfigurationsResponse {
        if (!response.status.isSuccess()) {
            throwListBucketAnalyticsConfigurationsError(context, response)
        }
        val builder = ListBucketAnalyticsConfigurationsResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeListBucketAnalyticsConfigurationsOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private fun deserializeListBucketAnalyticsConfigurationsOperationBody(builder: ListBucketAnalyticsConfigurationsResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val ANALYTICSCONFIGURATIONLIST_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("AnalyticsConfiguration"), Flattened)
    val CONTINUATIONTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ContinuationToken"))
    val ISTRUNCATED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("IsTruncated"))
    val NEXTCONTINUATIONTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("NextContinuationToken"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ListBucketAnalyticsConfigurationResult"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(ANALYTICSCONFIGURATIONLIST_DESCRIPTOR)
        field(CONTINUATIONTOKEN_DESCRIPTOR)
        field(ISTRUNCATED_DESCRIPTOR)
        field(NEXTCONTINUATIONTOKEN_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ANALYTICSCONFIGURATIONLIST_DESCRIPTOR.index -> builder.analyticsConfigurationList =
                    deserializer.deserializeList(ANALYTICSCONFIGURATIONLIST_DESCRIPTOR) {
                        val col0 = mutableListOf<AnalyticsConfiguration>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeAnalyticsConfigurationDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                CONTINUATIONTOKEN_DESCRIPTOR.index -> builder.continuationToken = deserializeString()
                ISTRUNCATED_DESCRIPTOR.index -> builder.isTruncated = deserializeBoolean()
                NEXTCONTINUATIONTOKEN_DESCRIPTOR.index -> builder.nextContinuationToken = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwListBucketAnalyticsConfigurationsError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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
