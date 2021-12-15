// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DnsEntry
import aws.sdk.kotlin.services.ec2.model.State
import aws.sdk.kotlin.services.ec2.model.VpcEndpointConnection
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
import aws.smithy.kotlin.runtime.time.Instant


internal fun deserializeVpcEndpointConnectionDocument(deserializer: Deserializer): VpcEndpointConnection {
    val builder = VpcEndpointConnection.Builder()
    val CREATIONTIMESTAMP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("creationTimestamp"))
    val DNSENTRIES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("dnsEntrySet"), XmlCollectionName("item"))
    val GATEWAYLOADBALANCERARNS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("gatewayLoadBalancerArnSet"), XmlCollectionName("item"))
    val NETWORKLOADBALANCERARNS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("networkLoadBalancerArnSet"), XmlCollectionName("item"))
    val SERVICEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("serviceId"))
    val VPCENDPOINTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vpcEndpointId"))
    val VPCENDPOINTOWNER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vpcEndpointOwner"))
    val VPCENDPOINTSTATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vpcEndpointState"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("VpcEndpointConnection"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CREATIONTIMESTAMP_DESCRIPTOR)
        field(DNSENTRIES_DESCRIPTOR)
        field(GATEWAYLOADBALANCERARNS_DESCRIPTOR)
        field(NETWORKLOADBALANCERARNS_DESCRIPTOR)
        field(SERVICEID_DESCRIPTOR)
        field(VPCENDPOINTID_DESCRIPTOR)
        field(VPCENDPOINTOWNER_DESCRIPTOR)
        field(VPCENDPOINTSTATE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CREATIONTIMESTAMP_DESCRIPTOR.index -> builder.creationTimestamp = deserializeString().let { Instant.fromIso8601(it) }
                DNSENTRIES_DESCRIPTOR.index -> builder.dnsEntries =
                    deserializer.deserializeList(DNSENTRIES_DESCRIPTOR) {
                        val col0 = mutableListOf<DnsEntry>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeDnsEntryDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                GATEWAYLOADBALANCERARNS_DESCRIPTOR.index -> builder.gatewayLoadBalancerArns =
                    deserializer.deserializeList(GATEWAYLOADBALANCERARNS_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                NETWORKLOADBALANCERARNS_DESCRIPTOR.index -> builder.networkLoadBalancerArns =
                    deserializer.deserializeList(NETWORKLOADBALANCERARNS_DESCRIPTOR) {
                        val col0 = mutableListOf<String>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString() } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                SERVICEID_DESCRIPTOR.index -> builder.serviceId = deserializeString()
                VPCENDPOINTID_DESCRIPTOR.index -> builder.vpcEndpointId = deserializeString()
                VPCENDPOINTOWNER_DESCRIPTOR.index -> builder.vpcEndpointOwner = deserializeString()
                VPCENDPOINTSTATE_DESCRIPTOR.index -> builder.vpcEndpointState = deserializeString().let { State.fromValue(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
