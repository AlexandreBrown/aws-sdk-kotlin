// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyIdFormatRequest private constructor(builder: Builder) {
    /**
     * The type of resource: bundle | conversion-task | customer-gateway | dhcp-options |
     * elastic-ip-allocation | elastic-ip-association |
     * export-task | flow-log | image |
     * import-task | internet-gateway | network-acl
     * | network-acl-association | network-interface |
     * network-interface-attachment | prefix-list |
     * route-table | route-table-association |
     * security-group | subnet |
     * subnet-cidr-block-association | vpc |
     * vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.
     * Alternatively, use the all-current option to include all resource types that are
     * currently within their opt-in period for longer IDs.
     */
    val resource: kotlin.String? = builder.resource
    /**
     * Indicate whether the resource should use longer IDs (17-character IDs).
     */
    val useLongIds: kotlin.Boolean? = builder.useLongIds

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyIdFormatRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyIdFormatRequest(")
        append("resource=$resource,")
        append("useLongIds=$useLongIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = resource?.hashCode() ?: 0
        result = 31 * result + (useLongIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyIdFormatRequest

        if (resource != other.resource) return false
        if (useLongIds != other.useLongIds) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyIdFormatRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The type of resource: bundle | conversion-task | customer-gateway | dhcp-options |
         * elastic-ip-allocation | elastic-ip-association |
         * export-task | flow-log | image |
         * import-task | internet-gateway | network-acl
         * | network-acl-association | network-interface |
         * network-interface-attachment | prefix-list |
         * route-table | route-table-association |
         * security-group | subnet |
         * subnet-cidr-block-association | vpc |
         * vpc-cidr-block-association | vpc-endpoint | vpc-peering-connection | vpn-connection | vpn-gateway.
         * Alternatively, use the all-current option to include all resource types that are
         * currently within their opt-in period for longer IDs.
         */
        var resource: kotlin.String? = null
        /**
         * Indicate whether the resource should use longer IDs (17-character IDs).
         */
        var useLongIds: kotlin.Boolean? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyIdFormatRequest) : this() {
            this.resource = x.resource
            this.useLongIds = x.useLongIds
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyIdFormatRequest = ModifyIdFormatRequest(this)
    }
}
