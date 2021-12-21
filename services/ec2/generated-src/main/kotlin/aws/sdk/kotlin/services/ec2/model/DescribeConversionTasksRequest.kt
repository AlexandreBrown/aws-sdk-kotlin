// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeConversionTasksRequest private constructor(builder: Builder) {
    /**
     * The conversion task IDs.
     */
    val conversionTaskIds: List<String>? = builder.conversionTaskIds
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeConversionTasksRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeConversionTasksRequest(")
        append("conversionTaskIds=$conversionTaskIds,")
        append("dryRun=$dryRun)")
    }

    override fun hashCode(): kotlin.Int {
        var result = conversionTaskIds?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeConversionTasksRequest

        if (conversionTaskIds != other.conversionTaskIds) return false
        if (dryRun != other.dryRun) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeConversionTasksRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The conversion task IDs.
         */
        var conversionTaskIds: List<String>? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeConversionTasksRequest) : this() {
            this.conversionTaskIds = x.conversionTaskIds
            this.dryRun = x.dryRun
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeConversionTasksRequest = DescribeConversionTasksRequest(this)
    }
}