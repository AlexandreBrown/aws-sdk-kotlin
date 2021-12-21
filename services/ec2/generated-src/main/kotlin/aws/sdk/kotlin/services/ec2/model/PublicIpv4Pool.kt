// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an IPv4 address pool.
 */
class PublicIpv4Pool private constructor(builder: Builder) {
    /**
     * A description of the address pool.
     */
    val description: kotlin.String? = builder.description
    /**
     * The name of the location from which the address pool is advertised.
     * A network border group is a unique set of Availability Zones or Local Zones
     * from where Amazon Web Services advertises public IP addresses.
     */
    val networkBorderGroup: kotlin.String? = builder.networkBorderGroup
    /**
     * The address ranges.
     */
    val poolAddressRanges: List<PublicIpv4PoolRange>? = builder.poolAddressRanges
    /**
     * The ID of the address pool.
     */
    val poolId: kotlin.String? = builder.poolId
    /**
     * Any tags for the address pool.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * The total number of addresses.
     */
    val totalAddressCount: kotlin.Int? = builder.totalAddressCount
    /**
     * The total number of available addresses.
     */
    val totalAvailableAddressCount: kotlin.Int? = builder.totalAvailableAddressCount

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.PublicIpv4Pool = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PublicIpv4Pool(")
        append("description=$description,")
        append("networkBorderGroup=$networkBorderGroup,")
        append("poolAddressRanges=$poolAddressRanges,")
        append("poolId=$poolId,")
        append("tags=$tags,")
        append("totalAddressCount=$totalAddressCount,")
        append("totalAvailableAddressCount=$totalAvailableAddressCount)")
    }

    override fun hashCode(): kotlin.Int {
        var result = description?.hashCode() ?: 0
        result = 31 * result + (networkBorderGroup?.hashCode() ?: 0)
        result = 31 * result + (poolAddressRanges?.hashCode() ?: 0)
        result = 31 * result + (poolId?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (totalAddressCount ?: 0)
        result = 31 * result + (totalAvailableAddressCount ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PublicIpv4Pool

        if (description != other.description) return false
        if (networkBorderGroup != other.networkBorderGroup) return false
        if (poolAddressRanges != other.poolAddressRanges) return false
        if (poolId != other.poolId) return false
        if (tags != other.tags) return false
        if (totalAddressCount != other.totalAddressCount) return false
        if (totalAvailableAddressCount != other.totalAvailableAddressCount) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.PublicIpv4Pool = Builder(this).apply(block).build()

    class Builder {
        /**
         * A description of the address pool.
         */
        var description: kotlin.String? = null
        /**
         * The name of the location from which the address pool is advertised.
         * A network border group is a unique set of Availability Zones or Local Zones
         * from where Amazon Web Services advertises public IP addresses.
         */
        var networkBorderGroup: kotlin.String? = null
        /**
         * The address ranges.
         */
        var poolAddressRanges: List<PublicIpv4PoolRange>? = null
        /**
         * The ID of the address pool.
         */
        var poolId: kotlin.String? = null
        /**
         * Any tags for the address pool.
         */
        var tags: List<Tag>? = null
        /**
         * The total number of addresses.
         */
        var totalAddressCount: kotlin.Int? = null
        /**
         * The total number of available addresses.
         */
        var totalAvailableAddressCount: kotlin.Int? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.PublicIpv4Pool) : this() {
            this.description = x.description
            this.networkBorderGroup = x.networkBorderGroup
            this.poolAddressRanges = x.poolAddressRanges
            this.poolId = x.poolId
            this.tags = x.tags
            this.totalAddressCount = x.totalAddressCount
            this.totalAvailableAddressCount = x.totalAvailableAddressCount
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.PublicIpv4Pool = PublicIpv4Pool(this)
    }
}