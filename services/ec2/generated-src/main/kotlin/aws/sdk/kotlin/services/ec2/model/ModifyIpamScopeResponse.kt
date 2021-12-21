// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyIpamScopeResponse private constructor(builder: Builder) {
    /**
     * The results of the modification.
     */
    val ipamScope: aws.sdk.kotlin.services.ec2.model.IpamScope? = builder.ipamScope

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyIpamScopeResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyIpamScopeResponse(")
        append("ipamScope=$ipamScope)")
    }

    override fun hashCode(): kotlin.Int {
        var result = ipamScope?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyIpamScopeResponse

        if (ipamScope != other.ipamScope) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyIpamScopeResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The results of the modification.
         */
        var ipamScope: aws.sdk.kotlin.services.ec2.model.IpamScope? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyIpamScopeResponse) : this() {
            this.ipamScope = x.ipamScope
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyIpamScopeResponse = ModifyIpamScopeResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.IpamScope] inside the given [block]
         */
        fun ipamScope(block: aws.sdk.kotlin.services.ec2.model.IpamScope.Builder.() -> kotlin.Unit) {
            this.ipamScope = aws.sdk.kotlin.services.ec2.model.IpamScope.invoke(block)
        }
    }
}