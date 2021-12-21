// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeSnapshotsResponse private constructor(builder: Builder) {
    /**
     * The NextToken value to include in a future DescribeSnapshots
     * request. When the results of a DescribeSnapshots request exceed
     * MaxResults, this value can be used to retrieve the next page of results. This
     * value is null when there are no more results to return.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * Information about the snapshots.
     */
    val snapshots: List<Snapshot>? = builder.snapshots

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeSnapshotsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeSnapshotsResponse(")
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

        other as DescribeSnapshotsResponse

        if (nextToken != other.nextToken) return false
        if (snapshots != other.snapshots) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeSnapshotsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The NextToken value to include in a future DescribeSnapshots
         * request. When the results of a DescribeSnapshots request exceed
         * MaxResults, this value can be used to retrieve the next page of results. This
         * value is null when there are no more results to return.
         */
        var nextToken: kotlin.String? = null
        /**
         * Information about the snapshots.
         */
        var snapshots: List<Snapshot>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeSnapshotsResponse) : this() {
            this.nextToken = x.nextToken
            this.snapshots = x.snapshots
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeSnapshotsResponse = DescribeSnapshotsResponse(this)
    }
}