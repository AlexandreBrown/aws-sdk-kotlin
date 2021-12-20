// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



sealed class ObjectLockMode {

    abstract val value: kotlin.String

    object Compliance : aws.sdk.kotlin.services.s3.model.ObjectLockMode() {
        override val value: kotlin.String = "COMPLIANCE"
        override fun toString(): kotlin.String = value
    }

    object Governance : aws.sdk.kotlin.services.s3.model.ObjectLockMode() {
        override val value: kotlin.String = "GOVERNANCE"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.s3.model.ObjectLockMode() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.s3.model.ObjectLockMode = when(str) {
            "COMPLIANCE" -> Compliance
            "GOVERNANCE" -> Governance
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.s3.model.ObjectLockMode> = listOf(
            Compliance,
            Governance
        )
    }
}