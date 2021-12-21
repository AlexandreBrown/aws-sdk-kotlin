// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeImportImageTasksResponse private constructor(builder: Builder) {
    /**
     * A list of zero or more import image tasks that are currently active or were completed or canceled in the
     * previous 7 days.
     */
    val importImageTasks: List<ImportImageTask>? = builder.importImageTasks
    /**
     * The token to use to get the next page of results. This value is null when there are no more results
     * to return.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeImportImageTasksResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeImportImageTasksResponse(")
        append("importImageTasks=$importImageTasks,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = importImageTasks?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeImportImageTasksResponse

        if (importImageTasks != other.importImageTasks) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeImportImageTasksResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * A list of zero or more import image tasks that are currently active or were completed or canceled in the
         * previous 7 days.
         */
        var importImageTasks: List<ImportImageTask>? = null
        /**
         * The token to use to get the next page of results. This value is null when there are no more results
         * to return.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeImportImageTasksResponse) : this() {
            this.importImageTasks = x.importImageTasks
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeImportImageTasksResponse = DescribeImportImageTasksResponse(this)
    }
}