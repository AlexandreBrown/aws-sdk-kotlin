// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeIamInstanceProfileAssociationsRequest private constructor(builder: Builder) {
    /**
     * The IAM instance profile associations.
     */
    val associationIds: List<String>? = builder.associationIds
    /**
     * The filters.
     * instance-id - The ID of the instance.
     * state - The state of the association (associating |
     * associated | disassociating).
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The maximum number of results to return in a single call. To retrieve the remaining
     * results, make another call with the returned NextToken value.
     */
    val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token to request the next page of results.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeIamInstanceProfileAssociationsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeIamInstanceProfileAssociationsRequest(")
        append("associationIds=$associationIds,")
        append("filters=$filters,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = associationIds?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeIamInstanceProfileAssociationsRequest

        if (associationIds != other.associationIds) return false
        if (filters != other.filters) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeIamInstanceProfileAssociationsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The IAM instance profile associations.
         */
        var associationIds: List<String>? = null
        /**
         * The filters.
         * instance-id - The ID of the instance.
         * state - The state of the association (associating |
         * associated | disassociating).
         */
        var filters: List<Filter>? = null
        /**
         * The maximum number of results to return in a single call. To retrieve the remaining
         * results, make another call with the returned NextToken value.
         */
        var maxResults: kotlin.Int? = null
        /**
         * The token to request the next page of results.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeIamInstanceProfileAssociationsRequest) : this() {
            this.associationIds = x.associationIds
            this.filters = x.filters
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeIamInstanceProfileAssociationsRequest = DescribeIamInstanceProfileAssociationsRequest(this)
    }
}