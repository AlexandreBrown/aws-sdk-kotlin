// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes the properties of the Dedicated Host.
 */
class Host private constructor(builder: Builder) {
    /**
     * The time that the Dedicated Host was allocated.
     */
    val allocationTime: aws.smithy.kotlin.runtime.time.Instant? = builder.allocationTime
    /**
     * Indicates whether the Dedicated Host supports multiple instance types of the same instance family.
     * If the value is on, the Dedicated Host supports multiple instance types in the instance family.
     * If the value is off, the Dedicated Host supports a single instance type only.
     */
    val allowsMultipleInstanceTypes: aws.sdk.kotlin.services.ec2.model.AllowsMultipleInstanceTypes? = builder.allowsMultipleInstanceTypes
    /**
     * Whether auto-placement is on or off.
     */
    val autoPlacement: aws.sdk.kotlin.services.ec2.model.AutoPlacement? = builder.autoPlacement
    /**
     * The Availability Zone of the Dedicated Host.
     */
    val availabilityZone: kotlin.String? = builder.availabilityZone
    /**
     * The ID of the Availability Zone in which the Dedicated Host is allocated.
     */
    val availabilityZoneId: kotlin.String? = builder.availabilityZoneId
    /**
     * Information about the instances running on the Dedicated Host.
     */
    val availableCapacity: aws.sdk.kotlin.services.ec2.model.AvailableCapacity? = builder.availableCapacity
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring Idempotency.
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * The ID of the Dedicated Host.
     */
    val hostId: kotlin.String? = builder.hostId
    /**
     * The hardware specifications of the Dedicated Host.
     */
    val hostProperties: aws.sdk.kotlin.services.ec2.model.HostProperties? = builder.hostProperties
    /**
     * Indicates whether host recovery is enabled or disabled for the Dedicated Host.
     */
    val hostRecovery: aws.sdk.kotlin.services.ec2.model.HostRecovery? = builder.hostRecovery
    /**
     * The reservation ID of the Dedicated Host. This returns a null response
     * if the Dedicated Host doesn't have an associated reservation.
     */
    val hostReservationId: kotlin.String? = builder.hostReservationId
    /**
     * The IDs and instance type that are currently running on the Dedicated
     * Host.
     */
    val instances: List<HostInstance>? = builder.instances
    /**
     * Indicates whether the Dedicated Host is in a host resource group. If
     * memberOfServiceLinkedResourceGroup is
     * true, the host is in a host resource group; otherwise, it is not.
     */
    val memberOfServiceLinkedResourceGroup: kotlin.Boolean? = builder.memberOfServiceLinkedResourceGroup
    /**
     * The ID of the Amazon Web Services account that owns the Dedicated Host.
     */
    val ownerId: kotlin.String? = builder.ownerId
    /**
     * The time that the Dedicated Host was released.
     */
    val releaseTime: aws.smithy.kotlin.runtime.time.Instant? = builder.releaseTime
    /**
     * The Dedicated Host's state.
     */
    val state: aws.sdk.kotlin.services.ec2.model.AllocationState? = builder.state
    /**
     * Any tags assigned to the Dedicated Host.
     */
    val tags: List<Tag>? = builder.tags

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.Host = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("Host(")
        append("allocationTime=$allocationTime,")
        append("allowsMultipleInstanceTypes=$allowsMultipleInstanceTypes,")
        append("autoPlacement=$autoPlacement,")
        append("availabilityZone=$availabilityZone,")
        append("availabilityZoneId=$availabilityZoneId,")
        append("availableCapacity=$availableCapacity,")
        append("clientToken=$clientToken,")
        append("hostId=$hostId,")
        append("hostProperties=$hostProperties,")
        append("hostRecovery=$hostRecovery,")
        append("hostReservationId=$hostReservationId,")
        append("instances=$instances,")
        append("memberOfServiceLinkedResourceGroup=$memberOfServiceLinkedResourceGroup,")
        append("ownerId=$ownerId,")
        append("releaseTime=$releaseTime,")
        append("state=$state,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = allocationTime?.hashCode() ?: 0
        result = 31 * result + (allowsMultipleInstanceTypes?.hashCode() ?: 0)
        result = 31 * result + (autoPlacement?.hashCode() ?: 0)
        result = 31 * result + (availabilityZone?.hashCode() ?: 0)
        result = 31 * result + (availabilityZoneId?.hashCode() ?: 0)
        result = 31 * result + (availableCapacity?.hashCode() ?: 0)
        result = 31 * result + (clientToken?.hashCode() ?: 0)
        result = 31 * result + (hostId?.hashCode() ?: 0)
        result = 31 * result + (hostProperties?.hashCode() ?: 0)
        result = 31 * result + (hostRecovery?.hashCode() ?: 0)
        result = 31 * result + (hostReservationId?.hashCode() ?: 0)
        result = 31 * result + (instances?.hashCode() ?: 0)
        result = 31 * result + (memberOfServiceLinkedResourceGroup?.hashCode() ?: 0)
        result = 31 * result + (ownerId?.hashCode() ?: 0)
        result = 31 * result + (releaseTime?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Host

        if (allocationTime != other.allocationTime) return false
        if (allowsMultipleInstanceTypes != other.allowsMultipleInstanceTypes) return false
        if (autoPlacement != other.autoPlacement) return false
        if (availabilityZone != other.availabilityZone) return false
        if (availabilityZoneId != other.availabilityZoneId) return false
        if (availableCapacity != other.availableCapacity) return false
        if (clientToken != other.clientToken) return false
        if (hostId != other.hostId) return false
        if (hostProperties != other.hostProperties) return false
        if (hostRecovery != other.hostRecovery) return false
        if (hostReservationId != other.hostReservationId) return false
        if (instances != other.instances) return false
        if (memberOfServiceLinkedResourceGroup != other.memberOfServiceLinkedResourceGroup) return false
        if (ownerId != other.ownerId) return false
        if (releaseTime != other.releaseTime) return false
        if (state != other.state) return false
        if (tags != other.tags) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.Host = Builder(this).apply(block).build()

    class Builder {
        /**
         * The time that the Dedicated Host was allocated.
         */
        var allocationTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * Indicates whether the Dedicated Host supports multiple instance types of the same instance family.
         * If the value is on, the Dedicated Host supports multiple instance types in the instance family.
         * If the value is off, the Dedicated Host supports a single instance type only.
         */
        var allowsMultipleInstanceTypes: aws.sdk.kotlin.services.ec2.model.AllowsMultipleInstanceTypes? = null
        /**
         * Whether auto-placement is on or off.
         */
        var autoPlacement: aws.sdk.kotlin.services.ec2.model.AutoPlacement? = null
        /**
         * The Availability Zone of the Dedicated Host.
         */
        var availabilityZone: kotlin.String? = null
        /**
         * The ID of the Availability Zone in which the Dedicated Host is allocated.
         */
        var availabilityZoneId: kotlin.String? = null
        /**
         * Information about the instances running on the Dedicated Host.
         */
        var availableCapacity: aws.sdk.kotlin.services.ec2.model.AvailableCapacity? = null
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring Idempotency.
         */
        var clientToken: kotlin.String? = null
        /**
         * The ID of the Dedicated Host.
         */
        var hostId: kotlin.String? = null
        /**
         * The hardware specifications of the Dedicated Host.
         */
        var hostProperties: aws.sdk.kotlin.services.ec2.model.HostProperties? = null
        /**
         * Indicates whether host recovery is enabled or disabled for the Dedicated Host.
         */
        var hostRecovery: aws.sdk.kotlin.services.ec2.model.HostRecovery? = null
        /**
         * The reservation ID of the Dedicated Host. This returns a null response
         * if the Dedicated Host doesn't have an associated reservation.
         */
        var hostReservationId: kotlin.String? = null
        /**
         * The IDs and instance type that are currently running on the Dedicated
         * Host.
         */
        var instances: List<HostInstance>? = null
        /**
         * Indicates whether the Dedicated Host is in a host resource group. If
         * memberOfServiceLinkedResourceGroup is
         * true, the host is in a host resource group; otherwise, it is not.
         */
        var memberOfServiceLinkedResourceGroup: kotlin.Boolean? = null
        /**
         * The ID of the Amazon Web Services account that owns the Dedicated Host.
         */
        var ownerId: kotlin.String? = null
        /**
         * The time that the Dedicated Host was released.
         */
        var releaseTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The Dedicated Host's state.
         */
        var state: aws.sdk.kotlin.services.ec2.model.AllocationState? = null
        /**
         * Any tags assigned to the Dedicated Host.
         */
        var tags: List<Tag>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.Host) : this() {
            this.allocationTime = x.allocationTime
            this.allowsMultipleInstanceTypes = x.allowsMultipleInstanceTypes
            this.autoPlacement = x.autoPlacement
            this.availabilityZone = x.availabilityZone
            this.availabilityZoneId = x.availabilityZoneId
            this.availableCapacity = x.availableCapacity
            this.clientToken = x.clientToken
            this.hostId = x.hostId
            this.hostProperties = x.hostProperties
            this.hostRecovery = x.hostRecovery
            this.hostReservationId = x.hostReservationId
            this.instances = x.instances
            this.memberOfServiceLinkedResourceGroup = x.memberOfServiceLinkedResourceGroup
            this.ownerId = x.ownerId
            this.releaseTime = x.releaseTime
            this.state = x.state
            this.tags = x.tags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.Host = Host(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AvailableCapacity] inside the given [block]
         */
        fun availableCapacity(block: aws.sdk.kotlin.services.ec2.model.AvailableCapacity.Builder.() -> kotlin.Unit) {
            this.availableCapacity = aws.sdk.kotlin.services.ec2.model.AvailableCapacity.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.HostProperties] inside the given [block]
         */
        fun hostProperties(block: aws.sdk.kotlin.services.ec2.model.HostProperties.Builder.() -> kotlin.Unit) {
            this.hostProperties = aws.sdk.kotlin.services.ec2.model.HostProperties.invoke(block)
        }
    }
}
