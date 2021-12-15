// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeInstanceStatusRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The filters.
     * availability-zone - The Availability Zone of the instance.
     * event.code - The code for the scheduled event
     * (instance-reboot | system-reboot |
     * system-maintenance | instance-retirement |
     * instance-stop).
     * event.description - A description of the event.
     * event.instance-event-id - The ID of the event whose date and time
     * you are modifying.
     * event.not-after - The latest end time for the scheduled event
     * (for example, 2014-09-15T17:15:20.000Z).
     * event.not-before - The earliest start time for the scheduled
     * event (for example, 2014-09-15T17:15:20.000Z).
     * event.not-before-deadline - The deadline for starting the event
     * (for example, 2014-09-15T17:15:20.000Z).
     * instance-state-code - The code for the instance state, as a
     * 16-bit unsigned integer. The high byte is used for internal purposes and should
     * be ignored. The low byte is set based on the state represented. The valid values
     * are 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64
     * (stopping), and 80 (stopped).
     * instance-state-name - The state of the instance
     * (pending | running | shutting-down |
     * terminated | stopping |
     * stopped).
     * instance-status.reachability - Filters on instance status where
     * the name is reachability (passed | failed
     * | initializing | insufficient-data).
     * instance-status.status - The status of the instance
     * (ok | impaired | initializing |
     * insufficient-data | not-applicable).
     * system-status.reachability - Filters on system status where the
     * name is reachability (passed | failed |
     * initializing | insufficient-data).
     * system-status.status - The system status of the instance
     * (ok | impaired | initializing |
     * insufficient-data | not-applicable).
     */
    val filters: List<Filter>? = builder.filters
    /**
     * When true, includes the health status for all instances. When
     * false, includes the health status for running instances only.
     * Default: false
     */
    val includeAllInstances: kotlin.Boolean? = builder.includeAllInstances
    /**
     * The instance IDs.
     * Default: Describes all your instances.
     * Constraints: Maximum 100 explicitly specified instance IDs.
     */
    val instanceIds: List<String>? = builder.instanceIds
    /**
     * The maximum number of results to return in a single call. To retrieve the remaining
     * results, make another call with the returned NextToken value. This value
     * can be between 5 and 1000. You cannot specify this parameter and the instance IDs
     * parameter in the same call.
     */
    val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token to retrieve the next page of results.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeInstanceStatusRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeInstanceStatusRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("includeAllInstances=$includeAllInstances,")
        append("instanceIds=$instanceIds,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (includeAllInstances?.hashCode() ?: 0)
        result = 31 * result + (instanceIds?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeInstanceStatusRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (includeAllInstances != other.includeAllInstances) return false
        if (instanceIds != other.instanceIds) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeInstanceStatusRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The filters.
         * availability-zone - The Availability Zone of the instance.
         * event.code - The code for the scheduled event
         * (instance-reboot | system-reboot |
         * system-maintenance | instance-retirement |
         * instance-stop).
         * event.description - A description of the event.
         * event.instance-event-id - The ID of the event whose date and time
         * you are modifying.
         * event.not-after - The latest end time for the scheduled event
         * (for example, 2014-09-15T17:15:20.000Z).
         * event.not-before - The earliest start time for the scheduled
         * event (for example, 2014-09-15T17:15:20.000Z).
         * event.not-before-deadline - The deadline for starting the event
         * (for example, 2014-09-15T17:15:20.000Z).
         * instance-state-code - The code for the instance state, as a
         * 16-bit unsigned integer. The high byte is used for internal purposes and should
         * be ignored. The low byte is set based on the state represented. The valid values
         * are 0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64
         * (stopping), and 80 (stopped).
         * instance-state-name - The state of the instance
         * (pending | running | shutting-down |
         * terminated | stopping |
         * stopped).
         * instance-status.reachability - Filters on instance status where
         * the name is reachability (passed | failed
         * | initializing | insufficient-data).
         * instance-status.status - The status of the instance
         * (ok | impaired | initializing |
         * insufficient-data | not-applicable).
         * system-status.reachability - Filters on system status where the
         * name is reachability (passed | failed |
         * initializing | insufficient-data).
         * system-status.status - The system status of the instance
         * (ok | impaired | initializing |
         * insufficient-data | not-applicable).
         */
        var filters: List<Filter>? = null
        /**
         * When true, includes the health status for all instances. When
         * false, includes the health status for running instances only.
         * Default: false
         */
        var includeAllInstances: kotlin.Boolean? = null
        /**
         * The instance IDs.
         * Default: Describes all your instances.
         * Constraints: Maximum 100 explicitly specified instance IDs.
         */
        var instanceIds: List<String>? = null
        /**
         * The maximum number of results to return in a single call. To retrieve the remaining
         * results, make another call with the returned NextToken value. This value
         * can be between 5 and 1000. You cannot specify this parameter and the instance IDs
         * parameter in the same call.
         */
        var maxResults: kotlin.Int? = null
        /**
         * The token to retrieve the next page of results.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeInstanceStatusRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.includeAllInstances = x.includeAllInstances
            this.instanceIds = x.instanceIds
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeInstanceStatusRequest = DescribeInstanceStatusRequest(this)
    }
}
