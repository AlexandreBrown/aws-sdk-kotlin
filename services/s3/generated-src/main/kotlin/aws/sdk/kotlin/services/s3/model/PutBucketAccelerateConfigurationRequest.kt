// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class PutBucketAccelerateConfigurationRequest private constructor(builder: Builder) {
    /**
     * Container for setting the transfer acceleration state.
     */
    val accelerateConfiguration: aws.sdk.kotlin.services.s3.model.AccelerateConfiguration? = builder.accelerateConfiguration
    /**
     * The name of the bucket for which the accelerate configuration is set.
     */
    val bucket: kotlin.String? = builder.bucket
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     */
    val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.PutBucketAccelerateConfigurationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PutBucketAccelerateConfigurationRequest(")
        append("accelerateConfiguration=$accelerateConfiguration,")
        append("bucket=$bucket,")
        append("expectedBucketOwner=$expectedBucketOwner)")
    }

    override fun hashCode(): kotlin.Int {
        var result = accelerateConfiguration?.hashCode() ?: 0
        result = 31 * result + (bucket?.hashCode() ?: 0)
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PutBucketAccelerateConfigurationRequest

        if (accelerateConfiguration != other.accelerateConfiguration) return false
        if (bucket != other.bucket) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.PutBucketAccelerateConfigurationRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Container for setting the transfer acceleration state.
         */
        var accelerateConfiguration: aws.sdk.kotlin.services.s3.model.AccelerateConfiguration? = null
        /**
         * The name of the bucket for which the accelerate configuration is set.
         */
        var bucket: kotlin.String? = null
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        var expectedBucketOwner: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.PutBucketAccelerateConfigurationRequest) : this() {
            this.accelerateConfiguration = x.accelerateConfiguration
            this.bucket = x.bucket
            this.expectedBucketOwner = x.expectedBucketOwner
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.PutBucketAccelerateConfigurationRequest = PutBucketAccelerateConfigurationRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.AccelerateConfiguration] inside the given [block]
         */
        fun accelerateConfiguration(block: aws.sdk.kotlin.services.s3.model.AccelerateConfiguration.Builder.() -> kotlin.Unit) {
            this.accelerateConfiguration = aws.sdk.kotlin.services.s3.model.AccelerateConfiguration.invoke(block)
        }
    }
}