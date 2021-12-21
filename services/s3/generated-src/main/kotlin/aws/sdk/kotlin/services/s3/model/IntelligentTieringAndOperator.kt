// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * A container for specifying S3 Intelligent-Tiering filters. The filters determine the
 * subset of objects to which the rule applies.
 */
class IntelligentTieringAndOperator private constructor(builder: Builder) {
    /**
     * An object key name prefix that identifies the subset of objects to which the
     * configuration applies.
     */
    val prefix: kotlin.String? = builder.prefix
    /**
     * All of these tags must exist in the object's tag set in order for the configuration to
     * apply.
     */
    val tags: List<Tag>? = builder.tags

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.IntelligentTieringAndOperator = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("IntelligentTieringAndOperator(")
        append("prefix=$prefix,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = prefix?.hashCode() ?: 0
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as IntelligentTieringAndOperator

        if (prefix != other.prefix) return false
        if (tags != other.tags) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.IntelligentTieringAndOperator = Builder(this).apply(block).build()

    class Builder {
        /**
         * An object key name prefix that identifies the subset of objects to which the
         * configuration applies.
         */
        var prefix: kotlin.String? = null
        /**
         * All of these tags must exist in the object's tag set in order for the configuration to
         * apply.
         */
        var tags: List<Tag>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.IntelligentTieringAndOperator) : this() {
            this.prefix = x.prefix
            this.tags = x.tags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.IntelligentTieringAndOperator = IntelligentTieringAndOperator(this)
    }
}