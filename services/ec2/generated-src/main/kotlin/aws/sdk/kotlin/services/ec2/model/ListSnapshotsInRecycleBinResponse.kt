// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ListSnapshotsInRecycleBinResponse private constructor(builder: Builder) {
    /**
     * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * Information about the snapshots.
     */
    val snapshots: List<SnapshotRecycleBinInfo>? = builder.snapshots

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ListSnapshotsInRecycleBinResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ListSnapshotsInRecycleBinResponse(")
        append("nextToken=$nextToken,")
        append("snapshots=$snapshots)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (snapshots?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ListSnapshotsInRecycleBinResponse

        if (nextToken != other.nextToken) return false
        if (snapshots != other.snapshots) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ListSnapshotsInRecycleBinResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
         */
        var nextToken: kotlin.String? = null
        /**
         * Information about the snapshots.
         */
        var snapshots: List<SnapshotRecycleBinInfo>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ListSnapshotsInRecycleBinResponse) : this() {
            this.nextToken = x.nextToken
            this.snapshots = x.snapshots
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ListSnapshotsInRecycleBinResponse = ListSnapshotsInRecycleBinResponse(this)
    }
}
