// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class GetObjectLegalHoldResponse private constructor(builder: Builder) {
    /**
     * The current Legal Hold status for the specified object.
     */
    val legalHold: aws.sdk.kotlin.services.s3.model.ObjectLockLegalHold? = builder.legalHold

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.GetObjectLegalHoldResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetObjectLegalHoldResponse(")
        append("legalHold=$legalHold)")
    }

    override fun hashCode(): kotlin.Int {
        var result = legalHold?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetObjectLegalHoldResponse

        if (legalHold != other.legalHold) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.GetObjectLegalHoldResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The current Legal Hold status for the specified object.
         */
        var legalHold: aws.sdk.kotlin.services.s3.model.ObjectLockLegalHold? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.GetObjectLegalHoldResponse) : this() {
            this.legalHold = x.legalHold
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.GetObjectLegalHoldResponse = GetObjectLegalHoldResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.ObjectLockLegalHold] inside the given [block]
         */
        fun legalHold(block: aws.sdk.kotlin.services.s3.model.ObjectLockLegalHold.Builder.() -> kotlin.Unit) {
            this.legalHold = aws.sdk.kotlin.services.s3.model.ObjectLockLegalHold.invoke(block)
        }
    }
}
