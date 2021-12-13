// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateVpcEndpointConnectionNotificationResponse private constructor(builder: Builder) {
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
     * request.
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * Information about the notification.
     */
    val connectionNotification: aws.sdk.kotlin.services.ec2.model.ConnectionNotification? = builder.connectionNotification

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateVpcEndpointConnectionNotificationResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateVpcEndpointConnectionNotificationResponse(")
        append("clientToken=$clientToken,")
        append("connectionNotification=$connectionNotification)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (connectionNotification?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateVpcEndpointConnectionNotificationResponse

        if (clientToken != other.clientToken) return false
        if (connectionNotification != other.connectionNotification) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateVpcEndpointConnectionNotificationResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
         * request.
         */
        var clientToken: kotlin.String? = null
        /**
         * Information about the notification.
         */
        var connectionNotification: aws.sdk.kotlin.services.ec2.model.ConnectionNotification? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateVpcEndpointConnectionNotificationResponse) : this() {
            this.clientToken = x.clientToken
            this.connectionNotification = x.connectionNotification
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateVpcEndpointConnectionNotificationResponse = CreateVpcEndpointConnectionNotificationResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ConnectionNotification] inside the given [block]
         */
        fun connectionNotification(block: aws.sdk.kotlin.services.ec2.model.ConnectionNotification.Builder.() -> kotlin.Unit) {
            this.connectionNotification = aws.sdk.kotlin.services.ec2.model.ConnectionNotification.invoke(block)
        }
    }
}
