// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for DeleteVpnConnection.
 */
class DeleteVpnConnectionRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually
     * making the request, and provides an error response. If you have the required
     * permissions, the error response is DryRunOperation. Otherwise, it is
     * UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the VPN connection.
     */
    val vpnConnectionId: kotlin.String? = builder.vpnConnectionId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteVpnConnectionRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteVpnConnectionRequest(")
        append("dryRun=$dryRun,")
        append("vpnConnectionId=$vpnConnectionId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (vpnConnectionId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteVpnConnectionRequest

        if (dryRun != other.dryRun) return false
        if (vpnConnectionId != other.vpnConnectionId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteVpnConnectionRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually
         * making the request, and provides an error response. If you have the required
         * permissions, the error response is DryRunOperation. Otherwise, it is
         * UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the VPN connection.
         */
        var vpnConnectionId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteVpnConnectionRequest) : this() {
            this.dryRun = x.dryRun
            this.vpnConnectionId = x.vpnConnectionId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteVpnConnectionRequest = DeleteVpnConnectionRequest(this)
    }
}