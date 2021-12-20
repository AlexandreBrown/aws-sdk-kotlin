// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class GetManagedPrefixListEntriesRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The maximum number of results to return with a single call.
     * To retrieve the remaining results, make another call with the returned nextToken value.
     */
    val maxResults: kotlin.Int? = builder.maxResults
    /**
     * The token for the next page of results.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * The ID of the prefix list.
     */
    val prefixListId: kotlin.String? = builder.prefixListId
    /**
     * The version of the prefix list for which to return the entries. The default is the current version.
     */
    val targetVersion: kotlin.Long? = builder.targetVersion

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.GetManagedPrefixListEntriesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetManagedPrefixListEntriesRequest(")
        append("dryRun=$dryRun,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken,")
        append("prefixListId=$prefixListId,")
        append("targetVersion=$targetVersion)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (prefixListId?.hashCode() ?: 0)
        result = 31 * result + (targetVersion?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetManagedPrefixListEntriesRequest

        if (dryRun != other.dryRun) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false
        if (prefixListId != other.prefixListId) return false
        if (targetVersion != other.targetVersion) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.GetManagedPrefixListEntriesRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The maximum number of results to return with a single call.
         * To retrieve the remaining results, make another call with the returned nextToken value.
         */
        var maxResults: kotlin.Int? = null
        /**
         * The token for the next page of results.
         */
        var nextToken: kotlin.String? = null
        /**
         * The ID of the prefix list.
         */
        var prefixListId: kotlin.String? = null
        /**
         * The version of the prefix list for which to return the entries. The default is the current version.
         */
        var targetVersion: kotlin.Long? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.GetManagedPrefixListEntriesRequest) : this() {
            this.dryRun = x.dryRun
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
            this.prefixListId = x.prefixListId
            this.targetVersion = x.targetVersion
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.GetManagedPrefixListEntriesRequest = GetManagedPrefixListEntriesRequest(this)
    }
}