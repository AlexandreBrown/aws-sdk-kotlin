// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeTransitGatewayMulticastDomainsRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more filters. The possible values are:
     * state - The state of the transit gateway multicast domain. Valid values are pending | available | deleting | deleted.
     * transit-gateway-id - The ID of the transit gateway.
     * transit-gateway-multicast-domain-id - The ID of the transit gateway multicast domain.
     */
    val filters: List<Filter>? = builder.filters
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
     * The ID of the transit gateway multicast domain.
     */
    val transitGatewayMulticastDomainIds: List<String>? = builder.transitGatewayMulticastDomainIds

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayMulticastDomainsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeTransitGatewayMulticastDomainsRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken,")
        append("transitGatewayMulticastDomainIds=$transitGatewayMulticastDomainIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayMulticastDomainIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeTransitGatewayMulticastDomainsRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false
        if (transitGatewayMulticastDomainIds != other.transitGatewayMulticastDomainIds) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayMulticastDomainsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * One or more filters. The possible values are:
         * state - The state of the transit gateway multicast domain. Valid values are pending | available | deleting | deleted.
         * transit-gateway-id - The ID of the transit gateway.
         * transit-gateway-multicast-domain-id - The ID of the transit gateway multicast domain.
         */
        var filters: List<Filter>? = null
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
         * The ID of the transit gateway multicast domain.
         */
        var transitGatewayMulticastDomainIds: List<String>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayMulticastDomainsRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
            this.transitGatewayMulticastDomainIds = x.transitGatewayMulticastDomainIds
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeTransitGatewayMulticastDomainsRequest = DescribeTransitGatewayMulticastDomainsRequest(this)
    }
}