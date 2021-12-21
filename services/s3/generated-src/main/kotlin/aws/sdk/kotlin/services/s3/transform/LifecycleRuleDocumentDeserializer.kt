// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.AbortIncompleteMultipartUpload
import aws.sdk.kotlin.services.s3.model.ExpirationStatus
import aws.sdk.kotlin.services.s3.model.LifecycleExpiration
import aws.sdk.kotlin.services.s3.model.LifecycleRule
import aws.sdk.kotlin.services.s3.model.LifecycleRuleFilter
import aws.sdk.kotlin.services.s3.model.NoncurrentVersionExpiration
import aws.sdk.kotlin.services.s3.model.NoncurrentVersionTransition
import aws.sdk.kotlin.services.s3.model.Transition
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
import aws.smithy.kotlin.runtime.serde.xml.Flattened
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal fun deserializeLifecycleRuleDocument(deserializer: Deserializer): LifecycleRule {
    val builder = LifecycleRule.Builder()
    val ABORTINCOMPLETEMULTIPARTUPLOAD_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("AbortIncompleteMultipartUpload"))
    val EXPIRATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Expiration"))
    val FILTER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Filter"))
    val ID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ID"))
    val NONCURRENTVERSIONEXPIRATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("NoncurrentVersionExpiration"))
    val NONCURRENTVERSIONTRANSITIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("NoncurrentVersionTransition"), Flattened)
    val PREFIX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Prefix"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Status"))
    val TRANSITIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("Transition"), Flattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("LifecycleRule"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(ABORTINCOMPLETEMULTIPARTUPLOAD_DESCRIPTOR)
        field(EXPIRATION_DESCRIPTOR)
        field(FILTER_DESCRIPTOR)
        field(ID_DESCRIPTOR)
        field(NONCURRENTVERSIONEXPIRATION_DESCRIPTOR)
        field(NONCURRENTVERSIONTRANSITIONS_DESCRIPTOR)
        field(PREFIX_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
        field(TRANSITIONS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ABORTINCOMPLETEMULTIPARTUPLOAD_DESCRIPTOR.index -> builder.abortIncompleteMultipartUpload = deserializeAbortIncompleteMultipartUploadDocument(deserializer)
                EXPIRATION_DESCRIPTOR.index -> builder.expiration = deserializeLifecycleExpirationDocument(deserializer)
                FILTER_DESCRIPTOR.index -> builder.filter = deserializeLifecycleRuleFilterDocument(deserializer)
                ID_DESCRIPTOR.index -> builder.id = deserializeString()
                NONCURRENTVERSIONEXPIRATION_DESCRIPTOR.index -> builder.noncurrentVersionExpiration = deserializeNoncurrentVersionExpirationDocument(deserializer)
                NONCURRENTVERSIONTRANSITIONS_DESCRIPTOR.index -> builder.noncurrentVersionTransitions =
                    deserializer.deserializeList(NONCURRENTVERSIONTRANSITIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<NoncurrentVersionTransition>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeNoncurrentVersionTransitionDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                PREFIX_DESCRIPTOR.index -> builder.prefix = deserializeString()
                STATUS_DESCRIPTOR.index -> builder.status = deserializeString().let { ExpirationStatus.fromValue(it) }
                TRANSITIONS_DESCRIPTOR.index -> builder.transitions =
                    deserializer.deserializeList(TRANSITIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<Transition>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTransitionDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
