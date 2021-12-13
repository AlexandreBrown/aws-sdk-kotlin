// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * An entry for a prefix list.
 */
class RemovePrefixListEntry private constructor(builder: Builder) {
    /**
     * The CIDR block.
     */
    val cidr: kotlin.String? = builder.cidr

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.RemovePrefixListEntry = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("RemovePrefixListEntry(")
        append("cidr=$cidr)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cidr?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as RemovePrefixListEntry

        if (cidr != other.cidr) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.RemovePrefixListEntry = Builder(this).apply(block).build()

    class Builder {
        /**
         * The CIDR block.
         */
        var cidr: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.RemovePrefixListEntry) : this() {
            this.cidr = x.cidr
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.RemovePrefixListEntry = RemovePrefixListEntry(this)
    }
}
