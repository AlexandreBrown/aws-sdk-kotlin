// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeIpamPoolsRequest private constructor(builder: Builder) {
    /**
     * A check for whether you have the required permissions for the action without actually making the request
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more filters for the request. For more information about filtering, see <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output.
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The IDs of the IPAM pools you would like information on.
     */
    val ipamPoolIds: List<String>? = builder.ipamPoolIds
    /**
     * The maximum number of results to return in the request.
     */
    val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token for the next page of results.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeIpamPoolsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeIpamPoolsRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("ipamPoolIds=$ipamPoolIds,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (ipamPoolIds?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeIpamPoolsRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (ipamPoolIds != other.ipamPoolIds) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeIpamPoolsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * A check for whether you have the required permissions for the action without actually making the request
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * One or more filters for the request. For more information about filtering, see <a href="https://docs.aws.amazon.com/cli/latest/userguide/cli-usage-filter.html">Filtering CLI output.
         */
        var filters: List<Filter>? = null
        /**
         * The IDs of the IPAM pools you would like information on.
         */
        var ipamPoolIds: List<String>? = null
        /**
         * The maximum number of results to return in the request.
         */
        var maxResults: kotlin.Int? = null
        /**
         * The token for the next page of results.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeIpamPoolsRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.ipamPoolIds = x.ipamPoolIds
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeIpamPoolsRequest = DescribeIpamPoolsRequest(this)
    }
}
