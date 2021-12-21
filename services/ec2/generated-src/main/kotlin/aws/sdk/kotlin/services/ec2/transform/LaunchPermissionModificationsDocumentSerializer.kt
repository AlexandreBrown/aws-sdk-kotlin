// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.LaunchPermission
import aws.sdk.kotlin.services.ec2.model.LaunchPermissionModifications
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


internal fun serializeLaunchPermissionModificationsDocument(serializer: Serializer, input: LaunchPermissionModifications) {
    val ADD_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Add"), FormUrlFlattened)
    val REMOVE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Remove"), FormUrlFlattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("LaunchPermissionModifications"))
        field(ADD_DESCRIPTOR)
        field(REMOVE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.add != null) {
            listField(ADD_DESCRIPTOR) {
                for (el0 in input.add) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeLaunchPermissionDocument))
                }
            }
        }
        if (input.remove != null) {
            listField(REMOVE_DESCRIPTOR) {
                for (el0 in input.remove) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeLaunchPermissionDocument))
                }
            }
        }
    }
}
