// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.sts.model

import aws.smithy.kotlin.runtime.ServiceErrorMetadata

/**
 * The request was rejected because the total packed size of the session policies and
 * session tags combined was too large. An Amazon Web Services conversion compresses the session policy
 * document, session policy ARNs, and session tags into a packed binary format that has a
 * separate limit. The error message indicates by percentage how close the policies and
 * tags are to the upper size limit. For more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html">Passing Session Tags in STS in
 * the IAM User Guide.
 * You could receive this error even though you meet other defined session policy and
 * session tag limits. For more information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-quotas.html#reference_iam-limits-entity-length">IAM and STS Entity
 * Character Limits in the IAM User Guide.
 */
class PackedPolicyTooLargeException private constructor(builder: Builder) : StsException() {

    override val message: kotlin.String? = builder.message

    init {
        sdkErrorMetadata.attributes[ServiceErrorMetadata.ErrorType] = ErrorType.Client
    }

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.sts.model.PackedPolicyTooLargeException = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PackedPolicyTooLargeException(")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = message?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PackedPolicyTooLargeException

        if (message != other.message) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.sts.model.PackedPolicyTooLargeException = Builder(this).apply(block).build()

    class Builder {
        var message: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.sts.model.PackedPolicyTooLargeException) : this() {
            this.message = x.message
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.sts.model.PackedPolicyTooLargeException = PackedPolicyTooLargeException(this)
    }
}