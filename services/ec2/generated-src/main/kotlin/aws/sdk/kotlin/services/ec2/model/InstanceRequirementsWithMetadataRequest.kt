// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The architecture type, virtualization type, and other attributes for the instance types.
 * When you specify instance attributes, Amazon EC2 will identify instance types with those
 * attributes.
 * If you specify InstanceRequirementsWithMetadataRequest, you can't specify
 * InstanceTypes.
 */
class InstanceRequirementsWithMetadataRequest private constructor(builder: Builder) {
    /**
     * The architecture type.
     */
    val architectureTypes: List<ArchitectureType>? = builder.architectureTypes
    /**
     * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will
     * identify instance types with those attributes.
     */
    val instanceRequirements: aws.sdk.kotlin.services.ec2.model.InstanceRequirementsRequest? = builder.instanceRequirements
    /**
     * The virtualization type.
     */
    val virtualizationTypes: List<VirtualizationType>? = builder.virtualizationTypes

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.InstanceRequirementsWithMetadataRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InstanceRequirementsWithMetadataRequest(")
        append("architectureTypes=$architectureTypes,")
        append("instanceRequirements=$instanceRequirements,")
        append("virtualizationTypes=$virtualizationTypes)")
    }

    override fun hashCode(): kotlin.Int {
        var result = architectureTypes?.hashCode() ?: 0
        result = 31 * result + (instanceRequirements?.hashCode() ?: 0)
        result = 31 * result + (virtualizationTypes?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InstanceRequirementsWithMetadataRequest

        if (architectureTypes != other.architectureTypes) return false
        if (instanceRequirements != other.instanceRequirements) return false
        if (virtualizationTypes != other.virtualizationTypes) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.InstanceRequirementsWithMetadataRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The architecture type.
         */
        var architectureTypes: List<ArchitectureType>? = null
        /**
         * The attributes for the instance types. When you specify instance attributes, Amazon EC2 will
         * identify instance types with those attributes.
         */
        var instanceRequirements: aws.sdk.kotlin.services.ec2.model.InstanceRequirementsRequest? = null
        /**
         * The virtualization type.
         */
        var virtualizationTypes: List<VirtualizationType>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.InstanceRequirementsWithMetadataRequest) : this() {
            this.architectureTypes = x.architectureTypes
            this.instanceRequirements = x.instanceRequirements
            this.virtualizationTypes = x.virtualizationTypes
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.InstanceRequirementsWithMetadataRequest = InstanceRequirementsWithMetadataRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.InstanceRequirementsRequest] inside the given [block]
         */
        fun instanceRequirements(block: aws.sdk.kotlin.services.ec2.model.InstanceRequirementsRequest.Builder.() -> kotlin.Unit) {
            this.instanceRequirements = aws.sdk.kotlin.services.ec2.model.InstanceRequirementsRequest.invoke(block)
        }
    }
}