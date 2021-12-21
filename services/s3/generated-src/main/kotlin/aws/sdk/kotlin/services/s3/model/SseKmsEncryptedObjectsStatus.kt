// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



sealed class SseKmsEncryptedObjectsStatus {

    abstract val value: kotlin.String

    object Disabled : aws.sdk.kotlin.services.s3.model.SseKmsEncryptedObjectsStatus() {
        override val value: kotlin.String = "Disabled"
        override fun toString(): kotlin.String = value
    }

    object Enabled : aws.sdk.kotlin.services.s3.model.SseKmsEncryptedObjectsStatus() {
        override val value: kotlin.String = "Enabled"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.s3.model.SseKmsEncryptedObjectsStatus() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.s3.model.SseKmsEncryptedObjectsStatus = when(str) {
            "Disabled" -> Disabled
            "Enabled" -> Enabled
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.s3.model.SseKmsEncryptedObjectsStatus> = listOf(
            Disabled,
            Enabled
        )
    }
}