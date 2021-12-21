// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class SummaryStatus {

    abstract val value: kotlin.String

    object Impaired : aws.sdk.kotlin.services.ec2.model.SummaryStatus() {
        override val value: kotlin.String = "impaired"
        override fun toString(): kotlin.String = value
    }

    object Initializing : aws.sdk.kotlin.services.ec2.model.SummaryStatus() {
        override val value: kotlin.String = "initializing"
        override fun toString(): kotlin.String = value
    }

    object InsufficientData : aws.sdk.kotlin.services.ec2.model.SummaryStatus() {
        override val value: kotlin.String = "insufficient-data"
        override fun toString(): kotlin.String = value
    }

    object NotApplicable : aws.sdk.kotlin.services.ec2.model.SummaryStatus() {
        override val value: kotlin.String = "not-applicable"
        override fun toString(): kotlin.String = value
    }

    object Ok : aws.sdk.kotlin.services.ec2.model.SummaryStatus() {
        override val value: kotlin.String = "ok"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.SummaryStatus() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.SummaryStatus = when(str) {
            "impaired" -> Impaired
            "initializing" -> Initializing
            "insufficient-data" -> InsufficientData
            "not-applicable" -> NotApplicable
            "ok" -> Ok
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.SummaryStatus> = listOf(
            Impaired,
            Initializing,
            InsufficientData,
            NotApplicable,
            Ok
        )
    }
}