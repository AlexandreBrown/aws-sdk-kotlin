// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class GetBucketEncryptionResponse private constructor(builder: Builder) {
    /**
     * Specifies the default server-side-encryption configuration.
     */
    val serverSideEncryptionConfiguration: aws.sdk.kotlin.services.s3.model.ServerSideEncryptionConfiguration? = builder.serverSideEncryptionConfiguration

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.GetBucketEncryptionResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetBucketEncryptionResponse(")
        append("serverSideEncryptionConfiguration=$serverSideEncryptionConfiguration)")
    }

    override fun hashCode(): kotlin.Int {
        var result = serverSideEncryptionConfiguration?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetBucketEncryptionResponse

        if (serverSideEncryptionConfiguration != other.serverSideEncryptionConfiguration) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.GetBucketEncryptionResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Specifies the default server-side-encryption configuration.
         */
        var serverSideEncryptionConfiguration: aws.sdk.kotlin.services.s3.model.ServerSideEncryptionConfiguration? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.GetBucketEncryptionResponse) : this() {
            this.serverSideEncryptionConfiguration = x.serverSideEncryptionConfiguration
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.GetBucketEncryptionResponse = GetBucketEncryptionResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.ServerSideEncryptionConfiguration] inside the given [block]
         */
        fun serverSideEncryptionConfiguration(block: aws.sdk.kotlin.services.s3.model.ServerSideEncryptionConfiguration.Builder.() -> kotlin.Unit) {
            this.serverSideEncryptionConfiguration = aws.sdk.kotlin.services.s3.model.ServerSideEncryptionConfiguration.invoke(block)
        }
    }
}
