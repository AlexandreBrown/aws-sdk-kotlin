// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.DescribeSnapshotsResponse
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
import aws.sdk.kotlin.services.ec2.model.Snapshot
import aws.smithy.kotlin.runtime.client.ExecutionContext
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
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal class DescribeSnapshotsOperationDeserializer: HttpDeserialize<DescribeSnapshotsResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): DescribeSnapshotsResponse {
        if (!response.status.isSuccess()) {
            throwDescribeSnapshotsError(context, response)
        }
        val builder = DescribeSnapshotsResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeDescribeSnapshotsOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private fun deserializeDescribeSnapshotsOperationBody(builder: DescribeSnapshotsResponse.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val NEXTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("nextToken"))
    val SNAPSHOTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("snapshotSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("DescribeSnapshotsResult"))
        field(NEXTTOKEN_DESCRIPTOR)
        field(SNAPSHOTS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                NEXTTOKEN_DESCRIPTOR.index -> builder.nextToken = deserializeString()
                SNAPSHOTS_DESCRIPTOR.index -> builder.snapshots =
                    deserializer.deserializeList(SNAPSHOTS_DESCRIPTOR) {
                        val col0 = mutableListOf<Snapshot>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeSnapshotDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwDescribeSnapshotsError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
    val payload = response.body.readAll()
    val wrappedResponse = response.withPayload(payload)

    val errorDetails = try {
        checkNotNull(payload){ "unable to parse error from empty response" }
        parseEc2QueryErrorResponse(payload)
    } catch (ex: Exception) {
        throw UnknownServiceErrorException("failed to parse response as ec2Query error", ex).also {
            setAseErrorMetadata(it, wrappedResponse, null)
        }
    }

    throw Ec2Exception(errorDetails.message)
}
