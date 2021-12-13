// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the output of CreateCustomerGateway.
 */
class CreateCustomerGatewayResponse private constructor(builder: Builder) {
    /**
     * Information about the customer gateway.
     */
    val customerGateway: aws.sdk.kotlin.services.ec2.model.CustomerGateway? = builder.customerGateway

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateCustomerGatewayResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateCustomerGatewayResponse(")
        append("customerGateway=$customerGateway)")
    }

    override fun hashCode(): kotlin.Int {
        var result = customerGateway?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateCustomerGatewayResponse

        if (customerGateway != other.customerGateway) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateCustomerGatewayResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the customer gateway.
         */
        var customerGateway: aws.sdk.kotlin.services.ec2.model.CustomerGateway? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateCustomerGatewayResponse) : this() {
            this.customerGateway = x.customerGateway
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateCustomerGatewayResponse = CreateCustomerGatewayResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.CustomerGateway] inside the given [block]
         */
        fun customerGateway(block: aws.sdk.kotlin.services.ec2.model.CustomerGateway.Builder.() -> kotlin.Unit) {
            this.customerGateway = aws.sdk.kotlin.services.ec2.model.CustomerGateway.invoke(block)
        }
    }
}
