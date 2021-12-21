// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class PutObjectTaggingRequest private constructor(builder: Builder) {
    /**
     * The bucket name containing the object.
     * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
     * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
     */
    val bucket: kotlin.String? = builder.bucket
    /**
     * The MD5 hash for the request body.
     * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs, this field is calculated automatically.
     */
    val contentMd5: kotlin.String? = builder.contentMd5
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     */
    val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner
    /**
     * Name of the object key.
     */
    val key: kotlin.String? = builder.key
    /**
     * Confirms that the requester knows that they will be charged for the request. Bucket
     * owners need not specify this parameter in their requests. For information about downloading
     * objects from requester pays buckets, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html">Downloading Objects in
     * Requestor Pays Buckets in the Amazon S3 User Guide.
     */
    val requestPayer: aws.sdk.kotlin.services.s3.model.RequestPayer? = builder.requestPayer
    /**
     * Container for the TagSet and Tag elements
     */
    val tagging: aws.sdk.kotlin.services.s3.model.Tagging? = builder.tagging
    /**
     * The versionId of the object that the tag-set will be added to.
     */
    val versionId: kotlin.String? = builder.versionId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.PutObjectTaggingRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PutObjectTaggingRequest(")
        append("bucket=$bucket,")
        append("contentMd5=$contentMd5,")
        append("expectedBucketOwner=$expectedBucketOwner,")
        append("key=$key,")
        append("requestPayer=$requestPayer,")
        append("tagging=$tagging,")
        append("versionId=$versionId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (contentMd5?.hashCode() ?: 0)
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (key?.hashCode() ?: 0)
        result = 31 * result + (requestPayer?.hashCode() ?: 0)
        result = 31 * result + (tagging?.hashCode() ?: 0)
        result = 31 * result + (versionId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PutObjectTaggingRequest

        if (bucket != other.bucket) return false
        if (contentMd5 != other.contentMd5) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false
        if (key != other.key) return false
        if (requestPayer != other.requestPayer) return false
        if (tagging != other.tagging) return false
        if (versionId != other.versionId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.PutObjectTaggingRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The bucket name containing the object.
         * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
         * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
         */
        var bucket: kotlin.String? = null
        /**
         * The MD5 hash for the request body.
         * For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs, this field is calculated automatically.
         */
        var contentMd5: kotlin.String? = null
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        var expectedBucketOwner: kotlin.String? = null
        /**
         * Name of the object key.
         */
        var key: kotlin.String? = null
        /**
         * Confirms that the requester knows that they will be charged for the request. Bucket
         * owners need not specify this parameter in their requests. For information about downloading
         * objects from requester pays buckets, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html">Downloading Objects in
         * Requestor Pays Buckets in the Amazon S3 User Guide.
         */
        var requestPayer: aws.sdk.kotlin.services.s3.model.RequestPayer? = null
        /**
         * Container for the TagSet and Tag elements
         */
        var tagging: aws.sdk.kotlin.services.s3.model.Tagging? = null
        /**
         * The versionId of the object that the tag-set will be added to.
         */
        var versionId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.PutObjectTaggingRequest) : this() {
            this.bucket = x.bucket
            this.contentMd5 = x.contentMd5
            this.expectedBucketOwner = x.expectedBucketOwner
            this.key = x.key
            this.requestPayer = x.requestPayer
            this.tagging = x.tagging
            this.versionId = x.versionId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.PutObjectTaggingRequest = PutObjectTaggingRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.Tagging] inside the given [block]
         */
        fun tagging(block: aws.sdk.kotlin.services.s3.model.Tagging.Builder.() -> kotlin.Unit) {
            this.tagging = aws.sdk.kotlin.services.s3.model.Tagging.invoke(block)
        }
    }
}