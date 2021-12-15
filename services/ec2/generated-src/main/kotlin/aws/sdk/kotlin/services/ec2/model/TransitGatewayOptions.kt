// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the options for a transit gateway.
 */
class TransitGatewayOptions private constructor(builder: Builder) {
    /**
     * A private Autonomous System Number (ASN) for the Amazon side of a BGP session.
     * The range is 64512 to 65534 for 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
     */
    val amazonSideAsn: kotlin.Long? = builder.amazonSideAsn
    /**
     * The ID of the default association route table.
     */
    val associationDefaultRouteTableId: kotlin.String? = builder.associationDefaultRouteTableId
    /**
     * Indicates whether attachment requests are automatically accepted.
     */
    val autoAcceptSharedAttachments: aws.sdk.kotlin.services.ec2.model.AutoAcceptSharedAttachmentsValue? = builder.autoAcceptSharedAttachments
    /**
     * Indicates whether resource attachments are automatically associated with the default association route table.
     */
    val defaultRouteTableAssociation: aws.sdk.kotlin.services.ec2.model.DefaultRouteTableAssociationValue? = builder.defaultRouteTableAssociation
    /**
     * Indicates whether resource attachments automatically propagate routes to the default propagation route table.
     */
    val defaultRouteTablePropagation: aws.sdk.kotlin.services.ec2.model.DefaultRouteTablePropagationValue? = builder.defaultRouteTablePropagation
    /**
     * Indicates whether DNS support is enabled.
     */
    val dnsSupport: aws.sdk.kotlin.services.ec2.model.DnsSupportValue? = builder.dnsSupport
    /**
     * Indicates whether multicast is enabled on the transit gateway
     */
    val multicastSupport: aws.sdk.kotlin.services.ec2.model.MulticastSupportValue? = builder.multicastSupport
    /**
     * The ID of the default propagation route table.
     */
    val propagationDefaultRouteTableId: kotlin.String? = builder.propagationDefaultRouteTableId
    /**
     * The transit gateway CIDR blocks.
     */
    val transitGatewayCidrBlocks: List<String>? = builder.transitGatewayCidrBlocks
    /**
     * Indicates whether Equal Cost Multipath Protocol support is enabled.
     */
    val vpnEcmpSupport: aws.sdk.kotlin.services.ec2.model.VpnEcmpSupportValue? = builder.vpnEcmpSupport

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.TransitGatewayOptions = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TransitGatewayOptions(")
        append("amazonSideAsn=$amazonSideAsn,")
        append("associationDefaultRouteTableId=$associationDefaultRouteTableId,")
        append("autoAcceptSharedAttachments=$autoAcceptSharedAttachments,")
        append("defaultRouteTableAssociation=$defaultRouteTableAssociation,")
        append("defaultRouteTablePropagation=$defaultRouteTablePropagation,")
        append("dnsSupport=$dnsSupport,")
        append("multicastSupport=$multicastSupport,")
        append("propagationDefaultRouteTableId=$propagationDefaultRouteTableId,")
        append("transitGatewayCidrBlocks=$transitGatewayCidrBlocks,")
        append("vpnEcmpSupport=$vpnEcmpSupport)")
    }

    override fun hashCode(): kotlin.Int {
        var result = amazonSideAsn?.hashCode() ?: 0
        result = 31 * result + (associationDefaultRouteTableId?.hashCode() ?: 0)
        result = 31 * result + (autoAcceptSharedAttachments?.hashCode() ?: 0)
        result = 31 * result + (defaultRouteTableAssociation?.hashCode() ?: 0)
        result = 31 * result + (defaultRouteTablePropagation?.hashCode() ?: 0)
        result = 31 * result + (dnsSupport?.hashCode() ?: 0)
        result = 31 * result + (multicastSupport?.hashCode() ?: 0)
        result = 31 * result + (propagationDefaultRouteTableId?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayCidrBlocks?.hashCode() ?: 0)
        result = 31 * result + (vpnEcmpSupport?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TransitGatewayOptions

        if (amazonSideAsn != other.amazonSideAsn) return false
        if (associationDefaultRouteTableId != other.associationDefaultRouteTableId) return false
        if (autoAcceptSharedAttachments != other.autoAcceptSharedAttachments) return false
        if (defaultRouteTableAssociation != other.defaultRouteTableAssociation) return false
        if (defaultRouteTablePropagation != other.defaultRouteTablePropagation) return false
        if (dnsSupport != other.dnsSupport) return false
        if (multicastSupport != other.multicastSupport) return false
        if (propagationDefaultRouteTableId != other.propagationDefaultRouteTableId) return false
        if (transitGatewayCidrBlocks != other.transitGatewayCidrBlocks) return false
        if (vpnEcmpSupport != other.vpnEcmpSupport) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.TransitGatewayOptions = Builder(this).apply(block).build()

    class Builder {
        /**
         * A private Autonomous System Number (ASN) for the Amazon side of a BGP session.
         * The range is 64512 to 65534 for 16-bit ASNs and 4200000000 to 4294967294 for 32-bit ASNs.
         */
        var amazonSideAsn: kotlin.Long? = null
        /**
         * The ID of the default association route table.
         */
        var associationDefaultRouteTableId: kotlin.String? = null
        /**
         * Indicates whether attachment requests are automatically accepted.
         */
        var autoAcceptSharedAttachments: aws.sdk.kotlin.services.ec2.model.AutoAcceptSharedAttachmentsValue? = null
        /**
         * Indicates whether resource attachments are automatically associated with the default association route table.
         */
        var defaultRouteTableAssociation: aws.sdk.kotlin.services.ec2.model.DefaultRouteTableAssociationValue? = null
        /**
         * Indicates whether resource attachments automatically propagate routes to the default propagation route table.
         */
        var defaultRouteTablePropagation: aws.sdk.kotlin.services.ec2.model.DefaultRouteTablePropagationValue? = null
        /**
         * Indicates whether DNS support is enabled.
         */
        var dnsSupport: aws.sdk.kotlin.services.ec2.model.DnsSupportValue? = null
        /**
         * Indicates whether multicast is enabled on the transit gateway
         */
        var multicastSupport: aws.sdk.kotlin.services.ec2.model.MulticastSupportValue? = null
        /**
         * The ID of the default propagation route table.
         */
        var propagationDefaultRouteTableId: kotlin.String? = null
        /**
         * The transit gateway CIDR blocks.
         */
        var transitGatewayCidrBlocks: List<String>? = null
        /**
         * Indicates whether Equal Cost Multipath Protocol support is enabled.
         */
        var vpnEcmpSupport: aws.sdk.kotlin.services.ec2.model.VpnEcmpSupportValue? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.TransitGatewayOptions) : this() {
            this.amazonSideAsn = x.amazonSideAsn
            this.associationDefaultRouteTableId = x.associationDefaultRouteTableId
            this.autoAcceptSharedAttachments = x.autoAcceptSharedAttachments
            this.defaultRouteTableAssociation = x.defaultRouteTableAssociation
            this.defaultRouteTablePropagation = x.defaultRouteTablePropagation
            this.dnsSupport = x.dnsSupport
            this.multicastSupport = x.multicastSupport
            this.propagationDefaultRouteTableId = x.propagationDefaultRouteTableId
            this.transitGatewayCidrBlocks = x.transitGatewayCidrBlocks
            this.vpnEcmpSupport = x.vpnEcmpSupport
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.TransitGatewayOptions = TransitGatewayOptions(this)
    }
}
