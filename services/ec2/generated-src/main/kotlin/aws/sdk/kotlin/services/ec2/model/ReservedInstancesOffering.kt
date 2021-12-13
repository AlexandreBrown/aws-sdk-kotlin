// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a Reserved Instance offering.
 */
class ReservedInstancesOffering private constructor(builder: Builder) {
    /**
     * The Availability Zone in which the Reserved Instance can be used.
     */
    val availabilityZone: kotlin.String? = builder.availabilityZone
    /**
     * The currency of the Reserved Instance offering you are purchasing. It's
     * specified using ISO 4217 standard currency codes. At this time,
     * the only supported currency is USD.
     */
    val currencyCode: aws.sdk.kotlin.services.ec2.model.CurrencyCodeValues? = builder.currencyCode
    /**
     * The duration of the Reserved Instance, in seconds.
     */
    val duration: kotlin.Long? = builder.duration
    /**
     * The purchase price of the Reserved Instance.
     */
    val fixedPrice: kotlin.Float? = builder.fixedPrice
    /**
     * The tenancy of the instance.
     */
    val instanceTenancy: aws.sdk.kotlin.services.ec2.model.Tenancy? = builder.instanceTenancy
    /**
     * The instance type on which the Reserved Instance can be used.
     */
    val instanceType: aws.sdk.kotlin.services.ec2.model.InstanceType? = builder.instanceType
    /**
     * Indicates whether the offering is available through the Reserved Instance Marketplace (resale) or Amazon Web Services.
     * If it's a Reserved Instance Marketplace offering, this is true.
     */
    val marketplace: kotlin.Boolean? = builder.marketplace
    /**
     * If convertible it can be exchanged for Reserved Instances of
     * the same or higher monetary value, with different configurations. If standard, it is not
     * possible to perform an exchange.
     */
    val offeringClass: aws.sdk.kotlin.services.ec2.model.OfferingClassType? = builder.offeringClass
    /**
     * The Reserved Instance offering type.
     */
    val offeringType: aws.sdk.kotlin.services.ec2.model.OfferingTypeValues? = builder.offeringType
    /**
     * The pricing details of the Reserved Instance offering.
     */
    val pricingDetails: List<PricingDetail>? = builder.pricingDetails
    /**
     * The Reserved Instance product platform description.
     */
    val productDescription: aws.sdk.kotlin.services.ec2.model.RiProductDescription? = builder.productDescription
    /**
     * The recurring charge tag assigned to the resource.
     */
    val recurringCharges: List<RecurringCharge>? = builder.recurringCharges
    /**
     * The ID of the Reserved Instance offering. This is the offering ID used in GetReservedInstancesExchangeQuote
     * to confirm that an exchange can be made.
     */
    val reservedInstancesOfferingId: kotlin.String? = builder.reservedInstancesOfferingId
    /**
     * Whether the Reserved Instance is applied to instances in a Region or an Availability Zone.
     */
    val scope: aws.sdk.kotlin.services.ec2.model.Scope? = builder.scope
    /**
     * The usage price of the Reserved Instance, per hour.
     */
    val usagePrice: kotlin.Float? = builder.usagePrice

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ReservedInstancesOffering = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ReservedInstancesOffering(")
        append("availabilityZone=$availabilityZone,")
        append("currencyCode=$currencyCode,")
        append("duration=$duration,")
        append("fixedPrice=$fixedPrice,")
        append("instanceTenancy=$instanceTenancy,")
        append("instanceType=$instanceType,")
        append("marketplace=$marketplace,")
        append("offeringClass=$offeringClass,")
        append("offeringType=$offeringType,")
        append("pricingDetails=$pricingDetails,")
        append("productDescription=$productDescription,")
        append("recurringCharges=$recurringCharges,")
        append("reservedInstancesOfferingId=$reservedInstancesOfferingId,")
        append("scope=$scope,")
        append("usagePrice=$usagePrice)")
    }

    override fun hashCode(): kotlin.Int {
        var result = availabilityZone?.hashCode() ?: 0
        result = 31 * result + (currencyCode?.hashCode() ?: 0)
        result = 31 * result + (duration?.hashCode() ?: 0)
        result = 31 * result + (fixedPrice?.hashCode() ?: 0)
        result = 31 * result + (instanceTenancy?.hashCode() ?: 0)
        result = 31 * result + (instanceType?.hashCode() ?: 0)
        result = 31 * result + (marketplace?.hashCode() ?: 0)
        result = 31 * result + (offeringClass?.hashCode() ?: 0)
        result = 31 * result + (offeringType?.hashCode() ?: 0)
        result = 31 * result + (pricingDetails?.hashCode() ?: 0)
        result = 31 * result + (productDescription?.hashCode() ?: 0)
        result = 31 * result + (recurringCharges?.hashCode() ?: 0)
        result = 31 * result + (reservedInstancesOfferingId?.hashCode() ?: 0)
        result = 31 * result + (scope?.hashCode() ?: 0)
        result = 31 * result + (usagePrice?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ReservedInstancesOffering

        if (availabilityZone != other.availabilityZone) return false
        if (currencyCode != other.currencyCode) return false
        if (duration != other.duration) return false
        if (fixedPrice != other.fixedPrice) return false
        if (instanceTenancy != other.instanceTenancy) return false
        if (instanceType != other.instanceType) return false
        if (marketplace != other.marketplace) return false
        if (offeringClass != other.offeringClass) return false
        if (offeringType != other.offeringType) return false
        if (pricingDetails != other.pricingDetails) return false
        if (productDescription != other.productDescription) return false
        if (recurringCharges != other.recurringCharges) return false
        if (reservedInstancesOfferingId != other.reservedInstancesOfferingId) return false
        if (scope != other.scope) return false
        if (usagePrice != other.usagePrice) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ReservedInstancesOffering = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Availability Zone in which the Reserved Instance can be used.
         */
        var availabilityZone: kotlin.String? = null
        /**
         * The currency of the Reserved Instance offering you are purchasing. It's
         * specified using ISO 4217 standard currency codes. At this time,
         * the only supported currency is USD.
         */
        var currencyCode: aws.sdk.kotlin.services.ec2.model.CurrencyCodeValues? = null
        /**
         * The duration of the Reserved Instance, in seconds.
         */
        var duration: kotlin.Long? = null
        /**
         * The purchase price of the Reserved Instance.
         */
        var fixedPrice: kotlin.Float? = null
        /**
         * The tenancy of the instance.
         */
        var instanceTenancy: aws.sdk.kotlin.services.ec2.model.Tenancy? = null
        /**
         * The instance type on which the Reserved Instance can be used.
         */
        var instanceType: aws.sdk.kotlin.services.ec2.model.InstanceType? = null
        /**
         * Indicates whether the offering is available through the Reserved Instance Marketplace (resale) or Amazon Web Services.
         * If it's a Reserved Instance Marketplace offering, this is true.
         */
        var marketplace: kotlin.Boolean? = null
        /**
         * If convertible it can be exchanged for Reserved Instances of
         * the same or higher monetary value, with different configurations. If standard, it is not
         * possible to perform an exchange.
         */
        var offeringClass: aws.sdk.kotlin.services.ec2.model.OfferingClassType? = null
        /**
         * The Reserved Instance offering type.
         */
        var offeringType: aws.sdk.kotlin.services.ec2.model.OfferingTypeValues? = null
        /**
         * The pricing details of the Reserved Instance offering.
         */
        var pricingDetails: List<PricingDetail>? = null
        /**
         * The Reserved Instance product platform description.
         */
        var productDescription: aws.sdk.kotlin.services.ec2.model.RiProductDescription? = null
        /**
         * The recurring charge tag assigned to the resource.
         */
        var recurringCharges: List<RecurringCharge>? = null
        /**
         * The ID of the Reserved Instance offering. This is the offering ID used in GetReservedInstancesExchangeQuote
         * to confirm that an exchange can be made.
         */
        var reservedInstancesOfferingId: kotlin.String? = null
        /**
         * Whether the Reserved Instance is applied to instances in a Region or an Availability Zone.
         */
        var scope: aws.sdk.kotlin.services.ec2.model.Scope? = null
        /**
         * The usage price of the Reserved Instance, per hour.
         */
        var usagePrice: kotlin.Float? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ReservedInstancesOffering) : this() {
            this.availabilityZone = x.availabilityZone
            this.currencyCode = x.currencyCode
            this.duration = x.duration
            this.fixedPrice = x.fixedPrice
            this.instanceTenancy = x.instanceTenancy
            this.instanceType = x.instanceType
            this.marketplace = x.marketplace
            this.offeringClass = x.offeringClass
            this.offeringType = x.offeringType
            this.pricingDetails = x.pricingDetails
            this.productDescription = x.productDescription
            this.recurringCharges = x.recurringCharges
            this.reservedInstancesOfferingId = x.reservedInstancesOfferingId
            this.scope = x.scope
            this.usagePrice = x.usagePrice
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ReservedInstancesOffering = ReservedInstancesOffering(this)
    }
}
