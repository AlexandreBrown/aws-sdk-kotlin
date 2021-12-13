// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The market (purchasing) option for the instances.
 */
class LaunchTemplateInstanceMarketOptions private constructor(builder: Builder) {
    /**
     * The market type.
     */
    val marketType: aws.sdk.kotlin.services.ec2.model.MarketType? = builder.marketType
    /**
     * The options for Spot Instances.
     */
    val spotOptions: aws.sdk.kotlin.services.ec2.model.LaunchTemplateSpotMarketOptions? = builder.spotOptions

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.LaunchTemplateInstanceMarketOptions = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LaunchTemplateInstanceMarketOptions(")
        append("marketType=$marketType,")
        append("spotOptions=$spotOptions)")
    }

    override fun hashCode(): kotlin.Int {
        var result = marketType?.hashCode() ?: 0
        result = 31 * result + (spotOptions?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LaunchTemplateInstanceMarketOptions

        if (marketType != other.marketType) return false
        if (spotOptions != other.spotOptions) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.LaunchTemplateInstanceMarketOptions = Builder(this).apply(block).build()

    class Builder {
        /**
         * The market type.
         */
        var marketType: aws.sdk.kotlin.services.ec2.model.MarketType? = null
        /**
         * The options for Spot Instances.
         */
        var spotOptions: aws.sdk.kotlin.services.ec2.model.LaunchTemplateSpotMarketOptions? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.LaunchTemplateInstanceMarketOptions) : this() {
            this.marketType = x.marketType
            this.spotOptions = x.spotOptions
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.LaunchTemplateInstanceMarketOptions = LaunchTemplateInstanceMarketOptions(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.LaunchTemplateSpotMarketOptions] inside the given [block]
         */
        fun spotOptions(block: aws.sdk.kotlin.services.ec2.model.LaunchTemplateSpotMarketOptions.Builder.() -> kotlin.Unit) {
            this.spotOptions = aws.sdk.kotlin.services.ec2.model.LaunchTemplateSpotMarketOptions.invoke(block)
        }
    }
}
