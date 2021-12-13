// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.UserIdGroupPair
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


internal fun deserializeUserIdGroupPairDocument(deserializer: Deserializer): UserIdGroupPair {
    val builder = UserIdGroupPair.Builder()
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val GROUPID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("groupId"))
    val GROUPNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("groupName"))
    val PEERINGSTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("peeringStatus"))
    val USERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("userId"))
    val VPCID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vpcId"))
    val VPCPEERINGCONNECTIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vpcPeeringConnectionId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("UserIdGroupPair"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DESCRIPTION_DESCRIPTOR)
        field(GROUPID_DESCRIPTOR)
        field(GROUPNAME_DESCRIPTOR)
        field(PEERINGSTATUS_DESCRIPTOR)
        field(USERID_DESCRIPTOR)
        field(VPCID_DESCRIPTOR)
        field(VPCPEERINGCONNECTIONID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                GROUPID_DESCRIPTOR.index -> builder.groupId = deserializeString()
                GROUPNAME_DESCRIPTOR.index -> builder.groupName = deserializeString()
                PEERINGSTATUS_DESCRIPTOR.index -> builder.peeringStatus = deserializeString()
                USERID_DESCRIPTOR.index -> builder.userId = deserializeString()
                VPCID_DESCRIPTOR.index -> builder.vpcId = deserializeString()
                VPCPEERINGCONNECTIONID_DESCRIPTOR.index -> builder.vpcPeeringConnectionId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
