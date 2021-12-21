// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Details about the Dedicated Host Reservation offering.
 */
class HostOffering private constructor(builder: Builder) {
    /**
     * The currency of the offering.
     */
    val currencyCode: aws.sdk.kotlin.services.ec2.model.CurrencyCodeValues? = builder.currencyCode
    /**
     * The duration of the offering (in seconds).
     */
    val duration: kotlin.Int? = builder.duration
    /**
     * The hourly price of the offering.
     */
    val hourlyPrice: kotlin.String? = builder.hourlyPrice
    /**
     * The instance family of the offering.
     */
    val instanceFamily: kotlin.String? = builder.instanceFamily
    /**
     * The ID of the offering.
     */
    val offeringId: kotlin.String? = builder.offeringId
    /**
     * The available payment option.
     */
    val paymentOption: aws.sdk.kotlin.services.ec2.model.PaymentOption? = builder.paymentOption
    /**
     * The upfront price of the offering. Does not apply to No Upfront
     * offerings.
     */
    val upfrontPrice: kotlin.String? = builder.upfrontPrice

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.HostOffering = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("HostOffering(")
        append("currencyCode=$currencyCode,")
        append("duration=$duration,")
        append("hourlyPrice=$hourlyPrice,")
        append("instanceFamily=$instanceFamily,")
        append("offeringId=$offeringId,")
        append("paymentOption=$paymentOption,")
        append("upfrontPrice=$upfrontPrice)")
    }

    override fun hashCode(): kotlin.Int {
        var result = currencyCode?.hashCode() ?: 0
        result = 31 * result + (duration ?: 0)
        result = 31 * result + (hourlyPrice?.hashCode() ?: 0)
        result = 31 * result + (instanceFamily?.hashCode() ?: 0)
        result = 31 * result + (offeringId?.hashCode() ?: 0)
        result = 31 * result + (paymentOption?.hashCode() ?: 0)
        result = 31 * result + (upfrontPrice?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as HostOffering

        if (currencyCode != other.currencyCode) return false
        if (duration != other.duration) return false
        if (hourlyPrice != other.hourlyPrice) return false
        if (instanceFamily != other.instanceFamily) return false
        if (offeringId != other.offeringId) return false
        if (paymentOption != other.paymentOption) return false
        if (upfrontPrice != other.upfrontPrice) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.HostOffering = Builder(this).apply(block).build()

    class Builder {
        /**
         * The currency of the offering.
         */
        var currencyCode: aws.sdk.kotlin.services.ec2.model.CurrencyCodeValues? = null
        /**
         * The duration of the offering (in seconds).
         */
        var duration: kotlin.Int? = null
        /**
         * The hourly price of the offering.
         */
        var hourlyPrice: kotlin.String? = null
        /**
         * The instance family of the offering.
         */
        var instanceFamily: kotlin.String? = null
        /**
         * The ID of the offering.
         */
        var offeringId: kotlin.String? = null
        /**
         * The available payment option.
         */
        var paymentOption: aws.sdk.kotlin.services.ec2.model.PaymentOption? = null
        /**
         * The upfront price of the offering. Does not apply to No Upfront
         * offerings.
         */
        var upfrontPrice: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.HostOffering) : this() {
            this.currencyCode = x.currencyCode
            this.duration = x.duration
            this.hourlyPrice = x.hourlyPrice
            this.instanceFamily = x.instanceFamily
            this.offeringId = x.offeringId
            this.paymentOption = x.paymentOption
            this.upfrontPrice = x.upfrontPrice
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.HostOffering = HostOffering(this)
    }
}