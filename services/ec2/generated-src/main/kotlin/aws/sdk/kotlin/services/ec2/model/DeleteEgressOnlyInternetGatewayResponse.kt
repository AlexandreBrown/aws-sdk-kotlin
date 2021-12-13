// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteEgressOnlyInternetGatewayResponse private constructor(builder: Builder) {
    /**
     * Returns true if the request succeeds; otherwise, it returns an error.
     */
    val returnCode: kotlin.Boolean? = builder.returnCode

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteEgressOnlyInternetGatewayResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteEgressOnlyInternetGatewayResponse(")
        append("returnCode=$returnCode)")
    }

    override fun hashCode(): kotlin.Int {
        var result = returnCode?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteEgressOnlyInternetGatewayResponse

        if (returnCode != other.returnCode) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteEgressOnlyInternetGatewayResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Returns true if the request succeeds; otherwise, it returns an error.
         */
        var returnCode: kotlin.Boolean? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteEgressOnlyInternetGatewayResponse) : this() {
            this.returnCode = x.returnCode
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteEgressOnlyInternetGatewayResponse = DeleteEgressOnlyInternetGatewayResponse(this)
    }
}
