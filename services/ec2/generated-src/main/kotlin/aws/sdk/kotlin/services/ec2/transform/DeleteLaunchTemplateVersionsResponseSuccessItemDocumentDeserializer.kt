// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DeleteLaunchTemplateVersionsResponseSuccessItem
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


internal fun deserializeDeleteLaunchTemplateVersionsResponseSuccessItemDocument(deserializer: Deserializer): DeleteLaunchTemplateVersionsResponseSuccessItem {
    val builder = DeleteLaunchTemplateVersionsResponseSuccessItem.Builder()
    val LAUNCHTEMPLATEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("launchTemplateId"))
    val LAUNCHTEMPLATENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("launchTemplateName"))
    val VERSIONNUMBER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Long, XmlSerialName("versionNumber"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("DeleteLaunchTemplateVersionsResponseSuccessItem"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(LAUNCHTEMPLATEID_DESCRIPTOR)
        field(LAUNCHTEMPLATENAME_DESCRIPTOR)
        field(VERSIONNUMBER_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                LAUNCHTEMPLATEID_DESCRIPTOR.index -> builder.launchTemplateId = deserializeString()
                LAUNCHTEMPLATENAME_DESCRIPTOR.index -> builder.launchTemplateName = deserializeString()
                VERSIONNUMBER_DESCRIPTOR.index -> builder.versionNumber = deserializeLong()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
