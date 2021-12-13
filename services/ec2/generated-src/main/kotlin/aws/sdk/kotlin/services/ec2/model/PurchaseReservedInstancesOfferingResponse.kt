// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the output of PurchaseReservedInstancesOffering.
 */
class PurchaseReservedInstancesOfferingResponse private constructor(builder: Builder) {
    /**
     * The IDs of the purchased Reserved Instances. If your purchase crosses into a discounted
     * pricing tier, the final Reserved Instances IDs might change. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts-reserved-instances-application.html#crossing-pricing-tiers">Crossing
     * pricing tiers in the Amazon Elastic Compute Cloud User Guide.
     */
    val reservedInstancesId: kotlin.String? = builder.reservedInstancesId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.PurchaseReservedInstancesOfferingResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PurchaseReservedInstancesOfferingResponse(")
        append("reservedInstancesId=$reservedInstancesId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = reservedInstancesId?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PurchaseReservedInstancesOfferingResponse

        if (reservedInstancesId != other.reservedInstancesId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.PurchaseReservedInstancesOfferingResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The IDs of the purchased Reserved Instances. If your purchase crosses into a discounted
         * pricing tier, the final Reserved Instances IDs might change. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts-reserved-instances-application.html#crossing-pricing-tiers">Crossing
         * pricing tiers in the Amazon Elastic Compute Cloud User Guide.
         */
        var reservedInstancesId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.PurchaseReservedInstancesOfferingResponse) : this() {
            this.reservedInstancesId = x.reservedInstancesId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.PurchaseReservedInstancesOfferingResponse = PurchaseReservedInstancesOfferingResponse(this)
    }
}
