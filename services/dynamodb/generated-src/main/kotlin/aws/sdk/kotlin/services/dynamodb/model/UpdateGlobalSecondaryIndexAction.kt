// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the new provisioned throughput settings to be applied to a global secondary
 * index.
 */
class UpdateGlobalSecondaryIndexAction private constructor(builder: Builder) {
    /**
     * The name of the global secondary index to be updated.
     */
    val indexName: kotlin.String? = builder.indexName
    /**
     * Represents the provisioned throughput settings for the specified global secondary
     * index.
     * For current minimum and maximum provisioned throughput values, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Service,
     * Account, and Table Quotas in the Amazon DynamoDB Developer
     * Guide.
     */
    val provisionedThroughput: aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughput? = builder.provisionedThroughput

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.UpdateGlobalSecondaryIndexAction = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("UpdateGlobalSecondaryIndexAction(")
        append("indexName=$indexName,")
        append("provisionedThroughput=$provisionedThroughput)")
    }

    override fun hashCode(): kotlin.Int {
        var result = indexName?.hashCode() ?: 0
        result = 31 * result + (provisionedThroughput?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as UpdateGlobalSecondaryIndexAction

        if (indexName != other.indexName) return false
        if (provisionedThroughput != other.provisionedThroughput) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.UpdateGlobalSecondaryIndexAction = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of the global secondary index to be updated.
         */
        var indexName: kotlin.String? = null
        /**
         * Represents the provisioned throughput settings for the specified global secondary
         * index.
         * For current minimum and maximum provisioned throughput values, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html">Service,
         * Account, and Table Quotas in the Amazon DynamoDB Developer
         * Guide.
         */
        var provisionedThroughput: aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughput? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.UpdateGlobalSecondaryIndexAction) : this() {
            this.indexName = x.indexName
            this.provisionedThroughput = x.provisionedThroughput
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.UpdateGlobalSecondaryIndexAction = UpdateGlobalSecondaryIndexAction(this)

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughput] inside the given [block]
         */
        fun provisionedThroughput(block: aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughput.Builder.() -> kotlin.Unit) {
            this.provisionedThroughput = aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughput.invoke(block)
        }
    }
}