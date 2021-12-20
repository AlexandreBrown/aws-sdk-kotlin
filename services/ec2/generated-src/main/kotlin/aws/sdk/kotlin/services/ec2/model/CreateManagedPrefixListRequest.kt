// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateManagedPrefixListRequest private constructor(builder: Builder) {
    /**
     * The IP address type.
     * Valid Values: IPv4 | IPv6
     */
    val addressFamily: kotlin.String? = builder.addressFamily
    /**
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the
     * request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
     * Idempotency.
     * Constraints: Up to 255 UTF-8 characters in length.
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more entries for the prefix list.
     */
    val entries: List<AddPrefixListEntry>? = builder.entries
    /**
     * The maximum number of entries for the prefix list.
     */
    val maxEntries: kotlin.Int? = builder.maxEntries
    /**
     * A name for the prefix list.
     * Constraints: Up to 255 characters in length. The name cannot start with com.amazonaws.
     */
    val prefixListName: kotlin.String? = builder.prefixListName
    /**
     * The tags to apply to the prefix list during creation.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateManagedPrefixListRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateManagedPrefixListRequest(")
        append("addressFamily=$addressFamily,")
        append("clientToken=$clientToken,")
        append("dryRun=$dryRun,")
        append("entries=$entries,")
        append("maxEntries=$maxEntries,")
        append("prefixListName=$prefixListName,")
        append("tagSpecifications=$tagSpecifications)")
    }

    override fun hashCode(): kotlin.Int {
        var result = addressFamily?.hashCode() ?: 0
        result = 31 * result + (clientToken?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (entries?.hashCode() ?: 0)
        result = 31 * result + (maxEntries ?: 0)
        result = 31 * result + (prefixListName?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateManagedPrefixListRequest

        if (addressFamily != other.addressFamily) return false
        if (clientToken != other.clientToken) return false
        if (dryRun != other.dryRun) return false
        if (entries != other.entries) return false
        if (maxEntries != other.maxEntries) return false
        if (prefixListName != other.prefixListName) return false
        if (tagSpecifications != other.tagSpecifications) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateManagedPrefixListRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The IP address type.
         * Valid Values: IPv4 | IPv6
         */
        var addressFamily: kotlin.String? = null
        /**
         * Unique, case-sensitive identifier you provide to ensure the idempotency of the
         * request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Run_Instance_Idempotency.html">Ensuring
         * Idempotency.
         * Constraints: Up to 255 UTF-8 characters in length.
         */
        var clientToken: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * One or more entries for the prefix list.
         */
        var entries: List<AddPrefixListEntry>? = null
        /**
         * The maximum number of entries for the prefix list.
         */
        var maxEntries: kotlin.Int? = null
        /**
         * A name for the prefix list.
         * Constraints: Up to 255 characters in length. The name cannot start with com.amazonaws.
         */
        var prefixListName: kotlin.String? = null
        /**
         * The tags to apply to the prefix list during creation.
         */
        var tagSpecifications: List<TagSpecification>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateManagedPrefixListRequest) : this() {
            this.addressFamily = x.addressFamily
            this.clientToken = x.clientToken
            this.dryRun = x.dryRun
            this.entries = x.entries
            this.maxEntries = x.maxEntries
            this.prefixListName = x.prefixListName
            this.tagSpecifications = x.tagSpecifications
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateManagedPrefixListRequest = CreateManagedPrefixListRequest(this)
    }
}