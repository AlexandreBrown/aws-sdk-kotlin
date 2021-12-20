// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Information about a terminated Client VPN endpoint client connection.
 */
class TerminateConnectionStatus private constructor(builder: Builder) {
    /**
     * The ID of the client connection.
     */
    val connectionId: kotlin.String? = builder.connectionId
    /**
     * A message about the status of the client connection, if applicable.
     */
    val currentStatus: aws.sdk.kotlin.services.ec2.model.ClientVpnConnectionStatus? = builder.currentStatus
    /**
     * The state of the client connection.
     */
    val previousStatus: aws.sdk.kotlin.services.ec2.model.ClientVpnConnectionStatus? = builder.previousStatus

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.TerminateConnectionStatus = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("TerminateConnectionStatus(")
        append("connectionId=$connectionId,")
        append("currentStatus=$currentStatus,")
        append("previousStatus=$previousStatus)")
    }

    override fun hashCode(): kotlin.Int {
        var result = connectionId?.hashCode() ?: 0
        result = 31 * result + (currentStatus?.hashCode() ?: 0)
        result = 31 * result + (previousStatus?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as TerminateConnectionStatus

        if (connectionId != other.connectionId) return false
        if (currentStatus != other.currentStatus) return false
        if (previousStatus != other.previousStatus) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.TerminateConnectionStatus = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the client connection.
         */
        var connectionId: kotlin.String? = null
        /**
         * A message about the status of the client connection, if applicable.
         */
        var currentStatus: aws.sdk.kotlin.services.ec2.model.ClientVpnConnectionStatus? = null
        /**
         * The state of the client connection.
         */
        var previousStatus: aws.sdk.kotlin.services.ec2.model.ClientVpnConnectionStatus? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.TerminateConnectionStatus) : this() {
            this.connectionId = x.connectionId
            this.currentStatus = x.currentStatus
            this.previousStatus = x.previousStatus
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.TerminateConnectionStatus = TerminateConnectionStatus(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ClientVpnConnectionStatus] inside the given [block]
         */
        fun currentStatus(block: aws.sdk.kotlin.services.ec2.model.ClientVpnConnectionStatus.Builder.() -> kotlin.Unit) {
            this.currentStatus = aws.sdk.kotlin.services.ec2.model.ClientVpnConnectionStatus.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ClientVpnConnectionStatus] inside the given [block]
         */
        fun previousStatus(block: aws.sdk.kotlin.services.ec2.model.ClientVpnConnectionStatus.Builder.() -> kotlin.Unit) {
            this.previousStatus = aws.sdk.kotlin.services.ec2.model.ClientVpnConnectionStatus.invoke(block)
        }
    }
}