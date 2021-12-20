// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the output of DescribeVpcEndpoints.
 */
class DescribeVpcEndpointsResponse private constructor(builder: Builder) {
    /**
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * Information about the endpoints.
     */
    val vpcEndpoints: List<VpcEndpoint>? = builder.vpcEndpoints

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeVpcEndpointsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeVpcEndpointsResponse(")
        append("nextToken=$nextToken,")
        append("vpcEndpoints=$vpcEndpoints)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (vpcEndpoints?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeVpcEndpointsResponse

        if (nextToken != other.nextToken) return false
        if (vpcEndpoints != other.vpcEndpoints) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeVpcEndpointsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
         */
        var nextToken: kotlin.String? = null
        /**
         * Information about the endpoints.
         */
        var vpcEndpoints: List<VpcEndpoint>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeVpcEndpointsResponse) : this() {
            this.nextToken = x.nextToken
            this.vpcEndpoints = x.vpcEndpoints
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeVpcEndpointsResponse = DescribeVpcEndpointsResponse(this)
    }
}