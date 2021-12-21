// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an account attribute.
 */
class AccountAttribute private constructor(builder: Builder) {
    /**
     * The name of the account attribute.
     */
    val attributeName: kotlin.String? = builder.attributeName
    /**
     * The values for the account attribute.
     */
    val attributeValues: List<AccountAttributeValue>? = builder.attributeValues

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.AccountAttribute = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("AccountAttribute(")
        append("attributeName=$attributeName,")
        append("attributeValues=$attributeValues)")
    }

    override fun hashCode(): kotlin.Int {
        var result = attributeName?.hashCode() ?: 0
        result = 31 * result + (attributeValues?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as AccountAttribute

        if (attributeName != other.attributeName) return false
        if (attributeValues != other.attributeValues) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.AccountAttribute = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of the account attribute.
         */
        var attributeName: kotlin.String? = null
        /**
         * The values for the account attribute.
         */
        var attributeValues: List<AccountAttributeValue>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.AccountAttribute) : this() {
            this.attributeName = x.attributeName
            this.attributeValues = x.attributeValues
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.AccountAttribute = AccountAttribute(this)
    }
}