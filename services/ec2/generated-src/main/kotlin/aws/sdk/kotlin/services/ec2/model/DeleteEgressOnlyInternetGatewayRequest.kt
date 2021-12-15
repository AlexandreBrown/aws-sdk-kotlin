// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteEgressOnlyInternetGatewayRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the egress-only internet gateway.
     */
    val egressOnlyInternetGatewayId: kotlin.String? = builder.egressOnlyInternetGatewayId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteEgressOnlyInternetGatewayRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteEgressOnlyInternetGatewayRequest(")
        append("dryRun=$dryRun,")
        append("egressOnlyInternetGatewayId=$egressOnlyInternetGatewayId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (egressOnlyInternetGatewayId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteEgressOnlyInternetGatewayRequest

        if (dryRun != other.dryRun) return false
        if (egressOnlyInternetGatewayId != other.egressOnlyInternetGatewayId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteEgressOnlyInternetGatewayRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the egress-only internet gateway.
         */
        var egressOnlyInternetGatewayId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteEgressOnlyInternetGatewayRequest) : this() {
            this.dryRun = x.dryRun
            this.egressOnlyInternetGatewayId = x.egressOnlyInternetGatewayId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteEgressOnlyInternetGatewayRequest = DeleteEgressOnlyInternetGatewayRequest(this)
    }
}
