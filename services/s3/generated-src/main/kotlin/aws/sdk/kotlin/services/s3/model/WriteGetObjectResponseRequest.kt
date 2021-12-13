// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import aws.smithy.kotlin.runtime.content.ByteStream
import aws.smithy.kotlin.runtime.time.Instant

class WriteGetObjectResponseRequest private constructor(builder: Builder) {
    /**
     * Indicates that a range of bytes was specified.
     */
    val acceptRanges: kotlin.String? = builder.acceptRanges
    /**
     * The object data.
     */
    val body: aws.smithy.kotlin.runtime.content.ByteStream? = builder.body
    /**
     * Indicates whether the object stored in Amazon S3 uses an S3 bucket key for server-side
     * encryption with Amazon Web Services KMS (SSE-KMS).
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
     * The size of the content body in bytes.
     */
    val contentLength: kotlin.Long = builder.contentLength
    /**
     * The portion of the object returned in the response.
     */
    val contentRange: kotlin.String? = builder.contentRange
    /**
     * A standard MIME type describing the format of the object data.
     */
    val contentType: kotlin.String? = builder.contentType
    /**
     * Specifies whether an object stored in Amazon S3 is (true) or is not
     * (false) a delete marker.
     */
    val deleteMarker: kotlin.Boolean = builder.deleteMarker
    /**
     * An opaque identifier assigned by a web server to a specific version of a resource found
     * at a URL.
     */
    val eTag: kotlin.String? = builder.eTag
    /**
     * A string that uniquely identifies an error condition. Returned in the <Code> tag
     * of the error XML response for a corresponding GetObject call. Cannot be used
     * with a successful StatusCode header or when the transformed object is provided
     * in the body. All error codes from S3 are sentence-cased. Regex value is "^&#91;A-Z&#93;&#91;a-zA-Z&#93;+$".
     */
    val errorCode: kotlin.String? = builder.errorCode
    /**
     * Contains a generic description of the error condition. Returned in the <Message>
     * tag of the error XML response for a corresponding GetObject call. Cannot be
     * used with a successful StatusCode header or when the transformed object is
     * provided in body.
     */
    val errorMessage: kotlin.String? = builder.errorMessage
    /**
     * If object stored in Amazon S3 expiration is configured (see PUT Bucket lifecycle) it includes expiry-date and rule-id key-value pairs providing object expiration information. The value of the rule-id is URL encoded.
     */
    val expiration: kotlin.String? = builder.expiration
    /**
     * The date and time at which the object is no longer cacheable.
     */
    val expires: aws.smithy.kotlin.runtime.time.Instant? = builder.expires
    /**
     * The date and time that the object was last modified.
     */
    val lastModified: aws.smithy.kotlin.runtime.time.Instant? = builder.lastModified
    /**
     * A map of metadata to store with the object in S3.
     */
    val metadata: Map<String, String>? = builder.metadata
    /**
     * Set to the number of metadata entries not returned in x-amz-meta headers.
     * This can happen if you create metadata using an API like SOAP that supports more flexible
     * metadata than the REST API. For example, using SOAP, you can create metadata whose values
     * are not legal HTTP headers.
     */
    val missingMeta: kotlin.Int = builder.missingMeta
    /**
     * Indicates whether an object stored in Amazon S3 has an active legal hold.
     */
    val objectLockLegalHoldStatus: aws.sdk.kotlin.services.s3.model.ObjectLockLegalHoldStatus? = builder.objectLockLegalHoldStatus
    /**
     * Indicates whether an object stored in Amazon S3 has Object Lock enabled. For more
     * information about S3 Object Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html">Object Lock.
     */
    val objectLockMode: aws.sdk.kotlin.services.s3.model.ObjectLockMode? = builder.objectLockMode
    /**
     * The date and time when Object Lock is configured to expire.
     */
    val objectLockRetainUntilDate: aws.smithy.kotlin.runtime.time.Instant? = builder.objectLockRetainUntilDate
    /**
     * The count of parts this object has.
     */
    val partsCount: kotlin.Int = builder.partsCount
    /**
     * Indicates if request involves bucket that is either a source or destination in a Replication rule. For more
     * information about S3 Replication, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication.html">Replication.
     */
    val replicationStatus: aws.sdk.kotlin.services.s3.model.ReplicationStatus? = builder.replicationStatus
    /**
     * If present, indicates that the requester was successfully charged for the
     * request.
     */
    val requestCharged: aws.sdk.kotlin.services.s3.model.RequestCharged? = builder.requestCharged
    /**
     * Route prefix to the HTTP URL generated.
     */
    val requestRoute: kotlin.String? = builder.requestRoute
    /**
     * A single use encrypted token that maps WriteGetObjectResponse to the end
     * user GetObject request.
     */
    val requestToken: kotlin.String? = builder.requestToken
    /**
     * Provides information about object restoration operation and expiration time of the
     * restored object copy.
     */
    val restore: kotlin.String? = builder.restore
    /**
     * The server-side encryption algorithm used when storing requested object in Amazon S3 (for example, AES256, aws:kms).
     */
    val serverSideEncryption: aws.sdk.kotlin.services.s3.model.ServerSideEncryption? = builder.serverSideEncryption
    /**
     * Encryption algorithm used if server-side encryption with a customer-provided encryption key was specified for object stored in Amazon S3.
     */
    val sseCustomerAlgorithm: kotlin.String? = builder.sseCustomerAlgorithm
    /**
     * 128-bit MD5 digest of customer-provided encryption key used in Amazon S3 to encrypt data
     * stored in S3. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerSideEncryptionCustomerKeys.html">Protecting data
     * using server-side encryption with customer-provided encryption keys
     * (SSE-C).
     */
    val sseCustomerKeyMd5: kotlin.String? = builder.sseCustomerKeyMd5
    /**
     * If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric customer managed key that was used for stored in Amazon S3 object.
     */
    val ssekmsKeyId: kotlin.String? = builder.ssekmsKeyId
    /**
     * The integer status code for an HTTP response of a corresponding GetObject
     * request.
     * <p class="title">
     * Status Codes
     * 200 - OK
     * 206 - Partial Content
     * 304 - Not Modified
     * 400 - Bad Request
     * 401 - Unauthorized
     * 403 - Forbidden
     * 404 - Not Found
     * 405 - Method Not Allowed
     * 409 - Conflict
     * 411 - Length Required
     * 412 - Precondition Failed
     * 416 - Range Not Satisfiable
     * 500 - Internal Server Error
     * 503 - Service Unavailable
     */
    val statusCode: kotlin.Int = builder.statusCode
    /**
     * The class of storage used to store object in Amazon S3.
     */
    val storageClass: aws.sdk.kotlin.services.s3.model.StorageClass? = builder.storageClass
    /**
     * The number of tags, if any, on the object.
     */
    val tagCount: kotlin.Int = builder.tagCount
    /**
     * An ID used to reference a specific version of the object.
     */
    val versionId: kotlin.String? = builder.versionId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.WriteGetObjectResponseRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("WriteGetObjectResponseRequest(")
        append("acceptRanges=$acceptRanges,")
        append("body=$body,")
        append("bucketKeyEnabled=$bucketKeyEnabled,")
        append("cacheControl=$cacheControl,")
        append("contentDisposition=$contentDisposition,")
        append("contentEncoding=$contentEncoding,")
        append("contentLanguage=$contentLanguage,")
        append("contentLength=$contentLength,")
        append("contentRange=$contentRange,")
        append("contentType=$contentType,")
        append("deleteMarker=$deleteMarker,")
        append("eTag=$eTag,")
        append("errorCode=$errorCode,")
        append("errorMessage=$errorMessage,")
        append("expiration=$expiration,")
        append("expires=$expires,")
        append("lastModified=$lastModified,")
        append("metadata=$metadata,")
        append("missingMeta=$missingMeta,")
        append("objectLockLegalHoldStatus=$objectLockLegalHoldStatus,")
        append("objectLockMode=$objectLockMode,")
        append("objectLockRetainUntilDate=$objectLockRetainUntilDate,")
        append("partsCount=$partsCount,")
        append("replicationStatus=$replicationStatus,")
        append("requestCharged=$requestCharged,")
        append("requestRoute=$requestRoute,")
        append("requestToken=$requestToken,")
        append("restore=$restore,")
        append("serverSideEncryption=$serverSideEncryption,")
        append("sseCustomerAlgorithm=$sseCustomerAlgorithm,")
        append("sseCustomerKeyMd5=$sseCustomerKeyMd5,")
        append("ssekmsKeyId=*** Sensitive Data Redacted ***,")
        append("statusCode=$statusCode,")
        append("storageClass=$storageClass,")
        append("tagCount=$tagCount,")
        append("versionId=$versionId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = acceptRanges?.hashCode() ?: 0
        result = 31 * result + (body?.hashCode() ?: 0)
        result = 31 * result + (bucketKeyEnabled.hashCode())
        result = 31 * result + (cacheControl?.hashCode() ?: 0)
        result = 31 * result + (contentDisposition?.hashCode() ?: 0)
        result = 31 * result + (contentEncoding?.hashCode() ?: 0)
        result = 31 * result + (contentLanguage?.hashCode() ?: 0)
        result = 31 * result + (contentLength.hashCode())
        result = 31 * result + (contentRange?.hashCode() ?: 0)
        result = 31 * result + (contentType?.hashCode() ?: 0)
        result = 31 * result + (deleteMarker.hashCode())
        result = 31 * result + (eTag?.hashCode() ?: 0)
        result = 31 * result + (errorCode?.hashCode() ?: 0)
        result = 31 * result + (errorMessage?.hashCode() ?: 0)
        result = 31 * result + (expiration?.hashCode() ?: 0)
        result = 31 * result + (expires?.hashCode() ?: 0)
        result = 31 * result + (lastModified?.hashCode() ?: 0)
        result = 31 * result + (metadata?.hashCode() ?: 0)
        result = 31 * result + (missingMeta)
        result = 31 * result + (objectLockLegalHoldStatus?.hashCode() ?: 0)
        result = 31 * result + (objectLockMode?.hashCode() ?: 0)
        result = 31 * result + (objectLockRetainUntilDate?.hashCode() ?: 0)
        result = 31 * result + (partsCount)
        result = 31 * result + (replicationStatus?.hashCode() ?: 0)
        result = 31 * result + (requestCharged?.hashCode() ?: 0)
        result = 31 * result + (requestRoute?.hashCode() ?: 0)
        result = 31 * result + (requestToken?.hashCode() ?: 0)
        result = 31 * result + (restore?.hashCode() ?: 0)
        result = 31 * result + (serverSideEncryption?.hashCode() ?: 0)
        result = 31 * result + (sseCustomerAlgorithm?.hashCode() ?: 0)
        result = 31 * result + (sseCustomerKeyMd5?.hashCode() ?: 0)
        result = 31 * result + (ssekmsKeyId?.hashCode() ?: 0)
        result = 31 * result + (statusCode)
        result = 31 * result + (storageClass?.hashCode() ?: 0)
        result = 31 * result + (tagCount)
        result = 31 * result + (versionId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as WriteGetObjectResponseRequest

        if (acceptRanges != other.acceptRanges) return false
        if (body != other.body) return false
        if (bucketKeyEnabled != other.bucketKeyEnabled) return false
        if (cacheControl != other.cacheControl) return false
        if (contentDisposition != other.contentDisposition) return false
        if (contentEncoding != other.contentEncoding) return false
        if (contentLanguage != other.contentLanguage) return false
        if (contentLength != other.contentLength) return false
        if (contentRange != other.contentRange) return false
        if (contentType != other.contentType) return false
        if (deleteMarker != other.deleteMarker) return false
        if (eTag != other.eTag) return false
        if (errorCode != other.errorCode) return false
        if (errorMessage != other.errorMessage) return false
        if (expiration != other.expiration) return false
        if (expires != other.expires) return false
        if (lastModified != other.lastModified) return false
        if (metadata != other.metadata) return false
        if (missingMeta != other.missingMeta) return false
        if (objectLockLegalHoldStatus != other.objectLockLegalHoldStatus) return false
        if (objectLockMode != other.objectLockMode) return false
        if (objectLockRetainUntilDate != other.objectLockRetainUntilDate) return false
        if (partsCount != other.partsCount) return false
        if (replicationStatus != other.replicationStatus) return false
        if (requestCharged != other.requestCharged) return false
        if (requestRoute != other.requestRoute) return false
        if (requestToken != other.requestToken) return false
        if (restore != other.restore) return false
        if (serverSideEncryption != other.serverSideEncryption) return false
        if (sseCustomerAlgorithm != other.sseCustomerAlgorithm) return false
        if (sseCustomerKeyMd5 != other.sseCustomerKeyMd5) return false
        if (ssekmsKeyId != other.ssekmsKeyId) return false
        if (statusCode != other.statusCode) return false
        if (storageClass != other.storageClass) return false
        if (tagCount != other.tagCount) return false
        if (versionId != other.versionId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.WriteGetObjectResponseRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates that a range of bytes was specified.
         */
        var acceptRanges: kotlin.String? = null
        /**
         * The object data.
         */
        var body: aws.smithy.kotlin.runtime.content.ByteStream? = null
        /**
         * Indicates whether the object stored in Amazon S3 uses an S3 bucket key for server-side
         * encryption with Amazon Web Services KMS (SSE-KMS).
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
         * The size of the content body in bytes.
         */
        var contentLength: kotlin.Long = 0L
        /**
         * The portion of the object returned in the response.
         */
        var contentRange: kotlin.String? = null
        /**
         * A standard MIME type describing the format of the object data.
         */
        var contentType: kotlin.String? = null
        /**
         * Specifies whether an object stored in Amazon S3 is (true) or is not
         * (false) a delete marker.
         */
        var deleteMarker: kotlin.Boolean = false
        /**
         * An opaque identifier assigned by a web server to a specific version of a resource found
         * at a URL.
         */
        var eTag: kotlin.String? = null
        /**
         * A string that uniquely identifies an error condition. Returned in the <Code> tag
         * of the error XML response for a corresponding GetObject call. Cannot be used
         * with a successful StatusCode header or when the transformed object is provided
         * in the body. All error codes from S3 are sentence-cased. Regex value is "^&#91;A-Z&#93;&#91;a-zA-Z&#93;+$".
         */
        var errorCode: kotlin.String? = null
        /**
         * Contains a generic description of the error condition. Returned in the <Message>
         * tag of the error XML response for a corresponding GetObject call. Cannot be
         * used with a successful StatusCode header or when the transformed object is
         * provided in body.
         */
        var errorMessage: kotlin.String? = null
        /**
         * If object stored in Amazon S3 expiration is configured (see PUT Bucket lifecycle) it includes expiry-date and rule-id key-value pairs providing object expiration information. The value of the rule-id is URL encoded.
         */
        var expiration: kotlin.String? = null
        /**
         * The date and time at which the object is no longer cacheable.
         */
        var expires: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The date and time that the object was last modified.
         */
        var lastModified: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * A map of metadata to store with the object in S3.
         */
        var metadata: Map<String, String>? = null
        /**
         * Set to the number of metadata entries not returned in x-amz-meta headers.
         * This can happen if you create metadata using an API like SOAP that supports more flexible
         * metadata than the REST API. For example, using SOAP, you can create metadata whose values
         * are not legal HTTP headers.
         */
        var missingMeta: kotlin.Int = 0
        /**
         * Indicates whether an object stored in Amazon S3 has an active legal hold.
         */
        var objectLockLegalHoldStatus: aws.sdk.kotlin.services.s3.model.ObjectLockLegalHoldStatus? = null
        /**
         * Indicates whether an object stored in Amazon S3 has Object Lock enabled. For more
         * information about S3 Object Lock, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock.html">Object Lock.
         */
        var objectLockMode: aws.sdk.kotlin.services.s3.model.ObjectLockMode? = null
        /**
         * The date and time when Object Lock is configured to expire.
         */
        var objectLockRetainUntilDate: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The count of parts this object has.
         */
        var partsCount: kotlin.Int = 0
        /**
         * Indicates if request involves bucket that is either a source or destination in a Replication rule. For more
         * information about S3 Replication, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/replication.html">Replication.
         */
        var replicationStatus: aws.sdk.kotlin.services.s3.model.ReplicationStatus? = null
        /**
         * If present, indicates that the requester was successfully charged for the
         * request.
         */
        var requestCharged: aws.sdk.kotlin.services.s3.model.RequestCharged? = null
        /**
         * Route prefix to the HTTP URL generated.
         */
        var requestRoute: kotlin.String? = null
        /**
         * A single use encrypted token that maps WriteGetObjectResponse to the end
         * user GetObject request.
         */
        var requestToken: kotlin.String? = null
        /**
         * Provides information about object restoration operation and expiration time of the
         * restored object copy.
         */
        var restore: kotlin.String? = null
        /**
         * The server-side encryption algorithm used when storing requested object in Amazon S3 (for example, AES256, aws:kms).
         */
        var serverSideEncryption: aws.sdk.kotlin.services.s3.model.ServerSideEncryption? = null
        /**
         * Encryption algorithm used if server-side encryption with a customer-provided encryption key was specified for object stored in Amazon S3.
         */
        var sseCustomerAlgorithm: kotlin.String? = null
        /**
         * 128-bit MD5 digest of customer-provided encryption key used in Amazon S3 to encrypt data
         * stored in S3. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/ServerSideEncryptionCustomerKeys.html">Protecting data
         * using server-side encryption with customer-provided encryption keys
         * (SSE-C).
         */
        var sseCustomerKeyMd5: kotlin.String? = null
        /**
         * If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric customer managed key that was used for stored in Amazon S3 object.
         */
        var ssekmsKeyId: kotlin.String? = null
        /**
         * The integer status code for an HTTP response of a corresponding GetObject
         * request.
         * <p class="title">
         * Status Codes
         * 200 - OK
         * 206 - Partial Content
         * 304 - Not Modified
         * 400 - Bad Request
         * 401 - Unauthorized
         * 403 - Forbidden
         * 404 - Not Found
         * 405 - Method Not Allowed
         * 409 - Conflict
         * 411 - Length Required
         * 412 - Precondition Failed
         * 416 - Range Not Satisfiable
         * 500 - Internal Server Error
         * 503 - Service Unavailable
         */
        var statusCode: kotlin.Int = 0
        /**
         * The class of storage used to store object in Amazon S3.
         */
        var storageClass: aws.sdk.kotlin.services.s3.model.StorageClass? = null
        /**
         * The number of tags, if any, on the object.
         */
        var tagCount: kotlin.Int = 0
        /**
         * An ID used to reference a specific version of the object.
         */
        var versionId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.WriteGetObjectResponseRequest) : this() {
            this.acceptRanges = x.acceptRanges
            this.body = x.body
            this.bucketKeyEnabled = x.bucketKeyEnabled
            this.cacheControl = x.cacheControl
            this.contentDisposition = x.contentDisposition
            this.contentEncoding = x.contentEncoding
            this.contentLanguage = x.contentLanguage
            this.contentLength = x.contentLength
            this.contentRange = x.contentRange
            this.contentType = x.contentType
            this.deleteMarker = x.deleteMarker
            this.eTag = x.eTag
            this.errorCode = x.errorCode
            this.errorMessage = x.errorMessage
            this.expiration = x.expiration
            this.expires = x.expires
            this.lastModified = x.lastModified
            this.metadata = x.metadata
            this.missingMeta = x.missingMeta
            this.objectLockLegalHoldStatus = x.objectLockLegalHoldStatus
            this.objectLockMode = x.objectLockMode
            this.objectLockRetainUntilDate = x.objectLockRetainUntilDate
            this.partsCount = x.partsCount
            this.replicationStatus = x.replicationStatus
            this.requestCharged = x.requestCharged
            this.requestRoute = x.requestRoute
            this.requestToken = x.requestToken
            this.restore = x.restore
            this.serverSideEncryption = x.serverSideEncryption
            this.sseCustomerAlgorithm = x.sseCustomerAlgorithm
            this.sseCustomerKeyMd5 = x.sseCustomerKeyMd5
            this.ssekmsKeyId = x.ssekmsKeyId
            this.statusCode = x.statusCode
            this.storageClass = x.storageClass
            this.tagCount = x.tagCount
            this.versionId = x.versionId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.WriteGetObjectResponseRequest = WriteGetObjectResponseRequest(this)
    }
}
