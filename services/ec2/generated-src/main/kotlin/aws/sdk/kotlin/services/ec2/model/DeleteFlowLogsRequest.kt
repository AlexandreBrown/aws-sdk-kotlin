// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteFlowLogsRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more flow log IDs.
     * Constraint: Maximum of 1000 flow log IDs.
     */
    val flowLogIds: List<String>? = builder.flowLogIds

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteFlowLogsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteFlowLogsRequest(")
        append("dryRun=$dryRun,")
        append("flowLogIds=$flowLogIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (flowLogIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteFlowLogsRequest

        if (dryRun != other.dryRun) return false
        if (flowLogIds != other.flowLogIds) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteFlowLogsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * One or more flow log IDs.
         * Constraint: Maximum of 1000 flow log IDs.
         */
        var flowLogIds: List<String>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteFlowLogsRequest) : this() {
            this.dryRun = x.dryRun
            this.flowLogIds = x.flowLogIds
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteFlowLogsRequest = DeleteFlowLogsRequest(this)
    }
}
