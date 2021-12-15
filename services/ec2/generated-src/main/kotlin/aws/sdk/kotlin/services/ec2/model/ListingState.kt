// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class ListingState {

    abstract val value: kotlin.String

    object Available : aws.sdk.kotlin.services.ec2.model.ListingState() {
        override val value: kotlin.String = "available"
        override fun toString(): kotlin.String = value
    }

    object Cancelled : aws.sdk.kotlin.services.ec2.model.ListingState() {
        override val value: kotlin.String = "cancelled"
        override fun toString(): kotlin.String = value
    }

    object Pending : aws.sdk.kotlin.services.ec2.model.ListingState() {
        override val value: kotlin.String = "pending"
        override fun toString(): kotlin.String = value
    }

    object Sold : aws.sdk.kotlin.services.ec2.model.ListingState() {
        override val value: kotlin.String = "sold"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.ListingState() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.ListingState = when(str) {
            "available" -> Available
            "cancelled" -> Cancelled
            "pending" -> Pending
            "sold" -> Sold
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.ListingState> = listOf(
            Available,
            Cancelled,
            Pending,
            Sold
        )
    }
}
