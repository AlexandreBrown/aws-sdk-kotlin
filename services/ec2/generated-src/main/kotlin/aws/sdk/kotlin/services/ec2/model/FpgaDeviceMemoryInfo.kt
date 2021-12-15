// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the memory for the FPGA accelerator for the instance type.
 */
class FpgaDeviceMemoryInfo private constructor(builder: Builder) {
    /**
     * The size of the memory available to the FPGA accelerator, in MiB.
     */
    val sizeInMib: kotlin.Int? = builder.sizeInMib

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.FpgaDeviceMemoryInfo = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("FpgaDeviceMemoryInfo(")
        append("sizeInMib=$sizeInMib)")
    }

    override fun hashCode(): kotlin.Int {
        var result = sizeInMib ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as FpgaDeviceMemoryInfo

        if (sizeInMib != other.sizeInMib) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.FpgaDeviceMemoryInfo = Builder(this).apply(block).build()

    class Builder {
        /**
         * The size of the memory available to the FPGA accelerator, in MiB.
         */
        var sizeInMib: kotlin.Int? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.FpgaDeviceMemoryInfo) : this() {
            this.sizeInMib = x.sizeInMib
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.FpgaDeviceMemoryInfo = FpgaDeviceMemoryInfo(this)
    }
}
