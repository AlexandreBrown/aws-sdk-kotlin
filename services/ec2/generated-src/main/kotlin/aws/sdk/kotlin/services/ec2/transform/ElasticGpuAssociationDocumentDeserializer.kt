// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ElasticGpuAssociation
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


internal fun deserializeElasticGpuAssociationDocument(deserializer: Deserializer): ElasticGpuAssociation {
    val builder = ElasticGpuAssociation.Builder()
    val ELASTICGPUASSOCIATIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("elasticGpuAssociationId"))
    val ELASTICGPUASSOCIATIONSTATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("elasticGpuAssociationState"))
    val ELASTICGPUASSOCIATIONTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("elasticGpuAssociationTime"))
    val ELASTICGPUID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("elasticGpuId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ElasticGpuAssociation"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ELASTICGPUASSOCIATIONID_DESCRIPTOR)
        field(ELASTICGPUASSOCIATIONSTATE_DESCRIPTOR)
        field(ELASTICGPUASSOCIATIONTIME_DESCRIPTOR)
        field(ELASTICGPUID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ELASTICGPUASSOCIATIONID_DESCRIPTOR.index -> builder.elasticGpuAssociationId = deserializeString()
                ELASTICGPUASSOCIATIONSTATE_DESCRIPTOR.index -> builder.elasticGpuAssociationState = deserializeString()
                ELASTICGPUASSOCIATIONTIME_DESCRIPTOR.index -> builder.elasticGpuAssociationTime = deserializeString()
                ELASTICGPUID_DESCRIPTOR.index -> builder.elasticGpuId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
