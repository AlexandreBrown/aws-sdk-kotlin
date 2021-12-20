// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import aws.smithy.kotlin.runtime.time.Instant

class UploadPartCopyRequest private constructor(builder: Builder) {
    /**
     * The bucket name.
     * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
     * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
     */
    val bucket: kotlin.String? = builder.bucket
    /**
     * Specifies the source object for the copy operation. You specify the value in one of two
     * formats, depending on whether you want to access the source object through an <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">access point:
     * For objects not accessed through an access point, specify the name of the source
     * bucket and key of the source object, separated by a slash (/). For example, to copy
     * the object reports/january.pdf from the bucket
     * awsexamplebucket, use
     * awsexamplebucket/reports/january.pdf. The value must be URL
     * encoded.
     * For objects accessed through access points, specify the Amazon Resource Name (ARN) of the object as accessed through the access point, in the format arn:aws:s3:<Region>:<account-id>:accesspoint/<access-point-name>/object/<key>. For example, to copy the object reports/january.pdf through access point my-access-point owned by account 123456789012 in Region us-west-2, use the URL encoding of arn:aws:s3:us-west-2:123456789012:accesspoint/my-access-point/object/reports/january.pdf. The value must be URL encoded.
     * Amazon S3 supports copy operations using access points only when the source and destination buckets are in the same Amazon Web Services Region.
     * Alternatively, for objects accessed through Amazon S3 on Outposts, specify the ARN of the object as accessed in the format arn:aws:s3-outposts:<Region>:<account-id>:outpost/<outpost-id>/object/<key>. For example, to copy the object reports/january.pdf through outpost my-outpost owned by account 123456789012 in Region us-west-2, use the URL encoding of arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/object/reports/january.pdf. The value must be URL encoded.
     * To copy a specific version of an object, append ?versionId=<version-id>
     * to the value (for example,
     * awsexamplebucket/reports/january.pdf?versionId=QUpfdndhfd8438MNFDN93jdnJFkdmqnh893).
     * If you don't specify a version ID, Amazon S3 copies the latest version of the source
     * object.
     */
    val copySource: kotlin.String? = builder.copySource
    /**
     * Copies the object if its entity tag (ETag) matches the specified tag.
     */
    val copySourceIfMatch: kotlin.String? = builder.copySourceIfMatch
    /**
     * Copies the object if it has been modified since the specified time.
     */
    val copySourceIfModifiedSince: aws.smithy.kotlin.runtime.time.Instant? = builder.copySourceIfModifiedSince
    /**
     * Copies the object if its entity tag (ETag) is different than the specified ETag.
     */
    val copySourceIfNoneMatch: kotlin.String? = builder.copySourceIfNoneMatch
    /**
     * Copies the object if it hasn't been modified since the specified time.
     */
    val copySourceIfUnmodifiedSince: aws.smithy.kotlin.runtime.time.Instant? = builder.copySourceIfUnmodifiedSince
    /**
     * The range of bytes to copy from the source object. The range value must use the form
     * bytes=first-last, where the first and last are the zero-based byte offsets to copy. For
     * example, bytes=0-9 indicates that you want to copy the first 10 bytes of the source. You
     * can copy a range only if the source object is greater than 5 MB.
     */
    val copySourceRange: kotlin.String? = builder.copySourceRange
    /**
     * Specifies the algorithm to use when decrypting the source object (for example,
     * AES256).
     */
    val copySourceSseCustomerAlgorithm: kotlin.String? = builder.copySourceSseCustomerAlgorithm
    /**
     * Specifies the customer-provided encryption key for Amazon S3 to use to decrypt the source
     * object. The encryption key provided in this header must be one that was used when the
     * source object was created.
     */
    val copySourceSseCustomerKey: kotlin.String? = builder.copySourceSseCustomerKey
    /**
     * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses
     * this header for a message integrity check to ensure that the encryption key was transmitted
     * without error.
     */
    val copySourceSseCustomerKeyMd5: kotlin.String? = builder.copySourceSseCustomerKeyMd5
    /**
     * The account ID of the expected destination bucket owner. If the destination bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     */
    val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner
    /**
     * The account ID of the expected source bucket owner. If the source bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     */
    val expectedSourceBucketOwner: kotlin.String? = builder.expectedSourceBucketOwner
    /**
     * Object key for which the multipart upload was initiated.
     */
    val key: kotlin.String? = builder.key
    /**
     * Part number of part being copied. This is a positive integer between 1 and
     * 10,000.
     */
    val partNumber: kotlin.Int = builder.partNumber
    /**
     * Confirms that the requester knows that they will be charged for the request. Bucket
     * owners need not specify this parameter in their requests. For information about downloading
     * objects from requester pays buckets, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html">Downloading Objects in
     * Requestor Pays Buckets in the Amazon S3 User Guide.
     */
    val requestPayer: aws.sdk.kotlin.services.s3.model.RequestPayer? = builder.requestPayer
    /**
     * Specifies the algorithm to use to when encrypting the object (for example,
     * AES256).
     */
    val sseCustomerAlgorithm: kotlin.String? = builder.sseCustomerAlgorithm
    /**
     * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This
     * value is used to store the object and then it is discarded; Amazon S3 does not store the
     * encryption key. The key must be appropriate for use with the algorithm specified in the
     * x-amz-server-side-encryption-customer-algorithm header. This must be the
     * same encryption key specified in the initiate multipart upload request.
     */
    val sseCustomerKey: kotlin.String? = builder.sseCustomerKey
    /**
     * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses
     * this header for a message integrity check to ensure that the encryption key was transmitted
     * without error.
     */
    val sseCustomerKeyMd5: kotlin.String? = builder.sseCustomerKeyMd5
    /**
     * Upload ID identifying the multipart upload whose part is being copied.
     */
    val uploadId: kotlin.String? = builder.uploadId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.UploadPartCopyRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("UploadPartCopyRequest(")
        append("bucket=$bucket,")
        append("copySource=$copySource,")
        append("copySourceIfMatch=$copySourceIfMatch,")
        append("copySourceIfModifiedSince=$copySourceIfModifiedSince,")
        append("copySourceIfNoneMatch=$copySourceIfNoneMatch,")
        append("copySourceIfUnmodifiedSince=$copySourceIfUnmodifiedSince,")
        append("copySourceRange=$copySourceRange,")
        append("copySourceSseCustomerAlgorithm=$copySourceSseCustomerAlgorithm,")
        append("copySourceSseCustomerKey=*** Sensitive Data Redacted ***,")
        append("copySourceSseCustomerKeyMd5=$copySourceSseCustomerKeyMd5,")
        append("expectedBucketOwner=$expectedBucketOwner,")
        append("expectedSourceBucketOwner=$expectedSourceBucketOwner,")
        append("key=$key,")
        append("partNumber=$partNumber,")
        append("requestPayer=$requestPayer,")
        append("sseCustomerAlgorithm=$sseCustomerAlgorithm,")
        append("sseCustomerKey=*** Sensitive Data Redacted ***,")
        append("sseCustomerKeyMd5=$sseCustomerKeyMd5,")
        append("uploadId=$uploadId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (copySource?.hashCode() ?: 0)
        result = 31 * result + (copySourceIfMatch?.hashCode() ?: 0)
        result = 31 * result + (copySourceIfModifiedSince?.hashCode() ?: 0)
        result = 31 * result + (copySourceIfNoneMatch?.hashCode() ?: 0)
        result = 31 * result + (copySourceIfUnmodifiedSince?.hashCode() ?: 0)
        result = 31 * result + (copySourceRange?.hashCode() ?: 0)
        result = 31 * result + (copySourceSseCustomerAlgorithm?.hashCode() ?: 0)
        result = 31 * result + (copySourceSseCustomerKey?.hashCode() ?: 0)
        result = 31 * result + (copySourceSseCustomerKeyMd5?.hashCode() ?: 0)
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (expectedSourceBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (key?.hashCode() ?: 0)
        result = 31 * result + (partNumber)
        result = 31 * result + (requestPayer?.hashCode() ?: 0)
        result = 31 * result + (sseCustomerAlgorithm?.hashCode() ?: 0)
        result = 31 * result + (sseCustomerKey?.hashCode() ?: 0)
        result = 31 * result + (sseCustomerKeyMd5?.hashCode() ?: 0)
        result = 31 * result + (uploadId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as UploadPartCopyRequest

        if (bucket != other.bucket) return false
        if (copySource != other.copySource) return false
        if (copySourceIfMatch != other.copySourceIfMatch) return false
        if (copySourceIfModifiedSince != other.copySourceIfModifiedSince) return false
        if (copySourceIfNoneMatch != other.copySourceIfNoneMatch) return false
        if (copySourceIfUnmodifiedSince != other.copySourceIfUnmodifiedSince) return false
        if (copySourceRange != other.copySourceRange) return false
        if (copySourceSseCustomerAlgorithm != other.copySourceSseCustomerAlgorithm) return false
        if (copySourceSseCustomerKey != other.copySourceSseCustomerKey) return false
        if (copySourceSseCustomerKeyMd5 != other.copySourceSseCustomerKeyMd5) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false
        if (expectedSourceBucketOwner != other.expectedSourceBucketOwner) return false
        if (key != other.key) return false
        if (partNumber != other.partNumber) return false
        if (requestPayer != other.requestPayer) return false
        if (sseCustomerAlgorithm != other.sseCustomerAlgorithm) return false
        if (sseCustomerKey != other.sseCustomerKey) return false
        if (sseCustomerKeyMd5 != other.sseCustomerKeyMd5) return false
        if (uploadId != other.uploadId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.UploadPartCopyRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The bucket name.
         * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
         * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
         */
        var bucket: kotlin.String? = null
        /**
         * Specifies the source object for the copy operation. You specify the value in one of two
         * formats, depending on whether you want to access the source object through an <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-points.html">access point:
         * For objects not accessed through an access point, specify the name of the source
         * bucket and key of the source object, separated by a slash (/). For example, to copy
         * the object reports/january.pdf from the bucket
         * awsexamplebucket, use
         * awsexamplebucket/reports/january.pdf. The value must be URL
         * encoded.
         * For objects accessed through access points, specify the Amazon Resource Name (ARN) of the object as accessed through the access point, in the format arn:aws:s3:<Region>:<account-id>:accesspoint/<access-point-name>/object/<key>. For example, to copy the object reports/january.pdf through access point my-access-point owned by account 123456789012 in Region us-west-2, use the URL encoding of arn:aws:s3:us-west-2:123456789012:accesspoint/my-access-point/object/reports/january.pdf. The value must be URL encoded.
         * Amazon S3 supports copy operations using access points only when the source and destination buckets are in the same Amazon Web Services Region.
         * Alternatively, for objects accessed through Amazon S3 on Outposts, specify the ARN of the object as accessed in the format arn:aws:s3-outposts:<Region>:<account-id>:outpost/<outpost-id>/object/<key>. For example, to copy the object reports/january.pdf through outpost my-outpost owned by account 123456789012 in Region us-west-2, use the URL encoding of arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/object/reports/january.pdf. The value must be URL encoded.
         * To copy a specific version of an object, append ?versionId=<version-id>
         * to the value (for example,
         * awsexamplebucket/reports/january.pdf?versionId=QUpfdndhfd8438MNFDN93jdnJFkdmqnh893).
         * If you don't specify a version ID, Amazon S3 copies the latest version of the source
         * object.
         */
        var copySource: kotlin.String? = null
        /**
         * Copies the object if its entity tag (ETag) matches the specified tag.
         */
        var copySourceIfMatch: kotlin.String? = null
        /**
         * Copies the object if it has been modified since the specified time.
         */
        var copySourceIfModifiedSince: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * Copies the object if its entity tag (ETag) is different than the specified ETag.
         */
        var copySourceIfNoneMatch: kotlin.String? = null
        /**
         * Copies the object if it hasn't been modified since the specified time.
         */
        var copySourceIfUnmodifiedSince: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The range of bytes to copy from the source object. The range value must use the form
         * bytes=first-last, where the first and last are the zero-based byte offsets to copy. For
         * example, bytes=0-9 indicates that you want to copy the first 10 bytes of the source. You
         * can copy a range only if the source object is greater than 5 MB.
         */
        var copySourceRange: kotlin.String? = null
        /**
         * Specifies the algorithm to use when decrypting the source object (for example,
         * AES256).
         */
        var copySourceSseCustomerAlgorithm: kotlin.String? = null
        /**
         * Specifies the customer-provided encryption key for Amazon S3 to use to decrypt the source
         * object. The encryption key provided in this header must be one that was used when the
         * source object was created.
         */
        var copySourceSseCustomerKey: kotlin.String? = null
        /**
         * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses
         * this header for a message integrity check to ensure that the encryption key was transmitted
         * without error.
         */
        var copySourceSseCustomerKeyMd5: kotlin.String? = null
        /**
         * The account ID of the expected destination bucket owner. If the destination bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        var expectedBucketOwner: kotlin.String? = null
        /**
         * The account ID of the expected source bucket owner. If the source bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        var expectedSourceBucketOwner: kotlin.String? = null
        /**
         * Object key for which the multipart upload was initiated.
         */
        var key: kotlin.String? = null
        /**
         * Part number of part being copied. This is a positive integer between 1 and
         * 10,000.
         */
        var partNumber: kotlin.Int = 0
        /**
         * Confirms that the requester knows that they will be charged for the request. Bucket
         * owners need not specify this parameter in their requests. For information about downloading
         * objects from requester pays buckets, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html">Downloading Objects in
         * Requestor Pays Buckets in the Amazon S3 User Guide.
         */
        var requestPayer: aws.sdk.kotlin.services.s3.model.RequestPayer? = null
        /**
         * Specifies the algorithm to use to when encrypting the object (for example,
         * AES256).
         */
        var sseCustomerAlgorithm: kotlin.String? = null
        /**
         * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This
         * value is used to store the object and then it is discarded; Amazon S3 does not store the
         * encryption key. The key must be appropriate for use with the algorithm specified in the
         * x-amz-server-side-encryption-customer-algorithm header. This must be the
         * same encryption key specified in the initiate multipart upload request.
         */
        var sseCustomerKey: kotlin.String? = null
        /**
         * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses
         * this header for a message integrity check to ensure that the encryption key was transmitted
         * without error.
         */
        var sseCustomerKeyMd5: kotlin.String? = null
        /**
         * Upload ID identifying the multipart upload whose part is being copied.
         */
        var uploadId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.UploadPartCopyRequest) : this() {
            this.bucket = x.bucket
            this.copySource = x.copySource
            this.copySourceIfMatch = x.copySourceIfMatch
            this.copySourceIfModifiedSince = x.copySourceIfModifiedSince
            this.copySourceIfNoneMatch = x.copySourceIfNoneMatch
            this.copySourceIfUnmodifiedSince = x.copySourceIfUnmodifiedSince
            this.copySourceRange = x.copySourceRange
            this.copySourceSseCustomerAlgorithm = x.copySourceSseCustomerAlgorithm
            this.copySourceSseCustomerKey = x.copySourceSseCustomerKey
            this.copySourceSseCustomerKeyMd5 = x.copySourceSseCustomerKeyMd5
            this.expectedBucketOwner = x.expectedBucketOwner
            this.expectedSourceBucketOwner = x.expectedSourceBucketOwner
            this.key = x.key
            this.partNumber = x.partNumber
            this.requestPayer = x.requestPayer
            this.sseCustomerAlgorithm = x.sseCustomerAlgorithm
            this.sseCustomerKey = x.sseCustomerKey
            this.sseCustomerKeyMd5 = x.sseCustomerKeyMd5
            this.uploadId = x.uploadId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.UploadPartCopyRequest = UploadPartCopyRequest(this)
    }
}