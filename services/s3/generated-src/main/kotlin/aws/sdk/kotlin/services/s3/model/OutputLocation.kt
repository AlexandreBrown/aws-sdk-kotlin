// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Describes the location where the restore job's output is stored.
 */
class OutputLocation private constructor(builder: Builder) {
    /**
     * Describes an S3 location that will receive the results of the restore request.
     */
    val s3: aws.sdk.kotlin.services.s3.model.S3Location? = builder.s3

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.OutputLocation = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("OutputLocation(")
        append("s3=$s3)")
    }

    override fun hashCode(): kotlin.Int {
        var result = s3?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as OutputLocation

        if (s3 != other.s3) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.OutputLocation = Builder(this).apply(block).build()

    class Builder {
        /**
         * Describes an S3 location that will receive the results of the restore request.
         */
        var s3: aws.sdk.kotlin.services.s3.model.S3Location? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.OutputLocation) : this() {
            this.s3 = x.s3
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.OutputLocation = OutputLocation(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.S3Location] inside the given [block]
         */
        fun s3(block: aws.sdk.kotlin.services.s3.model.S3Location.Builder.() -> kotlin.Unit) {
            this.s3 = aws.sdk.kotlin.services.s3.model.S3Location.invoke(block)
        }
    }
}