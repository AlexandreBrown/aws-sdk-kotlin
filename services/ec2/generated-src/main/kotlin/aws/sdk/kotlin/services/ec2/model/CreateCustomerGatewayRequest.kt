// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for CreateCustomerGateway.
 */
class CreateCustomerGatewayRequest private constructor(builder: Builder) {
    /**
     * For devices that support BGP, the customer gateway's BGP ASN.
     * Default: 65000
     */
    val bgpAsn: kotlin.Int? = builder.bgpAsn
    /**
     * The Amazon Resource Name (ARN) for the customer gateway certificate.
     */
    val certificateArn: kotlin.String? = builder.certificateArn
    /**
     * A name for the customer gateway device.
     * Length Constraints: Up to 255 characters.
     */
    val deviceName: kotlin.String? = builder.deviceName
    /**
     * Checks whether you have the required permissions for the action, without actually
     * making the request, and provides an error response. If you have the required
     * permissions, the error response is DryRunOperation. Otherwise, it is
     * UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The Internet-routable IP address for the customer gateway's outside interface. The
     * address must be static.
     */
    val publicIp: kotlin.String? = builder.publicIp
    /**
     * The tags to apply to the customer gateway.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications
    /**
     * The type of VPN connection that this customer gateway supports
     * (ipsec.1).
     */
    val type: aws.sdk.kotlin.services.ec2.model.GatewayType? = builder.type

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateCustomerGatewayRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateCustomerGatewayRequest(")
        append("bgpAsn=$bgpAsn,")
        append("certificateArn=$certificateArn,")
        append("deviceName=$deviceName,")
        append("dryRun=$dryRun,")
        append("publicIp=$publicIp,")
        append("tagSpecifications=$tagSpecifications,")
        append("type=$type)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bgpAsn ?: 0
        result = 31 * result + (certificateArn?.hashCode() ?: 0)
        result = 31 * result + (deviceName?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (publicIp?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        result = 31 * result + (type?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateCustomerGatewayRequest

        if (bgpAsn != other.bgpAsn) return false
        if (certificateArn != other.certificateArn) return false
        if (deviceName != other.deviceName) return false
        if (dryRun != other.dryRun) return false
        if (publicIp != other.publicIp) return false
        if (tagSpecifications != other.tagSpecifications) return false
        if (type != other.type) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateCustomerGatewayRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * For devices that support BGP, the customer gateway's BGP ASN.
         * Default: 65000
         */
        var bgpAsn: kotlin.Int? = null
        /**
         * The Amazon Resource Name (ARN) for the customer gateway certificate.
         */
        var certificateArn: kotlin.String? = null
        /**
         * A name for the customer gateway device.
         * Length Constraints: Up to 255 characters.
         */
        var deviceName: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually
         * making the request, and provides an error response. If you have the required
         * permissions, the error response is DryRunOperation. Otherwise, it is
         * UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The Internet-routable IP address for the customer gateway's outside interface. The
         * address must be static.
         */
        var publicIp: kotlin.String? = null
        /**
         * The tags to apply to the customer gateway.
         */
        var tagSpecifications: List<TagSpecification>? = null
        /**
         * The type of VPN connection that this customer gateway supports
         * (ipsec.1).
         */
        var type: aws.sdk.kotlin.services.ec2.model.GatewayType? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateCustomerGatewayRequest) : this() {
            this.bgpAsn = x.bgpAsn
            this.certificateArn = x.certificateArn
            this.deviceName = x.deviceName
            this.dryRun = x.dryRun
            this.publicIp = x.publicIp
            this.tagSpecifications = x.tagSpecifications
            this.type = x.type
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateCustomerGatewayRequest = CreateCustomerGatewayRequest(this)
    }
}
