// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class PutBucketEncryptionRequest private constructor(builder: Builder) {
    /**
     * Specifies default encryption for a bucket using server-side encryption with Amazon S3-managed
     * keys (SSE-S3) or customer managed keys (SSE-KMS). For information about
     * the Amazon S3 default encryption feature, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html">Amazon S3 Default Bucket Encryption
     * in the Amazon S3 User Guide.
     */
    val bucket: kotlin.String? = builder.bucket
    /**
     * The base64-encoded 128-bit MD5 digest of the server-side encryption configuration.
     * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs, this field is calculated automatically.
     */
    val contentMd5: kotlin.String? = builder.contentMd5
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     */
    val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner
    /**
     * Specifies the default server-side-encryption configuration.
     */
    val serverSideEncryptionConfiguration: aws.sdk.kotlin.services.s3.model.ServerSideEncryptionConfiguration? = builder.serverSideEncryptionConfiguration

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.PutBucketEncryptionRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PutBucketEncryptionRequest(")
        append("bucket=$bucket,")
        append("contentMd5=$contentMd5,")
        append("expectedBucketOwner=$expectedBucketOwner,")
        append("serverSideEncryptionConfiguration=$serverSideEncryptionConfiguration)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (contentMd5?.hashCode() ?: 0)
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (serverSideEncryptionConfiguration?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PutBucketEncryptionRequest

        if (bucket != other.bucket) return false
        if (contentMd5 != other.contentMd5) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false
        if (serverSideEncryptionConfiguration != other.serverSideEncryptionConfiguration) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.PutBucketEncryptionRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Specifies default encryption for a bucket using server-side encryption with Amazon S3-managed
         * keys (SSE-S3) or customer managed keys (SSE-KMS). For information about
         * the Amazon S3 default encryption feature, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html">Amazon S3 Default Bucket Encryption
         * in the Amazon S3 User Guide.
         */
        var bucket: kotlin.String? = null
        /**
         * The base64-encoded 128-bit MD5 digest of the server-side encryption configuration.
         * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs, this field is calculated automatically.
         */
        var contentMd5: kotlin.String? = null
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        var expectedBucketOwner: kotlin.String? = null
        /**
         * Specifies the default server-side-encryption configuration.
         */
        var serverSideEncryptionConfiguration: aws.sdk.kotlin.services.s3.model.ServerSideEncryptionConfiguration? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.PutBucketEncryptionRequest) : this() {
            this.bucket = x.bucket
            this.contentMd5 = x.contentMd5
            this.expectedBucketOwner = x.expectedBucketOwner
            this.serverSideEncryptionConfiguration = x.serverSideEncryptionConfiguration
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.PutBucketEncryptionRequest = PutBucketEncryptionRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.ServerSideEncryptionConfiguration] inside the given [block]
         */
        fun serverSideEncryptionConfiguration(block: aws.sdk.kotlin.services.s3.model.ServerSideEncryptionConfiguration.Builder.() -> kotlin.Unit) {
            this.serverSideEncryptionConfiguration = aws.sdk.kotlin.services.s3.model.ServerSideEncryptionConfiguration.invoke(block)
        }
    }
}
