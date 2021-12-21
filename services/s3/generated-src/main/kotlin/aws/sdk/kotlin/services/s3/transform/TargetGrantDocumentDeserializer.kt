// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.BucketLogsPermission
import aws.sdk.kotlin.services.s3.model.Grantee
import aws.sdk.kotlin.services.s3.model.TargetGrant
import aws.smithy.kotlin.runtime.serde.Deserializer
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
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal fun deserializeTargetGrantDocument(deserializer: Deserializer): TargetGrant {
    val builder = TargetGrant.Builder()
    val GRANTEE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Grantee"), XmlNamespace("http://www.w3.org/2001/XMLSchema-instance", "xsi"))
    val PERMISSION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Permission"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("TargetGrant"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(GRANTEE_DESCRIPTOR)
        field(PERMISSION_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                GRANTEE_DESCRIPTOR.index -> builder.grantee = deserializeGranteeDocument(deserializer)
                PERMISSION_DESCRIPTOR.index -> builder.permission = deserializeString().let { BucketLogsPermission.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
