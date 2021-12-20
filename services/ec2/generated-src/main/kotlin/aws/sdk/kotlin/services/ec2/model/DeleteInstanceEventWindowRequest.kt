// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteInstanceEventWindowRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * Specify true to force delete the event window. Use the force delete parameter
     * if the event window is currently associated with targets.
     */
    val forceDelete: kotlin.Boolean? = builder.forceDelete
    /**
     * The ID of the event window.
     */
    val instanceEventWindowId: kotlin.String? = builder.instanceEventWindowId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteInstanceEventWindowRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteInstanceEventWindowRequest(")
        append("dryRun=$dryRun,")
        append("forceDelete=$forceDelete,")
        append("instanceEventWindowId=$instanceEventWindowId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (forceDelete?.hashCode() ?: 0)
        result = 31 * result + (instanceEventWindowId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteInstanceEventWindowRequest

        if (dryRun != other.dryRun) return false
        if (forceDelete != other.forceDelete) return false
        if (instanceEventWindowId != other.instanceEventWindowId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteInstanceEventWindowRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * Specify true to force delete the event window. Use the force delete parameter
         * if the event window is currently associated with targets.
         */
        var forceDelete: kotlin.Boolean? = null
        /**
         * The ID of the event window.
         */
        var instanceEventWindowId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteInstanceEventWindowRequest) : this() {
            this.dryRun = x.dryRun
            this.forceDelete = x.forceDelete
            this.instanceEventWindowId = x.instanceEventWindowId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteInstanceEventWindowRequest = DeleteInstanceEventWindowRequest(this)
    }
}