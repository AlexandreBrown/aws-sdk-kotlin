// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Specifies information about where to publish analysis or configuration results for an
 * Amazon S3 bucket and S3 Replication Time Control (S3 RTC).
 */
class Destination private constructor(builder: Builder) {
    /**
     * Specify this only in a cross-account scenario (where source and destination bucket
     * owners are not the same), and you want to change replica ownership to the Amazon Web Services account that
     * owns the destination bucket. If this is not specified in the replication configuration, the
     * replicas are owned by same Amazon Web Services account that owns the source object.
     */
    val accessControlTranslation: aws.sdk.kotlin.services.s3.model.AccessControlTranslation? = builder.accessControlTranslation
    /**
     * Destination bucket owner account ID. In a cross-account scenario, if you direct Amazon S3 to
     * change replica ownership to the Amazon Web Services account that owns the destination bucket by specifying
     * the AccessControlTranslation property, this is the account ID of the
     * destination bucket owner. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-change-owner.html">Replication Additional
     * Configuration: Changing the Replica Owner in the Amazon S3 User Guide.
     */
    val account: kotlin.String? = builder.account
    /**
     * The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to store the results.
     */
    val bucket: kotlin.String? = builder.bucket
    /**
     * A container that provides information about encryption. If
     * SourceSelectionCriteria is specified, you must specify this element.
     */
    val encryptionConfiguration: aws.sdk.kotlin.services.s3.model.EncryptionConfiguration? = builder.encryptionConfiguration
    /**
     * A container specifying replication metrics-related settings enabling replication
     * metrics and events.
     */
    val metrics: aws.sdk.kotlin.services.s3.model.Metrics? = builder.metrics
    /**
     * A container specifying S3 Replication Time Control (S3 RTC), including whether S3 RTC is enabled and the time
     * when all objects and operations on objects must be replicated. Must be specified together
     * with a Metrics block.
     */
    val replicationTime: aws.sdk.kotlin.services.s3.model.ReplicationTime? = builder.replicationTime
    /**
     * The storage class to use when replicating objects, such as S3 Standard or reduced
     * redundancy. By default, Amazon S3 uses the storage class of the source object to create the
     * object replica.
     * For valid values, see the StorageClass element of the <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT Bucket
     * replication action in the Amazon S3 API Reference.
     */
    val storageClass: aws.sdk.kotlin.services.s3.model.StorageClass? = builder.storageClass

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.Destination = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("Destination(")
        append("accessControlTranslation=$accessControlTranslation,")
        append("account=$account,")
        append("bucket=$bucket,")
        append("encryptionConfiguration=$encryptionConfiguration,")
        append("metrics=$metrics,")
        append("replicationTime=$replicationTime,")
        append("storageClass=$storageClass)")
    }

    override fun hashCode(): kotlin.Int {
        var result = accessControlTranslation?.hashCode() ?: 0
        result = 31 * result + (account?.hashCode() ?: 0)
        result = 31 * result + (bucket?.hashCode() ?: 0)
        result = 31 * result + (encryptionConfiguration?.hashCode() ?: 0)
        result = 31 * result + (metrics?.hashCode() ?: 0)
        result = 31 * result + (replicationTime?.hashCode() ?: 0)
        result = 31 * result + (storageClass?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Destination

        if (accessControlTranslation != other.accessControlTranslation) return false
        if (account != other.account) return false
        if (bucket != other.bucket) return false
        if (encryptionConfiguration != other.encryptionConfiguration) return false
        if (metrics != other.metrics) return false
        if (replicationTime != other.replicationTime) return false
        if (storageClass != other.storageClass) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.Destination = Builder(this).apply(block).build()

    class Builder {
        /**
         * Specify this only in a cross-account scenario (where source and destination bucket
         * owners are not the same), and you want to change replica ownership to the Amazon Web Services account that
         * owns the destination bucket. If this is not specified in the replication configuration, the
         * replicas are owned by same Amazon Web Services account that owns the source object.
         */
        var accessControlTranslation: aws.sdk.kotlin.services.s3.model.AccessControlTranslation? = null
        /**
         * Destination bucket owner account ID. In a cross-account scenario, if you direct Amazon S3 to
         * change replica ownership to the Amazon Web Services account that owns the destination bucket by specifying
         * the AccessControlTranslation property, this is the account ID of the
         * destination bucket owner. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/replication-change-owner.html">Replication Additional
         * Configuration: Changing the Replica Owner in the Amazon S3 User Guide.
         */
        var account: kotlin.String? = null
        /**
         * The Amazon Resource Name (ARN) of the bucket where you want Amazon S3 to store the results.
         */
        var bucket: kotlin.String? = null
        /**
         * A container that provides information about encryption. If
         * SourceSelectionCriteria is specified, you must specify this element.
         */
        var encryptionConfiguration: aws.sdk.kotlin.services.s3.model.EncryptionConfiguration? = null
        /**
         * A container specifying replication metrics-related settings enabling replication
         * metrics and events.
         */
        var metrics: aws.sdk.kotlin.services.s3.model.Metrics? = null
        /**
         * A container specifying S3 Replication Time Control (S3 RTC), including whether S3 RTC is enabled and the time
         * when all objects and operations on objects must be replicated. Must be specified together
         * with a Metrics block.
         */
        var replicationTime: aws.sdk.kotlin.services.s3.model.ReplicationTime? = null
        /**
         * The storage class to use when replicating objects, such as S3 Standard or reduced
         * redundancy. By default, Amazon S3 uses the storage class of the source object to create the
         * object replica.
         * For valid values, see the StorageClass element of the <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html">PUT Bucket
         * replication action in the Amazon S3 API Reference.
         */
        var storageClass: aws.sdk.kotlin.services.s3.model.StorageClass? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.Destination) : this() {
            this.accessControlTranslation = x.accessControlTranslation
            this.account = x.account
            this.bucket = x.bucket
            this.encryptionConfiguration = x.encryptionConfiguration
            this.metrics = x.metrics
            this.replicationTime = x.replicationTime
            this.storageClass = x.storageClass
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.Destination = Destination(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.AccessControlTranslation] inside the given [block]
         */
        fun accessControlTranslation(block: aws.sdk.kotlin.services.s3.model.AccessControlTranslation.Builder.() -> kotlin.Unit) {
            this.accessControlTranslation = aws.sdk.kotlin.services.s3.model.AccessControlTranslation.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.EncryptionConfiguration] inside the given [block]
         */
        fun encryptionConfiguration(block: aws.sdk.kotlin.services.s3.model.EncryptionConfiguration.Builder.() -> kotlin.Unit) {
            this.encryptionConfiguration = aws.sdk.kotlin.services.s3.model.EncryptionConfiguration.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.Metrics] inside the given [block]
         */
        fun metrics(block: aws.sdk.kotlin.services.s3.model.Metrics.Builder.() -> kotlin.Unit) {
            this.metrics = aws.sdk.kotlin.services.s3.model.Metrics.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.ReplicationTime] inside the given [block]
         */
        fun replicationTime(block: aws.sdk.kotlin.services.s3.model.ReplicationTime.Builder.() -> kotlin.Unit) {
            this.replicationTime = aws.sdk.kotlin.services.s3.model.ReplicationTime.invoke(block)
        }
    }
}