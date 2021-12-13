// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyTransitGatewayRequest private constructor(builder: Builder) {
    /**
     * The description for the transit gateway.
     */
    val description: kotlin.String? = builder.description
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The options to modify.
     */
    val options: aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayOptions? = builder.options
    /**
     * The ID of the transit gateway.
     */
    val transitGatewayId: kotlin.String? = builder.transitGatewayId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyTransitGatewayRequest(")
        append("description=$description,")
        append("dryRun=$dryRun,")
        append("options=$options,")
        append("transitGatewayId=$transitGatewayId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = description?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (options?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyTransitGatewayRequest

        if (description != other.description) return false
        if (dryRun != other.dryRun) return false
        if (options != other.options) return false
        if (transitGatewayId != other.transitGatewayId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The description for the transit gateway.
         */
        var description: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The options to modify.
         */
        var options: aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayOptions? = null
        /**
         * The ID of the transit gateway.
         */
        var transitGatewayId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayRequest) : this() {
            this.description = x.description
            this.dryRun = x.dryRun
            this.options = x.options
            this.transitGatewayId = x.transitGatewayId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayRequest = ModifyTransitGatewayRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayOptions] inside the given [block]
         */
        fun options(block: aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayOptions.Builder.() -> kotlin.Unit) {
            this.options = aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayOptions.invoke(block)
        }
    }
}
