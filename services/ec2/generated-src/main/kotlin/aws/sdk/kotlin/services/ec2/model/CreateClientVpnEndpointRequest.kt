// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateClientVpnEndpointRequest private constructor(builder: Builder) {
    /**
     * Information about the authentication method to be used to authenticate clients.
     */
    val authenticationOptions: List<ClientVpnAuthenticationRequest>? = builder.authenticationOptions
    /**
     * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
     */
    val clientCidrBlock: kotlin.String? = builder.clientCidrBlock
    /**
     * The options for managing connection authorization for new client connections.
     */
    val clientConnectOptions: aws.sdk.kotlin.services.ec2.model.ClientConnectOptions? = builder.clientConnectOptions
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to ensure idempotency.
     */
    val clientToken: kotlin.String? = builder.clientToken
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
     * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can
     * have up to two DNS servers. If no DNS server is specified, the DNS address configured on the device is used for the DNS server.
     */
    val dnsServers: List<String>? = builder.dnsServers
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The IDs of one or more security groups to apply to the target network. You must also specify the ID of the VPC that contains the security groups.
     */
    val securityGroupIds: List<String>? = builder.securityGroupIds
    /**
     * Specify whether to enable the self-service portal for the Client VPN endpoint.
     * Default Value: enabled
     */
    val selfServicePortal: aws.sdk.kotlin.services.ec2.model.SelfServicePortal? = builder.selfServicePortal
    /**
     * The ARN of the server certificate. For more information, see
     * the <a href="https://docs.aws.amazon.com/acm/latest/userguide/">Certificate Manager User Guide.
     */
    val serverCertificateArn: kotlin.String? = builder.serverCertificateArn
    /**
     * Indicates whether split-tunnel is enabled on the Client VPN endpoint.
     * By default, split-tunnel on a VPN endpoint is disabled.
     * For information about split-tunnel VPN endpoints, see <a href="https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html">Split-tunnel Client VPN endpoint in the
     * Client VPN Administrator Guide.
     */
    val splitTunnel: kotlin.Boolean? = builder.splitTunnel
    /**
     * The tags to apply to the Client VPN endpoint during creation.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications
    /**
     * The transport protocol to be used by the VPN session.
     * Default value: udp
     */
    val transportProtocol: aws.sdk.kotlin.services.ec2.model.TransportProtocol? = builder.transportProtocol
    /**
     * The ID of the VPC to associate with the Client VPN endpoint. If no security group IDs are specified in the request, the default security group for the VPC is applied.
     */
    val vpcId: kotlin.String? = builder.vpcId
    /**
     * The port number to assign to the Client VPN endpoint for TCP and UDP traffic.
     * Valid Values: 443 | 1194
     * Default Value: 443
     */
    val vpnPort: kotlin.Int? = builder.vpnPort

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateClientVpnEndpointRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateClientVpnEndpointRequest(")
        append("authenticationOptions=$authenticationOptions,")
        append("clientCidrBlock=$clientCidrBlock,")
        append("clientConnectOptions=$clientConnectOptions,")
        append("clientToken=$clientToken,")
        append("connectionLogOptions=$connectionLogOptions,")
        append("description=$description,")
        append("dnsServers=$dnsServers,")
        append("dryRun=$dryRun,")
        append("securityGroupIds=$securityGroupIds,")
        append("selfServicePortal=$selfServicePortal,")
        append("serverCertificateArn=$serverCertificateArn,")
        append("splitTunnel=$splitTunnel,")
        append("tagSpecifications=$tagSpecifications,")
        append("transportProtocol=$transportProtocol,")
        append("vpcId=$vpcId,")
        append("vpnPort=$vpnPort)")
    }

    override fun hashCode(): kotlin.Int {
        var result = authenticationOptions?.hashCode() ?: 0
        result = 31 * result + (clientCidrBlock?.hashCode() ?: 0)
        result = 31 * result + (clientConnectOptions?.hashCode() ?: 0)
        result = 31 * result + (clientToken?.hashCode() ?: 0)
        result = 31 * result + (connectionLogOptions?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (dnsServers?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (securityGroupIds?.hashCode() ?: 0)
        result = 31 * result + (selfServicePortal?.hashCode() ?: 0)
        result = 31 * result + (serverCertificateArn?.hashCode() ?: 0)
        result = 31 * result + (splitTunnel?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        result = 31 * result + (transportProtocol?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        result = 31 * result + (vpnPort ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateClientVpnEndpointRequest

        if (authenticationOptions != other.authenticationOptions) return false
        if (clientCidrBlock != other.clientCidrBlock) return false
        if (clientConnectOptions != other.clientConnectOptions) return false
        if (clientToken != other.clientToken) return false
        if (connectionLogOptions != other.connectionLogOptions) return false
        if (description != other.description) return false
        if (dnsServers != other.dnsServers) return false
        if (dryRun != other.dryRun) return false
        if (securityGroupIds != other.securityGroupIds) return false
        if (selfServicePortal != other.selfServicePortal) return false
        if (serverCertificateArn != other.serverCertificateArn) return false
        if (splitTunnel != other.splitTunnel) return false
        if (tagSpecifications != other.tagSpecifications) return false
        if (transportProtocol != other.transportProtocol) return false
        if (vpcId != other.vpcId) return false
        if (vpnPort != other.vpnPort) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateClientVpnEndpointRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the authentication method to be used to authenticate clients.
         */
        var authenticationOptions: List<ClientVpnAuthenticationRequest>? = null
        /**
         * The IPv4 address range, in CIDR notation, from which to assign client IP addresses. The address range cannot overlap with the local CIDR of the VPC in which the associated subnet is located, or the routes that you add manually. The address range cannot be changed after the Client VPN endpoint has been created. The CIDR block should be /22 or greater.
         */
        var clientCidrBlock: kotlin.String? = null
        /**
         * The options for managing connection authorization for new client connections.
         */
        var clientConnectOptions: aws.sdk.kotlin.services.ec2.model.ClientConnectOptions? = null
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to ensure idempotency.
         */
        var clientToken: kotlin.String? = null
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
         * Information about the DNS servers to be used for DNS resolution. A Client VPN endpoint can
         * have up to two DNS servers. If no DNS server is specified, the DNS address configured on the device is used for the DNS server.
         */
        var dnsServers: List<String>? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The IDs of one or more security groups to apply to the target network. You must also specify the ID of the VPC that contains the security groups.
         */
        var securityGroupIds: List<String>? = null
        /**
         * Specify whether to enable the self-service portal for the Client VPN endpoint.
         * Default Value: enabled
         */
        var selfServicePortal: aws.sdk.kotlin.services.ec2.model.SelfServicePortal? = null
        /**
         * The ARN of the server certificate. For more information, see
         * the <a href="https://docs.aws.amazon.com/acm/latest/userguide/">Certificate Manager User Guide.
         */
        var serverCertificateArn: kotlin.String? = null
        /**
         * Indicates whether split-tunnel is enabled on the Client VPN endpoint.
         * By default, split-tunnel on a VPN endpoint is disabled.
         * For information about split-tunnel VPN endpoints, see <a href="https://docs.aws.amazon.com/vpn/latest/clientvpn-admin/split-tunnel-vpn.html">Split-tunnel Client VPN endpoint in the
         * Client VPN Administrator Guide.
         */
        var splitTunnel: kotlin.Boolean? = null
        /**
         * The tags to apply to the Client VPN endpoint during creation.
         */
        var tagSpecifications: List<TagSpecification>? = null
        /**
         * The transport protocol to be used by the VPN session.
         * Default value: udp
         */
        var transportProtocol: aws.sdk.kotlin.services.ec2.model.TransportProtocol? = null
        /**
         * The ID of the VPC to associate with the Client VPN endpoint. If no security group IDs are specified in the request, the default security group for the VPC is applied.
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
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateClientVpnEndpointRequest) : this() {
            this.authenticationOptions = x.authenticationOptions
            this.clientCidrBlock = x.clientCidrBlock
            this.clientConnectOptions = x.clientConnectOptions
            this.clientToken = x.clientToken
            this.connectionLogOptions = x.connectionLogOptions
            this.description = x.description
            this.dnsServers = x.dnsServers
            this.dryRun = x.dryRun
            this.securityGroupIds = x.securityGroupIds
            this.selfServicePortal = x.selfServicePortal
            this.serverCertificateArn = x.serverCertificateArn
            this.splitTunnel = x.splitTunnel
            this.tagSpecifications = x.tagSpecifications
            this.transportProtocol = x.transportProtocol
            this.vpcId = x.vpcId
            this.vpnPort = x.vpnPort
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateClientVpnEndpointRequest = CreateClientVpnEndpointRequest(this)

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
    }
}