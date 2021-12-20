// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateFpgaImageRequest private constructor(builder: Builder) {
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">Ensuring Idempotency.
     */
    val clientToken: kotlin.String? = builder.clientToken
    /**
     * A description for the AFI.
     */
    val description: kotlin.String? = builder.description
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The location of the encrypted design checkpoint in Amazon S3. The input must be a tarball.
     */
    val inputStorageLocation: aws.sdk.kotlin.services.ec2.model.StorageLocation? = builder.inputStorageLocation
    /**
     * The location in Amazon S3 for the output logs.
     */
    val logsStorageLocation: aws.sdk.kotlin.services.ec2.model.StorageLocation? = builder.logsStorageLocation
    /**
     * A name for the AFI.
     */
    val name: kotlin.String? = builder.name
    /**
     * The tags to apply to the FPGA image during creation.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreateFpgaImageRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreateFpgaImageRequest(")
        append("clientToken=$clientToken,")
        append("description=$description,")
        append("dryRun=$dryRun,")
        append("inputStorageLocation=$inputStorageLocation,")
        append("logsStorageLocation=$logsStorageLocation,")
        append("name=$name,")
        append("tagSpecifications=$tagSpecifications)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (inputStorageLocation?.hashCode() ?: 0)
        result = 31 * result + (logsStorageLocation?.hashCode() ?: 0)
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreateFpgaImageRequest

        if (clientToken != other.clientToken) return false
        if (description != other.description) return false
        if (dryRun != other.dryRun) return false
        if (inputStorageLocation != other.inputStorageLocation) return false
        if (logsStorageLocation != other.logsStorageLocation) return false
        if (name != other.name) return false
        if (tagSpecifications != other.tagSpecifications) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreateFpgaImageRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
         * For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">Ensuring Idempotency.
         */
        var clientToken: kotlin.String? = null
        /**
         * A description for the AFI.
         */
        var description: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The location of the encrypted design checkpoint in Amazon S3. The input must be a tarball.
         */
        var inputStorageLocation: aws.sdk.kotlin.services.ec2.model.StorageLocation? = null
        /**
         * The location in Amazon S3 for the output logs.
         */
        var logsStorageLocation: aws.sdk.kotlin.services.ec2.model.StorageLocation? = null
        /**
         * A name for the AFI.
         */
        var name: kotlin.String? = null
        /**
         * The tags to apply to the FPGA image during creation.
         */
        var tagSpecifications: List<TagSpecification>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreateFpgaImageRequest) : this() {
            this.clientToken = x.clientToken
            this.description = x.description
            this.dryRun = x.dryRun
            this.inputStorageLocation = x.inputStorageLocation
            this.logsStorageLocation = x.logsStorageLocation
            this.name = x.name
            this.tagSpecifications = x.tagSpecifications
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreateFpgaImageRequest = CreateFpgaImageRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.StorageLocation] inside the given [block]
         */
        fun inputStorageLocation(block: aws.sdk.kotlin.services.ec2.model.StorageLocation.Builder.() -> kotlin.Unit) {
            this.inputStorageLocation = aws.sdk.kotlin.services.ec2.model.StorageLocation.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.StorageLocation] inside the given [block]
         */
        fun logsStorageLocation(block: aws.sdk.kotlin.services.ec2.model.StorageLocation.Builder.() -> kotlin.Unit) {
            this.logsStorageLocation = aws.sdk.kotlin.services.ec2.model.StorageLocation.invoke(block)
        }
    }
}