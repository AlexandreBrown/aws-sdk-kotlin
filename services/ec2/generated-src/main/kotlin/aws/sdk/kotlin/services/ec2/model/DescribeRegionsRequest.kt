// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeRegionsRequest private constructor(builder: Builder) {
    /**
     * Indicates whether to display all Regions, including Regions that are disabled for your account.
     */
    val allRegions: kotlin.Boolean? = builder.allRegions
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The filters.
     * endpoint - The endpoint of the Region (for example, ec2.us-east-1.amazonaws.com).
     * opt-in-status - The opt-in status of the Region (opt-in-not-required | opted-in |
     * not-opted-in).
     * region-name - The name of the Region (for example, us-east-1).
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The names of the Regions. You can specify any Regions, whether they are enabled and disabled for your account.
     */
    val regionNames: List<String>? = builder.regionNames

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeRegionsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeRegionsRequest(")
        append("allRegions=$allRegions,")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("regionNames=$regionNames)")
    }

    override fun hashCode(): kotlin.Int {
        var result = allRegions?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (regionNames?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeRegionsRequest

        if (allRegions != other.allRegions) return false
        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (regionNames != other.regionNames) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeRegionsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates whether to display all Regions, including Regions that are disabled for your account.
         */
        var allRegions: kotlin.Boolean? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The filters.
         * endpoint - The endpoint of the Region (for example, ec2.us-east-1.amazonaws.com).
         * opt-in-status - The opt-in status of the Region (opt-in-not-required | opted-in |
         * not-opted-in).
         * region-name - The name of the Region (for example, us-east-1).
         */
        var filters: List<Filter>? = null
        /**
         * The names of the Regions. You can specify any Regions, whether they are enabled and disabled for your account.
         */
        var regionNames: List<String>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeRegionsRequest) : this() {
            this.allRegions = x.allRegions
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.regionNames = x.regionNames
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeRegionsRequest = DescribeRegionsRequest(this)
    }
}
