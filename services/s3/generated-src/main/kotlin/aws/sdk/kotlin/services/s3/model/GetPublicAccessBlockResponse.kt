// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class GetPublicAccessBlockResponse private constructor(builder: Builder) {
    /**
     * The PublicAccessBlock configuration currently in effect for this Amazon S3
     * bucket.
     */
    val publicAccessBlockConfiguration: aws.sdk.kotlin.services.s3.model.PublicAccessBlockConfiguration? = builder.publicAccessBlockConfiguration

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.GetPublicAccessBlockResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetPublicAccessBlockResponse(")
        append("publicAccessBlockConfiguration=$publicAccessBlockConfiguration)")
    }

    override fun hashCode(): kotlin.Int {
        var result = publicAccessBlockConfiguration?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetPublicAccessBlockResponse

        if (publicAccessBlockConfiguration != other.publicAccessBlockConfiguration) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.GetPublicAccessBlockResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The PublicAccessBlock configuration currently in effect for this Amazon S3
         * bucket.
         */
        var publicAccessBlockConfiguration: aws.sdk.kotlin.services.s3.model.PublicAccessBlockConfiguration? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.GetPublicAccessBlockResponse) : this() {
            this.publicAccessBlockConfiguration = x.publicAccessBlockConfiguration
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.GetPublicAccessBlockResponse = GetPublicAccessBlockResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.PublicAccessBlockConfiguration] inside the given [block]
         */
        fun publicAccessBlockConfiguration(block: aws.sdk.kotlin.services.s3.model.PublicAccessBlockConfiguration.Builder.() -> kotlin.Unit) {
            this.publicAccessBlockConfiguration = aws.sdk.kotlin.services.s3.model.PublicAccessBlockConfiguration.invoke(block)
        }
    }
}
