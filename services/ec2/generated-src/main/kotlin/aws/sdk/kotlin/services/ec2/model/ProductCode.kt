// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a product code.
 */
class ProductCode private constructor(builder: Builder) {
    /**
     * The product code.
     */
    val productCodeId: kotlin.String? = builder.productCodeId
    /**
     * The type of product code.
     */
    val productCodeType: aws.sdk.kotlin.services.ec2.model.ProductCodeValues? = builder.productCodeType

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ProductCode = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ProductCode(")
        append("productCodeId=$productCodeId,")
        append("productCodeType=$productCodeType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = productCodeId?.hashCode() ?: 0
        result = 31 * result + (productCodeType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ProductCode

        if (productCodeId != other.productCodeId) return false
        if (productCodeType != other.productCodeType) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ProductCode = Builder(this).apply(block).build()

    class Builder {
        /**
         * The product code.
         */
        var productCodeId: kotlin.String? = null
        /**
         * The type of product code.
         */
        var productCodeType: aws.sdk.kotlin.services.ec2.model.ProductCodeValues? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ProductCode) : this() {
            this.productCodeId = x.productCodeId
            this.productCodeType = x.productCodeType
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ProductCode = ProductCode(this)
    }
}