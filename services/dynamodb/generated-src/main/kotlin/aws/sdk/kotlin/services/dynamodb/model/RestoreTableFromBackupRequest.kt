// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



class RestoreTableFromBackupRequest private constructor(builder: Builder) {
    /**
     * The Amazon Resource Name (ARN) associated with the backup.
     */
    val backupArn: kotlin.String? = builder.backupArn
    /**
     * The billing mode of the restored table.
     */
    val billingModeOverride: aws.sdk.kotlin.services.dynamodb.model.BillingMode? = builder.billingModeOverride
    /**
     * List of global secondary indexes for the restored table. The indexes provided should
     * match existing secondary indexes. You can choose to exclude some or all of the indexes
     * at the time of restore.
     */
    val globalSecondaryIndexOverride: List<GlobalSecondaryIndex>? = builder.globalSecondaryIndexOverride
    /**
     * List of local secondary indexes for the restored table. The indexes provided should
     * match existing secondary indexes. You can choose to exclude some or all of the indexes
     * at the time of restore.
     */
    val localSecondaryIndexOverride: List<LocalSecondaryIndex>? = builder.localSecondaryIndexOverride
    /**
     * Provisioned throughput settings for the restored table.
     */
    val provisionedThroughputOverride: aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughput? = builder.provisionedThroughputOverride
    /**
     * The new server-side encryption settings for the restored table.
     */
    val sseSpecificationOverride: aws.sdk.kotlin.services.dynamodb.model.SseSpecification? = builder.sseSpecificationOverride
    /**
     * The name of the new table to which the backup must be restored.
     */
    val targetTableName: kotlin.String? = builder.targetTableName

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.RestoreTableFromBackupRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("RestoreTableFromBackupRequest(")
        append("backupArn=$backupArn,")
        append("billingModeOverride=$billingModeOverride,")
        append("globalSecondaryIndexOverride=$globalSecondaryIndexOverride,")
        append("localSecondaryIndexOverride=$localSecondaryIndexOverride,")
        append("provisionedThroughputOverride=$provisionedThroughputOverride,")
        append("sseSpecificationOverride=$sseSpecificationOverride,")
        append("targetTableName=$targetTableName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = backupArn?.hashCode() ?: 0
        result = 31 * result + (billingModeOverride?.hashCode() ?: 0)
        result = 31 * result + (globalSecondaryIndexOverride?.hashCode() ?: 0)
        result = 31 * result + (localSecondaryIndexOverride?.hashCode() ?: 0)
        result = 31 * result + (provisionedThroughputOverride?.hashCode() ?: 0)
        result = 31 * result + (sseSpecificationOverride?.hashCode() ?: 0)
        result = 31 * result + (targetTableName?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as RestoreTableFromBackupRequest

        if (backupArn != other.backupArn) return false
        if (billingModeOverride != other.billingModeOverride) return false
        if (globalSecondaryIndexOverride != other.globalSecondaryIndexOverride) return false
        if (localSecondaryIndexOverride != other.localSecondaryIndexOverride) return false
        if (provisionedThroughputOverride != other.provisionedThroughputOverride) return false
        if (sseSpecificationOverride != other.sseSpecificationOverride) return false
        if (targetTableName != other.targetTableName) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.RestoreTableFromBackupRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Amazon Resource Name (ARN) associated with the backup.
         */
        var backupArn: kotlin.String? = null
        /**
         * The billing mode of the restored table.
         */
        var billingModeOverride: aws.sdk.kotlin.services.dynamodb.model.BillingMode? = null
        /**
         * List of global secondary indexes for the restored table. The indexes provided should
         * match existing secondary indexes. You can choose to exclude some or all of the indexes
         * at the time of restore.
         */
        var globalSecondaryIndexOverride: List<GlobalSecondaryIndex>? = null
        /**
         * List of local secondary indexes for the restored table. The indexes provided should
         * match existing secondary indexes. You can choose to exclude some or all of the indexes
         * at the time of restore.
         */
        var localSecondaryIndexOverride: List<LocalSecondaryIndex>? = null
        /**
         * Provisioned throughput settings for the restored table.
         */
        var provisionedThroughputOverride: aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughput? = null
        /**
         * The new server-side encryption settings for the restored table.
         */
        var sseSpecificationOverride: aws.sdk.kotlin.services.dynamodb.model.SseSpecification? = null
        /**
         * The name of the new table to which the backup must be restored.
         */
        var targetTableName: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.RestoreTableFromBackupRequest) : this() {
            this.backupArn = x.backupArn
            this.billingModeOverride = x.billingModeOverride
            this.globalSecondaryIndexOverride = x.globalSecondaryIndexOverride
            this.localSecondaryIndexOverride = x.localSecondaryIndexOverride
            this.provisionedThroughputOverride = x.provisionedThroughputOverride
            this.sseSpecificationOverride = x.sseSpecificationOverride
            this.targetTableName = x.targetTableName
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.RestoreTableFromBackupRequest = RestoreTableFromBackupRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughput] inside the given [block]
         */
        fun provisionedThroughputOverride(block: aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughput.Builder.() -> kotlin.Unit) {
            this.provisionedThroughputOverride = aws.sdk.kotlin.services.dynamodb.model.ProvisionedThroughput.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.SseSpecification] inside the given [block]
         */
        fun sseSpecificationOverride(block: aws.sdk.kotlin.services.dynamodb.model.SseSpecification.Builder.() -> kotlin.Unit) {
            this.sseSpecificationOverride = aws.sdk.kotlin.services.dynamodb.model.SseSpecification.invoke(block)
        }
    }
}