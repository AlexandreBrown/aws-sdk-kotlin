// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteTagsRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The IDs of the resources, separated by spaces.
     * Constraints: Up to 1000 resource IDs. We recommend breaking up this request into smaller batches.
     */
    val resources: List<String>? = builder.resources
    /**
     * The tags to delete. Specify a tag key and an optional tag value to delete
     * specific tags. If you specify a tag key without a tag value, we delete any tag with this
     * key regardless of its value. If you specify a tag key with an empty string as the tag
     * value, we delete the tag only if its value is an empty string.
     * If you omit this parameter, we delete all user-defined tags for the specified
     * resources. We do not delete Amazon Web Services-generated tags (tags that have the aws:
     * prefix).
     * Constraints: Up to 1000 tags.
     */
    val tags: List<Tag>? = builder.tags

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteTagsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteTagsRequest(")
        append("dryRun=$dryRun,")
        append("resources=$resources,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (resources?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteTagsRequest

        if (dryRun != other.dryRun) return false
        if (resources != other.resources) return false
        if (tags != other.tags) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteTagsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The IDs of the resources, separated by spaces.
         * Constraints: Up to 1000 resource IDs. We recommend breaking up this request into smaller batches.
         */
        var resources: List<String>? = null
        /**
         * The tags to delete. Specify a tag key and an optional tag value to delete
         * specific tags. If you specify a tag key without a tag value, we delete any tag with this
         * key regardless of its value. If you specify a tag key with an empty string as the tag
         * value, we delete the tag only if its value is an empty string.
         * If you omit this parameter, we delete all user-defined tags for the specified
         * resources. We do not delete Amazon Web Services-generated tags (tags that have the aws:
         * prefix).
         * Constraints: Up to 1000 tags.
         */
        var tags: List<Tag>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteTagsRequest) : this() {
            this.dryRun = x.dryRun
            this.resources = x.resources
            this.tags = x.tags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteTagsRequest = DeleteTagsRequest(this)
    }
}