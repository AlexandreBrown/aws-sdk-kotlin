// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ResourceStatementRequest
import aws.sdk.kotlin.services.ec2.model.ThroughResourcesStatementRequest
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal fun serializeThroughResourcesStatementRequestDocument(serializer: Serializer, input: ThroughResourcesStatementRequest) {
    val RESOURCESTATEMENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("ResourceStatement"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ThroughResourcesStatementRequest"))
        field(RESOURCESTATEMENT_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.resourceStatement?.let { field(RESOURCESTATEMENT_DESCRIPTOR, it, ::serializeResourceStatementRequestDocument) }
    }
}
