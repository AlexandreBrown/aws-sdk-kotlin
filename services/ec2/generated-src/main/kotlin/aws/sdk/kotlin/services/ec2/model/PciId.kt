// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the data that identifies an Amazon FPGA image (AFI) on the PCI bus.
 */
class PciId private constructor(builder: Builder) {
    /**
     * The ID of the device.
     */
    val deviceId: kotlin.String? = builder.deviceId
    /**
     * The ID of the subsystem.
     */
    val subsystemId: kotlin.String? = builder.subsystemId
    /**
     * The ID of the vendor for the subsystem.
     */
    val subsystemVendorId: kotlin.String? = builder.subsystemVendorId
    /**
     * The ID of the vendor.
     */
    val vendorId: kotlin.String? = builder.vendorId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.PciId = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("PciId(")
        append("deviceId=$deviceId,")
        append("subsystemId=$subsystemId,")
        append("subsystemVendorId=$subsystemVendorId,")
        append("vendorId=$vendorId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = deviceId?.hashCode() ?: 0
        result = 31 * result + (subsystemId?.hashCode() ?: 0)
        result = 31 * result + (subsystemVendorId?.hashCode() ?: 0)
        result = 31 * result + (vendorId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as PciId

        if (deviceId != other.deviceId) return false
        if (subsystemId != other.subsystemId) return false
        if (subsystemVendorId != other.subsystemVendorId) return false
        if (vendorId != other.vendorId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.PciId = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the device.
         */
        var deviceId: kotlin.String? = null
        /**
         * The ID of the subsystem.
         */
        var subsystemId: kotlin.String? = null
        /**
         * The ID of the vendor for the subsystem.
         */
        var subsystemVendorId: kotlin.String? = null
        /**
         * The ID of the vendor.
         */
        var vendorId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.PciId) : this() {
            this.deviceId = x.deviceId
            this.subsystemId = x.subsystemId
            this.subsystemVendorId = x.subsystemVendorId
            this.vendorId = x.vendorId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.PciId = PciId(this)
    }
}