// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ResetEbsDefaultKmsKeyIdResponse private constructor(builder: Builder) {
    /**
     * The Amazon Resource Name (ARN) of the default KMS key for EBS encryption by default.
     */
    val kmsKeyId: kotlin.String? = builder.kmsKeyId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ResetEbsDefaultKmsKeyIdResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ResetEbsDefaultKmsKeyIdResponse(")
        append("kmsKeyId=$kmsKeyId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = kmsKeyId?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ResetEbsDefaultKmsKeyIdResponse

        if (kmsKeyId != other.kmsKeyId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ResetEbsDefaultKmsKeyIdResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Amazon Resource Name (ARN) of the default KMS key for EBS encryption by default.
         */
        var kmsKeyId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ResetEbsDefaultKmsKeyIdResponse) : this() {
            this.kmsKeyId = x.kmsKeyId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ResetEbsDefaultKmsKeyIdResponse = ResetEbsDefaultKmsKeyIdResponse(this)
    }
}