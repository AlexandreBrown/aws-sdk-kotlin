// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an image.
 */
class Image private constructor(builder: Builder) {
    /**
     * The architecture of the image.
     */
    val architecture: aws.sdk.kotlin.services.ec2.model.ArchitectureValues? = builder.architecture
    /**
     * Any block device mapping entries.
     */
    val blockDeviceMappings: List<BlockDeviceMapping>? = builder.blockDeviceMappings
    /**
     * The boot mode of the image. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-boot.html">Boot modes in the
     * Amazon Elastic Compute Cloud User Guide.
     */
    val bootMode: aws.sdk.kotlin.services.ec2.model.BootModeValues? = builder.bootMode
    /**
     * The date and time the image was created.
     */
    val creationDate: kotlin.String? = builder.creationDate
    /**
     * The date and time to deprecate the AMI, in UTC, in the following format:
     * YYYY-MM-DDTHH:MM:SSZ.
     * If you specified a value for seconds, Amazon EC2 rounds the seconds to the
     * nearest minute.
     */
    val deprecationTime: kotlin.String? = builder.deprecationTime
    /**
     * The description of the AMI that was provided during image creation.
     */
    val description: kotlin.String? = builder.description
    /**
     * Specifies whether enhanced networking with ENA is enabled.
     */
    val enaSupport: kotlin.Boolean? = builder.enaSupport
    /**
     * The hypervisor type of the image.
     */
    val hypervisor: aws.sdk.kotlin.services.ec2.model.HypervisorType? = builder.hypervisor
    /**
     * The ID of the AMI.
     */
    val imageId: kotlin.String? = builder.imageId
    /**
     * The location of the AMI.
     */
    val imageLocation: kotlin.String? = builder.imageLocation
    /**
     * The Amazon Web Services account alias (for example, amazon, self) or
     * the Amazon Web Services account ID of the AMI owner.
     */
    val imageOwnerAlias: kotlin.String? = builder.imageOwnerAlias
    /**
     * The type of image.
     */
    val imageType: aws.sdk.kotlin.services.ec2.model.ImageTypeValues? = builder.imageType
    /**
     * The kernel associated with the image, if any. Only applicable for machine images.
     */
    val kernelId: kotlin.String? = builder.kernelId
    /**
     * The name of the AMI that was provided during image creation.
     */
    val name: kotlin.String? = builder.name
    /**
     * The ID of the Amazon Web Services account that owns the image.
     */
    val ownerId: kotlin.String? = builder.ownerId
    /**
     * This value is set to windows for Windows AMIs; otherwise, it is blank.
     */
    val platform: aws.sdk.kotlin.services.ec2.model.PlatformValues? = builder.platform
    /**
     * The platform details associated with the billing code of the AMI. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-billing-info.html">Understanding
     * AMI billing in the Amazon Elastic Compute Cloud User Guide.
     */
    val platformDetails: kotlin.String? = builder.platformDetails
    /**
     * Any product codes associated with the AMI.
     */
    val productCodes: List<ProductCode>? = builder.productCodes
    /**
     * Indicates whether the image has public launch permissions. The value is true if
     * this image has public launch permissions or false
     * if it has only implicit and explicit launch permissions.
     */
    val public: kotlin.Boolean? = builder.public
    /**
     * The RAM disk associated with the image, if any. Only applicable for machine images.
     */
    val ramdiskId: kotlin.String? = builder.ramdiskId
    /**
     * The device name of the root device volume (for example, /dev/sda1).
     */
    val rootDeviceName: kotlin.String? = builder.rootDeviceName
    /**
     * The type of root device used by the AMI. The AMI can use an Amazon EBS volume or an instance store volume.
     */
    val rootDeviceType: aws.sdk.kotlin.services.ec2.model.DeviceType? = builder.rootDeviceType
    /**
     * Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     */
    val sriovNetSupport: kotlin.String? = builder.sriovNetSupport
    /**
     * The current state of the AMI. If the state is available, the image is successfully registered and can be used to launch an instance.
     */
    val state: aws.sdk.kotlin.services.ec2.model.ImageState? = builder.state
    /**
     * The reason for the state change.
     */
    val stateReason: aws.sdk.kotlin.services.ec2.model.StateReason? = builder.stateReason
    /**
     * Any tags assigned to the image.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * The operation of the Amazon EC2 instance and the billing code that is associated with the AMI.
     * usageOperation corresponds to the <a href="https://docs.aws.amazon.com/cur/latest/userguide/Lineitem-columns.html#Lineitem-details-O-Operation">lineitem/Operation column on your Amazon Web Services Cost and Usage Report and in the <a href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/price-changes.html">Amazon Web Services Price
     * List API. You can view these fields on the Instances or
     * AMIs pages in the Amazon EC2 console, or in the responses that are
     * returned by the <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImages.html">DescribeImages
     * command in the Amazon EC2 API, or the <a href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-images.html">describe-images
     * command in the CLI.
     */
    val usageOperation: kotlin.String? = builder.usageOperation
    /**
     * The type of virtualization of the AMI.
     */
    val virtualizationType: aws.sdk.kotlin.services.ec2.model.VirtualizationType? = builder.virtualizationType

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.Image = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("Image(")
        append("architecture=$architecture,")
        append("blockDeviceMappings=$blockDeviceMappings,")
        append("bootMode=$bootMode,")
        append("creationDate=$creationDate,")
        append("deprecationTime=$deprecationTime,")
        append("description=$description,")
        append("enaSupport=$enaSupport,")
        append("hypervisor=$hypervisor,")
        append("imageId=$imageId,")
        append("imageLocation=$imageLocation,")
        append("imageOwnerAlias=$imageOwnerAlias,")
        append("imageType=$imageType,")
        append("kernelId=$kernelId,")
        append("name=$name,")
        append("ownerId=$ownerId,")
        append("platform=$platform,")
        append("platformDetails=$platformDetails,")
        append("productCodes=$productCodes,")
        append("public=$public,")
        append("ramdiskId=$ramdiskId,")
        append("rootDeviceName=$rootDeviceName,")
        append("rootDeviceType=$rootDeviceType,")
        append("sriovNetSupport=$sriovNetSupport,")
        append("state=$state,")
        append("stateReason=$stateReason,")
        append("tags=$tags,")
        append("usageOperation=$usageOperation,")
        append("virtualizationType=$virtualizationType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = architecture?.hashCode() ?: 0
        result = 31 * result + (blockDeviceMappings?.hashCode() ?: 0)
        result = 31 * result + (bootMode?.hashCode() ?: 0)
        result = 31 * result + (creationDate?.hashCode() ?: 0)
        result = 31 * result + (deprecationTime?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (enaSupport?.hashCode() ?: 0)
        result = 31 * result + (hypervisor?.hashCode() ?: 0)
        result = 31 * result + (imageId?.hashCode() ?: 0)
        result = 31 * result + (imageLocation?.hashCode() ?: 0)
        result = 31 * result + (imageOwnerAlias?.hashCode() ?: 0)
        result = 31 * result + (imageType?.hashCode() ?: 0)
        result = 31 * result + (kernelId?.hashCode() ?: 0)
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (ownerId?.hashCode() ?: 0)
        result = 31 * result + (platform?.hashCode() ?: 0)
        result = 31 * result + (platformDetails?.hashCode() ?: 0)
        result = 31 * result + (productCodes?.hashCode() ?: 0)
        result = 31 * result + (public?.hashCode() ?: 0)
        result = 31 * result + (ramdiskId?.hashCode() ?: 0)
        result = 31 * result + (rootDeviceName?.hashCode() ?: 0)
        result = 31 * result + (rootDeviceType?.hashCode() ?: 0)
        result = 31 * result + (sriovNetSupport?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (stateReason?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (usageOperation?.hashCode() ?: 0)
        result = 31 * result + (virtualizationType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Image

        if (architecture != other.architecture) return false
        if (blockDeviceMappings != other.blockDeviceMappings) return false
        if (bootMode != other.bootMode) return false
        if (creationDate != other.creationDate) return false
        if (deprecationTime != other.deprecationTime) return false
        if (description != other.description) return false
        if (enaSupport != other.enaSupport) return false
        if (hypervisor != other.hypervisor) return false
        if (imageId != other.imageId) return false
        if (imageLocation != other.imageLocation) return false
        if (imageOwnerAlias != other.imageOwnerAlias) return false
        if (imageType != other.imageType) return false
        if (kernelId != other.kernelId) return false
        if (name != other.name) return false
        if (ownerId != other.ownerId) return false
        if (platform != other.platform) return false
        if (platformDetails != other.platformDetails) return false
        if (productCodes != other.productCodes) return false
        if (public != other.public) return false
        if (ramdiskId != other.ramdiskId) return false
        if (rootDeviceName != other.rootDeviceName) return false
        if (rootDeviceType != other.rootDeviceType) return false
        if (sriovNetSupport != other.sriovNetSupport) return false
        if (state != other.state) return false
        if (stateReason != other.stateReason) return false
        if (tags != other.tags) return false
        if (usageOperation != other.usageOperation) return false
        if (virtualizationType != other.virtualizationType) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.Image = Builder(this).apply(block).build()

    class Builder {
        /**
         * The architecture of the image.
         */
        var architecture: aws.sdk.kotlin.services.ec2.model.ArchitectureValues? = null
        /**
         * Any block device mapping entries.
         */
        var blockDeviceMappings: List<BlockDeviceMapping>? = null
        /**
         * The boot mode of the image. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-boot.html">Boot modes in the
         * Amazon Elastic Compute Cloud User Guide.
         */
        var bootMode: aws.sdk.kotlin.services.ec2.model.BootModeValues? = null
        /**
         * The date and time the image was created.
         */
        var creationDate: kotlin.String? = null
        /**
         * The date and time to deprecate the AMI, in UTC, in the following format:
         * YYYY-MM-DDTHH:MM:SSZ.
         * If you specified a value for seconds, Amazon EC2 rounds the seconds to the
         * nearest minute.
         */
        var deprecationTime: kotlin.String? = null
        /**
         * The description of the AMI that was provided during image creation.
         */
        var description: kotlin.String? = null
        /**
         * Specifies whether enhanced networking with ENA is enabled.
         */
        var enaSupport: kotlin.Boolean? = null
        /**
         * The hypervisor type of the image.
         */
        var hypervisor: aws.sdk.kotlin.services.ec2.model.HypervisorType? = null
        /**
         * The ID of the AMI.
         */
        var imageId: kotlin.String? = null
        /**
         * The location of the AMI.
         */
        var imageLocation: kotlin.String? = null
        /**
         * The Amazon Web Services account alias (for example, amazon, self) or
         * the Amazon Web Services account ID of the AMI owner.
         */
        var imageOwnerAlias: kotlin.String? = null
        /**
         * The type of image.
         */
        var imageType: aws.sdk.kotlin.services.ec2.model.ImageTypeValues? = null
        /**
         * The kernel associated with the image, if any. Only applicable for machine images.
         */
        var kernelId: kotlin.String? = null
        /**
         * The name of the AMI that was provided during image creation.
         */
        var name: kotlin.String? = null
        /**
         * The ID of the Amazon Web Services account that owns the image.
         */
        var ownerId: kotlin.String? = null
        /**
         * This value is set to windows for Windows AMIs; otherwise, it is blank.
         */
        var platform: aws.sdk.kotlin.services.ec2.model.PlatformValues? = null
        /**
         * The platform details associated with the billing code of the AMI. For more information,
         * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-billing-info.html">Understanding
         * AMI billing in the Amazon Elastic Compute Cloud User Guide.
         */
        var platformDetails: kotlin.String? = null
        /**
         * Any product codes associated with the AMI.
         */
        var productCodes: List<ProductCode>? = null
        /**
         * Indicates whether the image has public launch permissions. The value is true if
         * this image has public launch permissions or false
         * if it has only implicit and explicit launch permissions.
         */
        var public: kotlin.Boolean? = null
        /**
         * The RAM disk associated with the image, if any. Only applicable for machine images.
         */
        var ramdiskId: kotlin.String? = null
        /**
         * The device name of the root device volume (for example, /dev/sda1).
         */
        var rootDeviceName: kotlin.String? = null
        /**
         * The type of root device used by the AMI. The AMI can use an Amazon EBS volume or an instance store volume.
         */
        var rootDeviceType: aws.sdk.kotlin.services.ec2.model.DeviceType? = null
        /**
         * Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
         */
        var sriovNetSupport: kotlin.String? = null
        /**
         * The current state of the AMI. If the state is available, the image is successfully registered and can be used to launch an instance.
         */
        var state: aws.sdk.kotlin.services.ec2.model.ImageState? = null
        /**
         * The reason for the state change.
         */
        var stateReason: aws.sdk.kotlin.services.ec2.model.StateReason? = null
        /**
         * Any tags assigned to the image.
         */
        var tags: List<Tag>? = null
        /**
         * The operation of the Amazon EC2 instance and the billing code that is associated with the AMI.
         * usageOperation corresponds to the <a href="https://docs.aws.amazon.com/cur/latest/userguide/Lineitem-columns.html#Lineitem-details-O-Operation">lineitem/Operation column on your Amazon Web Services Cost and Usage Report and in the <a href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/price-changes.html">Amazon Web Services Price
         * List API. You can view these fields on the Instances or
         * AMIs pages in the Amazon EC2 console, or in the responses that are
         * returned by the <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeImages.html">DescribeImages
         * command in the Amazon EC2 API, or the <a href="https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-images.html">describe-images
         * command in the CLI.
         */
        var usageOperation: kotlin.String? = null
        /**
         * The type of virtualization of the AMI.
         */
        var virtualizationType: aws.sdk.kotlin.services.ec2.model.VirtualizationType? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.Image) : this() {
            this.architecture = x.architecture
            this.blockDeviceMappings = x.blockDeviceMappings
            this.bootMode = x.bootMode
            this.creationDate = x.creationDate
            this.deprecationTime = x.deprecationTime
            this.description = x.description
            this.enaSupport = x.enaSupport
            this.hypervisor = x.hypervisor
            this.imageId = x.imageId
            this.imageLocation = x.imageLocation
            this.imageOwnerAlias = x.imageOwnerAlias
            this.imageType = x.imageType
            this.kernelId = x.kernelId
            this.name = x.name
            this.ownerId = x.ownerId
            this.platform = x.platform
            this.platformDetails = x.platformDetails
            this.productCodes = x.productCodes
            this.public = x.public
            this.ramdiskId = x.ramdiskId
            this.rootDeviceName = x.rootDeviceName
            this.rootDeviceType = x.rootDeviceType
            this.sriovNetSupport = x.sriovNetSupport
            this.state = x.state
            this.stateReason = x.stateReason
            this.tags = x.tags
            this.usageOperation = x.usageOperation
            this.virtualizationType = x.virtualizationType
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.Image = Image(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.StateReason] inside the given [block]
         */
        fun stateReason(block: aws.sdk.kotlin.services.ec2.model.StateReason.Builder.() -> kotlin.Unit) {
            this.stateReason = aws.sdk.kotlin.services.ec2.model.StateReason.invoke(block)
        }
    }
}