// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class AcceleratorType {

    abstract val value: kotlin.String

    object Fpga : aws.sdk.kotlin.services.ec2.model.AcceleratorType() {
        override val value: kotlin.String = "fpga"
        override fun toString(): kotlin.String = value
    }

    object Gpu : aws.sdk.kotlin.services.ec2.model.AcceleratorType() {
        override val value: kotlin.String = "gpu"
        override fun toString(): kotlin.String = value
    }

    object Inference : aws.sdk.kotlin.services.ec2.model.AcceleratorType() {
        override val value: kotlin.String = "inference"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.AcceleratorType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.AcceleratorType = when(str) {
            "fpga" -> Fpga
            "gpu" -> Gpu
            "inference" -> Inference
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.AcceleratorType> = listOf(
            Fpga,
            Gpu,
            Inference
        )
    }
}