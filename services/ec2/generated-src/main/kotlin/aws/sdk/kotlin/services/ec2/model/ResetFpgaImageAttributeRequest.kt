// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ResetFpgaImageAttributeRequest private constructor(builder: Builder) {
    /**
     * The attribute.
     */
    val attribute: aws.sdk.kotlin.services.ec2.model.ResetFpgaImageAttributeName? = builder.attribute
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the AFI.
     */
    val fpgaImageId: kotlin.String? = builder.fpgaImageId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ResetFpgaImageAttributeRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ResetFpgaImageAttributeRequest(")
        append("attribute=$attribute,")
        append("dryRun=$dryRun,")
        append("fpgaImageId=$fpgaImageId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = attribute?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (fpgaImageId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ResetFpgaImageAttributeRequest

        if (attribute != other.attribute) return false
        if (dryRun != other.dryRun) return false
        if (fpgaImageId != other.fpgaImageId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ResetFpgaImageAttributeRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The attribute.
         */
        var attribute: aws.sdk.kotlin.services.ec2.model.ResetFpgaImageAttributeName? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the AFI.
         */
        var fpgaImageId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ResetFpgaImageAttributeRequest) : this() {
            this.attribute = x.attribute
            this.dryRun = x.dryRun
            this.fpgaImageId = x.fpgaImageId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ResetFpgaImageAttributeRequest = ResetFpgaImageAttributeRequest(this)
    }
}