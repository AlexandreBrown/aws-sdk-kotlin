// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a VPC endpoint service.
 */
class ServiceDetail private constructor(builder: Builder) {
    /**
     * Indicates whether VPC endpoint connection requests to the service must be accepted by the service owner.
     */
    val acceptanceRequired: kotlin.Boolean? = builder.acceptanceRequired
    /**
     * The Availability Zones in which the service is available.
     */
    val availabilityZones: List<String>? = builder.availabilityZones
    /**
     * The DNS names for the service.
     */
    val baseEndpointDnsNames: List<String>? = builder.baseEndpointDnsNames
    /**
     * Indicates whether the service manages its VPC endpoints. Management of the service VPC
     * endpoints using the VPC endpoint API is restricted.
     */
    val managesVpcEndpoints: kotlin.Boolean? = builder.managesVpcEndpoints
    /**
     * The Amazon Web Services account ID of the service owner.
     */
    val owner: kotlin.String? = builder.owner
    /**
     * The private DNS name for the service.
     */
    val privateDnsName: kotlin.String? = builder.privateDnsName
    /**
     * The verification state of the VPC endpoint service.
     * Consumers of the endpoint service cannot use the private name when the state is not verified.
     */
    val privateDnsNameVerificationState: aws.sdk.kotlin.services.ec2.model.DnsNameState? = builder.privateDnsNameVerificationState
    /**
     * The private DNS names assigned to the VPC endpoint service.
     */
    val privateDnsNames: List<PrivateDnsDetails>? = builder.privateDnsNames
    /**
     * The ID of the endpoint service.
     */
    val serviceId: kotlin.String? = builder.serviceId
    /**
     * The Amazon Resource Name (ARN) of the service.
     */
    val serviceName: kotlin.String? = builder.serviceName
    /**
     * The type of service.
     */
    val serviceType: List<ServiceTypeDetail>? = builder.serviceType
    /**
     * Any tags assigned to the service.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * Indicates whether the service supports endpoint policies.
     */
    val vpcEndpointPolicySupported: kotlin.Boolean? = builder.vpcEndpointPolicySupported

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ServiceDetail = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ServiceDetail(")
        append("acceptanceRequired=$acceptanceRequired,")
        append("availabilityZones=$availabilityZones,")
        append("baseEndpointDnsNames=$baseEndpointDnsNames,")
        append("managesVpcEndpoints=$managesVpcEndpoints,")
        append("owner=$owner,")
        append("privateDnsName=$privateDnsName,")
        append("privateDnsNameVerificationState=$privateDnsNameVerificationState,")
        append("privateDnsNames=$privateDnsNames,")
        append("serviceId=$serviceId,")
        append("serviceName=$serviceName,")
        append("serviceType=$serviceType,")
        append("tags=$tags,")
        append("vpcEndpointPolicySupported=$vpcEndpointPolicySupported)")
    }

    override fun hashCode(): kotlin.Int {
        var result = acceptanceRequired?.hashCode() ?: 0
        result = 31 * result + (availabilityZones?.hashCode() ?: 0)
        result = 31 * result + (baseEndpointDnsNames?.hashCode() ?: 0)
        result = 31 * result + (managesVpcEndpoints?.hashCode() ?: 0)
        result = 31 * result + (owner?.hashCode() ?: 0)
        result = 31 * result + (privateDnsName?.hashCode() ?: 0)
        result = 31 * result + (privateDnsNameVerificationState?.hashCode() ?: 0)
        result = 31 * result + (privateDnsNames?.hashCode() ?: 0)
        result = 31 * result + (serviceId?.hashCode() ?: 0)
        result = 31 * result + (serviceName?.hashCode() ?: 0)
        result = 31 * result + (serviceType?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (vpcEndpointPolicySupported?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ServiceDetail

        if (acceptanceRequired != other.acceptanceRequired) return false
        if (availabilityZones != other.availabilityZones) return false
        if (baseEndpointDnsNames != other.baseEndpointDnsNames) return false
        if (managesVpcEndpoints != other.managesVpcEndpoints) return false
        if (owner != other.owner) return false
        if (privateDnsName != other.privateDnsName) return false
        if (privateDnsNameVerificationState != other.privateDnsNameVerificationState) return false
        if (privateDnsNames != other.privateDnsNames) return false
        if (serviceId != other.serviceId) return false
        if (serviceName != other.serviceName) return false
        if (serviceType != other.serviceType) return false
        if (tags != other.tags) return false
        if (vpcEndpointPolicySupported != other.vpcEndpointPolicySupported) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ServiceDetail = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates whether VPC endpoint connection requests to the service must be accepted by the service owner.
         */
        var acceptanceRequired: kotlin.Boolean? = null
        /**
         * The Availability Zones in which the service is available.
         */
        var availabilityZones: List<String>? = null
        /**
         * The DNS names for the service.
         */
        var baseEndpointDnsNames: List<String>? = null
        /**
         * Indicates whether the service manages its VPC endpoints. Management of the service VPC
         * endpoints using the VPC endpoint API is restricted.
         */
        var managesVpcEndpoints: kotlin.Boolean? = null
        /**
         * The Amazon Web Services account ID of the service owner.
         */
        var owner: kotlin.String? = null
        /**
         * The private DNS name for the service.
         */
        var privateDnsName: kotlin.String? = null
        /**
         * The verification state of the VPC endpoint service.
         * Consumers of the endpoint service cannot use the private name when the state is not verified.
         */
        var privateDnsNameVerificationState: aws.sdk.kotlin.services.ec2.model.DnsNameState? = null
        /**
         * The private DNS names assigned to the VPC endpoint service.
         */
        var privateDnsNames: List<PrivateDnsDetails>? = null
        /**
         * The ID of the endpoint service.
         */
        var serviceId: kotlin.String? = null
        /**
         * The Amazon Resource Name (ARN) of the service.
         */
        var serviceName: kotlin.String? = null
        /**
         * The type of service.
         */
        var serviceType: List<ServiceTypeDetail>? = null
        /**
         * Any tags assigned to the service.
         */
        var tags: List<Tag>? = null
        /**
         * Indicates whether the service supports endpoint policies.
         */
        var vpcEndpointPolicySupported: kotlin.Boolean? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ServiceDetail) : this() {
            this.acceptanceRequired = x.acceptanceRequired
            this.availabilityZones = x.availabilityZones
            this.baseEndpointDnsNames = x.baseEndpointDnsNames
            this.managesVpcEndpoints = x.managesVpcEndpoints
            this.owner = x.owner
            this.privateDnsName = x.privateDnsName
            this.privateDnsNameVerificationState = x.privateDnsNameVerificationState
            this.privateDnsNames = x.privateDnsNames
            this.serviceId = x.serviceId
            this.serviceName = x.serviceName
            this.serviceType = x.serviceType
            this.tags = x.tags
            this.vpcEndpointPolicySupported = x.vpcEndpointPolicySupported
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ServiceDetail = ServiceDetail(this)
    }
}
