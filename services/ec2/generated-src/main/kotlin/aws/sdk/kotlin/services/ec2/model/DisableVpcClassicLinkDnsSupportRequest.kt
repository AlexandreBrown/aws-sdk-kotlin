// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DisableVpcClassicLinkDnsSupportRequest private constructor(builder: Builder) {
    /**
     * The ID of the VPC.
     */
    val vpcId: kotlin.String? = builder.vpcId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DisableVpcClassicLinkDnsSupportRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DisableVpcClassicLinkDnsSupportRequest(")
        append("vpcId=$vpcId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = vpcId?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DisableVpcClassicLinkDnsSupportRequest

        if (vpcId != other.vpcId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DisableVpcClassicLinkDnsSupportRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the VPC.
         */
        var vpcId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DisableVpcClassicLinkDnsSupportRequest) : this() {
            this.vpcId = x.vpcId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DisableVpcClassicLinkDnsSupportRequest = DisableVpcClassicLinkDnsSupportRequest(this)
    }
}