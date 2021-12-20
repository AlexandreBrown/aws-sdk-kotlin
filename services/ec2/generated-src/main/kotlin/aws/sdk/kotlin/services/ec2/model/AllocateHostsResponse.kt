// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the output of AllocateHosts.
 */
class AllocateHostsResponse private constructor(builder: Builder) {
    /**
     * The ID of the allocated Dedicated Host. This is used to launch an instance onto a
     * specific host.
     */
    val hostIds: List<String>? = builder.hostIds

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AllocateHostsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AllocateHostsResponse(")
        append("hostIds=$hostIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = hostIds?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AllocateHostsResponse

        if (hostIds != other.hostIds) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AllocateHostsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the allocated Dedicated Host. This is used to launch an instance onto a
         * specific host.
         */
        var hostIds: List<String>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AllocateHostsResponse) : this() {
            this.hostIds = x.hostIds
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AllocateHostsResponse = AllocateHostsResponse(this)
    }
}