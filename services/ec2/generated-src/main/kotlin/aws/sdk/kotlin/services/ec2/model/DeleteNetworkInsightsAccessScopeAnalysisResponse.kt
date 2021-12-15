// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteNetworkInsightsAccessScopeAnalysisResponse private constructor(builder: Builder) {
    /**
     * The ID of the Network Access Scope analysis.
     */
    val networkInsightsAccessScopeAnalysisId: kotlin.String? = builder.networkInsightsAccessScopeAnalysisId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteNetworkInsightsAccessScopeAnalysisResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteNetworkInsightsAccessScopeAnalysisResponse(")
        append("networkInsightsAccessScopeAnalysisId=$networkInsightsAccessScopeAnalysisId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = networkInsightsAccessScopeAnalysisId?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteNetworkInsightsAccessScopeAnalysisResponse

        if (networkInsightsAccessScopeAnalysisId != other.networkInsightsAccessScopeAnalysisId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteNetworkInsightsAccessScopeAnalysisResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the Network Access Scope analysis.
         */
        var networkInsightsAccessScopeAnalysisId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteNetworkInsightsAccessScopeAnalysisResponse) : this() {
            this.networkInsightsAccessScopeAnalysisId = x.networkInsightsAccessScopeAnalysisId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteNetworkInsightsAccessScopeAnalysisResponse = DeleteNetworkInsightsAccessScopeAnalysisResponse(this)
    }
}
