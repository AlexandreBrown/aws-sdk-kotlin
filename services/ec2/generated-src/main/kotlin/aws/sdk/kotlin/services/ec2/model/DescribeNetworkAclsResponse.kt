// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeNetworkAclsResponse private constructor(builder: Builder) {
    /**
     * Information about one or more network ACLs.
     */
    val networkAcls: List<NetworkAcl>? = builder.networkAcls
    /**
     * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeNetworkAclsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeNetworkAclsResponse(")
        append("networkAcls=$networkAcls,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = networkAcls?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeNetworkAclsResponse

        if (networkAcls != other.networkAcls) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeNetworkAclsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about one or more network ACLs.
         */
        var networkAcls: List<NetworkAcl>? = null
        /**
         * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeNetworkAclsResponse) : this() {
            this.networkAcls = x.networkAcls
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeNetworkAclsResponse = DescribeNetworkAclsResponse(this)
    }
}