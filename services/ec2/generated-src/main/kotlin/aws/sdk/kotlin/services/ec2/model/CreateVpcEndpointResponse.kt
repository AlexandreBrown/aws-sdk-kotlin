// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the output of CreateVpcEndpoint.
 */
class CreateVpcEndpointResponse private constructor(builder: Builder) {
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
     * request.
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * Information about the endpoint.
     */
    val vpcEndpoint: aws.sdk.kotlin.services.ec2.model.VpcEndpoint? = builder.vpcEndpoint

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateVpcEndpointResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateVpcEndpointResponse(")
        append("clientToken=$clientToken,")
        append("vpcEndpoint=$vpcEndpoint)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (vpcEndpoint?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateVpcEndpointResponse

        if (clientToken != other.clientToken) return false
        if (vpcEndpoint != other.vpcEndpoint) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateVpcEndpointResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
         * request.
         */
        var clientToken: kotlin.String? = null
        /**
         * Information about the endpoint.
         */
        var vpcEndpoint: aws.sdk.kotlin.services.ec2.model.VpcEndpoint? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateVpcEndpointResponse) : this() {
            this.clientToken = x.clientToken
            this.vpcEndpoint = x.vpcEndpoint
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateVpcEndpointResponse = CreateVpcEndpointResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.VpcEndpoint] inside the given [block]
         */
        fun vpcEndpoint(block: aws.sdk.kotlin.services.ec2.model.VpcEndpoint.Builder.() -> kotlin.Unit) {
            this.vpcEndpoint = aws.sdk.kotlin.services.ec2.model.VpcEndpoint.invoke(block)
        }
    }
}