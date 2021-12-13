// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ConfirmProductInstanceRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * The ID of the instance.
     */
    val instanceId: kotlin.String? = builder.instanceId
    /**
     * The product code. This must be a product code that you own.
     */
    val productCode: kotlin.String? = builder.productCode

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ConfirmProductInstanceRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ConfirmProductInstanceRequest(")
        append("dryRun=$dryRun,")
        append("instanceId=$instanceId,")
        append("productCode=$productCode)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        result = 31 * result + (productCode?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ConfirmProductInstanceRequest

        if (dryRun != other.dryRun) return false
        if (instanceId != other.instanceId) return false
        if (productCode != other.productCode) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ConfirmProductInstanceRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * The ID of the instance.
         */
        var instanceId: kotlin.String? = null
        /**
         * The product code. This must be a product code that you own.
         */
        var productCode: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ConfirmProductInstanceRequest) : this() {
            this.dryRun = x.dryRun
            this.instanceId = x.instanceId
            this.productCode = x.productCode
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ConfirmProductInstanceRequest = ConfirmProductInstanceRequest(this)
    }
}
