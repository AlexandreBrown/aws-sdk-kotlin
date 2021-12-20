// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a route for a local gateway route table.
 */
class LocalGatewayRoute private constructor(builder: Builder) {
    /**
     * The CIDR block used for destination matches.
     */
    val destinationCidrBlock: kotlin.String? = builder.destinationCidrBlock
    /**
     * The Amazon Resource Name (ARN) of the local gateway route table.
     */
    val localGatewayRouteTableArn: kotlin.String? = builder.localGatewayRouteTableArn
    /**
     * The ID of the local gateway route table.
     */
    val localGatewayRouteTableId: kotlin.String? = builder.localGatewayRouteTableId
    /**
     * The ID of the virtual interface group.
     */
    val localGatewayVirtualInterfaceGroupId: kotlin.String? = builder.localGatewayVirtualInterfaceGroupId
    /**
     * The ID of the Amazon Web Services account that owns the local gateway route.
     */
    val ownerId: kotlin.String? = builder.ownerId
    /**
     * The state of the route.
     */
    val state: aws.sdk.kotlin.services.ec2.model.LocalGatewayRouteState? = builder.state
    /**
     * The route type.
     */
    val type: aws.sdk.kotlin.services.ec2.model.LocalGatewayRouteType? = builder.type

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.LocalGatewayRoute = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LocalGatewayRoute(")
        append("destinationCidrBlock=$destinationCidrBlock,")
        append("localGatewayRouteTableArn=$localGatewayRouteTableArn,")
        append("localGatewayRouteTableId=$localGatewayRouteTableId,")
        append("localGatewayVirtualInterfaceGroupId=$localGatewayVirtualInterfaceGroupId,")
        append("ownerId=$ownerId,")
        append("state=$state,")
        append("type=$type)")
    }

    override fun hashCode(): kotlin.Int {
        var result = destinationCidrBlock?.hashCode() ?: 0
        result = 31 * result + (localGatewayRouteTableArn?.hashCode() ?: 0)
        result = 31 * result + (localGatewayRouteTableId?.hashCode() ?: 0)
        result = 31 * result + (localGatewayVirtualInterfaceGroupId?.hashCode() ?: 0)
        result = 31 * result + (ownerId?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (type?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LocalGatewayRoute

        if (destinationCidrBlock != other.destinationCidrBlock) return false
        if (localGatewayRouteTableArn != other.localGatewayRouteTableArn) return false
        if (localGatewayRouteTableId != other.localGatewayRouteTableId) return false
        if (localGatewayVirtualInterfaceGroupId != other.localGatewayVirtualInterfaceGroupId) return false
        if (ownerId != other.ownerId) return false
        if (state != other.state) return false
        if (type != other.type) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.LocalGatewayRoute = Builder(this).apply(block).build()

    class Builder {
        /**
         * The CIDR block used for destination matches.
         */
        var destinationCidrBlock: kotlin.String? = null
        /**
         * The Amazon Resource Name (ARN) of the local gateway route table.
         */
        var localGatewayRouteTableArn: kotlin.String? = null
        /**
         * The ID of the local gateway route table.
         */
        var localGatewayRouteTableId: kotlin.String? = null
        /**
         * The ID of the virtual interface group.
         */
        var localGatewayVirtualInterfaceGroupId: kotlin.String? = null
        /**
         * The ID of the Amazon Web Services account that owns the local gateway route.
         */
        var ownerId: kotlin.String? = null
        /**
         * The state of the route.
         */
        var state: aws.sdk.kotlin.services.ec2.model.LocalGatewayRouteState? = null
        /**
         * The route type.
         */
        var type: aws.sdk.kotlin.services.ec2.model.LocalGatewayRouteType? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.LocalGatewayRoute) : this() {
            this.destinationCidrBlock = x.destinationCidrBlock
            this.localGatewayRouteTableArn = x.localGatewayRouteTableArn
            this.localGatewayRouteTableId = x.localGatewayRouteTableId
            this.localGatewayVirtualInterfaceGroupId = x.localGatewayVirtualInterfaceGroupId
            this.ownerId = x.ownerId
            this.state = x.state
            this.type = x.type
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.LocalGatewayRoute = LocalGatewayRoute(this)
    }
}