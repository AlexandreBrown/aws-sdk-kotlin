// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.sts.model



class GetAccessKeyInfoResponse private constructor(builder: Builder) {
    /**
     * The number used to identify the Amazon Web Services account.
     */
    val account: kotlin.String? = builder.account

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.sts.model.GetAccessKeyInfoResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetAccessKeyInfoResponse(")
        append("account=$account)")
    }

    override fun hashCode(): kotlin.Int {
        var result = account?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetAccessKeyInfoResponse

        if (account != other.account) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.sts.model.GetAccessKeyInfoResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The number used to identify the Amazon Web Services account.
         */
        var account: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.sts.model.GetAccessKeyInfoResponse) : this() {
            this.account = x.account
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.sts.model.GetAccessKeyInfoResponse = GetAccessKeyInfoResponse(this)
    }
}