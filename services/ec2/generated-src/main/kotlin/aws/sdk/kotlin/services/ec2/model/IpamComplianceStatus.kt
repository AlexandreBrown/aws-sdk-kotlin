// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class IpamComplianceStatus {

    abstract val value: kotlin.String

    object Compliant : aws.sdk.kotlin.services.ec2.model.IpamComplianceStatus() {
        override val value: kotlin.String = "compliant"
        override fun toString(): kotlin.String = value
    }

    object Ignored : aws.sdk.kotlin.services.ec2.model.IpamComplianceStatus() {
        override val value: kotlin.String = "ignored"
        override fun toString(): kotlin.String = value
    }

    object Noncompliant : aws.sdk.kotlin.services.ec2.model.IpamComplianceStatus() {
        override val value: kotlin.String = "noncompliant"
        override fun toString(): kotlin.String = value
    }

    object Unmanaged : aws.sdk.kotlin.services.ec2.model.IpamComplianceStatus() {
        override val value: kotlin.String = "unmanaged"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.IpamComplianceStatus() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.IpamComplianceStatus = when(str) {
            "compliant" -> Compliant
            "ignored" -> Ignored
            "noncompliant" -> Noncompliant
            "unmanaged" -> Unmanaged
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.IpamComplianceStatus> = listOf(
            Compliant,
            Ignored,
            Noncompliant,
            Unmanaged
        )
    }
}
