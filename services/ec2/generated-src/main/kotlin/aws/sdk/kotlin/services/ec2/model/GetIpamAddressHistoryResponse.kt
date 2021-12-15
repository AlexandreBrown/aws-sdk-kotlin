// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class GetIpamAddressHistoryResponse private constructor(builder: Builder) {
    /**
     * A historical record for a CIDR within an IPAM scope. If the CIDR is associated with an EC2 instance, you will see an object in the response for the instance and one for the network interface.
     */
    val historyRecords: List<IpamAddressHistoryRecord>? = builder.historyRecords
    /**
     * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.GetIpamAddressHistoryResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetIpamAddressHistoryResponse(")
        append("historyRecords=$historyRecords,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = historyRecords?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetIpamAddressHistoryResponse

        if (historyRecords != other.historyRecords) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.GetIpamAddressHistoryResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * A historical record for a CIDR within an IPAM scope. If the CIDR is associated with an EC2 instance, you will see an object in the response for the instance and one for the network interface.
         */
        var historyRecords: List<IpamAddressHistoryRecord>? = null
        /**
         * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
         */
        var nextToken: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.GetIpamAddressHistoryResponse) : this() {
            this.historyRecords = x.historyRecords
            this.nextToken = x.nextToken
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.GetIpamAddressHistoryResponse = GetIpamAddressHistoryResponse(this)
    }
}
