// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Describes where logs are stored and the prefix that Amazon S3 assigns to all log object keys
 * for a bucket. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlogging.html">PUT Bucket logging in the
 * Amazon S3 API Reference.
 */
class LoggingEnabled private constructor(builder: Builder) {
    /**
     * Specifies the bucket where you want Amazon S3 to store server access logs. You can have your
     * logs delivered to any bucket that you own, including the same bucket that is being logged.
     * You can also configure multiple buckets to deliver their logs to the same target bucket. In
     * this case, you should choose a different TargetPrefix for each source bucket
     * so that the delivered log files can be distinguished by key.
     */
    val targetBucket: kotlin.String? = builder.targetBucket
    /**
     * Container for granting information.
     * Buckets that use the bucket owner enforced setting for Object
     * Ownership don't support target grants. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/enable-server-access-logging.html#grant-log-delivery-permissions-general">Permissions for server access log delivery in the
     * Amazon S3 User Guide.
     */
    val targetGrants: List<TargetGrant>? = builder.targetGrants
    /**
     * A prefix for all log object keys. If you store log files from multiple Amazon S3 buckets in a
     * single bucket, you can use a prefix to distinguish which log files came from which
     * bucket.
     */
    val targetPrefix: kotlin.String? = builder.targetPrefix

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.LoggingEnabled = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LoggingEnabled(")
        append("targetBucket=$targetBucket,")
        append("targetGrants=$targetGrants,")
        append("targetPrefix=$targetPrefix)")
    }

    override fun hashCode(): kotlin.Int {
        var result = targetBucket?.hashCode() ?: 0
        result = 31 * result + (targetGrants?.hashCode() ?: 0)
        result = 31 * result + (targetPrefix?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LoggingEnabled

        if (targetBucket != other.targetBucket) return false
        if (targetGrants != other.targetGrants) return false
        if (targetPrefix != other.targetPrefix) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.LoggingEnabled = Builder(this).apply(block).build()

    class Builder {
        /**
         * Specifies the bucket where you want Amazon S3 to store server access logs. You can have your
         * logs delivered to any bucket that you own, including the same bucket that is being logged.
         * You can also configure multiple buckets to deliver their logs to the same target bucket. In
         * this case, you should choose a different TargetPrefix for each source bucket
         * so that the delivered log files can be distinguished by key.
         */
        var targetBucket: kotlin.String? = null
        /**
         * Container for granting information.
         * Buckets that use the bucket owner enforced setting for Object
         * Ownership don't support target grants. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/enable-server-access-logging.html#grant-log-delivery-permissions-general">Permissions for server access log delivery in the
         * Amazon S3 User Guide.
         */
        var targetGrants: List<TargetGrant>? = null
        /**
         * A prefix for all log object keys. If you store log files from multiple Amazon S3 buckets in a
         * single bucket, you can use a prefix to distinguish which log files came from which
         * bucket.
         */
        var targetPrefix: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.LoggingEnabled) : this() {
            this.targetBucket = x.targetBucket
            this.targetGrants = x.targetGrants
            this.targetPrefix = x.targetPrefix
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.LoggingEnabled = LoggingEnabled(this)
    }
}