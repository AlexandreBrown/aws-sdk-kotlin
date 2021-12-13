// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the output of CreateNetworkInterfacePermission.
 */
class CreateNetworkInterfacePermissionResponse private constructor(builder: Builder) {
    /**
     * Information about the permission for the network interface.
     */
    val interfacePermission: aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermission? = builder.interfacePermission

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateNetworkInterfacePermissionResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateNetworkInterfacePermissionResponse(")
        append("interfacePermission=$interfacePermission)")
    }

    override fun hashCode(): kotlin.Int {
        var result = interfacePermission?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateNetworkInterfacePermissionResponse

        if (interfacePermission != other.interfacePermission) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateNetworkInterfacePermissionResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the permission for the network interface.
         */
        var interfacePermission: aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermission? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateNetworkInterfacePermissionResponse) : this() {
            this.interfacePermission = x.interfacePermission
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateNetworkInterfacePermissionResponse = CreateNetworkInterfacePermissionResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermission] inside the given [block]
         */
        fun interfacePermission(block: aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermission.Builder.() -> kotlin.Unit) {
            this.interfacePermission = aws.sdk.kotlin.services.ec2.model.NetworkInterfacePermission.invoke(block)
        }
    }
}
