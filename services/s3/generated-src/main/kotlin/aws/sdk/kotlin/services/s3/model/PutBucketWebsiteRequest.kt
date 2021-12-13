// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class PutBucketWebsiteRequest private constructor(builder: Builder) {
    /**
     * The bucket name.
     */
    val bucket: kotlin.String? = builder.bucket
    /**
     * The base64-encoded 128-bit MD5 digest of the data. You must use this header as a message
     * integrity check to verify that the request body was not corrupted in transit. For more
     * information, see <a href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864.
     * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs, this field is calculated automatically.
     */
    val contentMd5: kotlin.String? = builder.contentMd5
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     */
    val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner
    /**
     * Container for the request.
     */
    val websiteConfiguration: aws.sdk.kotlin.services.s3.model.WebsiteConfiguration? = builder.websiteConfiguration

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.PutBucketWebsiteRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PutBucketWebsiteRequest(")
        append("bucket=$bucket,")
        append("contentMd5=$contentMd5,")
        append("expectedBucketOwner=$expectedBucketOwner,")
        append("websiteConfiguration=$websiteConfiguration)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (contentMd5?.hashCode() ?: 0)
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (websiteConfiguration?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PutBucketWebsiteRequest

        if (bucket != other.bucket) return false
        if (contentMd5 != other.contentMd5) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false
        if (websiteConfiguration != other.websiteConfiguration) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.PutBucketWebsiteRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The bucket name.
         */
        var bucket: kotlin.String? = null
        /**
         * The base64-encoded 128-bit MD5 digest of the data. You must use this header as a message
         * integrity check to verify that the request body was not corrupted in transit. For more
         * information, see <a href="http://www.ietf.org/rfc/rfc1864.txt">RFC 1864.
         * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs, this field is calculated automatically.
         */
        var contentMd5: kotlin.String? = null
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        var expectedBucketOwner: kotlin.String? = null
        /**
         * Container for the request.
         */
        var websiteConfiguration: aws.sdk.kotlin.services.s3.model.WebsiteConfiguration? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.PutBucketWebsiteRequest) : this() {
            this.bucket = x.bucket
            this.contentMd5 = x.contentMd5
            this.expectedBucketOwner = x.expectedBucketOwner
            this.websiteConfiguration = x.websiteConfiguration
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.PutBucketWebsiteRequest = PutBucketWebsiteRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.WebsiteConfiguration] inside the given [block]
         */
        fun websiteConfiguration(block: aws.sdk.kotlin.services.s3.model.WebsiteConfiguration.Builder.() -> kotlin.Unit) {
            this.websiteConfiguration = aws.sdk.kotlin.services.s3.model.WebsiteConfiguration.invoke(block)
        }
    }
}
