// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class PutBucketNotificationConfigurationRequest private constructor(builder: Builder) {
    /**
     * The name of the bucket.
     */
    val bucket: kotlin.String? = builder.bucket
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     */
    val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner
    /**
     * A container for specifying the notification configuration of the bucket. If this element
     * is empty, notifications are turned off for the bucket.
     */
    val notificationConfiguration: aws.sdk.kotlin.services.s3.model.NotificationConfiguration? = builder.notificationConfiguration
    /**
     * Skips validation of Amazon SQS, Amazon SNS, and Lambda destinations. True or false value.
     */
    val skipDestinationValidation: kotlin.Boolean = builder.skipDestinationValidation

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.PutBucketNotificationConfigurationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PutBucketNotificationConfigurationRequest(")
        append("bucket=$bucket,")
        append("expectedBucketOwner=$expectedBucketOwner,")
        append("notificationConfiguration=$notificationConfiguration,")
        append("skipDestinationValidation=$skipDestinationValidation)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (notificationConfiguration?.hashCode() ?: 0)
        result = 31 * result + (skipDestinationValidation.hashCode())
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PutBucketNotificationConfigurationRequest

        if (bucket != other.bucket) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false
        if (notificationConfiguration != other.notificationConfiguration) return false
        if (skipDestinationValidation != other.skipDestinationValidation) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.PutBucketNotificationConfigurationRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of the bucket.
         */
        var bucket: kotlin.String? = null
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        var expectedBucketOwner: kotlin.String? = null
        /**
         * A container for specifying the notification configuration of the bucket. If this element
         * is empty, notifications are turned off for the bucket.
         */
        var notificationConfiguration: aws.sdk.kotlin.services.s3.model.NotificationConfiguration? = null
        /**
         * Skips validation of Amazon SQS, Amazon SNS, and Lambda destinations. True or false value.
         */
        var skipDestinationValidation: kotlin.Boolean = false

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.PutBucketNotificationConfigurationRequest) : this() {
            this.bucket = x.bucket
            this.expectedBucketOwner = x.expectedBucketOwner
            this.notificationConfiguration = x.notificationConfiguration
            this.skipDestinationValidation = x.skipDestinationValidation
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.PutBucketNotificationConfigurationRequest = PutBucketNotificationConfigurationRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.NotificationConfiguration] inside the given [block]
         */
        fun notificationConfiguration(block: aws.sdk.kotlin.services.s3.model.NotificationConfiguration.Builder.() -> kotlin.Unit) {
            this.notificationConfiguration = aws.sdk.kotlin.services.s3.model.NotificationConfiguration.invoke(block)
        }
    }
}
