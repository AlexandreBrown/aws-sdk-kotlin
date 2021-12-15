// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The minimum and maximum baseline bandwidth to Amazon EBS, in Mbps. For more information, see
 * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-optimized.html">Amazon
 * EBS–optimized instances in the Amazon EC2 User Guide.
 */
class BaselineEbsBandwidthMbpsRequest private constructor(builder: Builder) {
    /**
     * The maximum baseline bandwidth, in Mbps. To specify no maximum limit, omit
     * this parameter.
     */
    val max: kotlin.Int? = builder.max
    /**
     * The minimum baseline bandwidth, in Mbps. To specify no minimum limit, omit
     * this parameter.
     */
    val min: kotlin.Int? = builder.min

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.BaselineEbsBandwidthMbpsRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("BaselineEbsBandwidthMbpsRequest(")
        append("max=$max,")
        append("min=$min)")
    }

    override fun hashCode(): kotlin.Int {
        var result = max ?: 0
        result = 31 * result + (min ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as BaselineEbsBandwidthMbpsRequest

        if (max != other.max) return false
        if (min != other.min) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.BaselineEbsBandwidthMbpsRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The maximum baseline bandwidth, in Mbps. To specify no maximum limit, omit
         * this parameter.
         */
        var max: kotlin.Int? = null
        /**
         * The minimum baseline bandwidth, in Mbps. To specify no minimum limit, omit
         * this parameter.
         */
        var min: kotlin.Int? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.BaselineEbsBandwidthMbpsRequest) : this() {
            this.max = x.max
            this.min = x.min
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.BaselineEbsBandwidthMbpsRequest = BaselineEbsBandwidthMbpsRequest(this)
    }
}
