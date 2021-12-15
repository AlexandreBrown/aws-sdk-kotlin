// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.json.RestJsonErrorDeserializer
import aws.sdk.kotlin.services.dynamodb.model.DescribeGlobalTableSettingsResponse
import aws.sdk.kotlin.services.dynamodb.model.DynamoDbException
import aws.sdk.kotlin.services.dynamodb.model.ReplicaSettingsDescription
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
import aws.smithy.kotlin.runtime.serde.json.JsonDeserializer
import aws.smithy.kotlin.runtime.serde.json.JsonSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class DescribeGlobalTableSettingsOperationDeserializer: HttpDeserialize<DescribeGlobalTableSettingsResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): DescribeGlobalTableSettingsResponse {
        if (!response.status.isSuccess()) {
            throwDescribeGlobalTableSettingsError(context, response)
        }
        val builder = DescribeGlobalTableSettingsResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeDescribeGlobalTableSettingsOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private fun deserializeDescribeGlobalTableSettingsOperationBody(builder: DescribeGlobalTableSettingsResponse.Builder, payload: ByteArray) {
    val deserializer = JsonDeserializer(payload)
    val GLOBALTABLENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("GlobalTableName"))
    val REPLICASETTINGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("ReplicaSettings"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(GLOBALTABLENAME_DESCRIPTOR)
        field(REPLICASETTINGS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                GLOBALTABLENAME_DESCRIPTOR.index -> builder.globalTableName = deserializeString()
                REPLICASETTINGS_DESCRIPTOR.index -> builder.replicaSettings =
                    deserializer.deserializeList(REPLICASETTINGS_DESCRIPTOR) {
                        val col0 = mutableListOf<ReplicaSettingsDescription>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeReplicaSettingsDescriptionDocument(deserializer) } else { deserializeNull(); continue }
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

private suspend fun throwDescribeGlobalTableSettingsError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
    val payload = response.body.readAll()
    val wrappedResponse = response.withPayload(payload)

    val errorDetails = try {
        RestJsonErrorDeserializer.deserialize(response.headers, payload)
    } catch (ex: Exception) {
        throw UnknownServiceErrorException("failed to parse response as awsJson1_0 error", ex).also {
            setAseErrorMetadata(it, wrappedResponse, null)
        }
    }

    val modeledExceptionDeserializer = when(errorDetails.code) {
        "GlobalTableNotFoundException" -> GlobalTableNotFoundExceptionDeserializer()
        "InternalServerError" -> InternalServerErrorDeserializer()
        "InvalidEndpointException" -> InvalidEndpointExceptionDeserializer()
        else -> throw DynamoDbException(errorDetails.message)
    }

    val modeledException = modeledExceptionDeserializer.deserialize(context, wrappedResponse)
    setAseErrorMetadata(modeledException, wrappedResponse, errorDetails)
    throw modeledException
}
