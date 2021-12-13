// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the state of a Client VPN endpoint route.
 */
class ClientVpnRouteStatus private constructor(builder: Builder) {
    /**
     * The state of the Client VPN endpoint route.
     */
    val code: aws.sdk.kotlin.services.ec2.model.ClientVpnRouteStatusCode? = builder.code
    /**
     * A message about the status of the Client VPN endpoint route, if applicable.
     */
    val message: kotlin.String? = builder.message

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ClientVpnRouteStatus = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ClientVpnRouteStatus(")
        append("code=$code,")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = code?.hashCode() ?: 0
        result = 31 * result + (message?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ClientVpnRouteStatus

        if (code != other.code) return false
        if (message != other.message) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ClientVpnRouteStatus = Builder(this).apply(block).build()

    class Builder {
        /**
         * The state of the Client VPN endpoint route.
         */
        var code: aws.sdk.kotlin.services.ec2.model.ClientVpnRouteStatusCode? = null
        /**
         * A message about the status of the Client VPN endpoint route, if applicable.
         */
        var message: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ClientVpnRouteStatus) : this() {
            this.code = x.code
            this.message = x.message
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ClientVpnRouteStatus = ClientVpnRouteStatus(this)
    }
}
