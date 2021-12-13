// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more filters.
     * local-gateway-id - The ID of a local gateway.
     * local-gateway-route-table-id - The ID of the local gateway route table.
     * local-gateway-route-table-virtual-interface-group-association-id - The ID of the association.
     * local-gateway-route-table-virtual-interface-group-id - The ID of the virtual interface group.
     * state - The state of the association.
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The IDs of the associations.
     */
    val localGatewayRouteTableVirtualInterfaceGroupAssociationIds: List<String>? = builder.localGatewayRouteTableVirtualInterfaceGroupAssociationIds
    /**
     * The maximum number of results to return with a single call.
     * To retrieve the remaining results, make another call with the returned nextToken value.
     */
    val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token for the next page of results.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("localGatewayRouteTableVirtualInterfaceGroupAssociationIds=$localGatewayRouteTableVirtualInterfaceGroupAssociationIds,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (localGatewayRouteTableVirtualInterfaceGroupAssociationIds?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (localGatewayRouteTableVirtualInterfaceGroupAssociationIds != other.localGatewayRouteTableVirtualInterfaceGroupAssociationIds) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * One or more filters.
         * local-gateway-id - The ID of a local gateway.
         * local-gateway-route-table-id - The ID of the local gateway route table.
         * local-gateway-route-table-virtual-interface-group-association-id - The ID of the association.
         * local-gateway-route-table-virtual-interface-group-id - The ID of the virtual interface group.
         * state - The state of the association.
         */
        var filters: List<Filter>? = null
        /**
         * The IDs of the associations.
         */
        var localGatewayRouteTableVirtualInterfaceGroupAssociationIds: List<String>? = null
        /**
         * The maximum number of results to return with a single call.
         * To retrieve the remaining results, make another call with the returned nextToken value.
         */
        var maxResults: kotlin.Int? = null
        /**
         * The token for the next page of results.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.localGatewayRouteTableVirtualInterfaceGroupAssociationIds = x.localGatewayRouteTableVirtualInterfaceGroupAssociationIds
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest = DescribeLocalGatewayRouteTableVirtualInterfaceGroupAssociationsRequest(this)
    }
}
