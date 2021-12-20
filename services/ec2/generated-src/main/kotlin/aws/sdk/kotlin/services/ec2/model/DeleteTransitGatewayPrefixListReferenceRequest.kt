// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteTransitGatewayPrefixListReferenceRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the prefix list.
     */
    val prefixListId: kotlin.String? = builder.prefixListId
    /**
     * The ID of the route table.
     */
    val transitGatewayRouteTableId: kotlin.String? = builder.transitGatewayRouteTableId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteTransitGatewayPrefixListReferenceRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteTransitGatewayPrefixListReferenceRequest(")
        append("dryRun=$dryRun,")
        append("prefixListId=$prefixListId,")
        append("transitGatewayRouteTableId=$transitGatewayRouteTableId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (prefixListId?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayRouteTableId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteTransitGatewayPrefixListReferenceRequest

        if (dryRun != other.dryRun) return false
        if (prefixListId != other.prefixListId) return false
        if (transitGatewayRouteTableId != other.transitGatewayRouteTableId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteTransitGatewayPrefixListReferenceRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the prefix list.
         */
        var prefixListId: kotlin.String? = null
        /**
         * The ID of the route table.
         */
        var transitGatewayRouteTableId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteTransitGatewayPrefixListReferenceRequest) : this() {
            this.dryRun = x.dryRun
            this.prefixListId = x.prefixListId
            this.transitGatewayRouteTableId = x.transitGatewayRouteTableId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteTransitGatewayPrefixListReferenceRequest = DeleteTransitGatewayPrefixListReferenceRequest(this)
    }
}