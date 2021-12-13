// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for DescribeScheduledInstanceAvailability.
 */
class DescribeScheduledInstanceAvailabilityRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The filters.
     * availability-zone - The Availability Zone (for example, us-west-2a).
     * instance-type - The instance type (for example, c4.large).
     * network-platform - The network platform (EC2-Classic or EC2-VPC).
     * platform - The platform (Linux/UNIX or Windows).
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The time period for the first schedule to start.
     */
    val firstSlotStartTimeRange: aws.sdk.kotlin.services.ec2.model.SlotDateTimeRangeRequest? = builder.firstSlotStartTimeRange
    /**
     * The maximum number of results to return in a single call.
     * This value can be between 5 and 300. The default value is 300.
     * To retrieve the remaining results, make another call with the returned
     * NextToken value.
     */
    val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The maximum available duration, in hours. This value must be greater than MinSlotDurationInHours
     * and less than 1,720.
     */
    val maxSlotDurationInHours: kotlin.Int? = builder.maxSlotDurationInHours
    /**
     * The minimum available duration, in hours. The minimum required duration is 1,200 hours per year. For example, the minimum daily schedule is 4 hours, the minimum weekly schedule is 24 hours, and the minimum monthly schedule is 100 hours.
     */
    val minSlotDurationInHours: kotlin.Int? = builder.minSlotDurationInHours
    /**
     * The token for the next set of results.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * The schedule recurrence.
     */
    val recurrence: aws.sdk.kotlin.services.ec2.model.ScheduledInstanceRecurrenceRequest? = builder.recurrence

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeScheduledInstanceAvailabilityRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeScheduledInstanceAvailabilityRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("firstSlotStartTimeRange=$firstSlotStartTimeRange,")
        append("maxResults=$maxResults,")
        append("maxSlotDurationInHours=$maxSlotDurationInHours,")
        append("minSlotDurationInHours=$minSlotDurationInHours,")
        append("nextToken=$nextToken,")
        append("recurrence=$recurrence)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (firstSlotStartTimeRange?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (maxSlotDurationInHours ?: 0)
        result = 31 * result + (minSlotDurationInHours ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (recurrence?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeScheduledInstanceAvailabilityRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (firstSlotStartTimeRange != other.firstSlotStartTimeRange) return false
        if (maxResults != other.maxResults) return false
        if (maxSlotDurationInHours != other.maxSlotDurationInHours) return false
        if (minSlotDurationInHours != other.minSlotDurationInHours) return false
        if (nextToken != other.nextToken) return false
        if (recurrence != other.recurrence) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeScheduledInstanceAvailabilityRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The filters.
         * availability-zone - The Availability Zone (for example, us-west-2a).
         * instance-type - The instance type (for example, c4.large).
         * network-platform - The network platform (EC2-Classic or EC2-VPC).
         * platform - The platform (Linux/UNIX or Windows).
         */
        var filters: List<Filter>? = null
        /**
         * The time period for the first schedule to start.
         */
        var firstSlotStartTimeRange: aws.sdk.kotlin.services.ec2.model.SlotDateTimeRangeRequest? = null
        /**
         * The maximum number of results to return in a single call.
         * This value can be between 5 and 300. The default value is 300.
         * To retrieve the remaining results, make another call with the returned
         * NextToken value.
         */
        var maxResults: kotlin.Int? = null
        /**
         * The maximum available duration, in hours. This value must be greater than MinSlotDurationInHours
         * and less than 1,720.
         */
        var maxSlotDurationInHours: kotlin.Int? = null
        /**
         * The minimum available duration, in hours. The minimum required duration is 1,200 hours per year. For example, the minimum daily schedule is 4 hours, the minimum weekly schedule is 24 hours, and the minimum monthly schedule is 100 hours.
         */
        var minSlotDurationInHours: kotlin.Int? = null
        /**
         * The token for the next set of results.
         */
        var nextToken: kotlin.String? = null
        /**
         * The schedule recurrence.
         */
        var recurrence: aws.sdk.kotlin.services.ec2.model.ScheduledInstanceRecurrenceRequest? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeScheduledInstanceAvailabilityRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.firstSlotStartTimeRange = x.firstSlotStartTimeRange
            this.maxResults = x.maxResults
            this.maxSlotDurationInHours = x.maxSlotDurationInHours
            this.minSlotDurationInHours = x.minSlotDurationInHours
            this.nextToken = x.nextToken
            this.recurrence = x.recurrence
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeScheduledInstanceAvailabilityRequest = DescribeScheduledInstanceAvailabilityRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.SlotDateTimeRangeRequest] inside the given [block]
         */
        fun firstSlotStartTimeRange(block: aws.sdk.kotlin.services.ec2.model.SlotDateTimeRangeRequest.Builder.() -> kotlin.Unit) {
            this.firstSlotStartTimeRange = aws.sdk.kotlin.services.ec2.model.SlotDateTimeRangeRequest.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ScheduledInstanceRecurrenceRequest] inside the given [block]
         */
        fun recurrence(block: aws.sdk.kotlin.services.ec2.model.ScheduledInstanceRecurrenceRequest.Builder.() -> kotlin.Unit) {
            this.recurrence = aws.sdk.kotlin.services.ec2.model.ScheduledInstanceRecurrenceRequest.invoke(block)
        }
    }
}
