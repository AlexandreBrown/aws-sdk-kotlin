// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateDhcpOptionsRequest private constructor(builder: Builder) {
    /**
     * A DHCP configuration option.
     */
    val dhcpConfigurations: List<NewDhcpConfiguration>? = builder.dhcpConfigurations
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The tags to assign to the DHCP option.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateDhcpOptionsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateDhcpOptionsRequest(")
        append("dhcpConfigurations=$dhcpConfigurations,")
        append("dryRun=$dryRun,")
        append("tagSpecifications=$tagSpecifications)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dhcpConfigurations?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateDhcpOptionsRequest

        if (dhcpConfigurations != other.dhcpConfigurations) return false
        if (dryRun != other.dryRun) return false
        if (tagSpecifications != other.tagSpecifications) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateDhcpOptionsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * A DHCP configuration option.
         */
        var dhcpConfigurations: List<NewDhcpConfiguration>? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The tags to assign to the DHCP option.
         */
        var tagSpecifications: List<TagSpecification>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateDhcpOptionsRequest) : this() {
            this.dhcpConfigurations = x.dhcpConfigurations
            this.dryRun = x.dryRun
            this.tagSpecifications = x.tagSpecifications
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateDhcpOptionsRequest = CreateDhcpOptionsRequest(this)
    }
}