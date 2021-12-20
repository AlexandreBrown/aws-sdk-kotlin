// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a Reserved Instance offering.
 */
class PricingDetail private constructor(builder: Builder) {
    /**
     * The number of reservations available for the price.
     */
    val count: kotlin.Int? = builder.count
    /**
     * The price per instance.
     */
    val price: kotlin.Double? = builder.price

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.PricingDetail = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PricingDetail(")
        append("count=$count,")
        append("price=$price)")
    }

    override fun hashCode(): kotlin.Int {
        var result = count ?: 0
        result = 31 * result + (price?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PricingDetail

        if (count != other.count) return false
        if (price != other.price) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.PricingDetail = Builder(this).apply(block).build()

    class Builder {
        /**
         * The number of reservations available for the price.
         */
        var count: kotlin.Int? = null
        /**
         * The price per instance.
         */
        var price: kotlin.Double? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.PricingDetail) : this() {
            this.count = x.count
            this.price = x.price
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.PricingDetail = PricingDetail(this)
    }
}