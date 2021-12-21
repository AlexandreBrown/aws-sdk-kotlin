// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * A signed document that proves that you are authorized to bring the specified IP address range to Amazon using BYOIP.
 */
class IpamCidrAuthorizationContext private constructor(builder: Builder) {
    /**
     * The plain-text authorization message for the prefix and account.
     */
    val message: kotlin.String? = builder.message
    /**
     * The signed authorization message for the prefix and account.
     */
    val signature: kotlin.String? = builder.signature

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.IpamCidrAuthorizationContext = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("IpamCidrAuthorizationContext(")
        append("message=$message,")
        append("signature=$signature)")
    }

    override fun hashCode(): kotlin.Int {
        var result = message?.hashCode() ?: 0
        result = 31 * result + (signature?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as IpamCidrAuthorizationContext

        if (message != other.message) return false
        if (signature != other.signature) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.IpamCidrAuthorizationContext = Builder(this).apply(block).build()

    class Builder {
        /**
         * The plain-text authorization message for the prefix and account.
         */
        var message: kotlin.String? = null
        /**
         * The signed authorization message for the prefix and account.
         */
        var signature: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.IpamCidrAuthorizationContext) : this() {
            this.message = x.message
            this.signature = x.signature
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.IpamCidrAuthorizationContext = IpamCidrAuthorizationContext(this)
    }
}