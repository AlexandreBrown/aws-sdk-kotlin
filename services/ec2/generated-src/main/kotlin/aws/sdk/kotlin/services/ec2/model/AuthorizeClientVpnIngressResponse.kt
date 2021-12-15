// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class AuthorizeClientVpnIngressResponse private constructor(builder: Builder) {
    /**
     * The current state of the authorization rule.
     */
    val status: aws.sdk.kotlin.services.ec2.model.ClientVpnAuthorizationRuleStatus? = builder.status

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AuthorizeClientVpnIngressResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AuthorizeClientVpnIngressResponse(")
        append("status=$status)")
    }

    override fun hashCode(): kotlin.Int {
        var result = status?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AuthorizeClientVpnIngressResponse

        if (status != other.status) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AuthorizeClientVpnIngressResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The current state of the authorization rule.
         */
        var status: aws.sdk.kotlin.services.ec2.model.ClientVpnAuthorizationRuleStatus? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AuthorizeClientVpnIngressResponse) : this() {
            this.status = x.status
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AuthorizeClientVpnIngressResponse = AuthorizeClientVpnIngressResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ClientVpnAuthorizationRuleStatus] inside the given [block]
         */
        fun status(block: aws.sdk.kotlin.services.ec2.model.ClientVpnAuthorizationRuleStatus.Builder.() -> kotlin.Unit) {
            this.status = aws.sdk.kotlin.services.ec2.model.ClientVpnAuthorizationRuleStatus.invoke(block)
        }
    }
}
