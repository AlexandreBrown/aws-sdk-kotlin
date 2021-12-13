// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeVpcEndpointConnectionsResponse private constructor(builder: Builder) {
    /**
     * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * Information about one or more VPC endpoint connections.
     */
    val vpcEndpointConnections: List<VpcEndpointConnection>? = builder.vpcEndpointConnections

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeVpcEndpointConnectionsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeVpcEndpointConnectionsResponse(")
        append("nextToken=$nextToken,")
        append("vpcEndpointConnections=$vpcEndpointConnections)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (vpcEndpointConnections?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeVpcEndpointConnectionsResponse

        if (nextToken != other.nextToken) return false
        if (vpcEndpointConnections != other.vpcEndpointConnections) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeVpcEndpointConnectionsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
         */
        var nextToken: kotlin.String? = null
        /**
         * Information about one or more VPC endpoint connections.
         */
        var vpcEndpointConnections: List<VpcEndpointConnection>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeVpcEndpointConnectionsResponse) : this() {
            this.nextToken = x.nextToken
            this.vpcEndpointConnections = x.vpcEndpointConnections
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeVpcEndpointConnectionsResponse = DescribeVpcEndpointConnectionsResponse(this)
    }
}
