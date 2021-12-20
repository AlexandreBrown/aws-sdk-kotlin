// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a DHCP configuration option.
 */
class DhcpConfiguration private constructor(builder: Builder) {
    /**
     * The name of a DHCP option.
     */
    val key: kotlin.String? = builder.key
    /**
     * One or more values for the DHCP option.
     */
    val values: List<AttributeValue>? = builder.values

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DhcpConfiguration = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DhcpConfiguration(")
        append("key=$key,")
        append("values=$values)")
    }

    override fun hashCode(): kotlin.Int {
        var result = key?.hashCode() ?: 0
        result = 31 * result + (values?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DhcpConfiguration

        if (key != other.key) return false
        if (values != other.values) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DhcpConfiguration = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of a DHCP option.
         */
        var key: kotlin.String? = null
        /**
         * One or more values for the DHCP option.
         */
        var values: List<AttributeValue>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DhcpConfiguration) : this() {
            this.key = x.key
            this.values = x.values
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DhcpConfiguration = DhcpConfiguration(this)
    }
}