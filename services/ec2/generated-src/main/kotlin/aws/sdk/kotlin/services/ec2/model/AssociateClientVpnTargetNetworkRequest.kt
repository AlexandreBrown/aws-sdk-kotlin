// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class AssociateClientVpnTargetNetworkRequest private constructor(builder: Builder) {
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to ensure idempotency.
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * The ID of the Client VPN endpoint.
     */
    val clientVpnEndpointId: kotlin.String? = builder.clientVpnEndpointId
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the subnet to associate with the Client VPN endpoint.
     */
    val subnetId: kotlin.String? = builder.subnetId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AssociateClientVpnTargetNetworkRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AssociateClientVpnTargetNetworkRequest(")
        append("clientToken=$clientToken,")
        append("clientVpnEndpointId=$clientVpnEndpointId,")
        append("dryRun=$dryRun,")
        append("subnetId=$subnetId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (clientVpnEndpointId?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (subnetId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AssociateClientVpnTargetNetworkRequest

        if (clientToken != other.clientToken) return false
        if (clientVpnEndpointId != other.clientVpnEndpointId) return false
        if (dryRun != other.dryRun) return false
        if (subnetId != other.subnetId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AssociateClientVpnTargetNetworkRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to ensure idempotency.
         */
        var clientToken: kotlin.String? = null
        /**
         * The ID of the Client VPN endpoint.
         */
        var clientVpnEndpointId: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the subnet to associate with the Client VPN endpoint.
         */
        var subnetId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AssociateClientVpnTargetNetworkRequest) : this() {
            this.clientToken = x.clientToken
            this.clientVpnEndpointId = x.clientVpnEndpointId
            this.dryRun = x.dryRun
            this.subnetId = x.subnetId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AssociateClientVpnTargetNetworkRequest = AssociateClientVpnTargetNetworkRequest(this)
    }
}
