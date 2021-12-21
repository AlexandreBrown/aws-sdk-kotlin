// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class RejectTransitGatewayMulticastDomainAssociationsResponse private constructor(builder: Builder) {
    /**
     * Describes the multicast domain associations.
     */
    val associations: aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastDomainAssociations? = builder.associations

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.RejectTransitGatewayMulticastDomainAssociationsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("RejectTransitGatewayMulticastDomainAssociationsResponse(")
        append("associations=$associations)")
    }

    override fun hashCode(): kotlin.Int {
        var result = associations?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as RejectTransitGatewayMulticastDomainAssociationsResponse

        if (associations != other.associations) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.RejectTransitGatewayMulticastDomainAssociationsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Describes the multicast domain associations.
         */
        var associations: aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastDomainAssociations? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.RejectTransitGatewayMulticastDomainAssociationsResponse) : this() {
            this.associations = x.associations
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.RejectTransitGatewayMulticastDomainAssociationsResponse = RejectTransitGatewayMulticastDomainAssociationsResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastDomainAssociations] inside the given [block]
         */
        fun associations(block: aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastDomainAssociations.Builder.() -> kotlin.Unit) {
            this.associations = aws.sdk.kotlin.services.ec2.model.TransitGatewayMulticastDomainAssociations.invoke(block)
        }
    }
}