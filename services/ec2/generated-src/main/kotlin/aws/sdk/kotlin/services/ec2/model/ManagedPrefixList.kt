// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a managed prefix list.
 */
class ManagedPrefixList private constructor(builder: Builder) {
    /**
     * The IP address version.
     */
    val addressFamily: kotlin.String? = builder.addressFamily
    /**
     * The maximum number of entries for the prefix list.
     */
    val maxEntries: kotlin.Int? = builder.maxEntries
    /**
     * The ID of the owner of the prefix list.
     */
    val ownerId: kotlin.String? = builder.ownerId
    /**
     * The Amazon Resource Name (ARN) for the prefix list.
     */
    val prefixListArn: kotlin.String? = builder.prefixListArn
    /**
     * The ID of the prefix list.
     */
    val prefixListId: kotlin.String? = builder.prefixListId
    /**
     * The name of the prefix list.
     */
    val prefixListName: kotlin.String? = builder.prefixListName
    /**
     * The current state of the prefix list.
     */
    val state: aws.sdk.kotlin.services.ec2.model.PrefixListState? = builder.state
    /**
     * The state message.
     */
    val stateMessage: kotlin.String? = builder.stateMessage
    /**
     * The tags for the prefix list.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * The version of the prefix list.
     */
    val version: kotlin.Long? = builder.version

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ManagedPrefixList = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ManagedPrefixList(")
        append("addressFamily=$addressFamily,")
        append("maxEntries=$maxEntries,")
        append("ownerId=$ownerId,")
        append("prefixListArn=$prefixListArn,")
        append("prefixListId=$prefixListId,")
        append("prefixListName=$prefixListName,")
        append("state=$state,")
        append("stateMessage=$stateMessage,")
        append("tags=$tags,")
        append("version=$version)")
    }

    override fun hashCode(): kotlin.Int {
        var result = addressFamily?.hashCode() ?: 0
        result = 31 * result + (maxEntries ?: 0)
        result = 31 * result + (ownerId?.hashCode() ?: 0)
        result = 31 * result + (prefixListArn?.hashCode() ?: 0)
        result = 31 * result + (prefixListId?.hashCode() ?: 0)
        result = 31 * result + (prefixListName?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (stateMessage?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (version?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ManagedPrefixList

        if (addressFamily != other.addressFamily) return false
        if (maxEntries != other.maxEntries) return false
        if (ownerId != other.ownerId) return false
        if (prefixListArn != other.prefixListArn) return false
        if (prefixListId != other.prefixListId) return false
        if (prefixListName != other.prefixListName) return false
        if (state != other.state) return false
        if (stateMessage != other.stateMessage) return false
        if (tags != other.tags) return false
        if (version != other.version) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ManagedPrefixList = Builder(this).apply(block).build()

    class Builder {
        /**
         * The IP address version.
         */
        var addressFamily: kotlin.String? = null
        /**
         * The maximum number of entries for the prefix list.
         */
        var maxEntries: kotlin.Int? = null
        /**
         * The ID of the owner of the prefix list.
         */
        var ownerId: kotlin.String? = null
        /**
         * The Amazon Resource Name (ARN) for the prefix list.
         */
        var prefixListArn: kotlin.String? = null
        /**
         * The ID of the prefix list.
         */
        var prefixListId: kotlin.String? = null
        /**
         * The name of the prefix list.
         */
        var prefixListName: kotlin.String? = null
        /**
         * The current state of the prefix list.
         */
        var state: aws.sdk.kotlin.services.ec2.model.PrefixListState? = null
        /**
         * The state message.
         */
        var stateMessage: kotlin.String? = null
        /**
         * The tags for the prefix list.
         */
        var tags: List<Tag>? = null
        /**
         * The version of the prefix list.
         */
        var version: kotlin.Long? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ManagedPrefixList) : this() {
            this.addressFamily = x.addressFamily
            this.maxEntries = x.maxEntries
            this.ownerId = x.ownerId
            this.prefixListArn = x.prefixListArn
            this.prefixListId = x.prefixListId
            this.prefixListName = x.prefixListName
            this.state = x.state
            this.stateMessage = x.stateMessage
            this.tags = x.tags
            this.version = x.version
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ManagedPrefixList = ManagedPrefixList(this)
    }
}
