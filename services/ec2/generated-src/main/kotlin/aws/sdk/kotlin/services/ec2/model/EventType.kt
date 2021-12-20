// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class EventType {

    abstract val value: kotlin.String

    object BatchChange : aws.sdk.kotlin.services.ec2.model.EventType() {
        override val value: kotlin.String = "fleetRequestChange"
        override fun toString(): kotlin.String = value
    }

    object Error : aws.sdk.kotlin.services.ec2.model.EventType() {
        override val value: kotlin.String = "error"
        override fun toString(): kotlin.String = value
    }

    object Information : aws.sdk.kotlin.services.ec2.model.EventType() {
        override val value: kotlin.String = "information"
        override fun toString(): kotlin.String = value
    }

    object InstanceChange : aws.sdk.kotlin.services.ec2.model.EventType() {
        override val value: kotlin.String = "instanceChange"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.EventType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.EventType = when(str) {
            "fleetRequestChange" -> BatchChange
            "error" -> Error
            "information" -> Information
            "instanceChange" -> InstanceChange
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.EventType> = listOf(
            BatchChange,
            Error,
            Information,
            InstanceChange
        )
    }
}