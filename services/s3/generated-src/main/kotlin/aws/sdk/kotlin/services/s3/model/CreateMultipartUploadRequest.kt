// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import aws.smithy.kotlin.runtime.time.Instant

class CreateMultipartUploadRequest private constructor(builder: Builder) {
    /**
     * The canned ACL to apply to the object.
     * This action is not supported by Amazon S3 on Outposts.
     */
    val acl: aws.sdk.kotlin.services.s3.model.ObjectCannedAcl? = builder.acl
    /**
     * The name of the bucket to which to initiate the upload
     * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
     * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
     */
    val bucket: kotlin.String? = builder.bucket
    /**
     * Specifies whether Amazon S3 should use an S3 Bucket Key for object encryption with server-side encryption using AWS KMS (SSE-KMS). Setting this header to true causes Amazon S3 to use an S3 Bucket Key for object encryption with SSE-KMS.
     * Specifying this header with an object action doesn’t affect bucket-level settings for S3 Bucket Key.
     */
    val bucketKeyEnabled: kotlin.Boolean = builder.bucketKeyEnabled
    /**
     * Specifies caching behavior along the request/reply chain.
     */
    val cacheControl: kotlin.String? = builder.cacheControl
    /**
     * Specifies presentational information for the object.
     */
    val contentDisposition: kotlin.String? = builder.contentDisposition
    /**
     * Specifies what content encodings have been applied to the object and thus what decoding
     * mechanisms must be applied to obtain the media-type referenced by the Content-Type header
     * field.
     */
    val contentEncoding: kotlin.String? = builder.contentEncoding
    /**
     * The language the content is in.
     */
    val contentLanguage: kotlin.String? = builder.contentLanguage
    /**
     * A standard MIME type describing the format of the object data.
     */
    val contentType: kotlin.String? = builder.contentType
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     */
    val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner
    /**
     * The date and time at which the object is no longer cacheable.
     */
    val expires: aws.smithy.kotlin.runtime.time.Instant? = builder.expires
    /**
     * Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the
     * object.
     * This action is not supported by Amazon S3 on Outposts.
     */
    val grantFullControl: kotlin.String? = builder.grantFullControl
    /**
     * Allows grantee to read the object data and its
     * metadata.
     * This action is not supported by Amazon S3 on Outposts.
     */
    val grantRead: kotlin.String? = builder.grantRead
    /**
     * Allows grantee to read the object ACL.
     * This action is not supported by Amazon S3 on Outposts.
     */
    val grantReadAcp: kotlin.String? = builder.grantReadAcp
    /**
     * Allows grantee to write the ACL for the applicable
     * object.
     * This action is not supported by Amazon S3 on Outposts.
     */
    val grantWriteAcp: kotlin.String? = builder.grantWriteAcp
    /**
     * Object key for which the multipart upload is to be initiated.
     */
    val key: kotlin.String? = builder.key
    /**
     * A map of metadata to store with the object in S3.
     */
    val metadata: Map<String, String>? = builder.metadata
    /**
     * Specifies whether you want to apply a Legal Hold to the uploaded object.
     */
    val objectLockLegalHoldStatus: aws.sdk.kotlin.services.s3.model.ObjectLockLegalHoldStatus? = builder.objectLockLegalHoldStatus
    /**
     * Specifies the Object Lock mode that you want to apply to the uploaded object.
     */
    val objectLockMode: aws.sdk.kotlin.services.s3.model.ObjectLockMode? = builder.objectLockMode
    /**
     * Specifies the date and time when you want the Object Lock to expire.
     */
    val objectLockRetainUntilDate: aws.smithy.kotlin.runtime.time.Instant? = builder.objectLockRetainUntilDate
    /**
     * Confirms that the requester knows that they will be charged for the request. Bucket
     * owners need not specify this parameter in their requests. For information about downloading
     * objects from requester pays buckets, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html">Downloading Objects in
     * Requestor Pays Buckets in the Amazon S3 User Guide.
     */
    val requestPayer: aws.sdk.kotlin.services.s3.model.RequestPayer? = builder.requestPayer
    /**
     * The server-side encryption algorithm used when storing this object in Amazon S3 (for example,
     * AES256, aws:kms).
     */
    val serverSideEncryption: aws.sdk.kotlin.services.s3.model.ServerSideEncryption? = builder.serverSideEncryption
    /**
     * Specifies the algorithm to use to when encrypting the object (for example,
     * AES256).
     */
    val sseCustomerAlgorithm: kotlin.String? = builder.sseCustomerAlgorithm
    /**
     * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This
     * value is used to store the object and then it is discarded; Amazon S3 does not store the
     * encryption key. The key must be appropriate for use with the algorithm specified in the
     * x-amz-server-side-encryption-customer-algorithm header.
     */
    val sseCustomerKey: kotlin.String? = builder.sseCustomerKey
    /**
     * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses
     * this header for a message integrity check to ensure that the encryption key was transmitted
     * without error.
     */
    val sseCustomerKeyMd5: kotlin.String? = builder.sseCustomerKeyMd5
    /**
     * Specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The value of this
     * header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value
     * pairs.
     */
    val ssekmsEncryptionContext: kotlin.String? = builder.ssekmsEncryptionContext
    /**
     * Specifies the ID of the symmetric customer managed key to use for object
     * encryption. All GET and PUT requests for an object protected by Amazon Web Services KMS will fail if not
     * made via SSL or using SigV4. For information about configuring using any of the officially
     * supported Amazon Web Services SDKs and Amazon Web Services CLI, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version">Specifying the Signature Version in Request Authentication
     * in the Amazon S3 User Guide.
     */
    val ssekmsKeyId: kotlin.String? = builder.ssekmsKeyId
    /**
     * By default, Amazon S3 uses the STANDARD Storage Class to store newly created objects. The
     * STANDARD storage class provides high durability and high availability. Depending on
     * performance needs, you can specify a different Storage Class. Amazon S3 on Outposts only uses
     * the OUTPOSTS Storage Class. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes in the
     * Amazon S3 User Guide.
     */
    val storageClass: aws.sdk.kotlin.services.s3.model.StorageClass? = builder.storageClass
    /**
     * The tag-set for the object. The tag-set must be encoded as URL Query parameters.
     */
    val tagging: kotlin.String? = builder.tagging
    /**
     * If the bucket is configured as a website, redirects requests for this object to another
     * object in the same bucket or to an external URL. Amazon S3 stores the value of this header in
     * the object metadata.
     */
    val websiteRedirectLocation: kotlin.String? = builder.websiteRedirectLocation

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.CreateMultipartUploadRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateMultipartUploadRequest(")
        append("acl=$acl,")
        append("bucket=$bucket,")
        append("bucketKeyEnabled=$bucketKeyEnabled,")
        append("cacheControl=$cacheControl,")
        append("contentDisposition=$contentDisposition,")
        append("contentEncoding=$contentEncoding,")
        append("contentLanguage=$contentLanguage,")
        append("contentType=$contentType,")
        append("expectedBucketOwner=$expectedBucketOwner,")
        append("expires=$expires,")
        append("grantFullControl=$grantFullControl,")
        append("grantRead=$grantRead,")
        append("grantReadAcp=$grantReadAcp,")
        append("grantWriteAcp=$grantWriteAcp,")
        append("key=$key,")
        append("metadata=$metadata,")
        append("objectLockLegalHoldStatus=$objectLockLegalHoldStatus,")
        append("objectLockMode=$objectLockMode,")
        append("objectLockRetainUntilDate=$objectLockRetainUntilDate,")
        append("requestPayer=$requestPayer,")
        append("serverSideEncryption=$serverSideEncryption,")
        append("sseCustomerAlgorithm=$sseCustomerAlgorithm,")
        append("sseCustomerKey=*** Sensitive Data Redacted ***,")
        append("sseCustomerKeyMd5=$sseCustomerKeyMd5,")
        append("ssekmsEncryptionContext=*** Sensitive Data Redacted ***,")
        append("ssekmsKeyId=*** Sensitive Data Redacted ***,")
        append("storageClass=$storageClass,")
        append("tagging=$tagging,")
        append("websiteRedirectLocation=$websiteRedirectLocation)")
    }

    override fun hashCode(): kotlin.Int {
        var result = acl?.hashCode() ?: 0
        result = 31 * result + (bucket?.hashCode() ?: 0)
        result = 31 * result + (bucketKeyEnabled.hashCode())
        result = 31 * result + (cacheControl?.hashCode() ?: 0)
        result = 31 * result + (contentDisposition?.hashCode() ?: 0)
        result = 31 * result + (contentEncoding?.hashCode() ?: 0)
        result = 31 * result + (contentLanguage?.hashCode() ?: 0)
        result = 31 * result + (contentType?.hashCode() ?: 0)
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (expires?.hashCode() ?: 0)
        result = 31 * result + (grantFullControl?.hashCode() ?: 0)
        result = 31 * result + (grantRead?.hashCode() ?: 0)
        result = 31 * result + (grantReadAcp?.hashCode() ?: 0)
        result = 31 * result + (grantWriteAcp?.hashCode() ?: 0)
        result = 31 * result + (key?.hashCode() ?: 0)
        result = 31 * result + (metadata?.hashCode() ?: 0)
        result = 31 * result + (objectLockLegalHoldStatus?.hashCode() ?: 0)
        result = 31 * result + (objectLockMode?.hashCode() ?: 0)
        result = 31 * result + (objectLockRetainUntilDate?.hashCode() ?: 0)
        result = 31 * result + (requestPayer?.hashCode() ?: 0)
        result = 31 * result + (serverSideEncryption?.hashCode() ?: 0)
        result = 31 * result + (sseCustomerAlgorithm?.hashCode() ?: 0)
        result = 31 * result + (sseCustomerKey?.hashCode() ?: 0)
        result = 31 * result + (sseCustomerKeyMd5?.hashCode() ?: 0)
        result = 31 * result + (ssekmsEncryptionContext?.hashCode() ?: 0)
        result = 31 * result + (ssekmsKeyId?.hashCode() ?: 0)
        result = 31 * result + (storageClass?.hashCode() ?: 0)
        result = 31 * result + (tagging?.hashCode() ?: 0)
        result = 31 * result + (websiteRedirectLocation?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateMultipartUploadRequest

        if (acl != other.acl) return false
        if (bucket != other.bucket) return false
        if (bucketKeyEnabled != other.bucketKeyEnabled) return false
        if (cacheControl != other.cacheControl) return false
        if (contentDisposition != other.contentDisposition) return false
        if (contentEncoding != other.contentEncoding) return false
        if (contentLanguage != other.contentLanguage) return false
        if (contentType != other.contentType) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false
        if (expires != other.expires) return false
        if (grantFullControl != other.grantFullControl) return false
        if (grantRead != other.grantRead) return false
        if (grantReadAcp != other.grantReadAcp) return false
        if (grantWriteAcp != other.grantWriteAcp) return false
        if (key != other.key) return false
        if (metadata != other.metadata) return false
        if (objectLockLegalHoldStatus != other.objectLockLegalHoldStatus) return false
        if (objectLockMode != other.objectLockMode) return false
        if (objectLockRetainUntilDate != other.objectLockRetainUntilDate) return false
        if (requestPayer != other.requestPayer) return false
        if (serverSideEncryption != other.serverSideEncryption) return false
        if (sseCustomerAlgorithm != other.sseCustomerAlgorithm) return false
        if (sseCustomerKey != other.sseCustomerKey) return false
        if (sseCustomerKeyMd5 != other.sseCustomerKeyMd5) return false
        if (ssekmsEncryptionContext != other.ssekmsEncryptionContext) return false
        if (ssekmsKeyId != other.ssekmsKeyId) return false
        if (storageClass != other.storageClass) return false
        if (tagging != other.tagging) return false
        if (websiteRedirectLocation != other.websiteRedirectLocation) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.CreateMultipartUploadRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The canned ACL to apply to the object.
         * This action is not supported by Amazon S3 on Outposts.
         */
        var acl: aws.sdk.kotlin.services.s3.model.ObjectCannedAcl? = null
        /**
         * The name of the bucket to which to initiate the upload
         * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
         * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
         */
        var bucket: kotlin.String? = null
        /**
         * Specifies whether Amazon S3 should use an S3 Bucket Key for object encryption with server-side encryption using AWS KMS (SSE-KMS). Setting this header to true causes Amazon S3 to use an S3 Bucket Key for object encryption with SSE-KMS.
         * Specifying this header with an object action doesn’t affect bucket-level settings for S3 Bucket Key.
         */
        var bucketKeyEnabled: kotlin.Boolean = false
        /**
         * Specifies caching behavior along the request/reply chain.
         */
        var cacheControl: kotlin.String? = null
        /**
         * Specifies presentational information for the object.
         */
        var contentDisposition: kotlin.String? = null
        /**
         * Specifies what content encodings have been applied to the object and thus what decoding
         * mechanisms must be applied to obtain the media-type referenced by the Content-Type header
         * field.
         */
        var contentEncoding: kotlin.String? = null
        /**
         * The language the content is in.
         */
        var contentLanguage: kotlin.String? = null
        /**
         * A standard MIME type describing the format of the object data.
         */
        var contentType: kotlin.String? = null
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        var expectedBucketOwner: kotlin.String? = null
        /**
         * The date and time at which the object is no longer cacheable.
         */
        var expires: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * Gives the grantee READ, READ_ACP, and WRITE_ACP permissions on the
         * object.
         * This action is not supported by Amazon S3 on Outposts.
         */
        var grantFullControl: kotlin.String? = null
        /**
         * Allows grantee to read the object data and its
         * metadata.
         * This action is not supported by Amazon S3 on Outposts.
         */
        var grantRead: kotlin.String? = null
        /**
         * Allows grantee to read the object ACL.
         * This action is not supported by Amazon S3 on Outposts.
         */
        var grantReadAcp: kotlin.String? = null
        /**
         * Allows grantee to write the ACL for the applicable
         * object.
         * This action is not supported by Amazon S3 on Outposts.
         */
        var grantWriteAcp: kotlin.String? = null
        /**
         * Object key for which the multipart upload is to be initiated.
         */
        var key: kotlin.String? = null
        /**
         * A map of metadata to store with the object in S3.
         */
        var metadata: Map<String, String>? = null
        /**
         * Specifies whether you want to apply a Legal Hold to the uploaded object.
         */
        var objectLockLegalHoldStatus: aws.sdk.kotlin.services.s3.model.ObjectLockLegalHoldStatus? = null
        /**
         * Specifies the Object Lock mode that you want to apply to the uploaded object.
         */
        var objectLockMode: aws.sdk.kotlin.services.s3.model.ObjectLockMode? = null
        /**
         * Specifies the date and time when you want the Object Lock to expire.
         */
        var objectLockRetainUntilDate: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * Confirms that the requester knows that they will be charged for the request. Bucket
         * owners need not specify this parameter in their requests. For information about downloading
         * objects from requester pays buckets, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/ObjectsinRequesterPaysBuckets.html">Downloading Objects in
         * Requestor Pays Buckets in the Amazon S3 User Guide.
         */
        var requestPayer: aws.sdk.kotlin.services.s3.model.RequestPayer? = null
        /**
         * The server-side encryption algorithm used when storing this object in Amazon S3 (for example,
         * AES256, aws:kms).
         */
        var serverSideEncryption: aws.sdk.kotlin.services.s3.model.ServerSideEncryption? = null
        /**
         * Specifies the algorithm to use to when encrypting the object (for example,
         * AES256).
         */
        var sseCustomerAlgorithm: kotlin.String? = null
        /**
         * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This
         * value is used to store the object and then it is discarded; Amazon S3 does not store the
         * encryption key. The key must be appropriate for use with the algorithm specified in the
         * x-amz-server-side-encryption-customer-algorithm header.
         */
        var sseCustomerKey: kotlin.String? = null
        /**
         * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses
         * this header for a message integrity check to ensure that the encryption key was transmitted
         * without error.
         */
        var sseCustomerKeyMd5: kotlin.String? = null
        /**
         * Specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The value of this
         * header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value
         * pairs.
         */
        var ssekmsEncryptionContext: kotlin.String? = null
        /**
         * Specifies the ID of the symmetric customer managed key to use for object
         * encryption. All GET and PUT requests for an object protected by Amazon Web Services KMS will fail if not
         * made via SSL or using SigV4. For information about configuring using any of the officially
         * supported Amazon Web Services SDKs and Amazon Web Services CLI, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UsingAWSSDK.html#specify-signature-version">Specifying the Signature Version in Request Authentication
         * in the Amazon S3 User Guide.
         */
        var ssekmsKeyId: kotlin.String? = null
        /**
         * By default, Amazon S3 uses the STANDARD Storage Class to store newly created objects. The
         * STANDARD storage class provides high durability and high availability. Depending on
         * performance needs, you can specify a different Storage Class. Amazon S3 on Outposts only uses
         * the OUTPOSTS Storage Class. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/storage-class-intro.html">Storage Classes in the
         * Amazon S3 User Guide.
         */
        var storageClass: aws.sdk.kotlin.services.s3.model.StorageClass? = null
        /**
         * The tag-set for the object. The tag-set must be encoded as URL Query parameters.
         */
        var tagging: kotlin.String? = null
        /**
         * If the bucket is configured as a website, redirects requests for this object to another
         * object in the same bucket or to an external URL. Amazon S3 stores the value of this header in
         * the object metadata.
         */
        var websiteRedirectLocation: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.CreateMultipartUploadRequest) : this() {
            this.acl = x.acl
            this.bucket = x.bucket
            this.bucketKeyEnabled = x.bucketKeyEnabled
            this.cacheControl = x.cacheControl
            this.contentDisposition = x.contentDisposition
            this.contentEncoding = x.contentEncoding
            this.contentLanguage = x.contentLanguage
            this.contentType = x.contentType
            this.expectedBucketOwner = x.expectedBucketOwner
            this.expires = x.expires
            this.grantFullControl = x.grantFullControl
            this.grantRead = x.grantRead
            this.grantReadAcp = x.grantReadAcp
            this.grantWriteAcp = x.grantWriteAcp
            this.key = x.key
            this.metadata = x.metadata
            this.objectLockLegalHoldStatus = x.objectLockLegalHoldStatus
            this.objectLockMode = x.objectLockMode
            this.objectLockRetainUntilDate = x.objectLockRetainUntilDate
            this.requestPayer = x.requestPayer
            this.serverSideEncryption = x.serverSideEncryption
            this.sseCustomerAlgorithm = x.sseCustomerAlgorithm
            this.sseCustomerKey = x.sseCustomerKey
            this.sseCustomerKeyMd5 = x.sseCustomerKeyMd5
            this.ssekmsEncryptionContext = x.ssekmsEncryptionContext
            this.ssekmsKeyId = x.ssekmsKeyId
            this.storageClass = x.storageClass
            this.tagging = x.tagging
            this.websiteRedirectLocation = x.websiteRedirectLocation
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.CreateMultipartUploadRequest = CreateMultipartUploadRequest(this)
    }
}
