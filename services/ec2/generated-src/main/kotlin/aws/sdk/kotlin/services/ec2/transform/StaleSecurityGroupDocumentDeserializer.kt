// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.StaleIpPermission
import aws.sdk.kotlin.services.ec2.model.StaleSecurityGroup
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
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal fun deserializeStaleSecurityGroupDocument(deserializer: Deserializer): StaleSecurityGroup {
    val builder = StaleSecurityGroup.Builder()
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val GROUPID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("groupId"))
    val GROUPNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("groupName"))
    val STALEIPPERMISSIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("staleIpPermissions"), XmlCollectionName("item"))
    val STALEIPPERMISSIONSEGRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("staleIpPermissionsEgress"), XmlCollectionName("item"))
    val VPCID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vpcId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("StaleSecurityGroup"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DESCRIPTION_DESCRIPTOR)
        field(GROUPID_DESCRIPTOR)
        field(GROUPNAME_DESCRIPTOR)
        field(STALEIPPERMISSIONS_DESCRIPTOR)
        field(STALEIPPERMISSIONSEGRESS_DESCRIPTOR)
        field(VPCID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                GROUPID_DESCRIPTOR.index -> builder.groupId = deserializeString()
                GROUPNAME_DESCRIPTOR.index -> builder.groupName = deserializeString()
                STALEIPPERMISSIONS_DESCRIPTOR.index -> builder.staleIpPermissions =
                    deserializer.deserializeList(STALEIPPERMISSIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<StaleIpPermission>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeStaleIpPermissionDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                STALEIPPERMISSIONSEGRESS_DESCRIPTOR.index -> builder.staleIpPermissionsEgress =
                    deserializer.deserializeList(STALEIPPERMISSIONSEGRESS_DESCRIPTOR) {
                        val col0 = mutableListOf<StaleIpPermission>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeStaleIpPermissionDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                VPCID_DESCRIPTOR.index -> builder.vpcId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
