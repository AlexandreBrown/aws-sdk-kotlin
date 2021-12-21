// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Information about the DNS server to be used.
 */
class DnsServersOptionsModifyStructure private constructor(builder: Builder) {
    /**
     * The IPv4 address range, in CIDR notation, of the DNS servers to be used. You can specify up to
     * two DNS servers. Ensure that the DNS servers can be reached by the clients. The specified values
     * overwrite the existing values.
     */
    val customDnsServers: List<String>? = builder.customDnsServers
    /**
     * Indicates whether DNS servers should be used. Specify False to delete the existing DNS
     * servers.
     */
    val enabled: kotlin.Boolean? = builder.enabled

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DnsServersOptionsModifyStructure = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DnsServersOptionsModifyStructure(")
        append("customDnsServers=$customDnsServers,")
        append("enabled=$enabled)")
    }

    override fun hashCode(): kotlin.Int {
        var result = customDnsServers?.hashCode() ?: 0
        result = 31 * result + (enabled?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DnsServersOptionsModifyStructure

        if (customDnsServers != other.customDnsServers) return false
        if (enabled != other.enabled) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DnsServersOptionsModifyStructure = Builder(this).apply(block).build()

    class Builder {
        /**
         * The IPv4 address range, in CIDR notation, of the DNS servers to be used. You can specify up to
         * two DNS servers. Ensure that the DNS servers can be reached by the clients. The specified values
         * overwrite the existing values.
         */
        var customDnsServers: List<String>? = null
        /**
         * Indicates whether DNS servers should be used. Specify False to delete the existing DNS
         * servers.
         */
        var enabled: kotlin.Boolean? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DnsServersOptionsModifyStructure) : this() {
            this.customDnsServers = x.customDnsServers
            this.enabled = x.enabled
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DnsServersOptionsModifyStructure = DnsServersOptionsModifyStructure(this)
    }
}