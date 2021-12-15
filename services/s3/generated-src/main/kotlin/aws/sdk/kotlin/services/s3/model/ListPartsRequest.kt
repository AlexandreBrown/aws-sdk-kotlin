// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class ListPartsRequest private constructor(builder: Builder) {
    /**
     * The name of the bucket to which the parts are being uploaded.
     * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
     * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
     */
    val bucket: kotlin.String? = builder.bucket
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     */
    val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner
    /**
     * Object key for which the multipart upload was initiated.
     */
    val key: kotlin.String? = builder.key
    /**
     * Sets the maximum number of parts to return.
     */
    val maxParts: kotlin.Int = builder.maxParts
    /**
     * Specifies the part after which listing should begin. Only parts with higher part numbers
     * will be listed.
     */
    val partNumberMarker: kotlin.String? = builder.partNumberMarker
    /**
     * Confirms that the requester knows that they will be charged for the request. Bucket
     * owners need not specify this parameter in their requests. For information about downloading
     * objects from requester pays buckets, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html">Downloading Objects in
     * Requestor Pays Buckets in the Amazon S3 User Guide.
     */
    val requestPayer: aws.sdk.kotlin.services.s3.model.RequestPayer? = builder.requestPayer
    /**
     * Upload ID identifying the multipart upload whose parts are being listed.
     */
    val uploadId: kotlin.String? = builder.uploadId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.ListPartsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ListPartsRequest(")
        append("bucket=$bucket,")
        append("expectedBucketOwner=$expectedBucketOwner,")
        append("key=$key,")
        append("maxParts=$maxParts,")
        append("partNumberMarker=$partNumberMarker,")
        append("requestPayer=$requestPayer,")
        append("uploadId=$uploadId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (key?.hashCode() ?: 0)
        result = 31 * result + (maxParts)
        result = 31 * result + (partNumberMarker?.hashCode() ?: 0)
        result = 31 * result + (requestPayer?.hashCode() ?: 0)
        result = 31 * result + (uploadId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ListPartsRequest

        if (bucket != other.bucket) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false
        if (key != other.key) return false
        if (maxParts != other.maxParts) return false
        if (partNumberMarker != other.partNumberMarker) return false
        if (requestPayer != other.requestPayer) return false
        if (uploadId != other.uploadId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.ListPartsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of the bucket to which the parts are being uploaded.
         * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
         * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
         */
        var bucket: kotlin.String? = null
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        var expectedBucketOwner: kotlin.String? = null
        /**
         * Object key for which the multipart upload was initiated.
         */
        var key: kotlin.String? = null
        /**
         * Sets the maximum number of parts to return.
         */
        var maxParts: kotlin.Int = 0
        /**
         * Specifies the part after which listing should begin. Only parts with higher part numbers
         * will be listed.
         */
        var partNumberMarker: kotlin.String? = null
        /**
         * Confirms that the requester knows that they will be charged for the request. Bucket
         * owners need not specify this parameter in their requests. For information about downloading
         * objects from requester pays buckets, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html">Downloading Objects in
         * Requestor Pays Buckets in the Amazon S3 User Guide.
         */
        var requestPayer: aws.sdk.kotlin.services.s3.model.RequestPayer? = null
        /**
         * Upload ID identifying the multipart upload whose parts are being listed.
         */
        var uploadId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.ListPartsRequest) : this() {
            this.bucket = x.bucket
            this.expectedBucketOwner = x.expectedBucketOwner
            this.key = x.key
            this.maxParts = x.maxParts
            this.partNumberMarker = x.partNumberMarker
            this.requestPayer = x.requestPayer
            this.uploadId = x.uploadId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.ListPartsRequest = ListPartsRequest(this)
    }
}
