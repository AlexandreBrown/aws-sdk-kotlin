// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Describes how uncompressed comma-separated values (CSV)-formatted results are
 * formatted.
 */
class CsvOutput private constructor(builder: Builder) {
    /**
     * The value used to separate individual fields in a record. You can specify an arbitrary
     * delimiter.
     */
    val fieldDelimiter: kotlin.String? = builder.fieldDelimiter
    /**
     * A single character used for escaping when the field delimiter is part of the value. For
     * example, if the value is a, b, Amazon S3 wraps this field value in quotation marks,
     * as follows: " a , b ".
     */
    val quoteCharacter: kotlin.String? = builder.quoteCharacter
    /**
     * The single character used for escaping the quote character inside an already escaped
     * value.
     */
    val quoteEscapeCharacter: kotlin.String? = builder.quoteEscapeCharacter
    /**
     * Indicates whether to use quotation marks around output fields.
     * ALWAYS: Always use quotation marks for output fields.
     * ASNEEDED: Use quotation marks for output fields when needed.
     */
    val quoteFields: aws.sdk.kotlin.services.s3.model.QuoteFields? = builder.quoteFields
    /**
     * A single character used to separate individual records in the output. Instead of the
     * default value, you can specify an arbitrary delimiter.
     */
    val recordDelimiter: kotlin.String? = builder.recordDelimiter

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.CsvOutput = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CsvOutput(")
        append("fieldDelimiter=$fieldDelimiter,")
        append("quoteCharacter=$quoteCharacter,")
        append("quoteEscapeCharacter=$quoteEscapeCharacter,")
        append("quoteFields=$quoteFields,")
        append("recordDelimiter=$recordDelimiter)")
    }

    override fun hashCode(): kotlin.Int {
        var result = fieldDelimiter?.hashCode() ?: 0
        result = 31 * result + (quoteCharacter?.hashCode() ?: 0)
        result = 31 * result + (quoteEscapeCharacter?.hashCode() ?: 0)
        result = 31 * result + (quoteFields?.hashCode() ?: 0)
        result = 31 * result + (recordDelimiter?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CsvOutput

        if (fieldDelimiter != other.fieldDelimiter) return false
        if (quoteCharacter != other.quoteCharacter) return false
        if (quoteEscapeCharacter != other.quoteEscapeCharacter) return false
        if (quoteFields != other.quoteFields) return false
        if (recordDelimiter != other.recordDelimiter) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.CsvOutput = Builder(this).apply(block).build()

    class Builder {
        /**
         * The value used to separate individual fields in a record. You can specify an arbitrary
         * delimiter.
         */
        var fieldDelimiter: kotlin.String? = null
        /**
         * A single character used for escaping when the field delimiter is part of the value. For
         * example, if the value is a, b, Amazon S3 wraps this field value in quotation marks,
         * as follows: " a , b ".
         */
        var quoteCharacter: kotlin.String? = null
        /**
         * The single character used for escaping the quote character inside an already escaped
         * value.
         */
        var quoteEscapeCharacter: kotlin.String? = null
        /**
         * Indicates whether to use quotation marks around output fields.
         * ALWAYS: Always use quotation marks for output fields.
         * ASNEEDED: Use quotation marks for output fields when needed.
         */
        var quoteFields: aws.sdk.kotlin.services.s3.model.QuoteFields? = null
        /**
         * A single character used to separate individual records in the output. Instead of the
         * default value, you can specify an arbitrary delimiter.
         */
        var recordDelimiter: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.CsvOutput) : this() {
            this.fieldDelimiter = x.fieldDelimiter
            this.quoteCharacter = x.quoteCharacter
            this.quoteEscapeCharacter = x.quoteEscapeCharacter
            this.quoteFields = x.quoteFields
            this.recordDelimiter = x.recordDelimiter
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.CsvOutput = CsvOutput(this)
    }
}