// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class ListBucketsResponse private constructor(builder: Builder) {
    /**
     * The list of buckets owned by the requestor.
     */
    val buckets: List<Bucket>? = builder.buckets
    /**
     * The owner of the buckets listed.
     */
    val owner: aws.sdk.kotlin.services.s3.model.Owner? = builder.owner

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.ListBucketsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ListBucketsResponse(")
        append("buckets=$buckets,")
        append("owner=$owner)")
    }

    override fun hashCode(): kotlin.Int {
        var result = buckets?.hashCode() ?: 0
        result = 31 * result + (owner?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ListBucketsResponse

        if (buckets != other.buckets) return false
        if (owner != other.owner) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.ListBucketsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The list of buckets owned by the requestor.
         */
        var buckets: List<Bucket>? = null
        /**
         * The owner of the buckets listed.
         */
        var owner: aws.sdk.kotlin.services.s3.model.Owner? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.ListBucketsResponse) : this() {
            this.buckets = x.buckets
            this.owner = x.owner
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.ListBucketsResponse = ListBucketsResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.Owner] inside the given [block]
         */
        fun owner(block: aws.sdk.kotlin.services.s3.model.Owner.Builder.() -> kotlin.Unit) {
            this.owner = aws.sdk.kotlin.services.s3.model.Owner.invoke(block)
        }
    }
}
