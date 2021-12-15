// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyVpcPeeringConnectionOptionsResponse private constructor(builder: Builder) {
    /**
     * Information about the VPC peering connection options for the accepter VPC.
     */
    val accepterPeeringConnectionOptions: aws.sdk.kotlin.services.ec2.model.PeeringConnectionOptions? = builder.accepterPeeringConnectionOptions
    /**
     * Information about the VPC peering connection options for the requester VPC.
     */
    val requesterPeeringConnectionOptions: aws.sdk.kotlin.services.ec2.model.PeeringConnectionOptions? = builder.requesterPeeringConnectionOptions

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyVpcPeeringConnectionOptionsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyVpcPeeringConnectionOptionsResponse(")
        append("accepterPeeringConnectionOptions=$accepterPeeringConnectionOptions,")
        append("requesterPeeringConnectionOptions=$requesterPeeringConnectionOptions)")
    }

    override fun hashCode(): kotlin.Int {
        var result = accepterPeeringConnectionOptions?.hashCode() ?: 0
        result = 31 * result + (requesterPeeringConnectionOptions?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyVpcPeeringConnectionOptionsResponse

        if (accepterPeeringConnectionOptions != other.accepterPeeringConnectionOptions) return false
        if (requesterPeeringConnectionOptions != other.requesterPeeringConnectionOptions) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyVpcPeeringConnectionOptionsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the VPC peering connection options for the accepter VPC.
         */
        var accepterPeeringConnectionOptions: aws.sdk.kotlin.services.ec2.model.PeeringConnectionOptions? = null
        /**
         * Information about the VPC peering connection options for the requester VPC.
         */
        var requesterPeeringConnectionOptions: aws.sdk.kotlin.services.ec2.model.PeeringConnectionOptions? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyVpcPeeringConnectionOptionsResponse) : this() {
            this.accepterPeeringConnectionOptions = x.accepterPeeringConnectionOptions
            this.requesterPeeringConnectionOptions = x.requesterPeeringConnectionOptions
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyVpcPeeringConnectionOptionsResponse = ModifyVpcPeeringConnectionOptionsResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.PeeringConnectionOptions] inside the given [block]
         */
        fun accepterPeeringConnectionOptions(block: aws.sdk.kotlin.services.ec2.model.PeeringConnectionOptions.Builder.() -> kotlin.Unit) {
            this.accepterPeeringConnectionOptions = aws.sdk.kotlin.services.ec2.model.PeeringConnectionOptions.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.PeeringConnectionOptions] inside the given [block]
         */
        fun requesterPeeringConnectionOptions(block: aws.sdk.kotlin.services.ec2.model.PeeringConnectionOptions.Builder.() -> kotlin.Unit) {
            this.requesterPeeringConnectionOptions = aws.sdk.kotlin.services.ec2.model.PeeringConnectionOptions.invoke(block)
        }
    }
}
