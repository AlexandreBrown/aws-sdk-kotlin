// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateVpcEndpointConnectionNotificationRequest private constructor(builder: Builder) {
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
     * request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to ensure
     * idempotency.
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * One or more endpoint events for which to receive notifications. Valid values are
     * Accept, Connect, Delete, and
     * Reject.
     */
    val connectionEvents: List<String>? = builder.connectionEvents
    /**
     * The ARN of the SNS topic for the notifications.
     */
    val connectionNotificationArn: kotlin.String? = builder.connectionNotificationArn
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the endpoint service.
     */
    val serviceId: kotlin.String? = builder.serviceId
    /**
     * The ID of the endpoint.
     */
    val vpcEndpointId: kotlin.String? = builder.vpcEndpointId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateVpcEndpointConnectionNotificationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateVpcEndpointConnectionNotificationRequest(")
        append("clientToken=$clientToken,")
        append("connectionEvents=$connectionEvents,")
        append("connectionNotificationArn=$connectionNotificationArn,")
        append("dryRun=$dryRun,")
        append("serviceId=$serviceId,")
        append("vpcEndpointId=$vpcEndpointId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (connectionEvents?.hashCode() ?: 0)
        result = 31 * result + (connectionNotificationArn?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (serviceId?.hashCode() ?: 0)
        result = 31 * result + (vpcEndpointId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateVpcEndpointConnectionNotificationRequest

        if (clientToken != other.clientToken) return false
        if (connectionEvents != other.connectionEvents) return false
        if (connectionNotificationArn != other.connectionNotificationArn) return false
        if (dryRun != other.dryRun) return false
        if (serviceId != other.serviceId) return false
        if (vpcEndpointId != other.vpcEndpointId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateVpcEndpointConnectionNotificationRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
         * request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">How to ensure
         * idempotency.
         */
        var clientToken: kotlin.String? = null
        /**
         * One or more endpoint events for which to receive notifications. Valid values are
         * Accept, Connect, Delete, and
         * Reject.
         */
        var connectionEvents: List<String>? = null
        /**
         * The ARN of the SNS topic for the notifications.
         */
        var connectionNotificationArn: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the endpoint service.
         */
        var serviceId: kotlin.String? = null
        /**
         * The ID of the endpoint.
         */
        var vpcEndpointId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateVpcEndpointConnectionNotificationRequest) : this() {
            this.clientToken = x.clientToken
            this.connectionEvents = x.connectionEvents
            this.connectionNotificationArn = x.connectionNotificationArn
            this.dryRun = x.dryRun
            this.serviceId = x.serviceId
            this.vpcEndpointId = x.vpcEndpointId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateVpcEndpointConnectionNotificationRequest = CreateVpcEndpointConnectionNotificationRequest(this)
    }
}