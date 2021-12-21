// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the auto scaling settings of the replica.
 */
class ReplicaAutoScalingDescription private constructor(builder: Builder) {
    /**
     * Replica-specific global secondary index auto scaling settings.
     */
    val globalSecondaryIndexes: List<ReplicaGlobalSecondaryIndexAutoScalingDescription>? = builder.globalSecondaryIndexes
    /**
     * The Region where the replica exists.
     */
    val regionName: kotlin.String? = builder.regionName
    /**
     * Represents the auto scaling settings for a global table or global secondary
     * index.
     */
    val replicaProvisionedReadCapacityAutoScalingSettings: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription? = builder.replicaProvisionedReadCapacityAutoScalingSettings
    /**
     * Represents the auto scaling settings for a global table or global secondary
     * index.
     */
    val replicaProvisionedWriteCapacityAutoScalingSettings: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription? = builder.replicaProvisionedWriteCapacityAutoScalingSettings
    /**
     * The current state of the replica:
     * CREATING - The replica is being created.
     * UPDATING - The replica is being updated.
     * DELETING - The replica is being deleted.
     * ACTIVE - The replica is ready for use.
     */
    val replicaStatus: aws.sdk.kotlin.services.dynamodb.model.ReplicaStatus? = builder.replicaStatus

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.ReplicaAutoScalingDescription = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ReplicaAutoScalingDescription(")
        append("globalSecondaryIndexes=$globalSecondaryIndexes,")
        append("regionName=$regionName,")
        append("replicaProvisionedReadCapacityAutoScalingSettings=$replicaProvisionedReadCapacityAutoScalingSettings,")
        append("replicaProvisionedWriteCapacityAutoScalingSettings=$replicaProvisionedWriteCapacityAutoScalingSettings,")
        append("replicaStatus=$replicaStatus)")
    }

    override fun hashCode(): kotlin.Int {
        var result = globalSecondaryIndexes?.hashCode() ?: 0
        result = 31 * result + (regionName?.hashCode() ?: 0)
        result = 31 * result + (replicaProvisionedReadCapacityAutoScalingSettings?.hashCode() ?: 0)
        result = 31 * result + (replicaProvisionedWriteCapacityAutoScalingSettings?.hashCode() ?: 0)
        result = 31 * result + (replicaStatus?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ReplicaAutoScalingDescription

        if (globalSecondaryIndexes != other.globalSecondaryIndexes) return false
        if (regionName != other.regionName) return false
        if (replicaProvisionedReadCapacityAutoScalingSettings != other.replicaProvisionedReadCapacityAutoScalingSettings) return false
        if (replicaProvisionedWriteCapacityAutoScalingSettings != other.replicaProvisionedWriteCapacityAutoScalingSettings) return false
        if (replicaStatus != other.replicaStatus) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.ReplicaAutoScalingDescription = Builder(this).apply(block).build()

    class Builder {
        /**
         * Replica-specific global secondary index auto scaling settings.
         */
        var globalSecondaryIndexes: List<ReplicaGlobalSecondaryIndexAutoScalingDescription>? = null
        /**
         * The Region where the replica exists.
         */
        var regionName: kotlin.String? = null
        /**
         * Represents the auto scaling settings for a global table or global secondary
         * index.
         */
        var replicaProvisionedReadCapacityAutoScalingSettings: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription? = null
        /**
         * Represents the auto scaling settings for a global table or global secondary
         * index.
         */
        var replicaProvisionedWriteCapacityAutoScalingSettings: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription? = null
        /**
         * The current state of the replica:
         * CREATING - The replica is being created.
         * UPDATING - The replica is being updated.
         * DELETING - The replica is being deleted.
         * ACTIVE - The replica is ready for use.
         */
        var replicaStatus: aws.sdk.kotlin.services.dynamodb.model.ReplicaStatus? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.ReplicaAutoScalingDescription) : this() {
            this.globalSecondaryIndexes = x.globalSecondaryIndexes
            this.regionName = x.regionName
            this.replicaProvisionedReadCapacityAutoScalingSettings = x.replicaProvisionedReadCapacityAutoScalingSettings
            this.replicaProvisionedWriteCapacityAutoScalingSettings = x.replicaProvisionedWriteCapacityAutoScalingSettings
            this.replicaStatus = x.replicaStatus
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.ReplicaAutoScalingDescription = ReplicaAutoScalingDescription(this)

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription] inside the given [block]
         */
        fun replicaProvisionedReadCapacityAutoScalingSettings(block: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription.Builder.() -> kotlin.Unit) {
            this.replicaProvisionedReadCapacityAutoScalingSettings = aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription] inside the given [block]
         */
        fun replicaProvisionedWriteCapacityAutoScalingSettings(block: aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription.Builder.() -> kotlin.Unit) {
            this.replicaProvisionedWriteCapacityAutoScalingSettings = aws.sdk.kotlin.services.dynamodb.model.AutoScalingSettingsDescription.invoke(block)
        }
    }
}