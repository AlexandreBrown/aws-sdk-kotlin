// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



class UpdateContributorInsightsRequest private constructor(builder: Builder) {
    /**
     * Represents the contributor insights action.
     */
    val contributorInsightsAction: aws.sdk.kotlin.services.dynamodb.model.ContributorInsightsAction? = builder.contributorInsightsAction
    /**
     * The global secondary index name, if applicable.
     */
    val indexName: kotlin.String? = builder.indexName
    /**
     * The name of the table.
     */
    val tableName: kotlin.String? = builder.tableName

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.UpdateContributorInsightsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("UpdateContributorInsightsRequest(")
        append("contributorInsightsAction=$contributorInsightsAction,")
        append("indexName=$indexName,")
        append("tableName=$tableName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = contributorInsightsAction?.hashCode() ?: 0
        result = 31 * result + (indexName?.hashCode() ?: 0)
        result = 31 * result + (tableName?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as UpdateContributorInsightsRequest

        if (contributorInsightsAction != other.contributorInsightsAction) return false
        if (indexName != other.indexName) return false
        if (tableName != other.tableName) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.UpdateContributorInsightsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Represents the contributor insights action.
         */
        var contributorInsightsAction: aws.sdk.kotlin.services.dynamodb.model.ContributorInsightsAction? = null
        /**
         * The global secondary index name, if applicable.
         */
        var indexName: kotlin.String? = null
        /**
         * The name of the table.
         */
        var tableName: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.UpdateContributorInsightsRequest) : this() {
            this.contributorInsightsAction = x.contributorInsightsAction
            this.indexName = x.indexName
            this.tableName = x.tableName
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.UpdateContributorInsightsRequest = UpdateContributorInsightsRequest(this)
    }
}