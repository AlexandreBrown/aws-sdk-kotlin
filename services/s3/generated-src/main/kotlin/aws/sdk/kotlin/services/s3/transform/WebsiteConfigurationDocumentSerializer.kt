// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.WebsiteConfiguration
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
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal fun serializeWebsiteConfigurationDocument(serializer: Serializer, input: WebsiteConfiguration) {
    val ERRORDOCUMENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("ErrorDocument"))
    val INDEXDOCUMENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("IndexDocument"))
    val REDIRECTALLREQUESTSTO_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("RedirectAllRequestsTo"))
    val ROUTINGRULES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("RoutingRules"), XmlCollectionName("RoutingRule"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("WebsiteConfiguration"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(ERRORDOCUMENT_DESCRIPTOR)
        field(INDEXDOCUMENT_DESCRIPTOR)
        field(REDIRECTALLREQUESTSTO_DESCRIPTOR)
        field(ROUTINGRULES_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.errorDocument?.let { field(ERRORDOCUMENT_DESCRIPTOR, it, ::serializeErrorDocumentDocument) }
        input.indexDocument?.let { field(INDEXDOCUMENT_DESCRIPTOR, it, ::serializeIndexDocumentDocument) }
        input.redirectAllRequestsTo?.let { field(REDIRECTALLREQUESTSTO_DESCRIPTOR, it, ::serializeRedirectAllRequestsToDocument) }
        if (input.routingRules != null) {
            listField(ROUTINGRULES_DESCRIPTOR) {
                for (el0 in input.routingRules) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeRoutingRuleDocument))
                }
            }
        }
    }
}
