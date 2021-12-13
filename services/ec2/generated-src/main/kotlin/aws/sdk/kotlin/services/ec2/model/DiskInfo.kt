// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a disk.
 */
class DiskInfo private constructor(builder: Builder) {
    /**
     * The number of disks with this configuration.
     */
    val count: kotlin.Int? = builder.count
    /**
     * The size of the disk in GB.
     */
    val sizeInGb: kotlin.Long? = builder.sizeInGb
    /**
     * The type of disk.
     */
    val type: aws.sdk.kotlin.services.ec2.model.DiskType? = builder.type

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DiskInfo = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DiskInfo(")
        append("count=$count,")
        append("sizeInGb=$sizeInGb,")
        append("type=$type)")
    }

    override fun hashCode(): kotlin.Int {
        var result = count ?: 0
        result = 31 * result + (sizeInGb?.hashCode() ?: 0)
        result = 31 * result + (type?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DiskInfo

        if (count != other.count) return false
        if (sizeInGb != other.sizeInGb) return false
        if (type != other.type) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DiskInfo = Builder(this).apply(block).build()

    class Builder {
        /**
         * The number of disks with this configuration.
         */
        var count: kotlin.Int? = null
        /**
         * The size of the disk in GB.
         */
        var sizeInGb: kotlin.Long? = null
        /**
         * The type of disk.
         */
        var type: aws.sdk.kotlin.services.ec2.model.DiskType? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DiskInfo) : this() {
            this.count = x.count
            this.sizeInGb = x.sizeInGb
            this.type = x.type
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DiskInfo = DiskInfo(this)
    }
}
