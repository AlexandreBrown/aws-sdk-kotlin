// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The VPC peering connection options.
 */
class PeeringConnectionOptionsRequest private constructor(builder: Builder) {
    /**
     * If true, enables a local VPC to resolve public DNS hostnames to private IP addresses when queried from instances in the peer VPC.
     */
    val allowDnsResolutionFromRemoteVpc: kotlin.Boolean? = builder.allowDnsResolutionFromRemoteVpc
    /**
     * If true, enables outbound communication from an EC2-Classic instance that's linked to
     * a local VPC using ClassicLink to instances in a peer VPC.
     */
    val allowEgressFromLocalClassicLinkToRemoteVpc: kotlin.Boolean? = builder.allowEgressFromLocalClassicLinkToRemoteVpc
    /**
     * If true, enables outbound communication from instances in a local VPC to an
     * EC2-Classic instance that's linked to a peer VPC using ClassicLink.
     */
    val allowEgressFromLocalVpcToRemoteClassicLink: kotlin.Boolean? = builder.allowEgressFromLocalVpcToRemoteClassicLink

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.PeeringConnectionOptionsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PeeringConnectionOptionsRequest(")
        append("allowDnsResolutionFromRemoteVpc=$allowDnsResolutionFromRemoteVpc,")
        append("allowEgressFromLocalClassicLinkToRemoteVpc=$allowEgressFromLocalClassicLinkToRemoteVpc,")
        append("allowEgressFromLocalVpcToRemoteClassicLink=$allowEgressFromLocalVpcToRemoteClassicLink)")
    }

    override fun hashCode(): kotlin.Int {
        var result = allowDnsResolutionFromRemoteVpc?.hashCode() ?: 0
        result = 31 * result + (allowEgressFromLocalClassicLinkToRemoteVpc?.hashCode() ?: 0)
        result = 31 * result + (allowEgressFromLocalVpcToRemoteClassicLink?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PeeringConnectionOptionsRequest

        if (allowDnsResolutionFromRemoteVpc != other.allowDnsResolutionFromRemoteVpc) return false
        if (allowEgressFromLocalClassicLinkToRemoteVpc != other.allowEgressFromLocalClassicLinkToRemoteVpc) return false
        if (allowEgressFromLocalVpcToRemoteClassicLink != other.allowEgressFromLocalVpcToRemoteClassicLink) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.PeeringConnectionOptionsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * If true, enables a local VPC to resolve public DNS hostnames to private IP addresses when queried from instances in the peer VPC.
         */
        var allowDnsResolutionFromRemoteVpc: kotlin.Boolean? = null
        /**
         * If true, enables outbound communication from an EC2-Classic instance that's linked to
         * a local VPC using ClassicLink to instances in a peer VPC.
         */
        var allowEgressFromLocalClassicLinkToRemoteVpc: kotlin.Boolean? = null
        /**
         * If true, enables outbound communication from instances in a local VPC to an
         * EC2-Classic instance that's linked to a peer VPC using ClassicLink.
         */
        var allowEgressFromLocalVpcToRemoteClassicLink: kotlin.Boolean? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.PeeringConnectionOptionsRequest) : this() {
            this.allowDnsResolutionFromRemoteVpc = x.allowDnsResolutionFromRemoteVpc
            this.allowEgressFromLocalClassicLinkToRemoteVpc = x.allowEgressFromLocalClassicLinkToRemoteVpc
            this.allowEgressFromLocalVpcToRemoteClassicLink = x.allowEgressFromLocalVpcToRemoteClassicLink
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.PeeringConnectionOptionsRequest = PeeringConnectionOptionsRequest(this)
    }
}
