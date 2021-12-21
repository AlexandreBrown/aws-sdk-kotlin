// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class PutBucketOwnershipControlsRequest private constructor(builder: Builder) {
    /**
     * The name of the Amazon S3 bucket whose OwnershipControls you want to set.
     */
    val bucket: kotlin.String? = builder.bucket
    /**
     * The MD5 hash of the OwnershipControls request body.
     * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs, this field is calculated automatically.
     */
    val contentMd5: kotlin.String? = builder.contentMd5
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     */
    val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner
    /**
     * The OwnershipControls (BucketOwnerEnforced, BucketOwnerPreferred, or ObjectWriter) that you want
     * to apply to this Amazon S3 bucket.
     */
    val ownershipControls: aws.sdk.kotlin.services.s3.model.OwnershipControls? = builder.ownershipControls

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.PutBucketOwnershipControlsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PutBucketOwnershipControlsRequest(")
        append("bucket=$bucket,")
        append("contentMd5=$contentMd5,")
        append("expectedBucketOwner=$expectedBucketOwner,")
        append("ownershipControls=$ownershipControls)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (contentMd5?.hashCode() ?: 0)
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (ownershipControls?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PutBucketOwnershipControlsRequest

        if (bucket != other.bucket) return false
        if (contentMd5 != other.contentMd5) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false
        if (ownershipControls != other.ownershipControls) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.PutBucketOwnershipControlsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of the Amazon S3 bucket whose OwnershipControls you want to set.
         */
        var bucket: kotlin.String? = null
        /**
         * The MD5 hash of the OwnershipControls request body.
         * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs, this field is calculated automatically.
         */
        var contentMd5: kotlin.String? = null
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        var expectedBucketOwner: kotlin.String? = null
        /**
         * The OwnershipControls (BucketOwnerEnforced, BucketOwnerPreferred, or ObjectWriter) that you want
         * to apply to this Amazon S3 bucket.
         */
        var ownershipControls: aws.sdk.kotlin.services.s3.model.OwnershipControls? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.PutBucketOwnershipControlsRequest) : this() {
            this.bucket = x.bucket
            this.contentMd5 = x.contentMd5
            this.expectedBucketOwner = x.expectedBucketOwner
            this.ownershipControls = x.ownershipControls
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.PutBucketOwnershipControlsRequest = PutBucketOwnershipControlsRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.OwnershipControls] inside the given [block]
         */
        fun ownershipControls(block: aws.sdk.kotlin.services.s3.model.OwnershipControls.Builder.() -> kotlin.Unit) {
            this.ownershipControls = aws.sdk.kotlin.services.s3.model.OwnershipControls.invoke(block)
        }
    }
}