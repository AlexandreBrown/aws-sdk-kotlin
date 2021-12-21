// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class CapacityReservationPreference {

    abstract val value: kotlin.String

    object None : aws.sdk.kotlin.services.ec2.model.CapacityReservationPreference() {
        override val value: kotlin.String = "none"
        override fun toString(): kotlin.String = value
    }

    object Open : aws.sdk.kotlin.services.ec2.model.CapacityReservationPreference() {
        override val value: kotlin.String = "open"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.CapacityReservationPreference() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.CapacityReservationPreference = when(str) {
            "none" -> None
            "open" -> Open
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.CapacityReservationPreference> = listOf(
            None,
            Open
        )
    }
}