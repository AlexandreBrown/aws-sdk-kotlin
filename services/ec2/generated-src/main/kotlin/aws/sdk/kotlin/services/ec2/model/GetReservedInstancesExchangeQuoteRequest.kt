// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for GetReservedInstanceExchangeQuote.
 */
class GetReservedInstancesExchangeQuoteRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The IDs of the Convertible Reserved Instances to exchange.
     */
    val reservedInstanceIds: List<String>? = builder.reservedInstanceIds
    /**
     * The configuration of the target Convertible Reserved Instance to exchange for your
     * current Convertible Reserved Instances.
     */
    val targetConfigurations: List<TargetConfigurationRequest>? = builder.targetConfigurations

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.GetReservedInstancesExchangeQuoteRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetReservedInstancesExchangeQuoteRequest(")
        append("dryRun=$dryRun,")
        append("reservedInstanceIds=$reservedInstanceIds,")
        append("targetConfigurations=$targetConfigurations)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (reservedInstanceIds?.hashCode() ?: 0)
        result = 31 * result + (targetConfigurations?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetReservedInstancesExchangeQuoteRequest

        if (dryRun != other.dryRun) return false
        if (reservedInstanceIds != other.reservedInstanceIds) return false
        if (targetConfigurations != other.targetConfigurations) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.GetReservedInstancesExchangeQuoteRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The IDs of the Convertible Reserved Instances to exchange.
         */
        var reservedInstanceIds: List<String>? = null
        /**
         * The configuration of the target Convertible Reserved Instance to exchange for your
         * current Convertible Reserved Instances.
         */
        var targetConfigurations: List<TargetConfigurationRequest>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.GetReservedInstancesExchangeQuoteRequest) : this() {
            this.dryRun = x.dryRun
            this.reservedInstanceIds = x.reservedInstanceIds
            this.targetConfigurations = x.targetConfigurations
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.GetReservedInstancesExchangeQuoteRequest = GetReservedInstancesExchangeQuoteRequest(this)
    }
}
