// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class AssignIpv6AddressesRequest private constructor(builder: Builder) {
    /**
     * The number of additional IPv6 addresses to assign to the network interface.
     * The specified number of IPv6 addresses are assigned in addition to the
     * existing IPv6 addresses that are already assigned to the network interface.
     * Amazon EC2 automatically selects the IPv6 addresses from the subnet range. You
     * can't use this option if specifying specific IPv6 addresses.
     */
    val ipv6AddressCount: kotlin.Int? = builder.ipv6AddressCount
    /**
     * One or more specific IPv6 addresses to be assigned to the network interface. You can't use this option if you're specifying a number of IPv6 addresses.
     */
    val ipv6Addresses: List<String>? = builder.ipv6Addresses
    /**
     * The number of IPv6 prefixes that Amazon Web Services automatically assigns to the
     * network interface. You cannot use this option if you use the Ipv6Prefixes
     * option.
     */
    val ipv6PrefixCount: kotlin.Int? = builder.ipv6PrefixCount
    /**
     * One or more IPv6 prefixes assigned to the network interface. You cannot use this option if you use the Ipv6PrefixCount option.
     */
    val ipv6Prefixes: List<String>? = builder.ipv6Prefixes
    /**
     * The ID of the network interface.
     */
    val networkInterfaceId: kotlin.String? = builder.networkInterfaceId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AssignIpv6AddressesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AssignIpv6AddressesRequest(")
        append("ipv6AddressCount=$ipv6AddressCount,")
        append("ipv6Addresses=$ipv6Addresses,")
        append("ipv6PrefixCount=$ipv6PrefixCount,")
        append("ipv6Prefixes=$ipv6Prefixes,")
        append("networkInterfaceId=$networkInterfaceId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = ipv6AddressCount ?: 0
        result = 31 * result + (ipv6Addresses?.hashCode() ?: 0)
        result = 31 * result + (ipv6PrefixCount ?: 0)
        result = 31 * result + (ipv6Prefixes?.hashCode() ?: 0)
        result = 31 * result + (networkInterfaceId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AssignIpv6AddressesRequest

        if (ipv6AddressCount != other.ipv6AddressCount) return false
        if (ipv6Addresses != other.ipv6Addresses) return false
        if (ipv6PrefixCount != other.ipv6PrefixCount) return false
        if (ipv6Prefixes != other.ipv6Prefixes) return false
        if (networkInterfaceId != other.networkInterfaceId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AssignIpv6AddressesRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The number of additional IPv6 addresses to assign to the network interface.
         * The specified number of IPv6 addresses are assigned in addition to the
         * existing IPv6 addresses that are already assigned to the network interface.
         * Amazon EC2 automatically selects the IPv6 addresses from the subnet range. You
         * can't use this option if specifying specific IPv6 addresses.
         */
        var ipv6AddressCount: kotlin.Int? = null
        /**
         * One or more specific IPv6 addresses to be assigned to the network interface. You can't use this option if you're specifying a number of IPv6 addresses.
         */
        var ipv6Addresses: List<String>? = null
        /**
         * The number of IPv6 prefixes that Amazon Web Services automatically assigns to the
         * network interface. You cannot use this option if you use the Ipv6Prefixes
         * option.
         */
        var ipv6PrefixCount: kotlin.Int? = null
        /**
         * One or more IPv6 prefixes assigned to the network interface. You cannot use this option if you use the Ipv6PrefixCount option.
         */
        var ipv6Prefixes: List<String>? = null
        /**
         * The ID of the network interface.
         */
        var networkInterfaceId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AssignIpv6AddressesRequest) : this() {
            this.ipv6AddressCount = x.ipv6AddressCount
            this.ipv6Addresses = x.ipv6Addresses
            this.ipv6PrefixCount = x.ipv6PrefixCount
            this.ipv6Prefixes = x.ipv6Prefixes
            this.networkInterfaceId = x.networkInterfaceId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AssignIpv6AddressesRequest = AssignIpv6AddressesRequest(this)
    }
}