// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.InstanceEventWindowDisassociationRequest
import aws.sdk.kotlin.services.ec2.model.Tag
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlFlattened
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal fun serializeInstanceEventWindowDisassociationRequestDocument(serializer: Serializer, input: InstanceEventWindowDisassociationRequest) {
    val DEDICATEDHOSTIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("DedicatedHostId"), FormUrlFlattened)
    val INSTANCEIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("InstanceId"), FormUrlFlattened)
    val INSTANCETAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("InstanceTag"), FormUrlFlattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("InstanceEventWindowDisassociationRequest"))
        field(DEDICATEDHOSTIDS_DESCRIPTOR)
        field(INSTANCEIDS_DESCRIPTOR)
        field(INSTANCETAGS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.instanceIds != null) {
            listField(INSTANCEIDS_DESCRIPTOR) {
                for (el0 in input.instanceIds) {
                    serializeString(el0)
                }
            }
        }
        if (input.instanceTags != null) {
            listField(INSTANCETAGS_DESCRIPTOR) {
                for (el0 in input.instanceTags) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeTagDocument))
                }
            }
        }
        if (input.dedicatedHostIds != null) {
            listField(DEDICATEDHOSTIDS_DESCRIPTOR) {
                for (el0 in input.dedicatedHostIds) {
                    serializeString(el0)
                }
            }
        }
    }
}
