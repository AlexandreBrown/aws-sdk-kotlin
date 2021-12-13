// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DetachVolumeRequest private constructor(builder: Builder) {
    /**
     * The device name.
     */
    val device: kotlin.String? = builder.device
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * Forces detachment if the previous detachment attempt did not occur cleanly (for example,
     * logging into an instance, unmounting the volume, and detaching normally). This option can lead
     * to data loss or a corrupted file system. Use this option only as a last resort to detach a
     * volume from a failed instance. The instance won't have an opportunity to flush file system
     * caches or file system metadata. If you use this option, you must perform file system check and
     * repair procedures.
     */
    val force: kotlin.Boolean? = builder.force
    /**
     * The ID of the instance. If you are detaching a Multi-Attach enabled volume, you must specify an instance ID.
     */
    val instanceId: kotlin.String? = builder.instanceId
    /**
     * The ID of the volume.
     */
    val volumeId: kotlin.String? = builder.volumeId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DetachVolumeRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DetachVolumeRequest(")
        append("device=$device,")
        append("dryRun=$dryRun,")
        append("force=$force,")
        append("instanceId=$instanceId,")
        append("volumeId=$volumeId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = device?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (force?.hashCode() ?: 0)
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        result = 31 * result + (volumeId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DetachVolumeRequest

        if (device != other.device) return false
        if (dryRun != other.dryRun) return false
        if (force != other.force) return false
        if (instanceId != other.instanceId) return false
        if (volumeId != other.volumeId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DetachVolumeRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The device name.
         */
        var device: kotlin.String? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * Forces detachment if the previous detachment attempt did not occur cleanly (for example,
         * logging into an instance, unmounting the volume, and detaching normally). This option can lead
         * to data loss or a corrupted file system. Use this option only as a last resort to detach a
         * volume from a failed instance. The instance won't have an opportunity to flush file system
         * caches or file system metadata. If you use this option, you must perform file system check and
         * repair procedures.
         */
        var force: kotlin.Boolean? = null
        /**
         * The ID of the instance. If you are detaching a Multi-Attach enabled volume, you must specify an instance ID.
         */
        var instanceId: kotlin.String? = null
        /**
         * The ID of the volume.
         */
        var volumeId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DetachVolumeRequest) : this() {
            this.device = x.device
            this.dryRun = x.dryRun
            this.force = x.force
            this.instanceId = x.instanceId
            this.volumeId = x.volumeId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DetachVolumeRequest = DetachVolumeRequest(this)
    }
}
