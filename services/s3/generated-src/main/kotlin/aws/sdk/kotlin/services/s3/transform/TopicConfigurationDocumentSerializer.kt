// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.Event
import aws.sdk.kotlin.services.s3.model.NotificationConfigurationFilter
import aws.sdk.kotlin.services.s3.model.TopicConfiguration
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
import aws.smithy.kotlin.runtime.serde.xml.Flattened
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal fun serializeTopicConfigurationDocument(serializer: Serializer, input: TopicConfiguration) {
    val EVENTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("Event"), Flattened)
    val FILTER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Filter"))
    val ID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Id"))
    val TOPICARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Topic"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("TopicConfiguration"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(EVENTS_DESCRIPTOR)
        field(FILTER_DESCRIPTOR)
        field(ID_DESCRIPTOR)
        field(TOPICARN_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.events != null) {
            listField(EVENTS_DESCRIPTOR) {
                for (el0 in input.events) {
                    serializeString(el0.value)
                }
            }
        }
        input.filter?.let { field(FILTER_DESCRIPTOR, it, ::serializeNotificationConfigurationFilterDocument) }
        input.id?.let { field(ID_DESCRIPTOR, it) }
        input.topicArn?.let { field(TOPICARN_DESCRIPTOR, it) }
    }
}
