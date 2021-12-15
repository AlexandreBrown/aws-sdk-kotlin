// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyVpcEndpointConnectionNotificationRequest private constructor(builder: Builder) {
    /**
     * One or more events for the endpoint. Valid values are Accept,
     * Connect, Delete, and Reject.
     */
    val connectionEvents: List<String>? = builder.connectionEvents
    /**
     * The ARN for the SNS topic for the notification.
     */
    val connectionNotificationArn: kotlin.String? = builder.connectionNotificationArn
    /**
     * The ID of the notification.
     */
    val connectionNotificationId: kotlin.String? = builder.connectionNotificationId
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyVpcEndpointConnectionNotificationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyVpcEndpointConnectionNotificationRequest(")
        append("connectionEvents=$connectionEvents,")
        append("connectionNotificationArn=$connectionNotificationArn,")
        append("connectionNotificationId=$connectionNotificationId,")
        append("dryRun=$dryRun)")
    }

    override fun hashCode(): kotlin.Int {
        var result = connectionEvents?.hashCode() ?: 0
        result = 31 * result + (connectionNotificationArn?.hashCode() ?: 0)
        result = 31 * result + (connectionNotificationId?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyVpcEndpointConnectionNotificationRequest

        if (connectionEvents != other.connectionEvents) return false
        if (connectionNotificationArn != other.connectionNotificationArn) return false
        if (connectionNotificationId != other.connectionNotificationId) return false
        if (dryRun != other.dryRun) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyVpcEndpointConnectionNotificationRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * One or more events for the endpoint. Valid values are Accept,
         * Connect, Delete, and Reject.
         */
        var connectionEvents: List<String>? = null
        /**
         * The ARN for the SNS topic for the notification.
         */
        var connectionNotificationArn: kotlin.String? = null
        /**
         * The ID of the notification.
         */
        var connectionNotificationId: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyVpcEndpointConnectionNotificationRequest) : this() {
            this.connectionEvents = x.connectionEvents
            this.connectionNotificationArn = x.connectionNotificationArn
            this.connectionNotificationId = x.connectionNotificationId
            this.dryRun = x.dryRun
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyVpcEndpointConnectionNotificationRequest = ModifyVpcEndpointConnectionNotificationRequest(this)
    }
}
