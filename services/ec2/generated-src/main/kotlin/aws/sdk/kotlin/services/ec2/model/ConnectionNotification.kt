// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a connection notification for a VPC endpoint or VPC endpoint
 * service.
 */
class ConnectionNotification private constructor(builder: Builder) {
    /**
     * The events for the notification. Valid values are Accept,
     * Connect, Delete, and Reject.
     */
    val connectionEvents: List<String>? = builder.connectionEvents
    /**
     * The ARN of the SNS topic for the notification.
     */
    val connectionNotificationArn: kotlin.String? = builder.connectionNotificationArn
    /**
     * The ID of the notification.
     */
    val connectionNotificationId: kotlin.String? = builder.connectionNotificationId
    /**
     * The state of the notification.
     */
    val connectionNotificationState: aws.sdk.kotlin.services.ec2.model.ConnectionNotificationState? = builder.connectionNotificationState
    /**
     * The type of notification.
     */
    val connectionNotificationType: aws.sdk.kotlin.services.ec2.model.ConnectionNotificationType? = builder.connectionNotificationType
    /**
     * The ID of the endpoint service.
     */
    val serviceId: kotlin.String? = builder.serviceId
    /**
     * The ID of the VPC endpoint.
     */
    val vpcEndpointId: kotlin.String? = builder.vpcEndpointId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ConnectionNotification = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ConnectionNotification(")
        append("connectionEvents=$connectionEvents,")
        append("connectionNotificationArn=$connectionNotificationArn,")
        append("connectionNotificationId=$connectionNotificationId,")
        append("connectionNotificationState=$connectionNotificationState,")
        append("connectionNotificationType=$connectionNotificationType,")
        append("serviceId=$serviceId,")
        append("vpcEndpointId=$vpcEndpointId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = connectionEvents?.hashCode() ?: 0
        result = 31 * result + (connectionNotificationArn?.hashCode() ?: 0)
        result = 31 * result + (connectionNotificationId?.hashCode() ?: 0)
        result = 31 * result + (connectionNotificationState?.hashCode() ?: 0)
        result = 31 * result + (connectionNotificationType?.hashCode() ?: 0)
        result = 31 * result + (serviceId?.hashCode() ?: 0)
        result = 31 * result + (vpcEndpointId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ConnectionNotification

        if (connectionEvents != other.connectionEvents) return false
        if (connectionNotificationArn != other.connectionNotificationArn) return false
        if (connectionNotificationId != other.connectionNotificationId) return false
        if (connectionNotificationState != other.connectionNotificationState) return false
        if (connectionNotificationType != other.connectionNotificationType) return false
        if (serviceId != other.serviceId) return false
        if (vpcEndpointId != other.vpcEndpointId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ConnectionNotification = Builder(this).apply(block).build()

    class Builder {
        /**
         * The events for the notification. Valid values are Accept,
         * Connect, Delete, and Reject.
         */
        var connectionEvents: List<String>? = null
        /**
         * The ARN of the SNS topic for the notification.
         */
        var connectionNotificationArn: kotlin.String? = null
        /**
         * The ID of the notification.
         */
        var connectionNotificationId: kotlin.String? = null
        /**
         * The state of the notification.
         */
        var connectionNotificationState: aws.sdk.kotlin.services.ec2.model.ConnectionNotificationState? = null
        /**
         * The type of notification.
         */
        var connectionNotificationType: aws.sdk.kotlin.services.ec2.model.ConnectionNotificationType? = null
        /**
         * The ID of the endpoint service.
         */
        var serviceId: kotlin.String? = null
        /**
         * The ID of the VPC endpoint.
         */
        var vpcEndpointId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ConnectionNotification) : this() {
            this.connectionEvents = x.connectionEvents
            this.connectionNotificationArn = x.connectionNotificationArn
            this.connectionNotificationId = x.connectionNotificationId
            this.connectionNotificationState = x.connectionNotificationState
            this.connectionNotificationType = x.connectionNotificationType
            this.serviceId = x.serviceId
            this.vpcEndpointId = x.vpcEndpointId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ConnectionNotification = ConnectionNotification(this)
    }
}