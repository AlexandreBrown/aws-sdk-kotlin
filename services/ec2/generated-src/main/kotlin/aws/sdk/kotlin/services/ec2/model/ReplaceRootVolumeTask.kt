// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Information about a root volume replacement task.
 */
class ReplaceRootVolumeTask private constructor(builder: Builder) {
    /**
     * The time the task completed.
     */
    val completeTime: kotlin.String? = builder.completeTime
    /**
     * The ID of the instance for which the root volume replacement task was created.
     */
    val instanceId: kotlin.String? = builder.instanceId
    /**
     * The ID of the root volume replacement task.
     */
    val replaceRootVolumeTaskId: kotlin.String? = builder.replaceRootVolumeTaskId
    /**
     * The time the task was started.
     */
    val startTime: kotlin.String? = builder.startTime
    /**
     * The tags assigned to the task.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * The state of the task. The task can be in one of the following states:
     * pending - the replacement volume is being created.
     * in-progress - the original volume is being detached and the
     * replacement volume is being attached.
     * succeeded - the replacement volume has been successfully attached
     * to the instance and the instance is available.
     * failing - the replacement task is in the process of failing.
     * failed - the replacement task has failed but the original root
     * volume is still attached.
     * failing-detached - the replacement task is in the process of failing.
     * The instance might have no root volume attached.
     * failed-detached - the replacement task has failed and the instance
     * has no root volume attached.
     */
    val taskState: aws.sdk.kotlin.services.ec2.model.ReplaceRootVolumeTaskState? = builder.taskState

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ReplaceRootVolumeTask = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ReplaceRootVolumeTask(")
        append("completeTime=$completeTime,")
        append("instanceId=$instanceId,")
        append("replaceRootVolumeTaskId=$replaceRootVolumeTaskId,")
        append("startTime=$startTime,")
        append("tags=$tags,")
        append("taskState=$taskState)")
    }

    override fun hashCode(): kotlin.Int {
        var result = completeTime?.hashCode() ?: 0
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        result = 31 * result + (replaceRootVolumeTaskId?.hashCode() ?: 0)
        result = 31 * result + (startTime?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (taskState?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ReplaceRootVolumeTask

        if (completeTime != other.completeTime) return false
        if (instanceId != other.instanceId) return false
        if (replaceRootVolumeTaskId != other.replaceRootVolumeTaskId) return false
        if (startTime != other.startTime) return false
        if (tags != other.tags) return false
        if (taskState != other.taskState) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ReplaceRootVolumeTask = Builder(this).apply(block).build()

    class Builder {
        /**
         * The time the task completed.
         */
        var completeTime: kotlin.String? = null
        /**
         * The ID of the instance for which the root volume replacement task was created.
         */
        var instanceId: kotlin.String? = null
        /**
         * The ID of the root volume replacement task.
         */
        var replaceRootVolumeTaskId: kotlin.String? = null
        /**
         * The time the task was started.
         */
        var startTime: kotlin.String? = null
        /**
         * The tags assigned to the task.
         */
        var tags: List<Tag>? = null
        /**
         * The state of the task. The task can be in one of the following states:
         * pending - the replacement volume is being created.
         * in-progress - the original volume is being detached and the
         * replacement volume is being attached.
         * succeeded - the replacement volume has been successfully attached
         * to the instance and the instance is available.
         * failing - the replacement task is in the process of failing.
         * failed - the replacement task has failed but the original root
         * volume is still attached.
         * failing-detached - the replacement task is in the process of failing.
         * The instance might have no root volume attached.
         * failed-detached - the replacement task has failed and the instance
         * has no root volume attached.
         */
        var taskState: aws.sdk.kotlin.services.ec2.model.ReplaceRootVolumeTaskState? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ReplaceRootVolumeTask) : this() {
            this.completeTime = x.completeTime
            this.instanceId = x.instanceId
            this.replaceRootVolumeTaskId = x.replaceRootVolumeTaskId
            this.startTime = x.startTime
            this.tags = x.tags
            this.taskState = x.taskState
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ReplaceRootVolumeTask = ReplaceRootVolumeTask(this)
    }
}
