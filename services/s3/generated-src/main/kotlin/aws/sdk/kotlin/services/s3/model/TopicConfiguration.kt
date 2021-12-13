// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * A container for specifying the configuration for publication of messages to an Amazon
 * Simple Notification Service (Amazon SNS) topic when Amazon S3 detects specified events.
 */
class TopicConfiguration private constructor(builder: Builder) {
    /**
     * The Amazon S3 bucket event about which to send notifications. For more information, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Supported
     * Event Types in the Amazon S3 User Guide.
     */
    val events: List<Event>? = builder.events
    /**
     * Specifies object key name filtering rules. For information about key name filtering, see
     * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring
     * Event Notifications in the Amazon S3 User Guide.
     */
    val filter: aws.sdk.kotlin.services.s3.model.NotificationConfigurationFilter? = builder.filter
    /**
     * An optional unique identifier for configurations in a notification configuration. If you
     * don't provide one, Amazon S3 will assign an ID.
     */
    val id: kotlin.String? = builder.id
    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to which Amazon S3 publishes a message
     * when it detects events of the specified type.
     */
    val topicArn: kotlin.String? = builder.topicArn

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.TopicConfiguration = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TopicConfiguration(")
        append("events=$events,")
        append("filter=$filter,")
        append("id=$id,")
        append("topicArn=$topicArn)")
    }

    override fun hashCode(): kotlin.Int {
        var result = events?.hashCode() ?: 0
        result = 31 * result + (filter?.hashCode() ?: 0)
        result = 31 * result + (id?.hashCode() ?: 0)
        result = 31 * result + (topicArn?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TopicConfiguration

        if (events != other.events) return false
        if (filter != other.filter) return false
        if (id != other.id) return false
        if (topicArn != other.topicArn) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.TopicConfiguration = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Amazon S3 bucket event about which to send notifications. For more information, see
         * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Supported
         * Event Types in the Amazon S3 User Guide.
         */
        var events: List<Event>? = null
        /**
         * Specifies object key name filtering rules. For information about key name filtering, see
         * <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html">Configuring
         * Event Notifications in the Amazon S3 User Guide.
         */
        var filter: aws.sdk.kotlin.services.s3.model.NotificationConfigurationFilter? = null
        /**
         * An optional unique identifier for configurations in a notification configuration. If you
         * don't provide one, Amazon S3 will assign an ID.
         */
        var id: kotlin.String? = null
        /**
         * The Amazon Resource Name (ARN) of the Amazon SNS topic to which Amazon S3 publishes a message
         * when it detects events of the specified type.
         */
        var topicArn: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.TopicConfiguration) : this() {
            this.events = x.events
            this.filter = x.filter
            this.id = x.id
            this.topicArn = x.topicArn
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.TopicConfiguration = TopicConfiguration(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.NotificationConfigurationFilter] inside the given [block]
         */
        fun filter(block: aws.sdk.kotlin.services.s3.model.NotificationConfigurationFilter.Builder.() -> kotlin.Unit) {
            this.filter = aws.sdk.kotlin.services.s3.model.NotificationConfigurationFilter.invoke(block)
        }
    }
}
