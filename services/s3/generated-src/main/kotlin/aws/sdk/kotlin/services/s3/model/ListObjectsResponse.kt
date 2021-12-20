// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class ListObjectsResponse private constructor(builder: Builder) {
    /**
     * All of the keys (up to 1,000) rolled up in a common prefix count as a single return when calculating
     * the number of returns.
     * A response can contain CommonPrefixes only if you specify a delimiter.
     * CommonPrefixes contains all (if there are any) keys between Prefix and the next
     * occurrence of the string specified by the delimiter.
     * CommonPrefixes lists keys that act like subdirectories in the directory specified by
     * Prefix.
     * For example, if the prefix is notes/ and the delimiter is a slash (/) as in
     * notes/summer/july, the common prefix is notes/summer/. All of the keys that roll up into a
     * common prefix count as a single return when calculating the number of returns.
     */
    val commonPrefixes: List<CommonPrefix>? = builder.commonPrefixes
    /**
     * Metadata about each object returned.
     */
    val contents: List<Object>? = builder.contents
    /**
     * Causes keys that contain the same string between the prefix and the first occurrence of
     * the delimiter to be rolled up into a single result element in the
     * CommonPrefixes collection. These rolled-up keys are not returned elsewhere
     * in the response. Each rolled-up result counts as only one return against the
     * MaxKeys value.
     */
    val delimiter: kotlin.String? = builder.delimiter
    /**
     * Encoding type used by Amazon S3 to encode object keys in the response.
     */
    val encodingType: aws.sdk.kotlin.services.s3.model.EncodingType? = builder.encodingType
    /**
     * A flag that indicates whether Amazon S3 returned all of the results that satisfied the search
     * criteria.
     */
    val isTruncated: kotlin.Boolean = builder.isTruncated
    /**
     * Indicates where in the bucket listing begins. Marker is included in the response if it
     * was sent with the request.
     */
    val marker: kotlin.String? = builder.marker
    /**
     * The maximum number of keys returned in the response body.
     */
    val maxKeys: kotlin.Int = builder.maxKeys
    /**
     * The bucket name.
     */
    val name: kotlin.String? = builder.name
    /**
     * When response is truncated (the IsTruncated element value in the response is true), you
     * can use the key name in this field as marker in the subsequent request to get next set of
     * objects. Amazon S3 lists objects in alphabetical order Note: This element is returned only if
     * you have delimiter request parameter specified. If response does not include the NextMarker
     * and it is truncated, you can use the value of the last Key in the response as the marker in
     * the subsequent request to get the next set of object keys.
     */
    val nextMarker: kotlin.String? = builder.nextMarker
    /**
     * Keys that begin with the indicated prefix.
     */
    val prefix: kotlin.String? = builder.prefix

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.ListObjectsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ListObjectsResponse(")
        append("commonPrefixes=$commonPrefixes,")
        append("contents=$contents,")
        append("delimiter=$delimiter,")
        append("encodingType=$encodingType,")
        append("isTruncated=$isTruncated,")
        append("marker=$marker,")
        append("maxKeys=$maxKeys,")
        append("name=$name,")
        append("nextMarker=$nextMarker,")
        append("prefix=$prefix)")
    }

    override fun hashCode(): kotlin.Int {
        var result = commonPrefixes?.hashCode() ?: 0
        result = 31 * result + (contents?.hashCode() ?: 0)
        result = 31 * result + (delimiter?.hashCode() ?: 0)
        result = 31 * result + (encodingType?.hashCode() ?: 0)
        result = 31 * result + (isTruncated.hashCode())
        result = 31 * result + (marker?.hashCode() ?: 0)
        result = 31 * result + (maxKeys)
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (nextMarker?.hashCode() ?: 0)
        result = 31 * result + (prefix?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ListObjectsResponse

        if (commonPrefixes != other.commonPrefixes) return false
        if (contents != other.contents) return false
        if (delimiter != other.delimiter) return false
        if (encodingType != other.encodingType) return false
        if (isTruncated != other.isTruncated) return false
        if (marker != other.marker) return false
        if (maxKeys != other.maxKeys) return false
        if (name != other.name) return false
        if (nextMarker != other.nextMarker) return false
        if (prefix != other.prefix) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.ListObjectsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * All of the keys (up to 1,000) rolled up in a common prefix count as a single return when calculating
         * the number of returns.
         * A response can contain CommonPrefixes only if you specify a delimiter.
         * CommonPrefixes contains all (if there are any) keys between Prefix and the next
         * occurrence of the string specified by the delimiter.
         * CommonPrefixes lists keys that act like subdirectories in the directory specified by
         * Prefix.
         * For example, if the prefix is notes/ and the delimiter is a slash (/) as in
         * notes/summer/july, the common prefix is notes/summer/. All of the keys that roll up into a
         * common prefix count as a single return when calculating the number of returns.
         */
        var commonPrefixes: List<CommonPrefix>? = null
        /**
         * Metadata about each object returned.
         */
        var contents: List<Object>? = null
        /**
         * Causes keys that contain the same string between the prefix and the first occurrence of
         * the delimiter to be rolled up into a single result element in the
         * CommonPrefixes collection. These rolled-up keys are not returned elsewhere
         * in the response. Each rolled-up result counts as only one return against the
         * MaxKeys value.
         */
        var delimiter: kotlin.String? = null
        /**
         * Encoding type used by Amazon S3 to encode object keys in the response.
         */
        var encodingType: aws.sdk.kotlin.services.s3.model.EncodingType? = null
        /**
         * A flag that indicates whether Amazon S3 returned all of the results that satisfied the search
         * criteria.
         */
        var isTruncated: kotlin.Boolean = false
        /**
         * Indicates where in the bucket listing begins. Marker is included in the response if it
         * was sent with the request.
         */
        var marker: kotlin.String? = null
        /**
         * The maximum number of keys returned in the response body.
         */
        var maxKeys: kotlin.Int = 0
        /**
         * The bucket name.
         */
        var name: kotlin.String? = null
        /**
         * When response is truncated (the IsTruncated element value in the response is true), you
         * can use the key name in this field as marker in the subsequent request to get next set of
         * objects. Amazon S3 lists objects in alphabetical order Note: This element is returned only if
         * you have delimiter request parameter specified. If response does not include the NextMarker
         * and it is truncated, you can use the value of the last Key in the response as the marker in
         * the subsequent request to get the next set of object keys.
         */
        var nextMarker: kotlin.String? = null
        /**
         * Keys that begin with the indicated prefix.
         */
        var prefix: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.ListObjectsResponse) : this() {
            this.commonPrefixes = x.commonPrefixes
            this.contents = x.contents
            this.delimiter = x.delimiter
            this.encodingType = x.encodingType
            this.isTruncated = x.isTruncated
            this.marker = x.marker
            this.maxKeys = x.maxKeys
            this.name = x.name
            this.nextMarker = x.nextMarker
            this.prefix = x.prefix
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.ListObjectsResponse = ListObjectsResponse(this)
    }
}