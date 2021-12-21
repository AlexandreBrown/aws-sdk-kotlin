// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.AccessControlPolicy
import aws.sdk.kotlin.services.s3.model.Grant
import aws.sdk.kotlin.services.s3.model.Owner
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
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


internal fun serializeAccessControlPolicyDocument(serializer: Serializer, input: AccessControlPolicy) {
    val GRANTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("AccessControlList"), XmlCollectionName("Grant"))
    val OWNER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Owner"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("AccessControlPolicy"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(GRANTS_DESCRIPTOR)
        field(OWNER_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.grants != null) {
            listField(GRANTS_DESCRIPTOR) {
                for (el0 in input.grants) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeGrantDocument))
                }
            }
        }
        input.owner?.let { field(OWNER_DESCRIPTOR, it, ::serializeOwnerDocument) }
    }
}
