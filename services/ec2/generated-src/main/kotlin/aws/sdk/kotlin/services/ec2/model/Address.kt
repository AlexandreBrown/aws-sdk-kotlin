// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an Elastic IP address, or a carrier IP address.
 */
class Address private constructor(builder: Builder) {
    /**
     * The ID representing the allocation of the address for use with EC2-VPC.
     */
    val allocationId: kotlin.String? = builder.allocationId
    /**
     * The ID representing the association of the address with an instance in a VPC.
     */
    val associationId: kotlin.String? = builder.associationId
    /**
     * The carrier IP address associated. This option is only available for network interfaces
     * which  reside in a subnet in a Wavelength Zone (for example an EC2 instance).
     */
    val carrierIp: kotlin.String? = builder.carrierIp
    /**
     * The customer-owned IP address.
     */
    val customerOwnedIp: kotlin.String? = builder.customerOwnedIp
    /**
     * The ID of the customer-owned address pool.
     */
    val customerOwnedIpv4Pool: kotlin.String? = builder.customerOwnedIpv4Pool
    /**
     * Indicates whether this Elastic IP address is for use with instances
     * in EC2-Classic (standard) or instances in a VPC (vpc).
     */
    val domain: aws.sdk.kotlin.services.ec2.model.DomainType? = builder.domain
    /**
     * The ID of the instance that the address is associated with (if any).
     */
    val instanceId: kotlin.String? = builder.instanceId
    /**
     * The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from
     * which Amazon Web Services advertises IP addresses.
     */
    val networkBorderGroup: kotlin.String? = builder.networkBorderGroup
    /**
     * The ID of the network interface.
     */
    val networkInterfaceId: kotlin.String? = builder.networkInterfaceId
    /**
     * The ID of the Amazon Web Services account that owns the network interface.
     */
    val networkInterfaceOwnerId: kotlin.String? = builder.networkInterfaceOwnerId
    /**
     * The private IP address associated with the Elastic IP address.
     */
    val privateIpAddress: kotlin.String? = builder.privateIpAddress
    /**
     * The Elastic IP address.
     */
    val publicIp: kotlin.String? = builder.publicIp
    /**
     * The ID of an address pool.
     */
    val publicIpv4Pool: kotlin.String? = builder.publicIpv4Pool
    /**
     * Any tags assigned to the Elastic IP address.
     */
    val tags: List<Tag>? = builder.tags

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.Address = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("Address(")
        append("allocationId=$allocationId,")
        append("associationId=$associationId,")
        append("carrierIp=$carrierIp,")
        append("customerOwnedIp=$customerOwnedIp,")
        append("customerOwnedIpv4Pool=$customerOwnedIpv4Pool,")
        append("domain=$domain,")
        append("instanceId=$instanceId,")
        append("networkBorderGroup=$networkBorderGroup,")
        append("networkInterfaceId=$networkInterfaceId,")
        append("networkInterfaceOwnerId=$networkInterfaceOwnerId,")
        append("privateIpAddress=$privateIpAddress,")
        append("publicIp=$publicIp,")
        append("publicIpv4Pool=$publicIpv4Pool,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = allocationId?.hashCode() ?: 0
        result = 31 * result + (associationId?.hashCode() ?: 0)
        result = 31 * result + (carrierIp?.hashCode() ?: 0)
        result = 31 * result + (customerOwnedIp?.hashCode() ?: 0)
        result = 31 * result + (customerOwnedIpv4Pool?.hashCode() ?: 0)
        result = 31 * result + (domain?.hashCode() ?: 0)
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        result = 31 * result + (networkBorderGroup?.hashCode() ?: 0)
        result = 31 * result + (networkInterfaceId?.hashCode() ?: 0)
        result = 31 * result + (networkInterfaceOwnerId?.hashCode() ?: 0)
        result = 31 * result + (privateIpAddress?.hashCode() ?: 0)
        result = 31 * result + (publicIp?.hashCode() ?: 0)
        result = 31 * result + (publicIpv4Pool?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Address

        if (allocationId != other.allocationId) return false
        if (associationId != other.associationId) return false
        if (carrierIp != other.carrierIp) return false
        if (customerOwnedIp != other.customerOwnedIp) return false
        if (customerOwnedIpv4Pool != other.customerOwnedIpv4Pool) return false
        if (domain != other.domain) return false
        if (instanceId != other.instanceId) return false
        if (networkBorderGroup != other.networkBorderGroup) return false
        if (networkInterfaceId != other.networkInterfaceId) return false
        if (networkInterfaceOwnerId != other.networkInterfaceOwnerId) return false
        if (privateIpAddress != other.privateIpAddress) return false
        if (publicIp != other.publicIp) return false
        if (publicIpv4Pool != other.publicIpv4Pool) return false
        if (tags != other.tags) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.Address = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID representing the allocation of the address for use with EC2-VPC.
         */
        var allocationId: kotlin.String? = null
        /**
         * The ID representing the association of the address with an instance in a VPC.
         */
        var associationId: kotlin.String? = null
        /**
         * The carrier IP address associated. This option is only available for network interfaces
         * which  reside in a subnet in a Wavelength Zone (for example an EC2 instance).
         */
        var carrierIp: kotlin.String? = null
        /**
         * The customer-owned IP address.
         */
        var customerOwnedIp: kotlin.String? = null
        /**
         * The ID of the customer-owned address pool.
         */
        var customerOwnedIpv4Pool: kotlin.String? = null
        /**
         * Indicates whether this Elastic IP address is for use with instances
         * in EC2-Classic (standard) or instances in a VPC (vpc).
         */
        var domain: aws.sdk.kotlin.services.ec2.model.DomainType? = null
        /**
         * The ID of the instance that the address is associated with (if any).
         */
        var instanceId: kotlin.String? = null
        /**
         * The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from
         * which Amazon Web Services advertises IP addresses.
         */
        var networkBorderGroup: kotlin.String? = null
        /**
         * The ID of the network interface.
         */
        var networkInterfaceId: kotlin.String? = null
        /**
         * The ID of the Amazon Web Services account that owns the network interface.
         */
        var networkInterfaceOwnerId: kotlin.String? = null
        /**
         * The private IP address associated with the Elastic IP address.
         */
        var privateIpAddress: kotlin.String? = null
        /**
         * The Elastic IP address.
         */
        var publicIp: kotlin.String? = null
        /**
         * The ID of an address pool.
         */
        var publicIpv4Pool: kotlin.String? = null
        /**
         * Any tags assigned to the Elastic IP address.
         */
        var tags: List<Tag>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.Address) : this() {
            this.allocationId = x.allocationId
            this.associationId = x.associationId
            this.carrierIp = x.carrierIp
            this.customerOwnedIp = x.customerOwnedIp
            this.customerOwnedIpv4Pool = x.customerOwnedIpv4Pool
            this.domain = x.domain
            this.instanceId = x.instanceId
            this.networkBorderGroup = x.networkBorderGroup
            this.networkInterfaceId = x.networkInterfaceId
            this.networkInterfaceOwnerId = x.networkInterfaceOwnerId
            this.privateIpAddress = x.privateIpAddress
            this.publicIp = x.publicIp
            this.publicIpv4Pool = x.publicIpv4Pool
            this.tags = x.tags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.Address = Address(this)
    }
}
