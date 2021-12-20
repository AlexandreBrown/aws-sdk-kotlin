// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a network access control (ACL) rule.
 */
class AnalysisAclRule private constructor(builder: Builder) {
    /**
     * The IPv4 address range, in CIDR notation.
     */
    val cidr: kotlin.String? = builder.cidr
    /**
     * Indicates whether the rule is an outbound rule.
     */
    val egress: kotlin.Boolean? = builder.egress
    /**
     * The range of ports.
     */
    val portRange: aws.sdk.kotlin.services.ec2.model.PortRange? = builder.portRange
    /**
     * The protocol.
     */
    val protocol: kotlin.String? = builder.protocol
    /**
     * Indicates whether to allow or deny traffic that matches the rule.
     */
    val ruleAction: kotlin.String? = builder.ruleAction
    /**
     * The rule number.
     */
    val ruleNumber: kotlin.Int? = builder.ruleNumber

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AnalysisAclRule = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AnalysisAclRule(")
        append("cidr=$cidr,")
        append("egress=$egress,")
        append("portRange=$portRange,")
        append("protocol=$protocol,")
        append("ruleAction=$ruleAction,")
        append("ruleNumber=$ruleNumber)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cidr?.hashCode() ?: 0
        result = 31 * result + (egress?.hashCode() ?: 0)
        result = 31 * result + (portRange?.hashCode() ?: 0)
        result = 31 * result + (protocol?.hashCode() ?: 0)
        result = 31 * result + (ruleAction?.hashCode() ?: 0)
        result = 31 * result + (ruleNumber ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AnalysisAclRule

        if (cidr != other.cidr) return false
        if (egress != other.egress) return false
        if (portRange != other.portRange) return false
        if (protocol != other.protocol) return false
        if (ruleAction != other.ruleAction) return false
        if (ruleNumber != other.ruleNumber) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AnalysisAclRule = Builder(this).apply(block).build()

    class Builder {
        /**
         * The IPv4 address range, in CIDR notation.
         */
        var cidr: kotlin.String? = null
        /**
         * Indicates whether the rule is an outbound rule.
         */
        var egress: kotlin.Boolean? = null
        /**
         * The range of ports.
         */
        var portRange: aws.sdk.kotlin.services.ec2.model.PortRange? = null
        /**
         * The protocol.
         */
        var protocol: kotlin.String? = null
        /**
         * Indicates whether to allow or deny traffic that matches the rule.
         */
        var ruleAction: kotlin.String? = null
        /**
         * The rule number.
         */
        var ruleNumber: kotlin.Int? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AnalysisAclRule) : this() {
            this.cidr = x.cidr
            this.egress = x.egress
            this.portRange = x.portRange
            this.protocol = x.protocol
            this.ruleAction = x.ruleAction
            this.ruleNumber = x.ruleNumber
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AnalysisAclRule = AnalysisAclRule(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.PortRange] inside the given [block]
         */
        fun portRange(block: aws.sdk.kotlin.services.ec2.model.PortRange.Builder.() -> kotlin.Unit) {
            this.portRange = aws.sdk.kotlin.services.ec2.model.PortRange.invoke(block)
        }
    }
}