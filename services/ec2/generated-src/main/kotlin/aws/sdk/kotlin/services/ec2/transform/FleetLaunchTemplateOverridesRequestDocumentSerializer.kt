// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.FleetLaunchTemplateOverridesRequest
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


internal fun serializeFleetLaunchTemplateOverridesRequestDocument(serializer: Serializer, input: FleetLaunchTemplateOverridesRequest) {
    val AVAILABILITYZONE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("AvailabilityZone"))
    val INSTANCEREQUIREMENTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("InstanceRequirements"))
    val INSTANCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstanceType"))
    val MAXPRICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("MaxPrice"))
    val PLACEMENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("Placement"))
    val PRIORITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Double, FormUrlSerialName("Priority"))
    val SUBNETID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("SubnetId"))
    val WEIGHTEDCAPACITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Double, FormUrlSerialName("WeightedCapacity"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("FleetLaunchTemplateOverridesRequest"))
        field(AVAILABILITYZONE_DESCRIPTOR)
        field(INSTANCEREQUIREMENTS_DESCRIPTOR)
        field(INSTANCETYPE_DESCRIPTOR)
        field(MAXPRICE_DESCRIPTOR)
        field(PLACEMENT_DESCRIPTOR)
        field(PRIORITY_DESCRIPTOR)
        field(SUBNETID_DESCRIPTOR)
        field(WEIGHTEDCAPACITY_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.instanceType?.let { field(INSTANCETYPE_DESCRIPTOR, it.value) }
        input.maxPrice?.let { field(MAXPRICE_DESCRIPTOR, it) }
        input.subnetId?.let { field(SUBNETID_DESCRIPTOR, it) }
        input.availabilityZone?.let { field(AVAILABILITYZONE_DESCRIPTOR, it) }
        input.weightedCapacity?.let { field(WEIGHTEDCAPACITY_DESCRIPTOR, it) }
        input.priority?.let { field(PRIORITY_DESCRIPTOR, it) }
        input.placement?.let { field(PLACEMENT_DESCRIPTOR, it, ::serializePlacementDocument) }
        input.instanceRequirements?.let { field(INSTANCEREQUIREMENTS_DESCRIPTOR, it, ::serializeInstanceRequirementsRequestDocument) }
    }
}
