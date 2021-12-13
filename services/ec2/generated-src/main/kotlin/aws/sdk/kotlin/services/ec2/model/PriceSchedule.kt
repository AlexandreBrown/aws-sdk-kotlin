// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the price for a Reserved Instance.
 */
class PriceSchedule private constructor(builder: Builder) {
    /**
     * The current price schedule, as determined by the term remaining for the Reserved Instance in the listing.
     * A specific price schedule is always in effect, but only one price schedule can be active at any time. Take, for example, a Reserved Instance listing that has five months remaining in its term. When you specify price schedules for five months and two months, this means that schedule 1, covering the first three months of the remaining term, will be active during months 5, 4, and 3. Then schedule 2, covering the last two months of the term, will be active for months 2 and 1.
     */
    val active: kotlin.Boolean? = builder.active
    /**
     * The currency for transacting the Reserved Instance resale.
     * At this time, the only supported currency is USD.
     */
    val currencyCode: aws.sdk.kotlin.services.ec2.model.CurrencyCodeValues? = builder.currencyCode
    /**
     * The fixed price for the term.
     */
    val price: kotlin.Double? = builder.price
    /**
     * The number of months remaining in the reservation. For example, 2 is the second to the last month before the capacity reservation expires.
     */
    val term: kotlin.Long? = builder.term

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.PriceSchedule = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PriceSchedule(")
        append("active=$active,")
        append("currencyCode=$currencyCode,")
        append("price=$price,")
        append("term=$term)")
    }

    override fun hashCode(): kotlin.Int {
        var result = active?.hashCode() ?: 0
        result = 31 * result + (currencyCode?.hashCode() ?: 0)
        result = 31 * result + (price?.hashCode() ?: 0)
        result = 31 * result + (term?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PriceSchedule

        if (active != other.active) return false
        if (currencyCode != other.currencyCode) return false
        if (price != other.price) return false
        if (term != other.term) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.PriceSchedule = Builder(this).apply(block).build()

    class Builder {
        /**
         * The current price schedule, as determined by the term remaining for the Reserved Instance in the listing.
         * A specific price schedule is always in effect, but only one price schedule can be active at any time. Take, for example, a Reserved Instance listing that has five months remaining in its term. When you specify price schedules for five months and two months, this means that schedule 1, covering the first three months of the remaining term, will be active during months 5, 4, and 3. Then schedule 2, covering the last two months of the term, will be active for months 2 and 1.
         */
        var active: kotlin.Boolean? = null
        /**
         * The currency for transacting the Reserved Instance resale.
         * At this time, the only supported currency is USD.
         */
        var currencyCode: aws.sdk.kotlin.services.ec2.model.CurrencyCodeValues? = null
        /**
         * The fixed price for the term.
         */
        var price: kotlin.Double? = null
        /**
         * The number of months remaining in the reservation. For example, 2 is the second to the last month before the capacity reservation expires.
         */
        var term: kotlin.Long? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.PriceSchedule) : this() {
            this.active = x.active
            this.currencyCode = x.currencyCode
            this.price = x.price
            this.term = x.term
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.PriceSchedule = PriceSchedule(this)
    }
}
