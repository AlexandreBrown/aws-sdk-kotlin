// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeVpcClassicLinkDnsSupportResponse private constructor(builder: Builder) {
    /**
     * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * Information about the ClassicLink DNS support status of the VPCs.
     */
    val vpcs: List<ClassicLinkDnsSupport>? = builder.vpcs

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeVpcClassicLinkDnsSupportResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeVpcClassicLinkDnsSupportResponse(")
        append("nextToken=$nextToken,")
        append("vpcs=$vpcs)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (vpcs?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeVpcClassicLinkDnsSupportResponse

        if (nextToken != other.nextToken) return false
        if (vpcs != other.vpcs) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeVpcClassicLinkDnsSupportResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
         */
        var nextToken: kotlin.String? = null
        /**
         * Information about the ClassicLink DNS support status of the VPCs.
         */
        var vpcs: List<ClassicLinkDnsSupport>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeVpcClassicLinkDnsSupportResponse) : this() {
            this.nextToken = x.nextToken
            this.vpcs = x.vpcs
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeVpcClassicLinkDnsSupportResponse = DescribeVpcClassicLinkDnsSupportResponse(this)
    }
}
