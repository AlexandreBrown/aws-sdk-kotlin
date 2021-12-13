// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.SecurityGroupRuleRequest
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal fun serializeSecurityGroupRuleRequestDocument(serializer: Serializer, input: SecurityGroupRuleRequest) {
    val CIDRIPV4_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("CidrIpv4"))
    val CIDRIPV6_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("CidrIpv6"))
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Description"))
    val FROMPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("FromPort"))
    val IPPROTOCOL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("IpProtocol"))
    val PREFIXLISTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("PrefixListId"))
    val REFERENCEDGROUPID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("ReferencedGroupId"))
    val TOPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("ToPort"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("SecurityGroupRuleRequest"))
        field(CIDRIPV4_DESCRIPTOR)
        field(CIDRIPV6_DESCRIPTOR)
        field(DESCRIPTION_DESCRIPTOR)
        field(FROMPORT_DESCRIPTOR)
        field(IPPROTOCOL_DESCRIPTOR)
        field(PREFIXLISTID_DESCRIPTOR)
        field(REFERENCEDGROUPID_DESCRIPTOR)
        field(TOPORT_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.ipProtocol?.let { field(IPPROTOCOL_DESCRIPTOR, it) }
        input.fromPort?.let { field(FROMPORT_DESCRIPTOR, it) }
        input.toPort?.let { field(TOPORT_DESCRIPTOR, it) }
        input.cidrIpv4?.let { field(CIDRIPV4_DESCRIPTOR, it) }
        input.cidrIpv6?.let { field(CIDRIPV6_DESCRIPTOR, it) }
        input.prefixListId?.let { field(PREFIXLISTID_DESCRIPTOR, it) }
        input.referencedGroupId?.let { field(REFERENCEDGROUPID_DESCRIPTOR, it) }
        input.description?.let { field(DESCRIPTION_DESCRIPTOR, it) }
    }
}
