// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a Traffic Mirror target.
 */
class TrafficMirrorTarget private constructor(builder: Builder) {
    /**
     * Information about the Traffic Mirror target.
     */
    val description: kotlin.String? = builder.description
    /**
     * The network interface ID that is attached to the target.
     */
    val networkInterfaceId: kotlin.String? = builder.networkInterfaceId
    /**
     * The Amazon Resource Name (ARN) of the Network Load Balancer.
     */
    val networkLoadBalancerArn: kotlin.String? = builder.networkLoadBalancerArn
    /**
     * The ID of the account that owns the Traffic Mirror target.
     */
    val ownerId: kotlin.String? = builder.ownerId
    /**
     * The tags assigned to the Traffic Mirror target.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * The ID of the Traffic Mirror target.
     */
    val trafficMirrorTargetId: kotlin.String? = builder.trafficMirrorTargetId
    /**
     * The type of Traffic Mirror target.
     */
    val type: aws.sdk.kotlin.services.ec2.model.TrafficMirrorTargetType? = builder.type

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.TrafficMirrorTarget = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TrafficMirrorTarget(")
        append("description=$description,")
        append("networkInterfaceId=$networkInterfaceId,")
        append("networkLoadBalancerArn=$networkLoadBalancerArn,")
        append("ownerId=$ownerId,")
        append("tags=$tags,")
        append("trafficMirrorTargetId=$trafficMirrorTargetId,")
        append("type=$type)")
    }

    override fun hashCode(): kotlin.Int {
        var result = description?.hashCode() ?: 0
        result = 31 * result + (networkInterfaceId?.hashCode() ?: 0)
        result = 31 * result + (networkLoadBalancerArn?.hashCode() ?: 0)
        result = 31 * result + (ownerId?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (trafficMirrorTargetId?.hashCode() ?: 0)
        result = 31 * result + (type?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TrafficMirrorTarget

        if (description != other.description) return false
        if (networkInterfaceId != other.networkInterfaceId) return false
        if (networkLoadBalancerArn != other.networkLoadBalancerArn) return false
        if (ownerId != other.ownerId) return false
        if (tags != other.tags) return false
        if (trafficMirrorTargetId != other.trafficMirrorTargetId) return false
        if (type != other.type) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.TrafficMirrorTarget = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the Traffic Mirror target.
         */
        var description: kotlin.String? = null
        /**
         * The network interface ID that is attached to the target.
         */
        var networkInterfaceId: kotlin.String? = null
        /**
         * The Amazon Resource Name (ARN) of the Network Load Balancer.
         */
        var networkLoadBalancerArn: kotlin.String? = null
        /**
         * The ID of the account that owns the Traffic Mirror target.
         */
        var ownerId: kotlin.String? = null
        /**
         * The tags assigned to the Traffic Mirror target.
         */
        var tags: List<Tag>? = null
        /**
         * The ID of the Traffic Mirror target.
         */
        var trafficMirrorTargetId: kotlin.String? = null
        /**
         * The type of Traffic Mirror target.
         */
        var type: aws.sdk.kotlin.services.ec2.model.TrafficMirrorTargetType? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.TrafficMirrorTarget) : this() {
            this.description = x.description
            this.networkInterfaceId = x.networkInterfaceId
            this.networkLoadBalancerArn = x.networkLoadBalancerArn
            this.ownerId = x.ownerId
            this.tags = x.tags
            this.trafficMirrorTargetId = x.trafficMirrorTargetId
            this.type = x.type
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.TrafficMirrorTarget = TrafficMirrorTarget(this)
    }
}