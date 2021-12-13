// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeSubnetsRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more filters.
     * availability-zone - The Availability Zone for the subnet. You can also use
     * availabilityZone as the filter name.
     * availability-zone-id - The ID of the Availability Zone for the subnet.
     * You can also use availabilityZoneId as the filter name.
     * available-ip-address-count - The number of IPv4 addresses in the
     * subnet that are available.
     * cidr-block - The IPv4 CIDR block of the subnet. The CIDR block you
     * specify must exactly match the subnet's CIDR block for information to be
     * returned for the subnet. You can also use cidr or
     * cidrBlock as the filter names.
     * default-for-az - Indicates whether this is the default subnet for the
     * Availability Zone (true | false). You can also use
     * defaultForAz as the filter name.
     * ipv6-cidr-block-association.ipv6-cidr-block - An IPv6 CIDR
     * block associated with the subnet.
     * ipv6-cidr-block-association.association-id - An association ID
     * for an IPv6 CIDR block associated with the subnet.
     * ipv6-cidr-block-association.state - The state of an IPv6 CIDR
     * block associated with the subnet.
     * ipv6-native - Indicates whether this is an IPv6 only subnet (true | false).
     * outpost-arn - The Amazon Resource Name (ARN) of the Outpost.
     * owner-id - The ID of the Amazon Web Services account that owns the subnet.
     * state - The state of the subnet (pending | available).
     * subnet-arn - The Amazon Resource Name (ARN) of the subnet.
     * subnet-id - The ID of the subnet.
     * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
     * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
     * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
     * vpc-id - The ID of the VPC for the subnet.
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
     * One or more subnet IDs.
     * Default: Describes all your subnets.
     */
    val subnetIds: List<String>? = builder.subnetIds

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeSubnetsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeSubnetsRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken,")
        append("subnetIds=$subnetIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (subnetIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeSubnetsRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false
        if (subnetIds != other.subnetIds) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeSubnetsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * One or more filters.
         * availability-zone - The Availability Zone for the subnet. You can also use
         * availabilityZone as the filter name.
         * availability-zone-id - The ID of the Availability Zone for the subnet.
         * You can also use availabilityZoneId as the filter name.
         * available-ip-address-count - The number of IPv4 addresses in the
         * subnet that are available.
         * cidr-block - The IPv4 CIDR block of the subnet. The CIDR block you
         * specify must exactly match the subnet's CIDR block for information to be
         * returned for the subnet. You can also use cidr or
         * cidrBlock as the filter names.
         * default-for-az - Indicates whether this is the default subnet for the
         * Availability Zone (true | false). You can also use
         * defaultForAz as the filter name.
         * ipv6-cidr-block-association.ipv6-cidr-block - An IPv6 CIDR
         * block associated with the subnet.
         * ipv6-cidr-block-association.association-id - An association ID
         * for an IPv6 CIDR block associated with the subnet.
         * ipv6-cidr-block-association.state - The state of an IPv6 CIDR
         * block associated with the subnet.
         * ipv6-native - Indicates whether this is an IPv6 only subnet (true | false).
         * outpost-arn - The Amazon Resource Name (ARN) of the Outpost.
         * owner-id - The ID of the Amazon Web Services account that owns the subnet.
         * state - The state of the subnet (pending | available).
         * subnet-arn - The Amazon Resource Name (ARN) of the subnet.
         * subnet-id - The ID of the subnet.
         * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
         * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
         * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
         * vpc-id - The ID of the VPC for the subnet.
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
         * One or more subnet IDs.
         * Default: Describes all your subnets.
         */
        var subnetIds: List<String>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeSubnetsRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
            this.subnetIds = x.subnetIds
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeSubnetsRequest = DescribeSubnetsRequest(this)
    }
}
