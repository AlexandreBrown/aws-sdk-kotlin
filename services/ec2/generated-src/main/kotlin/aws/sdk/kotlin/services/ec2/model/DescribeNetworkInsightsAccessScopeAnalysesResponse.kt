// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeNetworkInsightsAccessScopeAnalysesResponse private constructor(builder: Builder) {
    /**
     * The Network Access Scope analyses.
     */
    val networkInsightsAccessScopeAnalyses: List<NetworkInsightsAccessScopeAnalysis>? = builder.networkInsightsAccessScopeAnalyses
    /**
     * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeNetworkInsightsAccessScopeAnalysesResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeNetworkInsightsAccessScopeAnalysesResponse(")
        append("networkInsightsAccessScopeAnalyses=$networkInsightsAccessScopeAnalyses,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = networkInsightsAccessScopeAnalyses?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeNetworkInsightsAccessScopeAnalysesResponse

        if (networkInsightsAccessScopeAnalyses != other.networkInsightsAccessScopeAnalyses) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeNetworkInsightsAccessScopeAnalysesResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Network Access Scope analyses.
         */
        var networkInsightsAccessScopeAnalyses: List<NetworkInsightsAccessScopeAnalysis>? = null
        /**
         * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeNetworkInsightsAccessScopeAnalysesResponse) : this() {
            this.networkInsightsAccessScopeAnalyses = x.networkInsightsAccessScopeAnalyses
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeNetworkInsightsAccessScopeAnalysesResponse = DescribeNetworkInsightsAccessScopeAnalysesResponse(this)
    }
}