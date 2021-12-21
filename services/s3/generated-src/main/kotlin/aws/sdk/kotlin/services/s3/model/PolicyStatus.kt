// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * The container element for a bucket's policy status.
 */
class PolicyStatus private constructor(builder: Builder) {
    /**
     * The policy status for this bucket. TRUE indicates that this bucket is
     * public. FALSE indicates that the bucket is not public.
     */
    val isPublic: kotlin.Boolean = builder.isPublic

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.PolicyStatus = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PolicyStatus(")
        append("isPublic=$isPublic)")
    }

    override fun hashCode(): kotlin.Int {
        var result = isPublic.hashCode()
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PolicyStatus

        if (isPublic != other.isPublic) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.PolicyStatus = Builder(this).apply(block).build()

    class Builder {
        /**
         * The policy status for this bucket. TRUE indicates that this bucket is
         * public. FALSE indicates that the bucket is not public.
         */
        var isPublic: kotlin.Boolean = false

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.PolicyStatus) : this() {
            this.isPublic = x.isPublic
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.PolicyStatus = PolicyStatus(this)
    }
}