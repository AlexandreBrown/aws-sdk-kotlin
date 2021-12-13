// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Contains the type of server-side encryption used to encrypt the inventory
 * results.
 */
class InventoryEncryption private constructor(builder: Builder) {
    /**
     * Specifies the use of SSE-KMS to encrypt delivered inventory reports.
     */
    val ssekms: aws.sdk.kotlin.services.s3.model.Ssekms? = builder.ssekms
    /**
     * Specifies the use of SSE-S3 to encrypt delivered inventory reports.
     */
    val sses3: aws.sdk.kotlin.services.s3.model.Sses3? = builder.sses3

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.InventoryEncryption = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InventoryEncryption(")
        append("ssekms=$ssekms,")
        append("sses3=$sses3)")
    }

    override fun hashCode(): kotlin.Int {
        var result = ssekms?.hashCode() ?: 0
        result = 31 * result + (sses3?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InventoryEncryption

        if (ssekms != other.ssekms) return false
        if (sses3 != other.sses3) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.InventoryEncryption = Builder(this).apply(block).build()

    class Builder {
        /**
         * Specifies the use of SSE-KMS to encrypt delivered inventory reports.
         */
        var ssekms: aws.sdk.kotlin.services.s3.model.Ssekms? = null
        /**
         * Specifies the use of SSE-S3 to encrypt delivered inventory reports.
         */
        var sses3: aws.sdk.kotlin.services.s3.model.Sses3? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.InventoryEncryption) : this() {
            this.ssekms = x.ssekms
            this.sses3 = x.sses3
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.InventoryEncryption = InventoryEncryption(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.Ssekms] inside the given [block]
         */
        fun ssekms(block: aws.sdk.kotlin.services.s3.model.Ssekms.Builder.() -> kotlin.Unit) {
            this.ssekms = aws.sdk.kotlin.services.s3.model.Ssekms.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.Sses3] inside the given [block]
         */
        fun sses3(block: aws.sdk.kotlin.services.s3.model.Sses3.Builder.() -> kotlin.Unit) {
            this.sses3 = aws.sdk.kotlin.services.s3.model.Sses3.invoke(block)
        }
    }
}
