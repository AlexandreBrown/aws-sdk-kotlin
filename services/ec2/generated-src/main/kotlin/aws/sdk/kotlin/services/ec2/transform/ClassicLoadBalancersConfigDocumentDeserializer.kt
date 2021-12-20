// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ClassicLoadBalancer
import aws.sdk.kotlin.services.ec2.model.ClassicLoadBalancersConfig
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


internal fun deserializeClassicLoadBalancersConfigDocument(deserializer: Deserializer): ClassicLoadBalancersConfig {
    val builder = ClassicLoadBalancersConfig.Builder()
    val CLASSICLOADBALANCERS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("classicLoadBalancers"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ClassicLoadBalancersConfig"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CLASSICLOADBALANCERS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CLASSICLOADBALANCERS_DESCRIPTOR.index -> builder.classicLoadBalancers =
                    deserializer.deserializeList(CLASSICLOADBALANCERS_DESCRIPTOR) {
                        val col0 = mutableListOf<ClassicLoadBalancer>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeClassicLoadBalancerDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}