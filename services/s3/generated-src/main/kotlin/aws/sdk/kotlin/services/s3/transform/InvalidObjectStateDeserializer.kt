// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.IntelligentTieringAccessTier
import aws.sdk.kotlin.services.s3.model.InvalidObjectState
import aws.sdk.kotlin.services.s3.model.StorageClass
import aws.smithy.kotlin.runtime.client.ExecutionContext
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
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlError
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal class InvalidObjectStateDeserializer: HttpDeserialize<InvalidObjectState> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): InvalidObjectState {
        val builder = InvalidObjectState.Builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeInvalidObjectStateError(builder, payload)
        }
        return builder.build()
    }
}

private fun deserializeInvalidObjectStateError(builder: InvalidObjectState.Builder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val ACCESSTIER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("AccessTier"))
    val STORAGECLASS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("StorageClass"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("Error"))
        trait(XmlError)
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(ACCESSTIER_DESCRIPTOR)
        field(STORAGECLASS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ACCESSTIER_DESCRIPTOR.index -> builder.accessTier = deserializeString().let { IntelligentTieringAccessTier.fromValue(it) }
                STORAGECLASS_DESCRIPTOR.index -> builder.storageClass = deserializeString().let { StorageClass.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}