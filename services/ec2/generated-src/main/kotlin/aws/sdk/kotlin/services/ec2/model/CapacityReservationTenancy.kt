// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class CapacityReservationTenancy {

    abstract val value: kotlin.String

    object Dedicated : aws.sdk.kotlin.services.ec2.model.CapacityReservationTenancy() {
        override val value: kotlin.String = "dedicated"
        override fun toString(): kotlin.String = value
    }

    object Default : aws.sdk.kotlin.services.ec2.model.CapacityReservationTenancy() {
        override val value: kotlin.String = "default"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.CapacityReservationTenancy() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.CapacityReservationTenancy = when(str) {
            "dedicated" -> Dedicated
            "default" -> Default
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.CapacityReservationTenancy> = listOf(
            Dedicated,
            Default
        )
    }
}