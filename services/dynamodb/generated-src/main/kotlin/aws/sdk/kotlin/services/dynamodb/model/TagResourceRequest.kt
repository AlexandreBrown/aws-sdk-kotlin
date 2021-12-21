// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



class TagResourceRequest private constructor(builder: Builder) {
    /**
     * Identifies the Amazon DynamoDB resource to which tags should be added. This value is
     * an Amazon Resource Name (ARN).
     */
    val resourceArn: kotlin.String? = builder.resourceArn
    /**
     * The tags to be assigned to the Amazon DynamoDB resource.
     */
    val tags: List<Tag>? = builder.tags

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.TagResourceRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TagResourceRequest(")
        append("resourceArn=$resourceArn,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = resourceArn?.hashCode() ?: 0
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TagResourceRequest

        if (resourceArn != other.resourceArn) return false
        if (tags != other.tags) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.TagResourceRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Identifies the Amazon DynamoDB resource to which tags should be added. This value is
         * an Amazon Resource Name (ARN).
         */
        var resourceArn: kotlin.String? = null
        /**
         * The tags to be assigned to the Amazon DynamoDB resource.
         */
        var tags: List<Tag>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.TagResourceRequest) : this() {
            this.resourceArn = x.resourceArn
            this.tags = x.tags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.TagResourceRequest = TagResourceRequest(this)
    }
}