// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyIpamScopeRequest private constructor(builder: Builder) {
    /**
     * The description of the scope you want to modify.
     */
    val description: kotlin.String? = builder.description
    /**
     * A check for whether you have the required permissions for the action without actually making the request
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the scope you want to modify.
     */
    val ipamScopeId: kotlin.String? = builder.ipamScopeId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyIpamScopeRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyIpamScopeRequest(")
        append("description=$description,")
        append("dryRun=$dryRun,")
        append("ipamScopeId=$ipamScopeId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = description?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (ipamScopeId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyIpamScopeRequest

        if (description != other.description) return false
        if (dryRun != other.dryRun) return false
        if (ipamScopeId != other.ipamScopeId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyIpamScopeRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The description of the scope you want to modify.
         */
        var description: kotlin.String? = null
        /**
         * A check for whether you have the required permissions for the action without actually making the request
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the scope you want to modify.
         */
        var ipamScopeId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyIpamScopeRequest) : this() {
            this.description = x.description
            this.dryRun = x.dryRun
            this.ipamScopeId = x.ipamScopeId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyIpamScopeRequest = ModifyIpamScopeRequest(this)
    }
}
