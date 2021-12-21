// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an image attribute.
 */
class DescribeImageAttributeResponse private constructor(builder: Builder) {
    /**
     * The block device mapping entries.
     */
    val blockDeviceMappings: List<BlockDeviceMapping>? = builder.blockDeviceMappings
    /**
     * Describes a value for a resource attribute that is a String.
     */
    val bootMode: aws.sdk.kotlin.services.ec2.model.AttributeValue? = builder.bootMode
    /**
     * A description for the AMI.
     */
    val description: aws.sdk.kotlin.services.ec2.model.AttributeValue? = builder.description
    /**
     * The ID of the AMI.
     */
    val imageId: kotlin.String? = builder.imageId
    /**
     * The kernel ID.
     */
    val kernelId: aws.sdk.kotlin.services.ec2.model.AttributeValue? = builder.kernelId
    /**
     * The launch permissions.
     */
    val launchPermissions: List<LaunchPermission>? = builder.launchPermissions
    /**
     * The product codes.
     */
    val productCodes: List<ProductCode>? = builder.productCodes
    /**
     * The RAM disk ID.
     */
    val ramdiskId: aws.sdk.kotlin.services.ec2.model.AttributeValue? = builder.ramdiskId
    /**
     * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     */
    val sriovNetSupport: aws.sdk.kotlin.services.ec2.model.AttributeValue? = builder.sriovNetSupport

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeImageAttributeResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeImageAttributeResponse(")
        append("blockDeviceMappings=$blockDeviceMappings,")
        append("bootMode=$bootMode,")
        append("description=$description,")
        append("imageId=$imageId,")
        append("kernelId=$kernelId,")
        append("launchPermissions=$launchPermissions,")
        append("productCodes=$productCodes,")
        append("ramdiskId=$ramdiskId,")
        append("sriovNetSupport=$sriovNetSupport)")
    }

    override fun hashCode(): kotlin.Int {
        var result = blockDeviceMappings?.hashCode() ?: 0
        result = 31 * result + (bootMode?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (imageId?.hashCode() ?: 0)
        result = 31 * result + (kernelId?.hashCode() ?: 0)
        result = 31 * result + (launchPermissions?.hashCode() ?: 0)
        result = 31 * result + (productCodes?.hashCode() ?: 0)
        result = 31 * result + (ramdiskId?.hashCode() ?: 0)
        result = 31 * result + (sriovNetSupport?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeImageAttributeResponse

        if (blockDeviceMappings != other.blockDeviceMappings) return false
        if (bootMode != other.bootMode) return false
        if (description != other.description) return false
        if (imageId != other.imageId) return false
        if (kernelId != other.kernelId) return false
        if (launchPermissions != other.launchPermissions) return false
        if (productCodes != other.productCodes) return false
        if (ramdiskId != other.ramdiskId) return false
        if (sriovNetSupport != other.sriovNetSupport) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeImageAttributeResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The block device mapping entries.
         */
        var blockDeviceMappings: List<BlockDeviceMapping>? = null
        /**
         * Describes a value for a resource attribute that is a String.
         */
        var bootMode: aws.sdk.kotlin.services.ec2.model.AttributeValue? = null
        /**
         * A description for the AMI.
         */
        var description: aws.sdk.kotlin.services.ec2.model.AttributeValue? = null
        /**
         * The ID of the AMI.
         */
        var imageId: kotlin.String? = null
        /**
         * The kernel ID.
         */
        var kernelId: aws.sdk.kotlin.services.ec2.model.AttributeValue? = null
        /**
         * The launch permissions.
         */
        var launchPermissions: List<LaunchPermission>? = null
        /**
         * The product codes.
         */
        var productCodes: List<ProductCode>? = null
        /**
         * The RAM disk ID.
         */
        var ramdiskId: aws.sdk.kotlin.services.ec2.model.AttributeValue? = null
        /**
         * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
         */
        var sriovNetSupport: aws.sdk.kotlin.services.ec2.model.AttributeValue? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeImageAttributeResponse) : this() {
            this.blockDeviceMappings = x.blockDeviceMappings
            this.bootMode = x.bootMode
            this.description = x.description
            this.imageId = x.imageId
            this.kernelId = x.kernelId
            this.launchPermissions = x.launchPermissions
            this.productCodes = x.productCodes
            this.ramdiskId = x.ramdiskId
            this.sriovNetSupport = x.sriovNetSupport
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeImageAttributeResponse = DescribeImageAttributeResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeValue] inside the given [block]
         */
        fun bootMode(block: aws.sdk.kotlin.services.ec2.model.AttributeValue.Builder.() -> kotlin.Unit) {
            this.bootMode = aws.sdk.kotlin.services.ec2.model.AttributeValue.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeValue] inside the given [block]
         */
        fun description(block: aws.sdk.kotlin.services.ec2.model.AttributeValue.Builder.() -> kotlin.Unit) {
            this.description = aws.sdk.kotlin.services.ec2.model.AttributeValue.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeValue] inside the given [block]
         */
        fun kernelId(block: aws.sdk.kotlin.services.ec2.model.AttributeValue.Builder.() -> kotlin.Unit) {
            this.kernelId = aws.sdk.kotlin.services.ec2.model.AttributeValue.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeValue] inside the given [block]
         */
        fun ramdiskId(block: aws.sdk.kotlin.services.ec2.model.AttributeValue.Builder.() -> kotlin.Unit) {
            this.ramdiskId = aws.sdk.kotlin.services.ec2.model.AttributeValue.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeValue] inside the given [block]
         */
        fun sriovNetSupport(block: aws.sdk.kotlin.services.ec2.model.AttributeValue.Builder.() -> kotlin.Unit) {
            this.sriovNetSupport = aws.sdk.kotlin.services.ec2.model.AttributeValue.invoke(block)
        }
    }
}