// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

class ModifyCapacityReservationFleetRequest private constructor(builder: Builder) {
    /**
     * The ID of the Capacity Reservation Fleet to modify.
     */
    val capacityReservationFleetId: kotlin.String? = builder.capacityReservationFleetId
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The date and time at which the Capacity Reservation Fleet expires. When the Capacity Reservation
     * Fleet expires, its state changes to expired and all of the Capacity Reservations in the
     * Fleet expire.
     * The Capacity Reservation Fleet expires within an hour after the specified time. For example, if you
     * specify 5/31/2019, 13:30:55, the Capacity Reservation Fleet is guaranteed
     * to expire between 13:30:55 and 14:30:55 on 5/31/2019.
     * You can't specify EndDate and
     * RemoveEndDate in the same request.
     */
    val endDate: aws.smithy.kotlin.runtime.time.Instant? = builder.endDate
    /**
     * Indicates whether to remove the end date from the Capacity Reservation Fleet. If you remove the
     * end date, the Capacity Reservation Fleet does not expire and it remains active until you explicitly
     * cancel it using the CancelCapacityReservationFleet action.
     * You can't specify RemoveEndDate and
     * EndDate in the same request.
     */
    val removeEndDate: kotlin.Boolean? = builder.removeEndDate
    /**
     * The total number of capacity units to be reserved by the Capacity Reservation Fleet. This value,
     * together with the instance type weights that you assign to each instance type used by the Fleet
     * determine the number of instances for which the Fleet reserves capacity. Both values are based on
     * units that make sense for your workload. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total target capacity
     * in the Amazon EC2 User Guide.
     */
    val totalTargetCapacity: kotlin.Int? = builder.totalTargetCapacity

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyCapacityReservationFleetRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyCapacityReservationFleetRequest(")
        append("capacityReservationFleetId=$capacityReservationFleetId,")
        append("dryRun=$dryRun,")
        append("endDate=$endDate,")
        append("removeEndDate=$removeEndDate,")
        append("totalTargetCapacity=$totalTargetCapacity)")
    }

    override fun hashCode(): kotlin.Int {
        var result = capacityReservationFleetId?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (endDate?.hashCode() ?: 0)
        result = 31 * result + (removeEndDate?.hashCode() ?: 0)
        result = 31 * result + (totalTargetCapacity ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyCapacityReservationFleetRequest

        if (capacityReservationFleetId != other.capacityReservationFleetId) return false
        if (dryRun != other.dryRun) return false
        if (endDate != other.endDate) return false
        if (removeEndDate != other.removeEndDate) return false
        if (totalTargetCapacity != other.totalTargetCapacity) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyCapacityReservationFleetRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the Capacity Reservation Fleet to modify.
         */
        var capacityReservationFleetId: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The date and time at which the Capacity Reservation Fleet expires. When the Capacity Reservation
         * Fleet expires, its state changes to expired and all of the Capacity Reservations in the
         * Fleet expire.
         * The Capacity Reservation Fleet expires within an hour after the specified time. For example, if you
         * specify 5/31/2019, 13:30:55, the Capacity Reservation Fleet is guaranteed
         * to expire between 13:30:55 and 14:30:55 on 5/31/2019.
         * You can't specify EndDate and
         * RemoveEndDate in the same request.
         */
        var endDate: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * Indicates whether to remove the end date from the Capacity Reservation Fleet. If you remove the
         * end date, the Capacity Reservation Fleet does not expire and it remains active until you explicitly
         * cancel it using the CancelCapacityReservationFleet action.
         * You can't specify RemoveEndDate and
         * EndDate in the same request.
         */
        var removeEndDate: kotlin.Boolean? = null
        /**
         * The total number of capacity units to be reserved by the Capacity Reservation Fleet. This value,
         * together with the instance type weights that you assign to each instance type used by the Fleet
         * determine the number of instances for which the Fleet reserves capacity. Both values are based on
         * units that make sense for your workload. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">Total target capacity
         * in the Amazon EC2 User Guide.
         */
        var totalTargetCapacity: kotlin.Int? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyCapacityReservationFleetRequest) : this() {
            this.capacityReservationFleetId = x.capacityReservationFleetId
            this.dryRun = x.dryRun
            this.endDate = x.endDate
            this.removeEndDate = x.removeEndDate
            this.totalTargetCapacity = x.totalTargetCapacity
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyCapacityReservationFleetRequest = ModifyCapacityReservationFleetRequest(this)
    }
}
