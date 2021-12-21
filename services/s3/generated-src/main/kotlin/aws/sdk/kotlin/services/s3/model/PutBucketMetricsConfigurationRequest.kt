// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class PutBucketMetricsConfigurationRequest private constructor(builder: Builder) {
    /**
     * The name of the bucket for which the metrics configuration is set.
     */
    val bucket: kotlin.String? = builder.bucket
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     */
    val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner
    /**
     * The ID used to identify the metrics configuration.
     */
    val id: kotlin.String? = builder.id
    /**
     * Specifies the metrics configuration.
     */
    val metricsConfiguration: aws.sdk.kotlin.services.s3.model.MetricsConfiguration? = builder.metricsConfiguration

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.PutBucketMetricsConfigurationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PutBucketMetricsConfigurationRequest(")
        append("bucket=$bucket,")
        append("expectedBucketOwner=$expectedBucketOwner,")
        append("id=$id,")
        append("metricsConfiguration=$metricsConfiguration)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (id?.hashCode() ?: 0)
        result = 31 * result + (metricsConfiguration?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PutBucketMetricsConfigurationRequest

        if (bucket != other.bucket) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false
        if (id != other.id) return false
        if (metricsConfiguration != other.metricsConfiguration) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.PutBucketMetricsConfigurationRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of the bucket for which the metrics configuration is set.
         */
        var bucket: kotlin.String? = null
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        var expectedBucketOwner: kotlin.String? = null
        /**
         * The ID used to identify the metrics configuration.
         */
        var id: kotlin.String? = null
        /**
         * Specifies the metrics configuration.
         */
        var metricsConfiguration: aws.sdk.kotlin.services.s3.model.MetricsConfiguration? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.PutBucketMetricsConfigurationRequest) : this() {
            this.bucket = x.bucket
            this.expectedBucketOwner = x.expectedBucketOwner
            this.id = x.id
            this.metricsConfiguration = x.metricsConfiguration
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.PutBucketMetricsConfigurationRequest = PutBucketMetricsConfigurationRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.MetricsConfiguration] inside the given [block]
         */
        fun metricsConfiguration(block: aws.sdk.kotlin.services.s3.model.MetricsConfiguration.Builder.() -> kotlin.Unit) {
            this.metricsConfiguration = aws.sdk.kotlin.services.s3.model.MetricsConfiguration.invoke(block)
        }
    }
}