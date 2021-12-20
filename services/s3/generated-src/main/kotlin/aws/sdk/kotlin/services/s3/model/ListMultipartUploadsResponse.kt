// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class ListMultipartUploadsResponse private constructor(builder: Builder) {
    /**
     * The name of the bucket to which the multipart upload was initiated. Does not return the access point ARN or access point alias if used.
     */
    val bucket: kotlin.String? = builder.bucket
    /**
     * If you specify a delimiter in the request, then the result returns each distinct key
     * prefix containing the delimiter in a CommonPrefixes element. The distinct key
     * prefixes are returned in the Prefix child element.
     */
    val commonPrefixes: List<CommonPrefix>? = builder.commonPrefixes
    /**
     * Contains the delimiter you specified in the request. If you don't specify a delimiter in
     * your request, this element is absent from the response.
     */
    val delimiter: kotlin.String? = builder.delimiter
    /**
     * Encoding type used by Amazon S3 to encode object keys in the response.
     * If you specify encoding-type request parameter, Amazon S3 includes this element
     * in the response, and returns encoded key name values in the following response
     * elements:
     * Delimiter, KeyMarker, Prefix,
     * NextKeyMarker, Key.
     */
    val encodingType: aws.sdk.kotlin.services.s3.model.EncodingType? = builder.encodingType
    /**
     * Indicates whether the returned list of multipart uploads is truncated. A value of true
     * indicates that the list was truncated. The list can be truncated if the number of multipart
     * uploads exceeds the limit allowed or specified by max uploads.
     */
    val isTruncated: kotlin.Boolean = builder.isTruncated
    /**
     * The key at or after which the listing began.
     */
    val keyMarker: kotlin.String? = builder.keyMarker
    /**
     * Maximum number of multipart uploads that could have been included in the
     * response.
     */
    val maxUploads: kotlin.Int = builder.maxUploads
    /**
     * When a list is truncated, this element specifies the value that should be used for the
     * key-marker request parameter in a subsequent request.
     */
    val nextKeyMarker: kotlin.String? = builder.nextKeyMarker
    /**
     * When a list is truncated, this element specifies the value that should be used for the
     * upload-id-marker request parameter in a subsequent request.
     */
    val nextUploadIdMarker: kotlin.String? = builder.nextUploadIdMarker
    /**
     * When a prefix is provided in the request, this field contains the specified prefix. The
     * result contains only keys starting with the specified prefix.
     */
    val prefix: kotlin.String? = builder.prefix
    /**
     * Upload ID after which listing began.
     */
    val uploadIdMarker: kotlin.String? = builder.uploadIdMarker
    /**
     * Container for elements related to a particular multipart upload. A response can contain
     * zero or more Upload elements.
     */
    val uploads: List<MultipartUpload>? = builder.uploads

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.ListMultipartUploadsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ListMultipartUploadsResponse(")
        append("bucket=$bucket,")
        append("commonPrefixes=$commonPrefixes,")
        append("delimiter=$delimiter,")
        append("encodingType=$encodingType,")
        append("isTruncated=$isTruncated,")
        append("keyMarker=$keyMarker,")
        append("maxUploads=$maxUploads,")
        append("nextKeyMarker=$nextKeyMarker,")
        append("nextUploadIdMarker=$nextUploadIdMarker,")
        append("prefix=$prefix,")
        append("uploadIdMarker=$uploadIdMarker,")
        append("uploads=$uploads)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (commonPrefixes?.hashCode() ?: 0)
        result = 31 * result + (delimiter?.hashCode() ?: 0)
        result = 31 * result + (encodingType?.hashCode() ?: 0)
        result = 31 * result + (isTruncated.hashCode())
        result = 31 * result + (keyMarker?.hashCode() ?: 0)
        result = 31 * result + (maxUploads)
        result = 31 * result + (nextKeyMarker?.hashCode() ?: 0)
        result = 31 * result + (nextUploadIdMarker?.hashCode() ?: 0)
        result = 31 * result + (prefix?.hashCode() ?: 0)
        result = 31 * result + (uploadIdMarker?.hashCode() ?: 0)
        result = 31 * result + (uploads?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ListMultipartUploadsResponse

        if (bucket != other.bucket) return false
        if (commonPrefixes != other.commonPrefixes) return false
        if (delimiter != other.delimiter) return false
        if (encodingType != other.encodingType) return false
        if (isTruncated != other.isTruncated) return false
        if (keyMarker != other.keyMarker) return false
        if (maxUploads != other.maxUploads) return false
        if (nextKeyMarker != other.nextKeyMarker) return false
        if (nextUploadIdMarker != other.nextUploadIdMarker) return false
        if (prefix != other.prefix) return false
        if (uploadIdMarker != other.uploadIdMarker) return false
        if (uploads != other.uploads) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.ListMultipartUploadsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of the bucket to which the multipart upload was initiated. Does not return the access point ARN or access point alias if used.
         */
        var bucket: kotlin.String? = null
        /**
         * If you specify a delimiter in the request, then the result returns each distinct key
         * prefix containing the delimiter in a CommonPrefixes element. The distinct key
         * prefixes are returned in the Prefix child element.
         */
        var commonPrefixes: List<CommonPrefix>? = null
        /**
         * Contains the delimiter you specified in the request. If you don't specify a delimiter in
         * your request, this element is absent from the response.
         */
        var delimiter: kotlin.String? = null
        /**
         * Encoding type used by Amazon S3 to encode object keys in the response.
         * If you specify encoding-type request parameter, Amazon S3 includes this element
         * in the response, and returns encoded key name values in the following response
         * elements:
         * Delimiter, KeyMarker, Prefix,
         * NextKeyMarker, Key.
         */
        var encodingType: aws.sdk.kotlin.services.s3.model.EncodingType? = null
        /**
         * Indicates whether the returned list of multipart uploads is truncated. A value of true
         * indicates that the list was truncated. The list can be truncated if the number of multipart
         * uploads exceeds the limit allowed or specified by max uploads.
         */
        var isTruncated: kotlin.Boolean = false
        /**
         * The key at or after which the listing began.
         */
        var keyMarker: kotlin.String? = null
        /**
         * Maximum number of multipart uploads that could have been included in the
         * response.
         */
        var maxUploads: kotlin.Int = 0
        /**
         * When a list is truncated, this element specifies the value that should be used for the
         * key-marker request parameter in a subsequent request.
         */
        var nextKeyMarker: kotlin.String? = null
        /**
         * When a list is truncated, this element specifies the value that should be used for the
         * upload-id-marker request parameter in a subsequent request.
         */
        var nextUploadIdMarker: kotlin.String? = null
        /**
         * When a prefix is provided in the request, this field contains the specified prefix. The
         * result contains only keys starting with the specified prefix.
         */
        var prefix: kotlin.String? = null
        /**
         * Upload ID after which listing began.
         */
        var uploadIdMarker: kotlin.String? = null
        /**
         * Container for elements related to a particular multipart upload. A response can contain
         * zero or more Upload elements.
         */
        var uploads: List<MultipartUpload>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.ListMultipartUploadsResponse) : this() {
            this.bucket = x.bucket
            this.commonPrefixes = x.commonPrefixes
            this.delimiter = x.delimiter
            this.encodingType = x.encodingType
            this.isTruncated = x.isTruncated
            this.keyMarker = x.keyMarker
            this.maxUploads = x.maxUploads
            this.nextKeyMarker = x.nextKeyMarker
            this.nextUploadIdMarker = x.nextUploadIdMarker
            this.prefix = x.prefix
            this.uploadIdMarker = x.uploadIdMarker
            this.uploads = x.uploads
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.ListMultipartUploadsResponse = ListMultipartUploadsResponse(this)
    }
}