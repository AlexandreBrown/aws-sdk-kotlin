// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeFleetInstancesResponse private constructor(builder: Builder) {
    /**
     * The running instances. This list is refreshed periodically and might be out of
     * date.
     */
    val activeInstances: List<ActiveInstance>? = builder.activeInstances
    /**
     * The ID of the EC2 Fleet.
     */
    val fleetId: kotlin.String? = builder.fleetId
    /**
     * The token for the next set of results.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeFleetInstancesResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeFleetInstancesResponse(")
        append("activeInstances=$activeInstances,")
        append("fleetId=$fleetId,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = activeInstances?.hashCode() ?: 0
        result = 31 * result + (fleetId?.hashCode() ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeFleetInstancesResponse

        if (activeInstances != other.activeInstances) return false
        if (fleetId != other.fleetId) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeFleetInstancesResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The running instances. This list is refreshed periodically and might be out of
         * date.
         */
        var activeInstances: List<ActiveInstance>? = null
        /**
         * The ID of the EC2 Fleet.
         */
        var fleetId: kotlin.String? = null
        /**
         * The token for the next set of results.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeFleetInstancesResponse) : this() {
            this.activeInstances = x.activeInstances
            this.fleetId = x.fleetId
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeFleetInstancesResponse = DescribeFleetInstancesResponse(this)
    }
}
