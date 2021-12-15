// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an EBS volume for a Scheduled Instance.
 */
class ScheduledInstancesEbs private constructor(builder: Builder) {
    /**
     * Indicates whether the volume is deleted on instance termination.
     */
    val deleteOnTermination: kotlin.Boolean? = builder.deleteOnTermination
    /**
     * Indicates whether the volume is encrypted. You can attached encrypted volumes only to instances that support them.
     */
    val encrypted: kotlin.Boolean? = builder.encrypted
    /**
     * The number of I/O operations per second (IOPS) to provision for an io1 or io2 volume, with a maximum
     * ratio of 50 IOPS/GiB for io1, and 500 IOPS/GiB for io2. Range is 100 to 64,000 IOPS for
     * volumes in most Regions. Maximum IOPS of 64,000 is guaranteed only on
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">instances built on the Nitro System. Other instance families guarantee performance up to
     * 32,000 IOPS. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types in the
     * Amazon EC2 User Guide.
     * This parameter is valid only for Provisioned IOPS SSD (io1 and io2) volumes.
     */
    val iops: kotlin.Int? = builder.iops
    /**
     * The ID of the snapshot.
     */
    val snapshotId: kotlin.String? = builder.snapshotId
    /**
     * The size of the volume, in GiB.
     * Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the snapshot size.
     */
    val volumeSize: kotlin.Int? = builder.volumeSize
    /**
     * The volume type. gp2 for General Purpose SSD, io1 or  io2 for Provisioned IOPS SSD, Throughput Optimized HDD
     * for st1, Cold HDD for sc1, or standard for
     * Magnetic.
     * Default: gp2
     */
    val volumeType: kotlin.String? = builder.volumeType

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ScheduledInstancesEbs = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ScheduledInstancesEbs(")
        append("deleteOnTermination=$deleteOnTermination,")
        append("encrypted=$encrypted,")
        append("iops=$iops,")
        append("snapshotId=$snapshotId,")
        append("volumeSize=$volumeSize,")
        append("volumeType=$volumeType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = deleteOnTermination?.hashCode() ?: 0
        result = 31 * result + (encrypted?.hashCode() ?: 0)
        result = 31 * result + (iops ?: 0)
        result = 31 * result + (snapshotId?.hashCode() ?: 0)
        result = 31 * result + (volumeSize ?: 0)
        result = 31 * result + (volumeType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ScheduledInstancesEbs

        if (deleteOnTermination != other.deleteOnTermination) return false
        if (encrypted != other.encrypted) return false
        if (iops != other.iops) return false
        if (snapshotId != other.snapshotId) return false
        if (volumeSize != other.volumeSize) return false
        if (volumeType != other.volumeType) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ScheduledInstancesEbs = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates whether the volume is deleted on instance termination.
         */
        var deleteOnTermination: kotlin.Boolean? = null
        /**
         * Indicates whether the volume is encrypted. You can attached encrypted volumes only to instances that support them.
         */
        var encrypted: kotlin.Boolean? = null
        /**
         * The number of I/O operations per second (IOPS) to provision for an io1 or io2 volume, with a maximum
         * ratio of 50 IOPS/GiB for io1, and 500 IOPS/GiB for io2. Range is 100 to 64,000 IOPS for
         * volumes in most Regions. Maximum IOPS of 64,000 is guaranteed only on
         * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances">instances built on the Nitro System. Other instance families guarantee performance up to
         * 32,000 IOPS. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html">Amazon EBS volume types in the
         * Amazon EC2 User Guide.
         * This parameter is valid only for Provisioned IOPS SSD (io1 and io2) volumes.
         */
        var iops: kotlin.Int? = null
        /**
         * The ID of the snapshot.
         */
        var snapshotId: kotlin.String? = null
        /**
         * The size of the volume, in GiB.
         * Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the snapshot size.
         */
        var volumeSize: kotlin.Int? = null
        /**
         * The volume type. gp2 for General Purpose SSD, io1 or  io2 for Provisioned IOPS SSD, Throughput Optimized HDD
         * for st1, Cold HDD for sc1, or standard for
         * Magnetic.
         * Default: gp2
         */
        var volumeType: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ScheduledInstancesEbs) : this() {
            this.deleteOnTermination = x.deleteOnTermination
            this.encrypted = x.encrypted
            this.iops = x.iops
            this.snapshotId = x.snapshotId
            this.volumeSize = x.volumeSize
            this.volumeType = x.volumeType
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ScheduledInstancesEbs = ScheduledInstancesEbs(this)
    }
}
