// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.LoggingEnabled
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


internal fun serializeLoggingEnabledDocument(serializer: Serializer, input: LoggingEnabled) {
    val TARGETBUCKET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("TargetBucket"))
    val TARGETGRANTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("TargetGrants"), XmlCollectionName("Grant"))
    val TARGETPREFIX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("TargetPrefix"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("LoggingEnabled"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(TARGETBUCKET_DESCRIPTOR)
        field(TARGETGRANTS_DESCRIPTOR)
        field(TARGETPREFIX_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.targetBucket?.let { field(TARGETBUCKET_DESCRIPTOR, it) }
        if (input.targetGrants != null) {
            listField(TARGETGRANTS_DESCRIPTOR) {
                for (el0 in input.targetGrants) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeTargetGrantDocument))
                }
            }
        }
        input.targetPrefix?.let { field(TARGETPREFIX_DESCRIPTOR, it) }
    }
}