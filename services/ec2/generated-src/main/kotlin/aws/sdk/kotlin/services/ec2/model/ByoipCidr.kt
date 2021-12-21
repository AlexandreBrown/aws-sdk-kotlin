// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Information about an address range that is provisioned for use with your Amazon Web Services resources
 * through bring your own IP addresses (BYOIP).
 */
class ByoipCidr private constructor(builder: Builder) {
    /**
     * The address range, in CIDR notation.
     */
    val cidr: kotlin.String? = builder.cidr
    /**
     * The description of the address range.
     */
    val description: kotlin.String? = builder.description
    /**
     * The state of the address pool.
     */
    val state: aws.sdk.kotlin.services.ec2.model.ByoipCidrState? = builder.state
    /**
     * Upon success, contains the ID of the address pool. Otherwise, contains an error message.
     */
    val statusMessage: kotlin.String? = builder.statusMessage

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ByoipCidr = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ByoipCidr(")
        append("cidr=$cidr,")
        append("description=$description,")
        append("state=$state,")
        append("statusMessage=$statusMessage)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cidr?.hashCode() ?: 0
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (statusMessage?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ByoipCidr

        if (cidr != other.cidr) return false
        if (description != other.description) return false
        if (state != other.state) return false
        if (statusMessage != other.statusMessage) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ByoipCidr = Builder(this).apply(block).build()

    class Builder {
        /**
         * The address range, in CIDR notation.
         */
        var cidr: kotlin.String? = null
        /**
         * The description of the address range.
         */
        var description: kotlin.String? = null
        /**
         * The state of the address pool.
         */
        var state: aws.sdk.kotlin.services.ec2.model.ByoipCidrState? = null
        /**
         * Upon success, contains the ID of the address pool. Otherwise, contains an error message.
         */
        var statusMessage: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ByoipCidr) : this() {
            this.cidr = x.cidr
            this.description = x.description
            this.state = x.state
            this.statusMessage = x.statusMessage
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ByoipCidr = ByoipCidr(this)
    }
}