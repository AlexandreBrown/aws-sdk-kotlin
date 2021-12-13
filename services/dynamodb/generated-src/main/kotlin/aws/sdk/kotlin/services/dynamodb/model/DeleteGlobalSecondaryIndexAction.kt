// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents a global secondary index to be deleted from an existing table.
 */
class DeleteGlobalSecondaryIndexAction private constructor(builder: Builder) {
    /**
     * The name of the global secondary index to be deleted.
     */
    val indexName: kotlin.String? = builder.indexName

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.DeleteGlobalSecondaryIndexAction = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteGlobalSecondaryIndexAction(")
        append("indexName=$indexName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = indexName?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteGlobalSecondaryIndexAction

        if (indexName != other.indexName) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.DeleteGlobalSecondaryIndexAction = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of the global secondary index to be deleted.
         */
        var indexName: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.DeleteGlobalSecondaryIndexAction) : this() {
            this.indexName = x.indexName
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.DeleteGlobalSecondaryIndexAction = DeleteGlobalSecondaryIndexAction(this)
    }
}
