// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateTransitGatewayPrefixListReferenceResponse private constructor(builder: Builder) {
    /**
     * Information about the prefix list reference.
     */
    val transitGatewayPrefixListReference: aws.sdk.kotlin.services.ec2.model.TransitGatewayPrefixListReference? = builder.transitGatewayPrefixListReference

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayPrefixListReferenceResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateTransitGatewayPrefixListReferenceResponse(")
        append("transitGatewayPrefixListReference=$transitGatewayPrefixListReference)")
    }

    override fun hashCode(): kotlin.Int {
        var result = transitGatewayPrefixListReference?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateTransitGatewayPrefixListReferenceResponse

        if (transitGatewayPrefixListReference != other.transitGatewayPrefixListReference) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayPrefixListReferenceResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the prefix list reference.
         */
        var transitGatewayPrefixListReference: aws.sdk.kotlin.services.ec2.model.TransitGatewayPrefixListReference? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayPrefixListReferenceResponse) : this() {
            this.transitGatewayPrefixListReference = x.transitGatewayPrefixListReference
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateTransitGatewayPrefixListReferenceResponse = CreateTransitGatewayPrefixListReferenceResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TransitGatewayPrefixListReference] inside the given [block]
         */
        fun transitGatewayPrefixListReference(block: aws.sdk.kotlin.services.ec2.model.TransitGatewayPrefixListReference.Builder.() -> kotlin.Unit) {
            this.transitGatewayPrefixListReference = aws.sdk.kotlin.services.ec2.model.TransitGatewayPrefixListReference.invoke(block)
        }
    }
}