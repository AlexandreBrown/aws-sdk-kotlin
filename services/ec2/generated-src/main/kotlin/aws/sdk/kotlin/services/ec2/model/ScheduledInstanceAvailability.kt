// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes a schedule that is available for your Scheduled Instances.
 */
class ScheduledInstanceAvailability private constructor(builder: Builder) {
    /**
     * The Availability Zone.
     */
    val availabilityZone: kotlin.String? = builder.availabilityZone
    /**
     * The number of available instances.
     */
    val availableInstanceCount: kotlin.Int? = builder.availableInstanceCount
    /**
     * The time period for the first schedule to start.
     */
    val firstSlotStartTime: aws.smithy.kotlin.runtime.time.Instant? = builder.firstSlotStartTime
    /**
     * The hourly price for a single instance.
     */
    val hourlyPrice: kotlin.String? = builder.hourlyPrice
    /**
     * The instance type. You can specify one of the C3, C4, M4, or R3 instance types.
     */
    val instanceType: kotlin.String? = builder.instanceType
    /**
     * The maximum term. The only possible value is 365 days.
     */
    val maxTermDurationInDays: kotlin.Int? = builder.maxTermDurationInDays
    /**
     * The minimum term. The only possible value is 365 days.
     */
    val minTermDurationInDays: kotlin.Int? = builder.minTermDurationInDays
    /**
     * The network platform (EC2-Classic or EC2-VPC).
     */
    val networkPlatform: kotlin.String? = builder.networkPlatform
    /**
     * The platform (Linux/UNIX or Windows).
     */
    val platform: kotlin.String? = builder.platform
    /**
     * The purchase token. This token expires in two hours.
     */
    val purchaseToken: kotlin.String? = builder.purchaseToken
    /**
     * The schedule recurrence.
     */
    val recurrence: aws.sdk.kotlin.services.ec2.model.ScheduledInstanceRecurrence? = builder.recurrence
    /**
     * The number of hours in the schedule.
     */
    val slotDurationInHours: kotlin.Int? = builder.slotDurationInHours
    /**
     * The total number of hours for a single instance for the entire term.
     */
    val totalScheduledInstanceHours: kotlin.Int? = builder.totalScheduledInstanceHours

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ScheduledInstanceAvailability = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ScheduledInstanceAvailability(")
        append("availabilityZone=$availabilityZone,")
        append("availableInstanceCount=$availableInstanceCount,")
        append("firstSlotStartTime=$firstSlotStartTime,")
        append("hourlyPrice=$hourlyPrice,")
        append("instanceType=$instanceType,")
        append("maxTermDurationInDays=$maxTermDurationInDays,")
        append("minTermDurationInDays=$minTermDurationInDays,")
        append("networkPlatform=$networkPlatform,")
        append("platform=$platform,")
        append("purchaseToken=$purchaseToken,")
        append("recurrence=$recurrence,")
        append("slotDurationInHours=$slotDurationInHours,")
        append("totalScheduledInstanceHours=$totalScheduledInstanceHours)")
    }

    override fun hashCode(): kotlin.Int {
        var result = availabilityZone?.hashCode() ?: 0
        result = 31 * result + (availableInstanceCount ?: 0)
        result = 31 * result + (firstSlotStartTime?.hashCode() ?: 0)
        result = 31 * result + (hourlyPrice?.hashCode() ?: 0)
        result = 31 * result + (instanceType?.hashCode() ?: 0)
        result = 31 * result + (maxTermDurationInDays ?: 0)
        result = 31 * result + (minTermDurationInDays ?: 0)
        result = 31 * result + (networkPlatform?.hashCode() ?: 0)
        result = 31 * result + (platform?.hashCode() ?: 0)
        result = 31 * result + (purchaseToken?.hashCode() ?: 0)
        result = 31 * result + (recurrence?.hashCode() ?: 0)
        result = 31 * result + (slotDurationInHours ?: 0)
        result = 31 * result + (totalScheduledInstanceHours ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ScheduledInstanceAvailability

        if (availabilityZone != other.availabilityZone) return false
        if (availableInstanceCount != other.availableInstanceCount) return false
        if (firstSlotStartTime != other.firstSlotStartTime) return false
        if (hourlyPrice != other.hourlyPrice) return false
        if (instanceType != other.instanceType) return false
        if (maxTermDurationInDays != other.maxTermDurationInDays) return false
        if (minTermDurationInDays != other.minTermDurationInDays) return false
        if (networkPlatform != other.networkPlatform) return false
        if (platform != other.platform) return false
        if (purchaseToken != other.purchaseToken) return false
        if (recurrence != other.recurrence) return false
        if (slotDurationInHours != other.slotDurationInHours) return false
        if (totalScheduledInstanceHours != other.totalScheduledInstanceHours) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ScheduledInstanceAvailability = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Availability Zone.
         */
        var availabilityZone: kotlin.String? = null
        /**
         * The number of available instances.
         */
        var availableInstanceCount: kotlin.Int? = null
        /**
         * The time period for the first schedule to start.
         */
        var firstSlotStartTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The hourly price for a single instance.
         */
        var hourlyPrice: kotlin.String? = null
        /**
         * The instance type. You can specify one of the C3, C4, M4, or R3 instance types.
         */
        var instanceType: kotlin.String? = null
        /**
         * The maximum term. The only possible value is 365 days.
         */
        var maxTermDurationInDays: kotlin.Int? = null
        /**
         * The minimum term. The only possible value is 365 days.
         */
        var minTermDurationInDays: kotlin.Int? = null
        /**
         * The network platform (EC2-Classic or EC2-VPC).
         */
        var networkPlatform: kotlin.String? = null
        /**
         * The platform (Linux/UNIX or Windows).
         */
        var platform: kotlin.String? = null
        /**
         * The purchase token. This token expires in two hours.
         */
        var purchaseToken: kotlin.String? = null
        /**
         * The schedule recurrence.
         */
        var recurrence: aws.sdk.kotlin.services.ec2.model.ScheduledInstanceRecurrence? = null
        /**
         * The number of hours in the schedule.
         */
        var slotDurationInHours: kotlin.Int? = null
        /**
         * The total number of hours for a single instance for the entire term.
         */
        var totalScheduledInstanceHours: kotlin.Int? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ScheduledInstanceAvailability) : this() {
            this.availabilityZone = x.availabilityZone
            this.availableInstanceCount = x.availableInstanceCount
            this.firstSlotStartTime = x.firstSlotStartTime
            this.hourlyPrice = x.hourlyPrice
            this.instanceType = x.instanceType
            this.maxTermDurationInDays = x.maxTermDurationInDays
            this.minTermDurationInDays = x.minTermDurationInDays
            this.networkPlatform = x.networkPlatform
            this.platform = x.platform
            this.purchaseToken = x.purchaseToken
            this.recurrence = x.recurrence
            this.slotDurationInHours = x.slotDurationInHours
            this.totalScheduledInstanceHours = x.totalScheduledInstanceHours
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ScheduledInstanceAvailability = ScheduledInstanceAvailability(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ScheduledInstanceRecurrence] inside the given [block]
         */
        fun recurrence(block: aws.sdk.kotlin.services.ec2.model.ScheduledInstanceRecurrence.Builder.() -> kotlin.Unit) {
            this.recurrence = aws.sdk.kotlin.services.ec2.model.ScheduledInstanceRecurrence.invoke(block)
        }
    }
}