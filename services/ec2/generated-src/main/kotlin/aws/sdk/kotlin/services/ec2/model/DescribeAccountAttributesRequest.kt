// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeAccountAttributesRequest private constructor(builder: Builder) {
    /**
     * The account attribute names.
     */
    val attributeNames: List<AccountAttributeName>? = builder.attributeNames
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeAccountAttributesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeAccountAttributesRequest(")
        append("attributeNames=$attributeNames,")
        append("dryRun=$dryRun)")
    }

    override fun hashCode(): kotlin.Int {
        var result = attributeNames?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeAccountAttributesRequest

        if (attributeNames != other.attributeNames) return false
        if (dryRun != other.dryRun) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeAccountAttributesRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The account attribute names.
         */
        var attributeNames: List<AccountAttributeName>? = null
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeAccountAttributesRequest) : this() {
            this.attributeNames = x.attributeNames
            this.dryRun = x.dryRun
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeAccountAttributesRequest = DescribeAccountAttributesRequest(this)
    }
}