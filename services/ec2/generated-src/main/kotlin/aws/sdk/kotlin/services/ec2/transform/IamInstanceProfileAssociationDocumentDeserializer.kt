// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.IamInstanceProfileAssociation
import aws.sdk.kotlin.services.ec2.model.IamInstanceProfileAssociationState
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
import aws.smithy.kotlin.runtime.time.Instant


internal fun deserializeIamInstanceProfileAssociationDocument(deserializer: Deserializer): IamInstanceProfileAssociation {
    val builder = IamInstanceProfileAssociation.Builder()
    val ASSOCIATIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("associationId"))
    val IAMINSTANCEPROFILE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("iamInstanceProfile"))
    val INSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceId"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val TIMESTAMP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("timestamp"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("IamInstanceProfileAssociation"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ASSOCIATIONID_DESCRIPTOR)
        field(IAMINSTANCEPROFILE_DESCRIPTOR)
        field(INSTANCEID_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(TIMESTAMP_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ASSOCIATIONID_DESCRIPTOR.index -> builder.associationId = deserializeString()
                IAMINSTANCEPROFILE_DESCRIPTOR.index -> builder.iamInstanceProfile = deserializeIamInstanceProfileDocument(deserializer)
                INSTANCEID_DESCRIPTOR.index -> builder.instanceId = deserializeString()
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { IamInstanceProfileAssociationState.fromValue(it) }
                TIMESTAMP_DESCRIPTOR.index -> builder.timestamp = deserializeString().let { Instant.fromIso8601(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}