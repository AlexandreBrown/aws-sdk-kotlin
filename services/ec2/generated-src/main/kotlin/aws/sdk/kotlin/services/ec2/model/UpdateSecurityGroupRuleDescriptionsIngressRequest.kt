// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class UpdateSecurityGroupRuleDescriptionsIngressRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the security group. You must specify either the security group ID or the
     * security group name in the request. For security groups in a nondefault VPC, you must
     * specify the security group ID.
     */
    val groupId: kotlin.String? = builder.groupId
    /**
     * &#91;EC2-Classic, default VPC&#93; The name of the security group. You must specify either the
     * security group ID or the security group name in the request.
     */
    val groupName: kotlin.String? = builder.groupName
    /**
     * The IP permissions for the security group rule. You must specify either IP permissions
     * or a description.
     */
    val ipPermissions: List<IpPermission>? = builder.ipPermissions
    /**
     * &#91;VPC only&#93; The description for the ingress security group rules. You must specify either
     * a description or IP permissions.
     */
    val securityGroupRuleDescriptions: List<SecurityGroupRuleDescription>? = builder.securityGroupRuleDescriptions

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("UpdateSecurityGroupRuleDescriptionsIngressRequest(")
        append("dryRun=$dryRun,")
        append("groupId=$groupId,")
        append("groupName=$groupName,")
        append("ipPermissions=$ipPermissions,")
        append("securityGroupRuleDescriptions=$securityGroupRuleDescriptions)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (groupId?.hashCode() ?: 0)
        result = 31 * result + (groupName?.hashCode() ?: 0)
        result = 31 * result + (ipPermissions?.hashCode() ?: 0)
        result = 31 * result + (securityGroupRuleDescriptions?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as UpdateSecurityGroupRuleDescriptionsIngressRequest

        if (dryRun != other.dryRun) return false
        if (groupId != other.groupId) return false
        if (groupName != other.groupName) return false
        if (ipPermissions != other.ipPermissions) return false
        if (securityGroupRuleDescriptions != other.securityGroupRuleDescriptions) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the security group. You must specify either the security group ID or the
         * security group name in the request. For security groups in a nondefault VPC, you must
         * specify the security group ID.
         */
        var groupId: kotlin.String? = null
        /**
         * &#91;EC2-Classic, default VPC&#93; The name of the security group. You must specify either the
         * security group ID or the security group name in the request.
         */
        var groupName: kotlin.String? = null
        /**
         * The IP permissions for the security group rule. You must specify either IP permissions
         * or a description.
         */
        var ipPermissions: List<IpPermission>? = null
        /**
         * &#91;VPC only&#93; The description for the ingress security group rules. You must specify either
         * a description or IP permissions.
         */
        var securityGroupRuleDescriptions: List<SecurityGroupRuleDescription>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressRequest) : this() {
            this.dryRun = x.dryRun
            this.groupId = x.groupId
            this.groupName = x.groupName
            this.ipPermissions = x.ipPermissions
            this.securityGroupRuleDescriptions = x.securityGroupRuleDescriptions
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.UpdateSecurityGroupRuleDescriptionsIngressRequest = UpdateSecurityGroupRuleDescriptionsIngressRequest(this)
    }
}
