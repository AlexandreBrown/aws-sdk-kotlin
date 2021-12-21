// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the security group that is referenced in the security group rule.
 */
class ReferencedSecurityGroup private constructor(builder: Builder) {
    /**
     * The ID of the security group.
     */
    val groupId: kotlin.String? = builder.groupId
    /**
     * The status of a VPC peering connection, if applicable.
     */
    val peeringStatus: kotlin.String? = builder.peeringStatus
    /**
     * The Amazon Web Services account ID.
     */
    val userId: kotlin.String? = builder.userId
    /**
     * The ID of the VPC.
     */
    val vpcId: kotlin.String? = builder.vpcId
    /**
     * The ID of the VPC peering connection.
     */
    val vpcPeeringConnectionId: kotlin.String? = builder.vpcPeeringConnectionId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ReferencedSecurityGroup = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ReferencedSecurityGroup(")
        append("groupId=$groupId,")
        append("peeringStatus=$peeringStatus,")
        append("userId=$userId,")
        append("vpcId=$vpcId,")
        append("vpcPeeringConnectionId=$vpcPeeringConnectionId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = groupId?.hashCode() ?: 0
        result = 31 * result + (peeringStatus?.hashCode() ?: 0)
        result = 31 * result + (userId?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        result = 31 * result + (vpcPeeringConnectionId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ReferencedSecurityGroup

        if (groupId != other.groupId) return false
        if (peeringStatus != other.peeringStatus) return false
        if (userId != other.userId) return false
        if (vpcId != other.vpcId) return false
        if (vpcPeeringConnectionId != other.vpcPeeringConnectionId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ReferencedSecurityGroup = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the security group.
         */
        var groupId: kotlin.String? = null
        /**
         * The status of a VPC peering connection, if applicable.
         */
        var peeringStatus: kotlin.String? = null
        /**
         * The Amazon Web Services account ID.
         */
        var userId: kotlin.String? = null
        /**
         * The ID of the VPC.
         */
        var vpcId: kotlin.String? = null
        /**
         * The ID of the VPC peering connection.
         */
        var vpcPeeringConnectionId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ReferencedSecurityGroup) : this() {
            this.groupId = x.groupId
            this.peeringStatus = x.peeringStatus
            this.userId = x.userId
            this.vpcId = x.vpcId
            this.vpcPeeringConnectionId = x.vpcPeeringConnectionId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ReferencedSecurityGroup = ReferencedSecurityGroup(this)
    }
}