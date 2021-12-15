// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a route table propagation.
 */
class TransitGatewayRouteTablePropagation private constructor(builder: Builder) {
    /**
     * The ID of the resource.
     */
    val resourceId: kotlin.String? = builder.resourceId
    /**
     * The type of resource. Note that the tgw-peering resource type has been deprecated.
     */
    val resourceType: aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachmentResourceType? = builder.resourceType
    /**
     * The state of the resource.
     */
    val state: aws.sdk.kotlin.services.ec2.model.TransitGatewayPropagationState? = builder.state
    /**
     * The ID of the attachment.
     */
    val transitGatewayAttachmentId: kotlin.String? = builder.transitGatewayAttachmentId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.TransitGatewayRouteTablePropagation = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TransitGatewayRouteTablePropagation(")
        append("resourceId=$resourceId,")
        append("resourceType=$resourceType,")
        append("state=$state,")
        append("transitGatewayAttachmentId=$transitGatewayAttachmentId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = resourceId?.hashCode() ?: 0
        result = 31 * result + (resourceType?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayAttachmentId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TransitGatewayRouteTablePropagation

        if (resourceId != other.resourceId) return false
        if (resourceType != other.resourceType) return false
        if (state != other.state) return false
        if (transitGatewayAttachmentId != other.transitGatewayAttachmentId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.TransitGatewayRouteTablePropagation = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the resource.
         */
        var resourceId: kotlin.String? = null
        /**
         * The type of resource. Note that the tgw-peering resource type has been deprecated.
         */
        var resourceType: aws.sdk.kotlin.services.ec2.model.TransitGatewayAttachmentResourceType? = null
        /**
         * The state of the resource.
         */
        var state: aws.sdk.kotlin.services.ec2.model.TransitGatewayPropagationState? = null
        /**
         * The ID of the attachment.
         */
        var transitGatewayAttachmentId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.TransitGatewayRouteTablePropagation) : this() {
            this.resourceId = x.resourceId
            this.resourceType = x.resourceType
            this.state = x.state
            this.transitGatewayAttachmentId = x.transitGatewayAttachmentId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.TransitGatewayRouteTablePropagation = TransitGatewayRouteTablePropagation(this)
    }
}
