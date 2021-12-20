// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.ReplicationRule
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
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


internal fun serializeReplicationRuleDocument(serializer: Serializer, input: ReplicationRule) {
    val DELETEMARKERREPLICATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("DeleteMarkerReplication"))
    val DESTINATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Destination"))
    val EXISTINGOBJECTREPLICATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("ExistingObjectReplication"))
    val FILTER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Filter"))
    val ID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ID"))
    val PREFIX_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Prefix"))
    val PRIORITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("Priority"))
    val SOURCESELECTIONCRITERIA_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("SourceSelectionCriteria"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Status"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ReplicationRule"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(DELETEMARKERREPLICATION_DESCRIPTOR)
        field(DESTINATION_DESCRIPTOR)
        field(EXISTINGOBJECTREPLICATION_DESCRIPTOR)
        field(FILTER_DESCRIPTOR)
        field(ID_DESCRIPTOR)
        field(PREFIX_DESCRIPTOR)
        field(PRIORITY_DESCRIPTOR)
        field(SOURCESELECTIONCRITERIA_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.deleteMarkerReplication?.let { field(DELETEMARKERREPLICATION_DESCRIPTOR, it, ::serializeDeleteMarkerReplicationDocument) }
        input.destination?.let { field(DESTINATION_DESCRIPTOR, it, ::serializeDestinationDocument) }
        input.existingObjectReplication?.let { field(EXISTINGOBJECTREPLICATION_DESCRIPTOR, it, ::serializeExistingObjectReplicationDocument) }
        input.filter?.let { field(FILTER_DESCRIPTOR, it, ::serializeReplicationRuleFilterDocument) }
        input.id?.let { field(ID_DESCRIPTOR, it) }
        input.prefix?.let { field(PREFIX_DESCRIPTOR, it) }
        if (input.priority != 0) field(PRIORITY_DESCRIPTOR, input.priority)
        input.sourceSelectionCriteria?.let { field(SOURCESELECTIONCRITERIA_DESCRIPTOR, it, ::serializeSourceSelectionCriteriaDocument) }
        input.status?.let { field(STATUS_DESCRIPTOR, it.value) }
    }
}