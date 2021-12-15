// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class AssociateEnclaveCertificateIamRoleRequest private constructor(builder: Builder) {
    /**
     * The ARN of the ACM certificate with which to associate the IAM role.
     */
    val certificateArn: kotlin.String? = builder.certificateArn
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ARN of the IAM role to associate with the ACM certificate. You can associate up to 16 IAM roles with an ACM
     * certificate.
     */
    val roleArn: kotlin.String? = builder.roleArn

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AssociateEnclaveCertificateIamRoleRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AssociateEnclaveCertificateIamRoleRequest(")
        append("certificateArn=$certificateArn,")
        append("dryRun=$dryRun,")
        append("roleArn=$roleArn)")
    }

    override fun hashCode(): kotlin.Int {
        var result = certificateArn?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (roleArn?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AssociateEnclaveCertificateIamRoleRequest

        if (certificateArn != other.certificateArn) return false
        if (dryRun != other.dryRun) return false
        if (roleArn != other.roleArn) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AssociateEnclaveCertificateIamRoleRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ARN of the ACM certificate with which to associate the IAM role.
         */
        var certificateArn: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ARN of the IAM role to associate with the ACM certificate. You can associate up to 16 IAM roles with an ACM
         * certificate.
         */
        var roleArn: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AssociateEnclaveCertificateIamRoleRequest) : this() {
            this.certificateArn = x.certificateArn
            this.dryRun = x.dryRun
            this.roleArn = x.roleArn
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AssociateEnclaveCertificateIamRoleRequest = AssociateEnclaveCertificateIamRoleRequest(this)
    }
}
