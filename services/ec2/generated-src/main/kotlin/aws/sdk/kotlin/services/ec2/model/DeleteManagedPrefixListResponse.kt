// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteManagedPrefixListResponse private constructor(builder: Builder) {
    /**
     * Information about the prefix list.
     */
    val prefixList: aws.sdk.kotlin.services.ec2.model.ManagedPrefixList? = builder.prefixList

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteManagedPrefixListResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteManagedPrefixListResponse(")
        append("prefixList=$prefixList)")
    }

    override fun hashCode(): kotlin.Int {
        var result = prefixList?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteManagedPrefixListResponse

        if (prefixList != other.prefixList) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteManagedPrefixListResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the prefix list.
         */
        var prefixList: aws.sdk.kotlin.services.ec2.model.ManagedPrefixList? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteManagedPrefixListResponse) : this() {
            this.prefixList = x.prefixList
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteManagedPrefixListResponse = DeleteManagedPrefixListResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ManagedPrefixList] inside the given [block]
         */
        fun prefixList(block: aws.sdk.kotlin.services.ec2.model.ManagedPrefixList.Builder.() -> kotlin.Unit) {
            this.prefixList = aws.sdk.kotlin.services.ec2.model.ManagedPrefixList.invoke(block)
        }
    }
}
