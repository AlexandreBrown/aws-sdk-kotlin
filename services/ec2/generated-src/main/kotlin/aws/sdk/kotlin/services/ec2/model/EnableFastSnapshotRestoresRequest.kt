// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class EnableFastSnapshotRestoresRequest private constructor(builder: Builder) {
    /**
     * One or more Availability Zones. For example, us-east-2a.
     */
    val availabilityZones: List<String>? = builder.availabilityZones
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The IDs of one or more snapshots. For example, snap-1234567890abcdef0. You can specify
     * a snapshot that was shared with you from another Amazon Web Services account.
     */
    val sourceSnapshotIds: List<String>? = builder.sourceSnapshotIds

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.EnableFastSnapshotRestoresRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("EnableFastSnapshotRestoresRequest(")
        append("availabilityZones=$availabilityZones,")
        append("dryRun=$dryRun,")
        append("sourceSnapshotIds=$sourceSnapshotIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = availabilityZones?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (sourceSnapshotIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as EnableFastSnapshotRestoresRequest

        if (availabilityZones != other.availabilityZones) return false
        if (dryRun != other.dryRun) return false
        if (sourceSnapshotIds != other.sourceSnapshotIds) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.EnableFastSnapshotRestoresRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * One or more Availability Zones. For example, us-east-2a.
         */
        var availabilityZones: List<String>? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The IDs of one or more snapshots. For example, snap-1234567890abcdef0. You can specify
         * a snapshot that was shared with you from another Amazon Web Services account.
         */
        var sourceSnapshotIds: List<String>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.EnableFastSnapshotRestoresRequest) : this() {
            this.availabilityZones = x.availabilityZones
            this.dryRun = x.dryRun
            this.sourceSnapshotIds = x.sourceSnapshotIds
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.EnableFastSnapshotRestoresRequest = EnableFastSnapshotRestoresRequest(this)
    }
}