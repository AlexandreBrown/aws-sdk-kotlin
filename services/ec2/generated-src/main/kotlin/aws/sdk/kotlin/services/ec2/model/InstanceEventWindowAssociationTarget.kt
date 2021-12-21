// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * One or more targets associated with the event window.
 */
class InstanceEventWindowAssociationTarget private constructor(builder: Builder) {
    /**
     * The IDs of the Dedicated Hosts associated with the event window.
     */
    val dedicatedHostIds: List<String>? = builder.dedicatedHostIds
    /**
     * The IDs of the instances associated with the event window.
     */
    val instanceIds: List<String>? = builder.instanceIds
    /**
     * The instance tags associated with the event window. Any instances associated with the tags
     * will be associated with the event window.
     */
    val tags: List<Tag>? = builder.tags

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.InstanceEventWindowAssociationTarget = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InstanceEventWindowAssociationTarget(")
        append("dedicatedHostIds=$dedicatedHostIds,")
        append("instanceIds=$instanceIds,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dedicatedHostIds?.hashCode() ?: 0
        result = 31 * result + (instanceIds?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InstanceEventWindowAssociationTarget

        if (dedicatedHostIds != other.dedicatedHostIds) return false
        if (instanceIds != other.instanceIds) return false
        if (tags != other.tags) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.InstanceEventWindowAssociationTarget = Builder(this).apply(block).build()

    class Builder {
        /**
         * The IDs of the Dedicated Hosts associated with the event window.
         */
        var dedicatedHostIds: List<String>? = null
        /**
         * The IDs of the instances associated with the event window.
         */
        var instanceIds: List<String>? = null
        /**
         * The instance tags associated with the event window. Any instances associated with the tags
         * will be associated with the event window.
         */
        var tags: List<Tag>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.InstanceEventWindowAssociationTarget) : this() {
            this.dedicatedHostIds = x.dedicatedHostIds
            this.instanceIds = x.instanceIds
            this.tags = x.tags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.InstanceEventWindowAssociationTarget = InstanceEventWindowAssociationTarget(this)
    }
}