// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * The options for Spot Instances.
 */
class LaunchTemplateSpotMarketOptions private constructor(builder: Builder) {
    /**
     * The required duration for the Spot Instances (also known as Spot blocks), in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360).
     */
    val blockDurationMinutes: kotlin.Int? = builder.blockDurationMinutes
    /**
     * The behavior when a Spot Instance is interrupted.
     */
    val instanceInterruptionBehavior: aws.sdk.kotlin.services.ec2.model.InstanceInterruptionBehavior? = builder.instanceInterruptionBehavior
    /**
     * The maximum hourly price you're willing to pay for the Spot Instances.
     */
    val maxPrice: kotlin.String? = builder.maxPrice
    /**
     * The Spot Instance request type.
     */
    val spotInstanceType: aws.sdk.kotlin.services.ec2.model.SpotInstanceType? = builder.spotInstanceType
    /**
     * The end date of the request. For a one-time request, the request remains active until all instances launch, the request is canceled, or this date is reached. If the request is persistent, it remains active until it is canceled or this date and time is reached.
     */
    val validUntil: aws.smithy.kotlin.runtime.time.Instant? = builder.validUntil

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.LaunchTemplateSpotMarketOptions = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LaunchTemplateSpotMarketOptions(")
        append("blockDurationMinutes=$blockDurationMinutes,")
        append("instanceInterruptionBehavior=$instanceInterruptionBehavior,")
        append("maxPrice=$maxPrice,")
        append("spotInstanceType=$spotInstanceType,")
        append("validUntil=$validUntil)")
    }

    override fun hashCode(): kotlin.Int {
        var result = blockDurationMinutes ?: 0
        result = 31 * result + (instanceInterruptionBehavior?.hashCode() ?: 0)
        result = 31 * result + (maxPrice?.hashCode() ?: 0)
        result = 31 * result + (spotInstanceType?.hashCode() ?: 0)
        result = 31 * result + (validUntil?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LaunchTemplateSpotMarketOptions

        if (blockDurationMinutes != other.blockDurationMinutes) return false
        if (instanceInterruptionBehavior != other.instanceInterruptionBehavior) return false
        if (maxPrice != other.maxPrice) return false
        if (spotInstanceType != other.spotInstanceType) return false
        if (validUntil != other.validUntil) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.LaunchTemplateSpotMarketOptions = Builder(this).apply(block).build()

    class Builder {
        /**
         * The required duration for the Spot Instances (also known as Spot blocks), in minutes. This value must be a multiple of 60 (60, 120, 180, 240, 300, or 360).
         */
        var blockDurationMinutes: kotlin.Int? = null
        /**
         * The behavior when a Spot Instance is interrupted.
         */
        var instanceInterruptionBehavior: aws.sdk.kotlin.services.ec2.model.InstanceInterruptionBehavior? = null
        /**
         * The maximum hourly price you're willing to pay for the Spot Instances.
         */
        var maxPrice: kotlin.String? = null
        /**
         * The Spot Instance request type.
         */
        var spotInstanceType: aws.sdk.kotlin.services.ec2.model.SpotInstanceType? = null
        /**
         * The end date of the request. For a one-time request, the request remains active until all instances launch, the request is canceled, or this date is reached. If the request is persistent, it remains active until it is canceled or this date and time is reached.
         */
        var validUntil: aws.smithy.kotlin.runtime.time.Instant? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.LaunchTemplateSpotMarketOptions) : this() {
            this.blockDurationMinutes = x.blockDurationMinutes
            this.instanceInterruptionBehavior = x.instanceInterruptionBehavior
            this.maxPrice = x.maxPrice
            this.spotInstanceType = x.spotInstanceType
            this.validUntil = x.validUntil
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.LaunchTemplateSpotMarketOptions = LaunchTemplateSpotMarketOptions(this)
    }
}
