// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a network interface.
 */
class LaunchTemplateInstanceNetworkInterfaceSpecification private constructor(builder: Builder) {
    /**
     * Indicates whether to associate a Carrier IP address with eth0 for a new network interface.
     * Use this option when you launch an instance in a Wavelength Zone and want to associate
     * a Carrier IP address with the network interface. For more information about Carrier IP
     * addresses, see <a href="https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#provider-owned-ip">Carrier IP addresses in the Wavelength Developer
     * Guide.
     */
    val associateCarrierIpAddress: kotlin.Boolean? = builder.associateCarrierIpAddress
    /**
     * Indicates whether to associate a public IPv4 address with eth0 for a new network interface.
     */
    val associatePublicIpAddress: kotlin.Boolean? = builder.associatePublicIpAddress
    /**
     * Indicates whether the network interface is deleted when the instance is terminated.
     */
    val deleteOnTermination: kotlin.Boolean? = builder.deleteOnTermination
    /**
     * A description for the network interface.
     */
    val description: kotlin.String? = builder.description
    /**
     * The device index for the network interface attachment.
     */
    val deviceIndex: kotlin.Int? = builder.deviceIndex
    /**
     * The IDs of one or more security groups.
     */
    val groups: List<String>? = builder.groups
    /**
     * The type of network interface.
     */
    val interfaceType: kotlin.String? = builder.interfaceType
    /**
     * The number of IPv4 prefixes that Amazon Web Services automatically assigned to the
     * network interface.
     */
    val ipv4PrefixCount: kotlin.Int? = builder.ipv4PrefixCount
    /**
     * One or more IPv4 prefixes assigned to the network interface.
     */
    val ipv4Prefixes: List<Ipv4PrefixSpecificationResponse>? = builder.ipv4Prefixes
    /**
     * The number of IPv6 addresses for the network interface.
     */
    val ipv6AddressCount: kotlin.Int? = builder.ipv6AddressCount
    /**
     * The IPv6 addresses for the network interface.
     */
    val ipv6Addresses: List<InstanceIpv6Address>? = builder.ipv6Addresses
    /**
     * The number of IPv6 prefixes that Amazon Web Services automatically assigned to the network
     * interface.
     */
    val ipv6PrefixCount: kotlin.Int? = builder.ipv6PrefixCount
    /**
     * One or more IPv6 prefixes assigned to the network interface.
     */
    val ipv6Prefixes: List<Ipv6PrefixSpecificationResponse>? = builder.ipv6Prefixes
    /**
     * The index of the network card.
     */
    val networkCardIndex: kotlin.Int? = builder.networkCardIndex
    /**
     * The ID of the network interface.
     */
    val networkInterfaceId: kotlin.String? = builder.networkInterfaceId
    /**
     * The primary private IPv4 address of the network interface.
     */
    val privateIpAddress: kotlin.String? = builder.privateIpAddress
    /**
     * One or more private IPv4 addresses.
     */
    val privateIpAddresses: List<PrivateIpAddressSpecification>? = builder.privateIpAddresses
    /**
     * The number of secondary private IPv4 addresses for the network interface.
     */
    val secondaryPrivateIpAddressCount: kotlin.Int? = builder.secondaryPrivateIpAddressCount
    /**
     * The ID of the subnet for the network interface.
     */
    val subnetId: kotlin.String? = builder.subnetId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.LaunchTemplateInstanceNetworkInterfaceSpecification = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LaunchTemplateInstanceNetworkInterfaceSpecification(")
        append("associateCarrierIpAddress=$associateCarrierIpAddress,")
        append("associatePublicIpAddress=$associatePublicIpAddress,")
        append("deleteOnTermination=$deleteOnTermination,")
        append("description=$description,")
        append("deviceIndex=$deviceIndex,")
        append("groups=$groups,")
        append("interfaceType=$interfaceType,")
        append("ipv4PrefixCount=$ipv4PrefixCount,")
        append("ipv4Prefixes=$ipv4Prefixes,")
        append("ipv6AddressCount=$ipv6AddressCount,")
        append("ipv6Addresses=$ipv6Addresses,")
        append("ipv6PrefixCount=$ipv6PrefixCount,")
        append("ipv6Prefixes=$ipv6Prefixes,")
        append("networkCardIndex=$networkCardIndex,")
        append("networkInterfaceId=$networkInterfaceId,")
        append("privateIpAddress=$privateIpAddress,")
        append("privateIpAddresses=$privateIpAddresses,")
        append("secondaryPrivateIpAddressCount=$secondaryPrivateIpAddressCount,")
        append("subnetId=$subnetId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = associateCarrierIpAddress?.hashCode() ?: 0
        result = 31 * result + (associatePublicIpAddress?.hashCode() ?: 0)
        result = 31 * result + (deleteOnTermination?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (deviceIndex ?: 0)
        result = 31 * result + (groups?.hashCode() ?: 0)
        result = 31 * result + (interfaceType?.hashCode() ?: 0)
        result = 31 * result + (ipv4PrefixCount ?: 0)
        result = 31 * result + (ipv4Prefixes?.hashCode() ?: 0)
        result = 31 * result + (ipv6AddressCount ?: 0)
        result = 31 * result + (ipv6Addresses?.hashCode() ?: 0)
        result = 31 * result + (ipv6PrefixCount ?: 0)
        result = 31 * result + (ipv6Prefixes?.hashCode() ?: 0)
        result = 31 * result + (networkCardIndex ?: 0)
        result = 31 * result + (networkInterfaceId?.hashCode() ?: 0)
        result = 31 * result + (privateIpAddress?.hashCode() ?: 0)
        result = 31 * result + (privateIpAddresses?.hashCode() ?: 0)
        result = 31 * result + (secondaryPrivateIpAddressCount ?: 0)
        result = 31 * result + (subnetId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LaunchTemplateInstanceNetworkInterfaceSpecification

        if (associateCarrierIpAddress != other.associateCarrierIpAddress) return false
        if (associatePublicIpAddress != other.associatePublicIpAddress) return false
        if (deleteOnTermination != other.deleteOnTermination) return false
        if (description != other.description) return false
        if (deviceIndex != other.deviceIndex) return false
        if (groups != other.groups) return false
        if (interfaceType != other.interfaceType) return false
        if (ipv4PrefixCount != other.ipv4PrefixCount) return false
        if (ipv4Prefixes != other.ipv4Prefixes) return false
        if (ipv6AddressCount != other.ipv6AddressCount) return false
        if (ipv6Addresses != other.ipv6Addresses) return false
        if (ipv6PrefixCount != other.ipv6PrefixCount) return false
        if (ipv6Prefixes != other.ipv6Prefixes) return false
        if (networkCardIndex != other.networkCardIndex) return false
        if (networkInterfaceId != other.networkInterfaceId) return false
        if (privateIpAddress != other.privateIpAddress) return false
        if (privateIpAddresses != other.privateIpAddresses) return false
        if (secondaryPrivateIpAddressCount != other.secondaryPrivateIpAddressCount) return false
        if (subnetId != other.subnetId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.LaunchTemplateInstanceNetworkInterfaceSpecification = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates whether to associate a Carrier IP address with eth0 for a new network interface.
         * Use this option when you launch an instance in a Wavelength Zone and want to associate
         * a Carrier IP address with the network interface. For more information about Carrier IP
         * addresses, see <a href="https://docs.aws.amazon.com/wavelength/latest/developerguide/how-wavelengths-work.html#provider-owned-ip">Carrier IP addresses in the Wavelength Developer
         * Guide.
         */
        var associateCarrierIpAddress: kotlin.Boolean? = null
        /**
         * Indicates whether to associate a public IPv4 address with eth0 for a new network interface.
         */
        var associatePublicIpAddress: kotlin.Boolean? = null
        /**
         * Indicates whether the network interface is deleted when the instance is terminated.
         */
        var deleteOnTermination: kotlin.Boolean? = null
        /**
         * A description for the network interface.
         */
        var description: kotlin.String? = null
        /**
         * The device index for the network interface attachment.
         */
        var deviceIndex: kotlin.Int? = null
        /**
         * The IDs of one or more security groups.
         */
        var groups: List<String>? = null
        /**
         * The type of network interface.
         */
        var interfaceType: kotlin.String? = null
        /**
         * The number of IPv4 prefixes that Amazon Web Services automatically assigned to the
         * network interface.
         */
        var ipv4PrefixCount: kotlin.Int? = null
        /**
         * One or more IPv4 prefixes assigned to the network interface.
         */
        var ipv4Prefixes: List<Ipv4PrefixSpecificationResponse>? = null
        /**
         * The number of IPv6 addresses for the network interface.
         */
        var ipv6AddressCount: kotlin.Int? = null
        /**
         * The IPv6 addresses for the network interface.
         */
        var ipv6Addresses: List<InstanceIpv6Address>? = null
        /**
         * The number of IPv6 prefixes that Amazon Web Services automatically assigned to the network
         * interface.
         */
        var ipv6PrefixCount: kotlin.Int? = null
        /**
         * One or more IPv6 prefixes assigned to the network interface.
         */
        var ipv6Prefixes: List<Ipv6PrefixSpecificationResponse>? = null
        /**
         * The index of the network card.
         */
        var networkCardIndex: kotlin.Int? = null
        /**
         * The ID of the network interface.
         */
        var networkInterfaceId: kotlin.String? = null
        /**
         * The primary private IPv4 address of the network interface.
         */
        var privateIpAddress: kotlin.String? = null
        /**
         * One or more private IPv4 addresses.
         */
        var privateIpAddresses: List<PrivateIpAddressSpecification>? = null
        /**
         * The number of secondary private IPv4 addresses for the network interface.
         */
        var secondaryPrivateIpAddressCount: kotlin.Int? = null
        /**
         * The ID of the subnet for the network interface.
         */
        var subnetId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.LaunchTemplateInstanceNetworkInterfaceSpecification) : this() {
            this.associateCarrierIpAddress = x.associateCarrierIpAddress
            this.associatePublicIpAddress = x.associatePublicIpAddress
            this.deleteOnTermination = x.deleteOnTermination
            this.description = x.description
            this.deviceIndex = x.deviceIndex
            this.groups = x.groups
            this.interfaceType = x.interfaceType
            this.ipv4PrefixCount = x.ipv4PrefixCount
            this.ipv4Prefixes = x.ipv4Prefixes
            this.ipv6AddressCount = x.ipv6AddressCount
            this.ipv6Addresses = x.ipv6Addresses
            this.ipv6PrefixCount = x.ipv6PrefixCount
            this.ipv6Prefixes = x.ipv6Prefixes
            this.networkCardIndex = x.networkCardIndex
            this.networkInterfaceId = x.networkInterfaceId
            this.privateIpAddress = x.privateIpAddress
            this.privateIpAddresses = x.privateIpAddresses
            this.secondaryPrivateIpAddressCount = x.secondaryPrivateIpAddressCount
            this.subnetId = x.subnetId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.LaunchTemplateInstanceNetworkInterfaceSpecification = LaunchTemplateInstanceNetworkInterfaceSpecification(this)
    }
}