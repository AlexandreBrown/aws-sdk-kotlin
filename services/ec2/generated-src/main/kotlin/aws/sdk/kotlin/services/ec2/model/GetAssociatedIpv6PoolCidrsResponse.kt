// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class GetAssociatedIpv6PoolCidrsResponse private constructor(builder: Builder) {
    /**
     * Information about the IPv6 CIDR block associations.
     */
    val ipv6CidrAssociations: List<Ipv6CidrAssociation>? = builder.ipv6CidrAssociations
    /**
     * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.GetAssociatedIpv6PoolCidrsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetAssociatedIpv6PoolCidrsResponse(")
        append("ipv6CidrAssociations=$ipv6CidrAssociations,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = ipv6CidrAssociations?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetAssociatedIpv6PoolCidrsResponse

        if (ipv6CidrAssociations != other.ipv6CidrAssociations) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.GetAssociatedIpv6PoolCidrsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the IPv6 CIDR block associations.
         */
        var ipv6CidrAssociations: List<Ipv6CidrAssociation>? = null
        /**
         * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.GetAssociatedIpv6PoolCidrsResponse) : this() {
            this.ipv6CidrAssociations = x.ipv6CidrAssociations
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.GetAssociatedIpv6PoolCidrsResponse = GetAssociatedIpv6PoolCidrsResponse(this)
    }
}