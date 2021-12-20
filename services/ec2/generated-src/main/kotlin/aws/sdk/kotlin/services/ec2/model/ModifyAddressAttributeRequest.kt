// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyAddressAttributeRequest private constructor(builder: Builder) {
    /**
     * &#91;EC2-VPC&#93; The allocation ID.
     */
    val allocationId: kotlin.String? = builder.allocationId
    /**
     * The domain name to modify for the IP address.
     */
    val domainName: kotlin.String? = builder.domainName
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyAddressAttributeRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyAddressAttributeRequest(")
        append("allocationId=$allocationId,")
        append("domainName=$domainName,")
        append("dryRun=$dryRun)")
    }

    override fun hashCode(): kotlin.Int {
        var result = allocationId?.hashCode() ?: 0
        result = 31 * result + (domainName?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyAddressAttributeRequest

        if (allocationId != other.allocationId) return false
        if (domainName != other.domainName) return false
        if (dryRun != other.dryRun) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyAddressAttributeRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * &#91;EC2-VPC&#93; The allocation ID.
         */
        var allocationId: kotlin.String? = null
        /**
         * The domain name to modify for the IP address.
         */
        var domainName: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyAddressAttributeRequest) : this() {
            this.allocationId = x.allocationId
            this.domainName = x.domainName
            this.dryRun = x.dryRun
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyAddressAttributeRequest = ModifyAddressAttributeRequest(this)
    }
}