// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

class ModifyCapacityReservationRequest private constructor(builder: Builder) {
    /**
     * Reserved. Capacity Reservations you have created are accepted by default.
     */
    val accept: kotlin.Boolean? = builder.accept
    /**
     * Reserved for future use.
     */
    val additionalInfo: kotlin.String? = builder.additionalInfo
    /**
     * The ID of the Capacity Reservation.
     */
    val capacityReservationId: kotlin.String? = builder.capacityReservationId
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity
     * is released and you can no longer launch instances into it. The Capacity Reservation's state changes to
     * expired when it reaches its end date and time.
     * The Capacity Reservation is cancelled within an hour from the specified time. For example, if you specify
     * 5/31/2019, 13:30:55, the Capacity Reservation is guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019.
     * You must provide an EndDate value if EndDateType is
     * limited. Omit EndDate if EndDateType is
     * unlimited.
     */
    val endDate: aws.smithy.kotlin.runtime.time.Instant? = builder.endDate
    /**
     * Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following end
     * types:
     * unlimited - The Capacity Reservation remains active until you explicitly cancel it. Do not
     * provide an EndDate value if EndDateType is
     * unlimited.
     * limited - The Capacity Reservation expires automatically at a specified date and time. You must
     * provide an EndDate value if EndDateType is
     * limited.
     */
    val endDateType: aws.sdk.kotlin.services.ec2.model.EndDateType? = builder.endDateType
    /**
     * The number of instances for which to reserve capacity. The number of instances can't be increased or
     * decreased by more than 1000 in a single request.
     */
    val instanceCount: kotlin.Int? = builder.instanceCount

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyCapacityReservationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyCapacityReservationRequest(")
        append("accept=$accept,")
        append("additionalInfo=$additionalInfo,")
        append("capacityReservationId=$capacityReservationId,")
        append("dryRun=$dryRun,")
        append("endDate=$endDate,")
        append("endDateType=$endDateType,")
        append("instanceCount=$instanceCount)")
    }

    override fun hashCode(): kotlin.Int {
        var result = accept?.hashCode() ?: 0
        result = 31 * result + (additionalInfo?.hashCode() ?: 0)
        result = 31 * result + (capacityReservationId?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (endDate?.hashCode() ?: 0)
        result = 31 * result + (endDateType?.hashCode() ?: 0)
        result = 31 * result + (instanceCount ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyCapacityReservationRequest

        if (accept != other.accept) return false
        if (additionalInfo != other.additionalInfo) return false
        if (capacityReservationId != other.capacityReservationId) return false
        if (dryRun != other.dryRun) return false
        if (endDate != other.endDate) return false
        if (endDateType != other.endDateType) return false
        if (instanceCount != other.instanceCount) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyCapacityReservationRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Reserved. Capacity Reservations you have created are accepted by default.
         */
        var accept: kotlin.Boolean? = null
        /**
         * Reserved for future use.
         */
        var additionalInfo: kotlin.String? = null
        /**
         * The ID of the Capacity Reservation.
         */
        var capacityReservationId: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The date and time at which the Capacity Reservation expires. When a Capacity Reservation expires, the reserved capacity
         * is released and you can no longer launch instances into it. The Capacity Reservation's state changes to
         * expired when it reaches its end date and time.
         * The Capacity Reservation is cancelled within an hour from the specified time. For example, if you specify
         * 5/31/2019, 13:30:55, the Capacity Reservation is guaranteed to end between 13:30:55 and 14:30:55 on 5/31/2019.
         * You must provide an EndDate value if EndDateType is
         * limited. Omit EndDate if EndDateType is
         * unlimited.
         */
        var endDate: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * Indicates the way in which the Capacity Reservation ends. A Capacity Reservation can have one of the following end
         * types:
         * unlimited - The Capacity Reservation remains active until you explicitly cancel it. Do not
         * provide an EndDate value if EndDateType is
         * unlimited.
         * limited - The Capacity Reservation expires automatically at a specified date and time. You must
         * provide an EndDate value if EndDateType is
         * limited.
         */
        var endDateType: aws.sdk.kotlin.services.ec2.model.EndDateType? = null
        /**
         * The number of instances for which to reserve capacity. The number of instances can't be increased or
         * decreased by more than 1000 in a single request.
         */
        var instanceCount: kotlin.Int? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyCapacityReservationRequest) : this() {
            this.accept = x.accept
            this.additionalInfo = x.additionalInfo
            this.capacityReservationId = x.capacityReservationId
            this.dryRun = x.dryRun
            this.endDate = x.endDate
            this.endDateType = x.endDateType
            this.instanceCount = x.instanceCount
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyCapacityReservationRequest = ModifyCapacityReservationRequest(this)
    }
}