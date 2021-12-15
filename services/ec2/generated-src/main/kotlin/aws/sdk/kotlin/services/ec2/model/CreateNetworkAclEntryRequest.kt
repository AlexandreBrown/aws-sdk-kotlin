// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateNetworkAclEntryRequest private constructor(builder: Builder) {
    /**
     * The IPv4 network range to allow or deny, in CIDR notation (for example
     * 172.16.0.0/24). We modify the specified CIDR block to its canonical form; for example, if you specify 100.68.0.18/18, we modify it to 100.68.0.0/18.
     */
    val cidrBlock: kotlin.String? = builder.cidrBlock
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet).
     */
    val egress: kotlin.Boolean? = builder.egress
    /**
     * ICMP protocol: The ICMP or ICMPv6 type and code. Required if specifying protocol
     * 1 (ICMP) or protocol 58 (ICMPv6) with an IPv6 CIDR block.
     */
    val icmpTypeCode: aws.sdk.kotlin.services.ec2.model.IcmpTypeCode? = builder.icmpTypeCode
    /**
     * The IPv6 network range to allow or deny, in CIDR notation (for example
     * 2001:db8:1234:1a00::/64).
     */
    val ipv6CidrBlock: kotlin.String? = builder.ipv6CidrBlock
    /**
     * The ID of the network ACL.
     */
    val networkAclId: kotlin.String? = builder.networkAclId
    /**
     * TCP or UDP protocols: The range of ports the rule applies to.
     * Required if specifying protocol 6 (TCP) or 17 (UDP).
     */
    val portRange: aws.sdk.kotlin.services.ec2.model.PortRange? = builder.portRange
    /**
     * The protocol number. A value of "-1" means all protocols. If you specify "-1" or a
     * protocol number other than "6" (TCP), "17" (UDP), or "1" (ICMP), traffic on all ports is
     * allowed, regardless of any ports or ICMP types or codes that you specify. If you specify
     * protocol "58" (ICMPv6) and specify an IPv4 CIDR block, traffic for all ICMP types and
     * codes allowed, regardless of any that you specify. If you specify protocol "58" (ICMPv6)
     * and specify an IPv6 CIDR block, you must specify an ICMP type and code.
     */
    val protocol: kotlin.String? = builder.protocol
    /**
     * Indicates whether to allow or deny the traffic that matches the rule.
     */
    val ruleAction: aws.sdk.kotlin.services.ec2.model.RuleAction? = builder.ruleAction
    /**
     * The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number.
     * Constraints: Positive integer from 1 to 32766. The range 32767 to 65535 is reserved for internal use.
     */
    val ruleNumber: kotlin.Int? = builder.ruleNumber

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateNetworkAclEntryRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateNetworkAclEntryRequest(")
        append("cidrBlock=$cidrBlock,")
        append("dryRun=$dryRun,")
        append("egress=$egress,")
        append("icmpTypeCode=$icmpTypeCode,")
        append("ipv6CidrBlock=$ipv6CidrBlock,")
        append("networkAclId=$networkAclId,")
        append("portRange=$portRange,")
        append("protocol=$protocol,")
        append("ruleAction=$ruleAction,")
        append("ruleNumber=$ruleNumber)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cidrBlock?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (egress?.hashCode() ?: 0)
        result = 31 * result + (icmpTypeCode?.hashCode() ?: 0)
        result = 31 * result + (ipv6CidrBlock?.hashCode() ?: 0)
        result = 31 * result + (networkAclId?.hashCode() ?: 0)
        result = 31 * result + (portRange?.hashCode() ?: 0)
        result = 31 * result + (protocol?.hashCode() ?: 0)
        result = 31 * result + (ruleAction?.hashCode() ?: 0)
        result = 31 * result + (ruleNumber ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateNetworkAclEntryRequest

        if (cidrBlock != other.cidrBlock) return false
        if (dryRun != other.dryRun) return false
        if (egress != other.egress) return false
        if (icmpTypeCode != other.icmpTypeCode) return false
        if (ipv6CidrBlock != other.ipv6CidrBlock) return false
        if (networkAclId != other.networkAclId) return false
        if (portRange != other.portRange) return false
        if (protocol != other.protocol) return false
        if (ruleAction != other.ruleAction) return false
        if (ruleNumber != other.ruleNumber) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateNetworkAclEntryRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The IPv4 network range to allow or deny, in CIDR notation (for example
         * 172.16.0.0/24). We modify the specified CIDR block to its canonical form; for example, if you specify 100.68.0.18/18, we modify it to 100.68.0.0/18.
         */
        var cidrBlock: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * Indicates whether this is an egress rule (rule is applied to traffic leaving the subnet).
         */
        var egress: kotlin.Boolean? = null
        /**
         * ICMP protocol: The ICMP or ICMPv6 type and code. Required if specifying protocol
         * 1 (ICMP) or protocol 58 (ICMPv6) with an IPv6 CIDR block.
         */
        var icmpTypeCode: aws.sdk.kotlin.services.ec2.model.IcmpTypeCode? = null
        /**
         * The IPv6 network range to allow or deny, in CIDR notation (for example
         * 2001:db8:1234:1a00::/64).
         */
        var ipv6CidrBlock: kotlin.String? = null
        /**
         * The ID of the network ACL.
         */
        var networkAclId: kotlin.String? = null
        /**
         * TCP or UDP protocols: The range of ports the rule applies to.
         * Required if specifying protocol 6 (TCP) or 17 (UDP).
         */
        var portRange: aws.sdk.kotlin.services.ec2.model.PortRange? = null
        /**
         * The protocol number. A value of "-1" means all protocols. If you specify "-1" or a
         * protocol number other than "6" (TCP), "17" (UDP), or "1" (ICMP), traffic on all ports is
         * allowed, regardless of any ports or ICMP types or codes that you specify. If you specify
         * protocol "58" (ICMPv6) and specify an IPv4 CIDR block, traffic for all ICMP types and
         * codes allowed, regardless of any that you specify. If you specify protocol "58" (ICMPv6)
         * and specify an IPv6 CIDR block, you must specify an ICMP type and code.
         */
        var protocol: kotlin.String? = null
        /**
         * Indicates whether to allow or deny the traffic that matches the rule.
         */
        var ruleAction: aws.sdk.kotlin.services.ec2.model.RuleAction? = null
        /**
         * The rule number for the entry (for example, 100). ACL entries are processed in ascending order by rule number.
         * Constraints: Positive integer from 1 to 32766. The range 32767 to 65535 is reserved for internal use.
         */
        var ruleNumber: kotlin.Int? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateNetworkAclEntryRequest) : this() {
            this.cidrBlock = x.cidrBlock
            this.dryRun = x.dryRun
            this.egress = x.egress
            this.icmpTypeCode = x.icmpTypeCode
            this.ipv6CidrBlock = x.ipv6CidrBlock
            this.networkAclId = x.networkAclId
            this.portRange = x.portRange
            this.protocol = x.protocol
            this.ruleAction = x.ruleAction
            this.ruleNumber = x.ruleNumber
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateNetworkAclEntryRequest = CreateNetworkAclEntryRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.IcmpTypeCode] inside the given [block]
         */
        fun icmpTypeCode(block: aws.sdk.kotlin.services.ec2.model.IcmpTypeCode.Builder.() -> kotlin.Unit) {
            this.icmpTypeCode = aws.sdk.kotlin.services.ec2.model.IcmpTypeCode.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.PortRange] inside the given [block]
         */
        fun portRange(block: aws.sdk.kotlin.services.ec2.model.PortRange.Builder.() -> kotlin.Unit) {
            this.portRange = aws.sdk.kotlin.services.ec2.model.PortRange.invoke(block)
        }
    }
}
