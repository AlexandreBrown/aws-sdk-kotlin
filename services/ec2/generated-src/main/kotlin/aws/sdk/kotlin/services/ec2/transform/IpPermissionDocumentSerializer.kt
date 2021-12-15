// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.IpPermission
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


internal fun serializeIpPermissionDocument(serializer: Serializer, input: IpPermission) {
    val FROMPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("FromPort"))
    val IPPROTOCOL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("IpProtocol"))
    val IPRANGES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("IpRanges"), FormUrlFlattened)
    val IPV6RANGES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Ipv6Ranges"), FormUrlFlattened)
    val PREFIXLISTIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("PrefixListIds"), FormUrlFlattened)
    val TOPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("ToPort"))
    val USERIDGROUPPAIRS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Groups"), FormUrlFlattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("IpPermission"))
        field(FROMPORT_DESCRIPTOR)
        field(IPPROTOCOL_DESCRIPTOR)
        field(IPRANGES_DESCRIPTOR)
        field(IPV6RANGES_DESCRIPTOR)
        field(PREFIXLISTIDS_DESCRIPTOR)
        field(TOPORT_DESCRIPTOR)
        field(USERIDGROUPPAIRS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.fromPort?.let { field(FROMPORT_DESCRIPTOR, it) }
        input.ipProtocol?.let { field(IPPROTOCOL_DESCRIPTOR, it) }
        if (input.ipRanges != null) {
            listField(IPRANGES_DESCRIPTOR) {
                for (el0 in input.ipRanges) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeIpRangeDocument))
                }
            }
        }
        if (input.ipv6Ranges != null) {
            listField(IPV6RANGES_DESCRIPTOR) {
                for (el0 in input.ipv6Ranges) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeIpv6RangeDocument))
                }
            }
        }
        if (input.prefixListIds != null) {
            listField(PREFIXLISTIDS_DESCRIPTOR) {
                for (el0 in input.prefixListIds) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializePrefixListIdDocument))
                }
            }
        }
        input.toPort?.let { field(TOPORT_DESCRIPTOR, it) }
        if (input.userIdGroupPairs != null) {
            listField(USERIDGROUPPAIRS_DESCRIPTOR) {
                for (el0 in input.userIdGroupPairs) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeUserIdGroupPairDocument))
                }
            }
        }
    }
}
