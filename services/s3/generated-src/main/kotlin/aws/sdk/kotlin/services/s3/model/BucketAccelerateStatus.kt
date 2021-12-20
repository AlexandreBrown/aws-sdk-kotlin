// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



sealed class BucketAccelerateStatus {

    abstract val value: kotlin.String

    object Enabled : aws.sdk.kotlin.services.s3.model.BucketAccelerateStatus() {
        override val value: kotlin.String = "Enabled"
        override fun toString(): kotlin.String = value
    }

    object Suspended : aws.sdk.kotlin.services.s3.model.BucketAccelerateStatus() {
        override val value: kotlin.String = "Suspended"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.s3.model.BucketAccelerateStatus() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.s3.model.BucketAccelerateStatus = when(str) {
            "Enabled" -> Enabled
            "Suspended" -> Suspended
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.s3.model.BucketAccelerateStatus> = listOf(
            Enabled,
            Suspended
        )
    }
}