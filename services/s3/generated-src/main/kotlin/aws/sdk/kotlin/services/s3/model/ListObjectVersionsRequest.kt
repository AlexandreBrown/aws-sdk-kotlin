// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class ListObjectVersionsRequest private constructor(builder: Builder) {
    /**
     * The bucket name that contains the objects.
     */
    val bucket: kotlin.String? = builder.bucket
    /**
     * A delimiter is a character that you specify to group keys. All keys that contain the
     * same string between the prefix and the first occurrence of the delimiter are
     * grouped under a single result element in CommonPrefixes. These groups are counted as one
     * result against the max-keys limitation. These keys are not returned elsewhere in the
     * response.
     */
    val delimiter: kotlin.String? = builder.delimiter
    /**
     * Requests Amazon S3 to encode the object keys in the response and specifies the encoding
     * method to use. An object key may contain any Unicode character; however, XML 1.0 parser
     * cannot parse some characters, such as characters with an ASCII value from 0 to 10. For
     * characters that are not supported in XML 1.0, you can add this parameter to request that
     * Amazon S3 encode the keys in the response.
     */
    val encodingType: aws.sdk.kotlin.services.s3.model.EncodingType? = builder.encodingType
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     */
    val expectedBucketOwner: kotlin.String? = builder.expectedBucketOwner
    /**
     * Specifies the key to start with when listing objects in a bucket.
     */
    val keyMarker: kotlin.String? = builder.keyMarker
    /**
     * Sets the maximum number of keys returned in the response. By default the action returns up
     * to 1,000 key names. The response might contain fewer keys but will never contain more. If
     * additional keys satisfy the search criteria, but were not returned because max-keys was
     * exceeded, the response contains <isTruncated>true</isTruncated>. To return the
     * additional keys, see key-marker and version-id-marker.
     */
    val maxKeys: kotlin.Int = builder.maxKeys
    /**
     * Use this parameter to select only those keys that begin with the specified prefix. You
     * can use prefixes to separate a bucket into different groupings of keys. (You can think of
     * using prefix to make groups in the same way you'd use a folder in a file system.) You can
     * use prefix with delimiter to roll up numerous objects into a single result under
     * CommonPrefixes.
     */
    val prefix: kotlin.String? = builder.prefix
    /**
     * Specifies the object version you want to start listing from.
     */
    val versionIdMarker: kotlin.String? = builder.versionIdMarker

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.ListObjectVersionsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ListObjectVersionsRequest(")
        append("bucket=$bucket,")
        append("delimiter=$delimiter,")
        append("encodingType=$encodingType,")
        append("expectedBucketOwner=$expectedBucketOwner,")
        append("keyMarker=$keyMarker,")
        append("maxKeys=$maxKeys,")
        append("prefix=$prefix,")
        append("versionIdMarker=$versionIdMarker)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (delimiter?.hashCode() ?: 0)
        result = 31 * result + (encodingType?.hashCode() ?: 0)
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (keyMarker?.hashCode() ?: 0)
        result = 31 * result + (maxKeys)
        result = 31 * result + (prefix?.hashCode() ?: 0)
        result = 31 * result + (versionIdMarker?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ListObjectVersionsRequest

        if (bucket != other.bucket) return false
        if (delimiter != other.delimiter) return false
        if (encodingType != other.encodingType) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false
        if (keyMarker != other.keyMarker) return false
        if (maxKeys != other.maxKeys) return false
        if (prefix != other.prefix) return false
        if (versionIdMarker != other.versionIdMarker) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.ListObjectVersionsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The bucket name that contains the objects.
         */
        var bucket: kotlin.String? = null
        /**
         * A delimiter is a character that you specify to group keys. All keys that contain the
         * same string between the prefix and the first occurrence of the delimiter are
         * grouped under a single result element in CommonPrefixes. These groups are counted as one
         * result against the max-keys limitation. These keys are not returned elsewhere in the
         * response.
         */
        var delimiter: kotlin.String? = null
        /**
         * Requests Amazon S3 to encode the object keys in the response and specifies the encoding
         * method to use. An object key may contain any Unicode character; however, XML 1.0 parser
         * cannot parse some characters, such as characters with an ASCII value from 0 to 10. For
         * characters that are not supported in XML 1.0, you can add this parameter to request that
         * Amazon S3 encode the keys in the response.
         */
        var encodingType: aws.sdk.kotlin.services.s3.model.EncodingType? = null
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        var expectedBucketOwner: kotlin.String? = null
        /**
         * Specifies the key to start with when listing objects in a bucket.
         */
        var keyMarker: kotlin.String? = null
        /**
         * Sets the maximum number of keys returned in the response. By default the action returns up
         * to 1,000 key names. The response might contain fewer keys but will never contain more. If
         * additional keys satisfy the search criteria, but were not returned because max-keys was
         * exceeded, the response contains <isTruncated>true</isTruncated>. To return the
         * additional keys, see key-marker and version-id-marker.
         */
        var maxKeys: kotlin.Int = 0
        /**
         * Use this parameter to select only those keys that begin with the specified prefix. You
         * can use prefixes to separate a bucket into different groupings of keys. (You can think of
         * using prefix to make groups in the same way you'd use a folder in a file system.) You can
         * use prefix with delimiter to roll up numerous objects into a single result under
         * CommonPrefixes.
         */
        var prefix: kotlin.String? = null
        /**
         * Specifies the object version you want to start listing from.
         */
        var versionIdMarker: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.ListObjectVersionsRequest) : this() {
            this.bucket = x.bucket
            this.delimiter = x.delimiter
            this.encodingType = x.encodingType
            this.expectedBucketOwner = x.expectedBucketOwner
            this.keyMarker = x.keyMarker
            this.maxKeys = x.maxKeys
            this.prefix = x.prefix
            this.versionIdMarker = x.versionIdMarker
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.ListObjectVersionsRequest = ListObjectVersionsRequest(this)
    }
}
