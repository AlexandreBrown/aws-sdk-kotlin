// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Container for the Suffix element.
 */
class IndexDocument private constructor(builder: Builder) {
    /**
     * A suffix that is appended to a request that is for a directory on the website endpoint
     * (for example,if the suffix is index.html and you make a request to samplebucket/images/ the
     * data that is returned will be for the object with the key name images/index.html) The
     * suffix must not be empty and must not include a slash character.
     * Replacement must be made for object keys containing special characters (such as carriage returns) when using
     * XML requests. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints">
     * XML related object key constraints.
     */
    val suffix: kotlin.String? = builder.suffix

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.IndexDocument = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("IndexDocument(")
        append("suffix=$suffix)")
    }

    override fun hashCode(): kotlin.Int {
        var result = suffix?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as IndexDocument

        if (suffix != other.suffix) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.IndexDocument = Builder(this).apply(block).build()

    class Builder {
        /**
         * A suffix that is appended to a request that is for a directory on the website endpoint
         * (for example,if the suffix is index.html and you make a request to samplebucket/images/ the
         * data that is returned will be for the object with the key name images/index.html) The
         * suffix must not be empty and must not include a slash character.
         * Replacement must be made for object keys containing special characters (such as carriage returns) when using
         * XML requests. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints">
         * XML related object key constraints.
         */
        var suffix: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.IndexDocument) : this() {
            this.suffix = x.suffix
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.IndexDocument = IndexDocument(this)
    }
}
