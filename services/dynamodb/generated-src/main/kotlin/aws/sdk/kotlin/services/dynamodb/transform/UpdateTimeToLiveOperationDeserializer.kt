// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.json.RestJsonErrorDeserializer
import aws.sdk.kotlin.services.dynamodb.model.DynamoDbException
import aws.sdk.kotlin.services.dynamodb.model.TimeToLiveSpecification
import aws.sdk.kotlin.services.dynamodb.model.UpdateTimeToLiveResponse
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


internal class UpdateTimeToLiveOperationDeserializer: HttpDeserialize<UpdateTimeToLiveResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): UpdateTimeToLiveResponse {
        if (!response.status.isSuccess()) {
            throwUpdateTimeToLiveError(context, response)
        }
        val builder = UpdateTimeToLiveResponse.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeUpdateTimeToLiveOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private fun deserializeUpdateTimeToLiveOperationBody(builder: UpdateTimeToLiveResponse.Builder, payload: ByteArray) {
    val deserializer = JsonDeserializer(payload)
    val TIMETOLIVESPECIFICATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("TimeToLiveSpecification"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(TIMETOLIVESPECIFICATION_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                TIMETOLIVESPECIFICATION_DESCRIPTOR.index -> builder.timeToLiveSpecification = deserializeTimeToLiveSpecificationDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwUpdateTimeToLiveError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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
        "InternalServerError" -> InternalServerErrorDeserializer()
        "InvalidEndpointException" -> InvalidEndpointExceptionDeserializer()
        "LimitExceededException" -> LimitExceededExceptionDeserializer()
        "ResourceInUseException" -> ResourceInUseExceptionDeserializer()
        "ResourceNotFoundException" -> ResourceNotFoundExceptionDeserializer()
        else -> throw DynamoDbException(errorDetails.message)
    }

    val modeledException = modeledExceptionDeserializer.deserialize(context, wrappedResponse)
    setAseErrorMetadata(modeledException, wrappedResponse, errorDetails)
    throw modeledException
}
