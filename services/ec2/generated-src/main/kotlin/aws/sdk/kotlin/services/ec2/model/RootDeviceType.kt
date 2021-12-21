// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class RootDeviceType {

    abstract val value: kotlin.String

    object Ebs : aws.sdk.kotlin.services.ec2.model.RootDeviceType() {
        override val value: kotlin.String = "ebs"
        override fun toString(): kotlin.String = value
    }

    object InstanceStore : aws.sdk.kotlin.services.ec2.model.RootDeviceType() {
        override val value: kotlin.String = "instance-store"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.RootDeviceType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.RootDeviceType = when(str) {
            "ebs" -> Ebs
            "instance-store" -> InstanceStore
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.RootDeviceType> = listOf(
            Ebs,
            InstanceStore
        )
    }
}