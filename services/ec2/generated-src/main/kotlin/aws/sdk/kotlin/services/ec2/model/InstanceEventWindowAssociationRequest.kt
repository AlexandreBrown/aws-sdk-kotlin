// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * One or more targets associated with the specified event window. Only one
 * type of target (instance ID, instance tag, or Dedicated Host ID)
 * can be associated with an event window.
 */
class InstanceEventWindowAssociationRequest private constructor(builder: Builder) {
    /**
     * The IDs of the Dedicated Hosts to associate with the event window.
     */
    val dedicatedHostIds: List<String>? = builder.dedicatedHostIds
    /**
     * The IDs of the instances to associate with the event window. If the instance is on a
     * Dedicated Host, you can't specify the Instance ID parameter; you must use the Dedicated
     * Host ID parameter.
     */
    val instanceIds: List<String>? = builder.instanceIds
    /**
     * The instance tags to associate with the event window. Any instances associated with the
     * tags will be associated with the event window.
     */
    val instanceTags: List<Tag>? = builder.instanceTags

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.InstanceEventWindowAssociationRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InstanceEventWindowAssociationRequest(")
        append("dedicatedHostIds=$dedicatedHostIds,")
        append("instanceIds=$instanceIds,")
        append("instanceTags=$instanceTags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dedicatedHostIds?.hashCode() ?: 0
        result = 31 * result + (instanceIds?.hashCode() ?: 0)
        result = 31 * result + (instanceTags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InstanceEventWindowAssociationRequest

        if (dedicatedHostIds != other.dedicatedHostIds) return false
        if (instanceIds != other.instanceIds) return false
        if (instanceTags != other.instanceTags) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.InstanceEventWindowAssociationRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The IDs of the Dedicated Hosts to associate with the event window.
         */
        var dedicatedHostIds: List<String>? = null
        /**
         * The IDs of the instances to associate with the event window. If the instance is on a
         * Dedicated Host, you can't specify the Instance ID parameter; you must use the Dedicated
         * Host ID parameter.
         */
        var instanceIds: List<String>? = null
        /**
         * The instance tags to associate with the event window. Any instances associated with the
         * tags will be associated with the event window.
         */
        var instanceTags: List<Tag>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.InstanceEventWindowAssociationRequest) : this() {
            this.dedicatedHostIds = x.dedicatedHostIds
            this.instanceIds = x.instanceIds
            this.instanceTags = x.instanceTags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.InstanceEventWindowAssociationRequest = InstanceEventWindowAssociationRequest(this)
    }
}