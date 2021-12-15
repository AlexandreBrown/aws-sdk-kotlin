// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class TunnelInsideIpVersion {

    abstract val value: kotlin.String

    object Ipv4 : aws.sdk.kotlin.services.ec2.model.TunnelInsideIpVersion() {
        override val value: kotlin.String = "ipv4"
        override fun toString(): kotlin.String = value
    }

    object Ipv6 : aws.sdk.kotlin.services.ec2.model.TunnelInsideIpVersion() {
        override val value: kotlin.String = "ipv6"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.TunnelInsideIpVersion() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.TunnelInsideIpVersion = when(str) {
            "ipv4" -> Ipv4
            "ipv6" -> Ipv6
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.TunnelInsideIpVersion> = listOf(
            Ipv4,
            Ipv6
        )
    }
}
