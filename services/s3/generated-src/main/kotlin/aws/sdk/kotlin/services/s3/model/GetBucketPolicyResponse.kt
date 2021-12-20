// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class GetBucketPolicyResponse private constructor(builder: Builder) {
    /**
     * The bucket policy as a JSON document.
     */
    val policy: kotlin.String? = builder.policy

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.GetBucketPolicyResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetBucketPolicyResponse(")
        append("policy=$policy)")
    }

    override fun hashCode(): kotlin.Int {
        var result = policy?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetBucketPolicyResponse

        if (policy != other.policy) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.GetBucketPolicyResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The bucket policy as a JSON document.
         */
        var policy: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.GetBucketPolicyResponse) : this() {
            this.policy = x.policy
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.GetBucketPolicyResponse = GetBucketPolicyResponse(this)
    }
}