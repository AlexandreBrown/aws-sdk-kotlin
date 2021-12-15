// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a launch permission modification.
 */
class LaunchPermissionModifications private constructor(builder: Builder) {
    /**
     * The Amazon Web Services account ID to add to the list of launch permissions for the AMI.
     */
    val add: List<LaunchPermission>? = builder.add
    /**
     * The Amazon Web Services account ID to remove from the list of launch permissions for the AMI.
     */
    val remove: List<LaunchPermission>? = builder.remove

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.LaunchPermissionModifications = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LaunchPermissionModifications(")
        append("add=$add,")
        append("remove=$remove)")
    }

    override fun hashCode(): kotlin.Int {
        var result = add?.hashCode() ?: 0
        result = 31 * result + (remove?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LaunchPermissionModifications

        if (add != other.add) return false
        if (remove != other.remove) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.LaunchPermissionModifications = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Amazon Web Services account ID to add to the list of launch permissions for the AMI.
         */
        var add: List<LaunchPermission>? = null
        /**
         * The Amazon Web Services account ID to remove from the list of launch permissions for the AMI.
         */
        var remove: List<LaunchPermission>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.LaunchPermissionModifications) : this() {
            this.add = x.add
            this.remove = x.remove
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.LaunchPermissionModifications = LaunchPermissionModifications(this)
    }
}
