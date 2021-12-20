// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateSnapshotsResponse private constructor(builder: Builder) {
    /**
     * List of snapshots.
     */
    val snapshots: List<SnapshotInfo>? = builder.snapshots

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateSnapshotsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateSnapshotsResponse(")
        append("snapshots=$snapshots)")
    }

    override fun hashCode(): kotlin.Int {
        var result = snapshots?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateSnapshotsResponse

        if (snapshots != other.snapshots) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateSnapshotsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * List of snapshots.
         */
        var snapshots: List<SnapshotInfo>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateSnapshotsResponse) : this() {
            this.snapshots = x.snapshots
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateSnapshotsResponse = CreateSnapshotsResponse(this)
    }
}