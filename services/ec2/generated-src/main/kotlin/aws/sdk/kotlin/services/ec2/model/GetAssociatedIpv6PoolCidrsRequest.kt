// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class GetAssociatedIpv6PoolCidrsRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The maximum number of results to return with a single call.
     * To retrieve the remaining results, make another call with the returned nextToken value.
     */
    val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token for the next page of results.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * The ID of the IPv6 address pool.
     */
    val poolId: kotlin.String? = builder.poolId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.GetAssociatedIpv6PoolCidrsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetAssociatedIpv6PoolCidrsRequest(")
        append("dryRun=$dryRun,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken,")
        append("poolId=$poolId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (poolId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetAssociatedIpv6PoolCidrsRequest

        if (dryRun != other.dryRun) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false
        if (poolId != other.poolId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.GetAssociatedIpv6PoolCidrsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The maximum number of results to return with a single call.
         * To retrieve the remaining results, make another call with the returned nextToken value.
         */
        var maxResults: kotlin.Int? = null
        /**
         * The token for the next page of results.
         */
        var nextToken: kotlin.String? = null
        /**
         * The ID of the IPv6 address pool.
         */
        var poolId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.GetAssociatedIpv6PoolCidrsRequest) : this() {
            this.dryRun = x.dryRun
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
            this.poolId = x.poolId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.GetAssociatedIpv6PoolCidrsRequest = GetAssociatedIpv6PoolCidrsRequest(this)
    }
}