// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.VpcCidrBlockAssociation
import aws.sdk.kotlin.services.ec2.model.VpcCidrBlockState
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


internal fun deserializeVpcCidrBlockAssociationDocument(deserializer: Deserializer): VpcCidrBlockAssociation {
    val builder = VpcCidrBlockAssociation.Builder()
    val ASSOCIATIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("associationId"))
    val CIDRBLOCK_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("cidrBlock"))
    val CIDRBLOCKSTATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("cidrBlockState"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("VpcCidrBlockAssociation"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ASSOCIATIONID_DESCRIPTOR)
        field(CIDRBLOCK_DESCRIPTOR)
        field(CIDRBLOCKSTATE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ASSOCIATIONID_DESCRIPTOR.index -> builder.associationId = deserializeString()
                CIDRBLOCK_DESCRIPTOR.index -> builder.cidrBlock = deserializeString()
                CIDRBLOCKSTATE_DESCRIPTOR.index -> builder.cidrBlockState = deserializeVpcCidrBlockStateDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
