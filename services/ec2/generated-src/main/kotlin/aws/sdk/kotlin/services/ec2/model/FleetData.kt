// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes an EC2 Fleet.
 */
class FleetData private constructor(builder: Builder) {
    /**
     * The progress of the EC2 Fleet. If there is an error, the status is error. After
     * all requests are placed, the status is pending_fulfillment. If the size of the
     * EC2 Fleet is equal to or greater than its target capacity, the status is fulfilled.
     * If the size of the EC2 Fleet is decreased, the status is pending_termination while
     * instances are terminating.
     */
    val activityStatus: aws.sdk.kotlin.services.ec2.model.FleetActivityStatus? = builder.activityStatus
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
     * request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency.
     * Constraints: Maximum 64 ASCII characters
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * Reserved.
     */
    val context: kotlin.String? = builder.context
    /**
     * The creation date and time of the EC2 Fleet.
     */
    val createTime: aws.smithy.kotlin.runtime.time.Instant? = builder.createTime
    /**
     * Information about the instances that could not be launched by the fleet. Valid only when
     * Type is set to instant.
     */
    val errors: List<DescribeFleetError>? = builder.errors
    /**
     * Indicates whether running instances should be terminated if the target capacity of the
     * EC2 Fleet is decreased below the current size of the EC2 Fleet.
     */
    val excessCapacityTerminationPolicy: aws.sdk.kotlin.services.ec2.model.FleetExcessCapacityTerminationPolicy? = builder.excessCapacityTerminationPolicy
    /**
     * The ID of the EC2 Fleet.
     */
    val fleetId: kotlin.String? = builder.fleetId
    /**
     * The state of the EC2 Fleet.
     */
    val fleetState: aws.sdk.kotlin.services.ec2.model.FleetStateCode? = builder.fleetState
    /**
     * The number of units fulfilled by this request compared to the set target
     * capacity.
     */
    val fulfilledCapacity: kotlin.Double? = builder.fulfilledCapacity
    /**
     * The number of units fulfilled by this request compared to the set target On-Demand
     * capacity.
     */
    val fulfilledOnDemandCapacity: kotlin.Double? = builder.fulfilledOnDemandCapacity
    /**
     * Information about the instances that were launched by the fleet. Valid only when
     * Type is set to instant.
     */
    val instances: List<DescribeFleetsInstances>? = builder.instances
    /**
     * The launch template and overrides.
     */
    val launchTemplateConfigs: List<FleetLaunchTemplateConfig>? = builder.launchTemplateConfigs
    /**
     * The allocation strategy of On-Demand Instances in an EC2 Fleet.
     */
    val onDemandOptions: aws.sdk.kotlin.services.ec2.model.OnDemandOptions? = builder.onDemandOptions
    /**
     * Indicates whether EC2 Fleet should replace unhealthy Spot Instances. Supported only for
     * fleets of type maintain. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/manage-ec2-fleet.html#ec2-fleet-health-checks">EC2 Fleet
     * health checks in the Amazon EC2 User Guide.
     */
    val replaceUnhealthyInstances: kotlin.Boolean? = builder.replaceUnhealthyInstances
    /**
     * The configuration of Spot Instances in an EC2 Fleet.
     */
    val spotOptions: aws.sdk.kotlin.services.ec2.model.SpotOptions? = builder.spotOptions
    /**
     * The tags for an EC2 Fleet resource.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * The number of units to request. You can choose to set the target capacity in terms of
     * instances or a performance characteristic that is important to your application workload,
     * such as vCPUs, memory, or I/O. If the request type is maintain, you can
     * specify a target capacity of 0 and add capacity later.
     */
    val targetCapacitySpecification: aws.sdk.kotlin.services.ec2.model.TargetCapacitySpecification? = builder.targetCapacitySpecification
    /**
     * Indicates whether running instances should be terminated when the EC2 Fleet expires.
     */
    val terminateInstancesWithExpiration: kotlin.Boolean? = builder.terminateInstancesWithExpiration
    /**
     * The type of request. Indicates whether the EC2 Fleet only requests the target
     * capacity, or also attempts to maintain it. If you request a certain target
     * capacity, EC2 Fleet only places the required requests; it does not attempt to replenish
     * instances if capacity is diminished, and it does not submit requests in alternative
     * capacity pools if capacity is unavailable. To maintain a certain target capacity, EC2 Fleet
     * places the required requests to meet this target capacity. It also automatically
     * replenishes any interrupted Spot Instances. Default: maintain.
     */
    val type: aws.sdk.kotlin.services.ec2.model.FleetType? = builder.type
    /**
     * The start date and time of the request, in UTC format (for example,
     * YYYY-MM-DDTHH:MM:SSZ).
     * The default is to start fulfilling the request immediately.
     */
    val validFrom: aws.smithy.kotlin.runtime.time.Instant? = builder.validFrom
    /**
     * The end date and time of the request, in UTC format (for example,
     * YYYY-MM-DDTHH:MM:SSZ).
     * At this point, no new instance requests are placed or able to fulfill the request. The
     * default end date is 7 days from the current date.
     */
    val validUntil: aws.smithy.kotlin.runtime.time.Instant? = builder.validUntil

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.FleetData = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("FleetData(")
        append("activityStatus=$activityStatus,")
        append("clientToken=$clientToken,")
        append("context=$context,")
        append("createTime=$createTime,")
        append("errors=$errors,")
        append("excessCapacityTerminationPolicy=$excessCapacityTerminationPolicy,")
        append("fleetId=$fleetId,")
        append("fleetState=$fleetState,")
        append("fulfilledCapacity=$fulfilledCapacity,")
        append("fulfilledOnDemandCapacity=$fulfilledOnDemandCapacity,")
        append("instances=$instances,")
        append("launchTemplateConfigs=$launchTemplateConfigs,")
        append("onDemandOptions=$onDemandOptions,")
        append("replaceUnhealthyInstances=$replaceUnhealthyInstances,")
        append("spotOptions=$spotOptions,")
        append("tags=$tags,")
        append("targetCapacitySpecification=$targetCapacitySpecification,")
        append("terminateInstancesWithExpiration=$terminateInstancesWithExpiration,")
        append("type=$type,")
        append("validFrom=$validFrom,")
        append("validUntil=$validUntil)")
    }

    override fun hashCode(): kotlin.Int {
        var result = activityStatus?.hashCode() ?: 0
        result = 31 * result + (clientToken?.hashCode() ?: 0)
        result = 31 * result + (context?.hashCode() ?: 0)
        result = 31 * result + (createTime?.hashCode() ?: 0)
        result = 31 * result + (errors?.hashCode() ?: 0)
        result = 31 * result + (excessCapacityTerminationPolicy?.hashCode() ?: 0)
        result = 31 * result + (fleetId?.hashCode() ?: 0)
        result = 31 * result + (fleetState?.hashCode() ?: 0)
        result = 31 * result + (fulfilledCapacity?.hashCode() ?: 0)
        result = 31 * result + (fulfilledOnDemandCapacity?.hashCode() ?: 0)
        result = 31 * result + (instances?.hashCode() ?: 0)
        result = 31 * result + (launchTemplateConfigs?.hashCode() ?: 0)
        result = 31 * result + (onDemandOptions?.hashCode() ?: 0)
        result = 31 * result + (replaceUnhealthyInstances?.hashCode() ?: 0)
        result = 31 * result + (spotOptions?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (targetCapacitySpecification?.hashCode() ?: 0)
        result = 31 * result + (terminateInstancesWithExpiration?.hashCode() ?: 0)
        result = 31 * result + (type?.hashCode() ?: 0)
        result = 31 * result + (validFrom?.hashCode() ?: 0)
        result = 31 * result + (validUntil?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as FleetData

        if (activityStatus != other.activityStatus) return false
        if (clientToken != other.clientToken) return false
        if (context != other.context) return false
        if (createTime != other.createTime) return false
        if (errors != other.errors) return false
        if (excessCapacityTerminationPolicy != other.excessCapacityTerminationPolicy) return false
        if (fleetId != other.fleetId) return false
        if (fleetState != other.fleetState) return false
        if (fulfilledCapacity != other.fulfilledCapacity) return false
        if (fulfilledOnDemandCapacity != other.fulfilledOnDemandCapacity) return false
        if (instances != other.instances) return false
        if (launchTemplateConfigs != other.launchTemplateConfigs) return false
        if (onDemandOptions != other.onDemandOptions) return false
        if (replaceUnhealthyInstances != other.replaceUnhealthyInstances) return false
        if (spotOptions != other.spotOptions) return false
        if (tags != other.tags) return false
        if (targetCapacitySpecification != other.targetCapacitySpecification) return false
        if (terminateInstancesWithExpiration != other.terminateInstancesWithExpiration) return false
        if (type != other.type) return false
        if (validFrom != other.validFrom) return false
        if (validUntil != other.validUntil) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.FleetData = Builder(this).apply(block).build()

    class Builder {
        /**
         * The progress of the EC2 Fleet. If there is an error, the status is error. After
         * all requests are placed, the status is pending_fulfillment. If the size of the
         * EC2 Fleet is equal to or greater than its target capacity, the status is fulfilled.
         * If the size of the EC2 Fleet is decreased, the status is pending_termination while
         * instances are terminating.
         */
        var activityStatus: aws.sdk.kotlin.services.ec2.model.FleetActivityStatus? = null
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
         * request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
         * Idempotency.
         * Constraints: Maximum 64 ASCII characters
         */
        var clientToken: kotlin.String? = null
        /**
         * Reserved.
         */
        var context: kotlin.String? = null
        /**
         * The creation date and time of the EC2 Fleet.
         */
        var createTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * Information about the instances that could not be launched by the fleet. Valid only when
         * Type is set to instant.
         */
        var errors: List<DescribeFleetError>? = null
        /**
         * Indicates whether running instances should be terminated if the target capacity of the
         * EC2 Fleet is decreased below the current size of the EC2 Fleet.
         */
        var excessCapacityTerminationPolicy: aws.sdk.kotlin.services.ec2.model.FleetExcessCapacityTerminationPolicy? = null
        /**
         * The ID of the EC2 Fleet.
         */
        var fleetId: kotlin.String? = null
        /**
         * The state of the EC2 Fleet.
         */
        var fleetState: aws.sdk.kotlin.services.ec2.model.FleetStateCode? = null
        /**
         * The number of units fulfilled by this request compared to the set target
         * capacity.
         */
        var fulfilledCapacity: kotlin.Double? = null
        /**
         * The number of units fulfilled by this request compared to the set target On-Demand
         * capacity.
         */
        var fulfilledOnDemandCapacity: kotlin.Double? = null
        /**
         * Information about the instances that were launched by the fleet. Valid only when
         * Type is set to instant.
         */
        var instances: List<DescribeFleetsInstances>? = null
        /**
         * The launch template and overrides.
         */
        var launchTemplateConfigs: List<FleetLaunchTemplateConfig>? = null
        /**
         * The allocation strategy of On-Demand Instances in an EC2 Fleet.
         */
        var onDemandOptions: aws.sdk.kotlin.services.ec2.model.OnDemandOptions? = null
        /**
         * Indicates whether EC2 Fleet should replace unhealthy Spot Instances. Supported only for
         * fleets of type maintain. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/manage-ec2-fleet.html#ec2-fleet-health-checks">EC2 Fleet
         * health checks in the Amazon EC2 User Guide.
         */
        var replaceUnhealthyInstances: kotlin.Boolean? = null
        /**
         * The configuration of Spot Instances in an EC2 Fleet.
         */
        var spotOptions: aws.sdk.kotlin.services.ec2.model.SpotOptions? = null
        /**
         * The tags for an EC2 Fleet resource.
         */
        var tags: List<Tag>? = null
        /**
         * The number of units to request. You can choose to set the target capacity in terms of
         * instances or a performance characteristic that is important to your application workload,
         * such as vCPUs, memory, or I/O. If the request type is maintain, you can
         * specify a target capacity of 0 and add capacity later.
         */
        var targetCapacitySpecification: aws.sdk.kotlin.services.ec2.model.TargetCapacitySpecification? = null
        /**
         * Indicates whether running instances should be terminated when the EC2 Fleet expires.
         */
        var terminateInstancesWithExpiration: kotlin.Boolean? = null
        /**
         * The type of request. Indicates whether the EC2 Fleet only requests the target
         * capacity, or also attempts to maintain it. If you request a certain target
         * capacity, EC2 Fleet only places the required requests; it does not attempt to replenish
         * instances if capacity is diminished, and it does not submit requests in alternative
         * capacity pools if capacity is unavailable. To maintain a certain target capacity, EC2 Fleet
         * places the required requests to meet this target capacity. It also automatically
         * replenishes any interrupted Spot Instances. Default: maintain.
         */
        var type: aws.sdk.kotlin.services.ec2.model.FleetType? = null
        /**
         * The start date and time of the request, in UTC format (for example,
         * YYYY-MM-DDTHH:MM:SSZ).
         * The default is to start fulfilling the request immediately.
         */
        var validFrom: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The end date and time of the request, in UTC format (for example,
         * YYYY-MM-DDTHH:MM:SSZ).
         * At this point, no new instance requests are placed or able to fulfill the request. The
         * default end date is 7 days from the current date.
         */
        var validUntil: aws.smithy.kotlin.runtime.time.Instant? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.FleetData) : this() {
            this.activityStatus = x.activityStatus
            this.clientToken = x.clientToken
            this.context = x.context
            this.createTime = x.createTime
            this.errors = x.errors
            this.excessCapacityTerminationPolicy = x.excessCapacityTerminationPolicy
            this.fleetId = x.fleetId
            this.fleetState = x.fleetState
            this.fulfilledCapacity = x.fulfilledCapacity
            this.fulfilledOnDemandCapacity = x.fulfilledOnDemandCapacity
            this.instances = x.instances
            this.launchTemplateConfigs = x.launchTemplateConfigs
            this.onDemandOptions = x.onDemandOptions
            this.replaceUnhealthyInstances = x.replaceUnhealthyInstances
            this.spotOptions = x.spotOptions
            this.tags = x.tags
            this.targetCapacitySpecification = x.targetCapacitySpecification
            this.terminateInstancesWithExpiration = x.terminateInstancesWithExpiration
            this.type = x.type
            this.validFrom = x.validFrom
            this.validUntil = x.validUntil
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.FleetData = FleetData(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.OnDemandOptions] inside the given [block]
         */
        fun onDemandOptions(block: aws.sdk.kotlin.services.ec2.model.OnDemandOptions.Builder.() -> kotlin.Unit) {
            this.onDemandOptions = aws.sdk.kotlin.services.ec2.model.OnDemandOptions.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.SpotOptions] inside the given [block]
         */
        fun spotOptions(block: aws.sdk.kotlin.services.ec2.model.SpotOptions.Builder.() -> kotlin.Unit) {
            this.spotOptions = aws.sdk.kotlin.services.ec2.model.SpotOptions.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TargetCapacitySpecification] inside the given [block]
         */
        fun targetCapacitySpecification(block: aws.sdk.kotlin.services.ec2.model.TargetCapacitySpecification.Builder.() -> kotlin.Unit) {
            this.targetCapacitySpecification = aws.sdk.kotlin.services.ec2.model.TargetCapacitySpecification.invoke(block)
        }
    }
}
