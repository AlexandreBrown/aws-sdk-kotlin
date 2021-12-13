// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a VPC.
 */
class Vpc private constructor(builder: Builder) {
    /**
     * The primary IPv4 CIDR block for the VPC.
     */
    val cidrBlock: kotlin.String? = builder.cidrBlock
    /**
     * Information about the IPv4 CIDR blocks associated with the VPC.
     */
    val cidrBlockAssociationSet: List<VpcCidrBlockAssociation>? = builder.cidrBlockAssociationSet
    /**
     * The ID of the set of DHCP options you've associated with the VPC.
     */
    val dhcpOptionsId: kotlin.String? = builder.dhcpOptionsId
    /**
     * The allowed tenancy of instances launched into the VPC.
     */
    val instanceTenancy: aws.sdk.kotlin.services.ec2.model.Tenancy? = builder.instanceTenancy
    /**
     * Information about the IPv6 CIDR blocks associated with the VPC.
     */
    val ipv6CidrBlockAssociationSet: List<VpcIpv6CidrBlockAssociation>? = builder.ipv6CidrBlockAssociationSet
    /**
     * Indicates whether the VPC is the default VPC.
     */
    val isDefault: kotlin.Boolean? = builder.isDefault
    /**
     * The ID of the Amazon Web Services account that owns the VPC.
     */
    val ownerId: kotlin.String? = builder.ownerId
    /**
     * The current state of the VPC.
     */
    val state: aws.sdk.kotlin.services.ec2.model.VpcState? = builder.state
    /**
     * Any tags assigned to the VPC.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * The ID of the VPC.
     */
    val vpcId: kotlin.String? = builder.vpcId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.Vpc = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("Vpc(")
        append("cidrBlock=$cidrBlock,")
        append("cidrBlockAssociationSet=$cidrBlockAssociationSet,")
        append("dhcpOptionsId=$dhcpOptionsId,")
        append("instanceTenancy=$instanceTenancy,")
        append("ipv6CidrBlockAssociationSet=$ipv6CidrBlockAssociationSet,")
        append("isDefault=$isDefault,")
        append("ownerId=$ownerId,")
        append("state=$state,")
        append("tags=$tags,")
        append("vpcId=$vpcId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cidrBlock?.hashCode() ?: 0
        result = 31 * result + (cidrBlockAssociationSet?.hashCode() ?: 0)
        result = 31 * result + (dhcpOptionsId?.hashCode() ?: 0)
        result = 31 * result + (instanceTenancy?.hashCode() ?: 0)
        result = 31 * result + (ipv6CidrBlockAssociationSet?.hashCode() ?: 0)
        result = 31 * result + (isDefault?.hashCode() ?: 0)
        result = 31 * result + (ownerId?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Vpc

        if (cidrBlock != other.cidrBlock) return false
        if (cidrBlockAssociationSet != other.cidrBlockAssociationSet) return false
        if (dhcpOptionsId != other.dhcpOptionsId) return false
        if (instanceTenancy != other.instanceTenancy) return false
        if (ipv6CidrBlockAssociationSet != other.ipv6CidrBlockAssociationSet) return false
        if (isDefault != other.isDefault) return false
        if (ownerId != other.ownerId) return false
        if (state != other.state) return false
        if (tags != other.tags) return false
        if (vpcId != other.vpcId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.Vpc = Builder(this).apply(block).build()

    class Builder {
        /**
         * The primary IPv4 CIDR block for the VPC.
         */
        var cidrBlock: kotlin.String? = null
        /**
         * Information about the IPv4 CIDR blocks associated with the VPC.
         */
        var cidrBlockAssociationSet: List<VpcCidrBlockAssociation>? = null
        /**
         * The ID of the set of DHCP options you've associated with the VPC.
         */
        var dhcpOptionsId: kotlin.String? = null
        /**
         * The allowed tenancy of instances launched into the VPC.
         */
        var instanceTenancy: aws.sdk.kotlin.services.ec2.model.Tenancy? = null
        /**
         * Information about the IPv6 CIDR blocks associated with the VPC.
         */
        var ipv6CidrBlockAssociationSet: List<VpcIpv6CidrBlockAssociation>? = null
        /**
         * Indicates whether the VPC is the default VPC.
         */
        var isDefault: kotlin.Boolean? = null
        /**
         * The ID of the Amazon Web Services account that owns the VPC.
         */
        var ownerId: kotlin.String? = null
        /**
         * The current state of the VPC.
         */
        var state: aws.sdk.kotlin.services.ec2.model.VpcState? = null
        /**
         * Any tags assigned to the VPC.
         */
        var tags: List<Tag>? = null
        /**
         * The ID of the VPC.
         */
        var vpcId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.Vpc) : this() {
            this.cidrBlock = x.cidrBlock
            this.cidrBlockAssociationSet = x.cidrBlockAssociationSet
            this.dhcpOptionsId = x.dhcpOptionsId
            this.instanceTenancy = x.instanceTenancy
            this.ipv6CidrBlockAssociationSet = x.ipv6CidrBlockAssociationSet
            this.isDefault = x.isDefault
            this.ownerId = x.ownerId
            this.state = x.state
            this.tags = x.tags
            this.vpcId = x.vpcId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.Vpc = Vpc(this)
    }
}
