// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an export instance task.
 */
class ExportToS3TaskSpecification private constructor(builder: Builder) {
    /**
     * The container format used to combine disk images with metadata (such as OVF). If absent, only the disk image is
     * exported.
     */
    val containerFormat: aws.sdk.kotlin.services.ec2.model.ContainerFormat? = builder.containerFormat
    /**
     * The format for the exported image.
     */
    val diskImageFormat: aws.sdk.kotlin.services.ec2.model.DiskImageFormat? = builder.diskImageFormat
    /**
     * The Amazon S3 bucket for the destination image. The destination bucket must exist and grant
     * WRITE and READ_ACP permissions to the Amazon Web Services account vm-import-export@amazon.com.
     */
    val s3Bucket: kotlin.String? = builder.s3Bucket
    /**
     * The image is written to a single object in the Amazon S3 bucket at the S3 key s3prefix +
     * exportTaskId + '.' + diskImageFormat.
     */
    val s3Prefix: kotlin.String? = builder.s3Prefix

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ExportToS3TaskSpecification = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ExportToS3TaskSpecification(")
        append("containerFormat=$containerFormat,")
        append("diskImageFormat=$diskImageFormat,")
        append("s3Bucket=$s3Bucket,")
        append("s3Prefix=$s3Prefix)")
    }

    override fun hashCode(): kotlin.Int {
        var result = containerFormat?.hashCode() ?: 0
        result = 31 * result + (diskImageFormat?.hashCode() ?: 0)
        result = 31 * result + (s3Bucket?.hashCode() ?: 0)
        result = 31 * result + (s3Prefix?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ExportToS3TaskSpecification

        if (containerFormat != other.containerFormat) return false
        if (diskImageFormat != other.diskImageFormat) return false
        if (s3Bucket != other.s3Bucket) return false
        if (s3Prefix != other.s3Prefix) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ExportToS3TaskSpecification = Builder(this).apply(block).build()

    class Builder {
        /**
         * The container format used to combine disk images with metadata (such as OVF). If absent, only the disk image is
         * exported.
         */
        var containerFormat: aws.sdk.kotlin.services.ec2.model.ContainerFormat? = null
        /**
         * The format for the exported image.
         */
        var diskImageFormat: aws.sdk.kotlin.services.ec2.model.DiskImageFormat? = null
        /**
         * The Amazon S3 bucket for the destination image. The destination bucket must exist and grant
         * WRITE and READ_ACP permissions to the Amazon Web Services account vm-import-export@amazon.com.
         */
        var s3Bucket: kotlin.String? = null
        /**
         * The image is written to a single object in the Amazon S3 bucket at the S3 key s3prefix +
         * exportTaskId + '.' + diskImageFormat.
         */
        var s3Prefix: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ExportToS3TaskSpecification) : this() {
            this.containerFormat = x.containerFormat
            this.diskImageFormat = x.diskImageFormat
            this.s3Bucket = x.s3Bucket
            this.s3Prefix = x.s3Prefix
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ExportToS3TaskSpecification = ExportToS3TaskSpecification(this)
    }
}
