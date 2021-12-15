// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the auto scaling configuration for a replica global secondary index.
 */
class ReplicaGlobalSecondaryIndexAutoScalingDescription private constructor(builder: Builder) {
    /**
     * The name of the global secondary index.
     */
    val indexName: kotlin.String? = builder.indexName
    /**
     * The current state of the replica global secondary index:
     * CREATING - The index is being created.
     * UPDATING - The index is being updated.
     * DELETING - The index is being deleted.
     * ACTIVE - The index is ready for use.
     */
    val indexStatus: aws.sdk.kotlin.services.dynamodb.model.IndexStatus? = builder.indexStatus
    /**
     * Represents the auto scaling settings for a global table or global secondary
     * index.
     */
    val provisionedReadCapacityAutoScalingSettings: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription? = builder.provisionedReadCapacityAutoScalingSettings
    /**
     * Represents the auto scaling settings for a global table or global secondary
     * index.
     */
    val provisionedWriteCapacityAutoScalingSettings: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription? = builder.provisionedWriteCapacityAutoScalingSettings

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.ReplicaGlobalSecondaryIndexAutoScalingDescription = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ReplicaGlobalSecondaryIndexAutoScalingDescription(")
        append("indexName=$indexName,")
        append("indexStatus=$indexStatus,")
        append("provisionedReadCapacityAutoScalingSettings=$provisionedReadCapacityAutoScalingSettings,")
        append("provisionedWriteCapacityAutoScalingSettings=$provisionedWriteCapacityAutoScalingSettings)")
    }

    override fun hashCode(): kotlin.Int {
        var result = indexName?.hashCode() ?: 0
        result = 31 * result + (indexStatus?.hashCode() ?: 0)
        result = 31 * result + (provisionedReadCapacityAutoScalingSettings?.hashCode() ?: 0)
        result = 31 * result + (provisionedWriteCapacityAutoScalingSettings?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ReplicaGlobalSecondaryIndexAutoScalingDescription

        if (indexName != other.indexName) return false
        if (indexStatus != other.indexStatus) return false
        if (provisionedReadCapacityAutoScalingSettings != other.provisionedReadCapacityAutoScalingSettings) return false
        if (provisionedWriteCapacityAutoScalingSettings != other.provisionedWriteCapacityAutoScalingSettings) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.ReplicaGlobalSecondaryIndexAutoScalingDescription = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of the global secondary index.
         */
        var indexName: kotlin.String? = null
        /**
         * The current state of the replica global secondary index:
         * CREATING - The index is being created.
         * UPDATING - The index is being updated.
         * DELETING - The index is being deleted.
         * ACTIVE - The index is ready for use.
         */
        var indexStatus: aws.sdk.kotlin.services.dynamodb.model.IndexStatus? = null
        /**
         * Represents the auto scaling settings for a global table or global secondary
         * index.
         */
        var provisionedReadCapacityAutoScalingSettings: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription? = null
        /**
         * Represents the auto scaling settings for a global table or global secondary
         * index.
         */
        var provisionedWriteCapacityAutoScalingSettings: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.ReplicaGlobalSecondaryIndexAutoScalingDescription) : this() {
            this.indexName = x.indexName
            this.indexStatus = x.indexStatus
            this.provisionedReadCapacityAutoScalingSettings = x.provisionedReadCapacityAutoScalingSettings
            this.provisionedWriteCapacityAutoScalingSettings = x.provisionedWriteCapacityAutoScalingSettings
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.ReplicaGlobalSecondaryIndexAutoScalingDescription = ReplicaGlobalSecondaryIndexAutoScalingDescription(this)

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription] inside the given [block]
         */
        fun provisionedReadCapacityAutoScalingSettings(block: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription.Builder.() -> kotlin.Unit) {
            this.provisionedReadCapacityAutoScalingSettings = aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription] inside the given [block]
         */
        fun provisionedWriteCapacityAutoScalingSettings(block: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription.Builder.() -> kotlin.Unit) {
            this.provisionedWriteCapacityAutoScalingSettings = aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription.invoke(block)
        }
    }
}
