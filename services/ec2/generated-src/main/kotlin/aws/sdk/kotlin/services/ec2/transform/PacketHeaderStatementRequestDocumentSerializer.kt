// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.PacketHeaderStatementRequest
import aws.sdk.kotlin.services.ec2.model.Protocol
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


internal fun serializePacketHeaderStatementRequestDocument(serializer: Serializer, input: PacketHeaderStatementRequest) {
    val DESTINATIONADDRESSES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("DestinationAddress"), FormUrlFlattened)
    val DESTINATIONPORTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("DestinationPort"), FormUrlFlattened)
    val DESTINATIONPREFIXLISTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("DestinationPrefixList"), FormUrlFlattened)
    val PROTOCOLS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Protocol"), FormUrlFlattened)
    val SOURCEADDRESSES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("SourceAddress"), FormUrlFlattened)
    val SOURCEPORTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("SourcePort"), FormUrlFlattened)
    val SOURCEPREFIXLISTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("SourcePrefixList"), FormUrlFlattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("PacketHeaderStatementRequest"))
        field(DESTINATIONADDRESSES_DESCRIPTOR)
        field(DESTINATIONPORTS_DESCRIPTOR)
        field(DESTINATIONPREFIXLISTS_DESCRIPTOR)
        field(PROTOCOLS_DESCRIPTOR)
        field(SOURCEADDRESSES_DESCRIPTOR)
        field(SOURCEPORTS_DESCRIPTOR)
        field(SOURCEPREFIXLISTS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.sourceAddresses != null) {
            listField(SOURCEADDRESSES_DESCRIPTOR) {
                for (el0 in input.sourceAddresses) {
                    serializeString(el0)
                }
            }
        }
        if (input.destinationAddresses != null) {
            listField(DESTINATIONADDRESSES_DESCRIPTOR) {
                for (el0 in input.destinationAddresses) {
                    serializeString(el0)
                }
            }
        }
        if (input.sourcePorts != null) {
            listField(SOURCEPORTS_DESCRIPTOR) {
                for (el0 in input.sourcePorts) {
                    serializeString(el0)
                }
            }
        }
        if (input.destinationPorts != null) {
            listField(DESTINATIONPORTS_DESCRIPTOR) {
                for (el0 in input.destinationPorts) {
                    serializeString(el0)
                }
            }
        }
        if (input.sourcePrefixLists != null) {
            listField(SOURCEPREFIXLISTS_DESCRIPTOR) {
                for (el0 in input.sourcePrefixLists) {
                    serializeString(el0)
                }
            }
        }
        if (input.destinationPrefixLists != null) {
            listField(DESTINATIONPREFIXLISTS_DESCRIPTOR) {
                for (el0 in input.destinationPrefixLists) {
                    serializeString(el0)
                }
            }
        }
        if (input.protocols != null) {
            listField(PROTOCOLS_DESCRIPTOR) {
                for (el0 in input.protocols) {
                    serializeString(el0.value)
                }
            }
        }
    }
}
