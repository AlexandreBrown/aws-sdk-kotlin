// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyClientVpnEndpointRequest private constructor(builder: Builder) {
    /**
     * The options for managing connection authorization for new client connections.
     */
    val clientConnectOptions: aws.sdk.kotlin.services.ec2.model.ClientConnectOptions? = builder.clientConnectOptions
    /**
     * The ID of the Client VPN endpoint to modify.
     */
    val clientVpnEndpointId: kotlin.String? = builder.clientVpnEndpointId
    /**
     * Information about the client connection logging options.
     * If you enable client connection logging, data about client connections is sent to a
     * Cloudwatch Logs log stream. The following information is logged:
     * Client connection requests
     * Client connection results (successful and unsuccessful)
     * Reasons for unsuccessful client connection requests
     * Client connection termination time
     */
    val connectionLogOptions: aws.sdk.kotlin.services.ec2.model.ConnectionLogOptions? = builder.connectionLogOptions
    /**
     * A brief description of the Client VPN endpoint.
     */
    val description: kotlin.String? = builder.description
    /**
     * Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have
     * up to two DNS servers.
     */
    val dnsServers: aws.sdk.kotlin.services.ec2.model.DnsServersOptionsModifyStructure? = builder.dnsServers
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The IDs of one or more security groups to apply to the target network.
     */
    val securityGroupIds: List<String>? = builder.securityGroupIds
    /**
     * Specify whether to enable the self-service portal for the Client VPN endpoint.
     */
    val selfServicePortal: aws.sdk.kotlin.services.ec2.model.SelfServicePortal? = builder.selfServicePortal
    /**
     * The ARN of the server certificate to be used. The server certificate must be provisioned in
     * Certificate Manager (ACM).
     */
    val serverCertificateArn: kotlin.String? = builder.serverCertificateArn
    /**
     * Indicates whether the VPN is split-tunnel.
     * For information about split-tunnel VPN endpoints, see <a href="https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html">Split-tunnel Client VPN endpoint in the
     * Client VPN Administrator Guide.
     */
    val splitTunnel: kotlin.Boolean? = builder.splitTunnel
    /**
     * The ID of the VPC to associate with the Client VPN endpoint.
     */
    val vpcId: kotlin.String? = builder.vpcId
    /**
     * The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
     * Valid Values: 443 | 1194
     * Default Value: 443
     */
    val vpnPort: kotlin.Int? = builder.vpnPort

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyClientVpnEndpointRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyClientVpnEndpointRequest(")
        append("clientConnectOptions=$clientConnectOptions,")
        append("clientVpnEndpointId=$clientVpnEndpointId,")
        append("connectionLogOptions=$connectionLogOptions,")
        append("description=$description,")
        append("dnsServers=$dnsServers,")
        append("dryRun=$dryRun,")
        append("securityGroupIds=$securityGroupIds,")
        append("selfServicePortal=$selfServicePortal,")
        append("serverCertificateArn=$serverCertificateArn,")
        append("splitTunnel=$splitTunnel,")
        append("vpcId=$vpcId,")
        append("vpnPort=$vpnPort)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientConnectOptions?.hashCode() ?: 0
        result = 31 * result + (clientVpnEndpointId?.hashCode() ?: 0)
        result = 31 * result + (connectionLogOptions?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (dnsServers?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (securityGroupIds?.hashCode() ?: 0)
        result = 31 * result + (selfServicePortal?.hashCode() ?: 0)
        result = 31 * result + (serverCertificateArn?.hashCode() ?: 0)
        result = 31 * result + (splitTunnel?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        result = 31 * result + (vpnPort ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyClientVpnEndpointRequest

        if (clientConnectOptions != other.clientConnectOptions) return false
        if (clientVpnEndpointId != other.clientVpnEndpointId) return false
        if (connectionLogOptions != other.connectionLogOptions) return false
        if (description != other.description) return false
        if (dnsServers != other.dnsServers) return false
        if (dryRun != other.dryRun) return false
        if (securityGroupIds != other.securityGroupIds) return false
        if (selfServicePortal != other.selfServicePortal) return false
        if (serverCertificateArn != other.serverCertificateArn) return false
        if (splitTunnel != other.splitTunnel) return false
        if (vpcId != other.vpcId) return false
        if (vpnPort != other.vpnPort) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyClientVpnEndpointRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The options for managing connection authorization for new client connections.
         */
        var clientConnectOptions: aws.sdk.kotlin.services.ec2.model.ClientConnectOptions? = null
        /**
         * The ID of the Client VPN endpoint to modify.
         */
        var clientVpnEndpointId: kotlin.String? = null
        /**
         * Information about the client connection logging options.
         * If you enable client connection logging, data about client connections is sent to a
         * Cloudwatch Logs log stream. The following information is logged:
         * Client connection requests
         * Client connection results (successful and unsuccessful)
         * Reasons for unsuccessful client connection requests
         * Client connection termination time
         */
        var connectionLogOptions: aws.sdk.kotlin.services.ec2.model.ConnectionLogOptions? = null
        /**
         * A brief description of the Client VPN endpoint.
         */
        var description: kotlin.String? = null
        /**
         * Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have
         * up to two DNS servers.
         */
        var dnsServers: aws.sdk.kotlin.services.ec2.model.DnsServersOptionsModifyStructure? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The IDs of one or more security groups to apply to the target network.
         */
        var securityGroupIds: List<String>? = null
        /**
         * Specify whether to enable the self-service portal for the Client VPN endpoint.
         */
        var selfServicePortal: aws.sdk.kotlin.services.ec2.model.SelfServicePortal? = null
        /**
         * The ARN of the server certificate to be used. The server certificate must be provisioned in
         * Certificate Manager (ACM).
         */
        var serverCertificateArn: kotlin.String? = null
        /**
         * Indicates whether the VPN is split-tunnel.
         * For information about split-tunnel VPN endpoints, see <a href="https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html">Split-tunnel Client VPN endpoint in the
         * Client VPN Administrator Guide.
         */
        var splitTunnel: kotlin.Boolean? = null
        /**
         * The ID of the VPC to associate with the Client VPN endpoint.
         */
        var vpcId: kotlin.String? = null
        /**
         * The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
         * Valid Values: 443 | 1194
         * Default Value: 443
         */
        var vpnPort: kotlin.Int? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyClientVpnEndpointRequest) : this() {
            this.clientConnectOptions = x.clientConnectOptions
            this.clientVpnEndpointId = x.clientVpnEndpointId
            this.connectionLogOptions = x.connectionLogOptions
            this.description = x.description
            this.dnsServers = x.dnsServers
            this.dryRun = x.dryRun
            this.securityGroupIds = x.securityGroupIds
            this.selfServicePortal = x.selfServicePortal
            this.serverCertificateArn = x.serverCertificateArn
            this.splitTunnel = x.splitTunnel
            this.vpcId = x.vpcId
            this.vpnPort = x.vpnPort
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyClientVpnEndpointRequest = ModifyClientVpnEndpointRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ClientConnectOptions] inside the given [block]
         */
        fun clientConnectOptions(block: aws.sdk.kotlin.services.ec2.model.ClientConnectOptions.Builder.() -> kotlin.Unit) {
            this.clientConnectOptions = aws.sdk.kotlin.services.ec2.model.ClientConnectOptions.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ConnectionLogOptions] inside the given [block]
         */
        fun connectionLogOptions(block: aws.sdk.kotlin.services.ec2.model.ConnectionLogOptions.Builder.() -> kotlin.Unit) {
            this.connectionLogOptions = aws.sdk.kotlin.services.ec2.model.ConnectionLogOptions.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.DnsServersOptionsModifyStructure] inside the given [block]
         */
        fun dnsServers(block: aws.sdk.kotlin.services.ec2.model.DnsServersOptionsModifyStructure.Builder.() -> kotlin.Unit) {
            this.dnsServers = aws.sdk.kotlin.services.ec2.model.DnsServersOptionsModifyStructure.invoke(block)
        }
    }
}
