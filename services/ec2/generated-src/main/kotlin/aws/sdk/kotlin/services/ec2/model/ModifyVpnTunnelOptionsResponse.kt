// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyVpnTunnelOptionsResponse private constructor(builder: Builder) {
    /**
     * Describes a VPN connection.
     */
    val vpnConnection: aws.sdk.kotlin.services.ec2.model.VpnConnection? = builder.vpnConnection

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyVpnTunnelOptionsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyVpnTunnelOptionsResponse(")
        append("vpnConnection=$vpnConnection)")
    }

    override fun hashCode(): kotlin.Int {
        var result = vpnConnection?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyVpnTunnelOptionsResponse

        if (vpnConnection != other.vpnConnection) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyVpnTunnelOptionsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Describes a VPN connection.
         */
        var vpnConnection: aws.sdk.kotlin.services.ec2.model.VpnConnection? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyVpnTunnelOptionsResponse) : this() {
            this.vpnConnection = x.vpnConnection
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyVpnTunnelOptionsResponse = ModifyVpnTunnelOptionsResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.VpnConnection] inside the given [block]
         */
        fun vpnConnection(block: aws.sdk.kotlin.services.ec2.model.VpnConnection.Builder.() -> kotlin.Unit) {
            this.vpnConnection = aws.sdk.kotlin.services.ec2.model.VpnConnection.invoke(block)
        }
    }
}