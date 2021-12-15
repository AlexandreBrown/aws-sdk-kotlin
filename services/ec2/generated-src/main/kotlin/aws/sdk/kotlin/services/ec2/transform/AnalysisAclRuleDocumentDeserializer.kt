// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AnalysisAclRule
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


internal fun deserializeAnalysisAclRuleDocument(deserializer: Deserializer): AnalysisAclRule {
    val builder = AnalysisAclRule.Builder()
    val CIDR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("cidr"))
    val EGRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("egress"))
    val PORTRANGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("portRange"))
    val PROTOCOL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("protocol"))
    val RULEACTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ruleAction"))
    val RULENUMBER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("ruleNumber"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("AnalysisAclRule"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CIDR_DESCRIPTOR)
        field(EGRESS_DESCRIPTOR)
        field(PORTRANGE_DESCRIPTOR)
        field(PROTOCOL_DESCRIPTOR)
        field(RULEACTION_DESCRIPTOR)
        field(RULENUMBER_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CIDR_DESCRIPTOR.index -> builder.cidr = deserializeString()
                EGRESS_DESCRIPTOR.index -> builder.egress = deserializeBoolean()
                PORTRANGE_DESCRIPTOR.index -> builder.portRange = deserializePortRangeDocument(deserializer)
                PROTOCOL_DESCRIPTOR.index -> builder.protocol = deserializeString()
                RULEACTION_DESCRIPTOR.index -> builder.ruleAction = deserializeString()
                RULENUMBER_DESCRIPTOR.index -> builder.ruleNumber = deserializeInt()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
