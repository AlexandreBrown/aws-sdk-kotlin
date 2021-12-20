// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for CreateReservedInstancesListing.
 */
class CreateReservedInstancesListingRequest private constructor(builder: Builder) {
    /**
     * Unique, case-sensitive identifier you provide to ensure idempotency of your
     * listings. This helps avoid duplicate listings. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring Idempotency.
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * The number of instances that are a part of a Reserved Instance account to be listed in the Reserved Instance Marketplace. This number should be less than or equal to the instance count associated with the Reserved Instance ID specified in this call.
     */
    val instanceCount: kotlin.Int? = builder.instanceCount
    /**
     * A list specifying the price of the Standard Reserved Instance for each month remaining in the Reserved Instance term.
     */
    val priceSchedules: List<PriceScheduleSpecification>? = builder.priceSchedules
    /**
     * The ID of the active Standard Reserved Instance.
     */
    val reservedInstancesId: kotlin.String? = builder.reservedInstancesId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateReservedInstancesListingRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateReservedInstancesListingRequest(")
        append("clientToken=$clientToken,")
        append("instanceCount=$instanceCount,")
        append("priceSchedules=$priceSchedules,")
        append("reservedInstancesId=$reservedInstancesId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (instanceCount ?: 0)
        result = 31 * result + (priceSchedules?.hashCode() ?: 0)
        result = 31 * result + (reservedInstancesId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateReservedInstancesListingRequest

        if (clientToken != other.clientToken) return false
        if (instanceCount != other.instanceCount) return false
        if (priceSchedules != other.priceSchedules) return false
        if (reservedInstancesId != other.reservedInstancesId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateReservedInstancesListingRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Unique, case-sensitive identifier you provide to ensure idempotency of your
         * listings. This helps avoid duplicate listings. For more information, see
         * <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring Idempotency.
         */
        var clientToken: kotlin.String? = null
        /**
         * The number of instances that are a part of a Reserved Instance account to be listed in the Reserved Instance Marketplace. This number should be less than or equal to the instance count associated with the Reserved Instance ID specified in this call.
         */
        var instanceCount: kotlin.Int? = null
        /**
         * A list specifying the price of the Standard Reserved Instance for each month remaining in the Reserved Instance term.
         */
        var priceSchedules: List<PriceScheduleSpecification>? = null
        /**
         * The ID of the active Standard Reserved Instance.
         */
        var reservedInstancesId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateReservedInstancesListingRequest) : this() {
            this.clientToken = x.clientToken
            this.instanceCount = x.instanceCount
            this.priceSchedules = x.priceSchedules
            this.reservedInstancesId = x.reservedInstancesId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateReservedInstancesListingRequest = CreateReservedInstancesListingRequest(this)
    }
}