// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class SearchTransitGatewayMulticastGroupsResponse private constructor(builder: Builder) {
    /**
     * Information about the  transit gateway multicast group.
     */
    val multicastGroups: List<TransitGatewayMulticastGroup>? = builder.multicastGroups
    /**
     * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.SearchTransitGatewayMulticastGroupsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("SearchTransitGatewayMulticastGroupsResponse(")
        append("multicastGroups=$multicastGroups,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = multicastGroups?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SearchTransitGatewayMulticastGroupsResponse

        if (multicastGroups != other.multicastGroups) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.SearchTransitGatewayMulticastGroupsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the  transit gateway multicast group.
         */
        var multicastGroups: List<TransitGatewayMulticastGroup>? = null
        /**
         * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.SearchTransitGatewayMulticastGroupsResponse) : this() {
            this.multicastGroups = x.multicastGroups
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.SearchTransitGatewayMulticastGroupsResponse = SearchTransitGatewayMulticastGroupsResponse(this)
    }
}