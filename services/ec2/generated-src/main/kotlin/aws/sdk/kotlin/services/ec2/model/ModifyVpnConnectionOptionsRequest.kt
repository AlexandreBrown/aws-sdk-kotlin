// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyVpnConnectionOptionsRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection.
     * Default: 0.0.0.0/0
     */
    val localIpv4NetworkCidr: kotlin.String? = builder.localIpv4NetworkCidr
    /**
     * The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection.
     * Default: ::/0
     */
    val localIpv6NetworkCidr: kotlin.String? = builder.localIpv6NetworkCidr
    /**
     * The IPv4 CIDR on the Amazon Web Services side of the VPN connection.
     * Default: 0.0.0.0/0
     */
    val remoteIpv4NetworkCidr: kotlin.String? = builder.remoteIpv4NetworkCidr
    /**
     * The IPv6 CIDR on the Amazon Web Services side of the VPN connection.
     * Default: ::/0
     */
    val remoteIpv6NetworkCidr: kotlin.String? = builder.remoteIpv6NetworkCidr
    /**
     * The ID of the Site-to-Site VPN connection.
     */
    val vpnConnectionId: kotlin.String? = builder.vpnConnectionId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyVpnConnectionOptionsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyVpnConnectionOptionsRequest(")
        append("dryRun=$dryRun,")
        append("localIpv4NetworkCidr=$localIpv4NetworkCidr,")
        append("localIpv6NetworkCidr=$localIpv6NetworkCidr,")
        append("remoteIpv4NetworkCidr=$remoteIpv4NetworkCidr,")
        append("remoteIpv6NetworkCidr=$remoteIpv6NetworkCidr,")
        append("vpnConnectionId=$vpnConnectionId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (localIpv4NetworkCidr?.hashCode() ?: 0)
        result = 31 * result + (localIpv6NetworkCidr?.hashCode() ?: 0)
        result = 31 * result + (remoteIpv4NetworkCidr?.hashCode() ?: 0)
        result = 31 * result + (remoteIpv6NetworkCidr?.hashCode() ?: 0)
        result = 31 * result + (vpnConnectionId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyVpnConnectionOptionsRequest

        if (dryRun != other.dryRun) return false
        if (localIpv4NetworkCidr != other.localIpv4NetworkCidr) return false
        if (localIpv6NetworkCidr != other.localIpv6NetworkCidr) return false
        if (remoteIpv4NetworkCidr != other.remoteIpv4NetworkCidr) return false
        if (remoteIpv6NetworkCidr != other.remoteIpv6NetworkCidr) return false
        if (vpnConnectionId != other.vpnConnectionId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyVpnConnectionOptionsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The IPv4 CIDR on the customer gateway (on-premises) side of the VPN connection.
         * Default: 0.0.0.0/0
         */
        var localIpv4NetworkCidr: kotlin.String? = null
        /**
         * The IPv6 CIDR on the customer gateway (on-premises) side of the VPN connection.
         * Default: ::/0
         */
        var localIpv6NetworkCidr: kotlin.String? = null
        /**
         * The IPv4 CIDR on the Amazon Web Services side of the VPN connection.
         * Default: 0.0.0.0/0
         */
        var remoteIpv4NetworkCidr: kotlin.String? = null
        /**
         * The IPv6 CIDR on the Amazon Web Services side of the VPN connection.
         * Default: ::/0
         */
        var remoteIpv6NetworkCidr: kotlin.String? = null
        /**
         * The ID of the Site-to-Site VPN connection.
         */
        var vpnConnectionId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyVpnConnectionOptionsRequest) : this() {
            this.dryRun = x.dryRun
            this.localIpv4NetworkCidr = x.localIpv4NetworkCidr
            this.localIpv6NetworkCidr = x.localIpv6NetworkCidr
            this.remoteIpv4NetworkCidr = x.remoteIpv4NetworkCidr
            this.remoteIpv6NetworkCidr = x.remoteIpv6NetworkCidr
            this.vpnConnectionId = x.vpnConnectionId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyVpnConnectionOptionsRequest = ModifyVpnConnectionOptionsRequest(this)
    }
}