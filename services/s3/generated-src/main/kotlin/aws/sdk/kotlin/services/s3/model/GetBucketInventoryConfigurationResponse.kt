// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class GetBucketInventoryConfigurationResponse private constructor(builder: Builder) {
    /**
     * Specifies the inventory configuration.
     */
    val inventoryConfiguration: aws.sdk.kotlin.services.s3.model.InventoryConfiguration? = builder.inventoryConfiguration

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.GetBucketInventoryConfigurationResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetBucketInventoryConfigurationResponse(")
        append("inventoryConfiguration=$inventoryConfiguration)")
    }

    override fun hashCode(): kotlin.Int {
        var result = inventoryConfiguration?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetBucketInventoryConfigurationResponse

        if (inventoryConfiguration != other.inventoryConfiguration) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.GetBucketInventoryConfigurationResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Specifies the inventory configuration.
         */
        var inventoryConfiguration: aws.sdk.kotlin.services.s3.model.InventoryConfiguration? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.GetBucketInventoryConfigurationResponse) : this() {
            this.inventoryConfiguration = x.inventoryConfiguration
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.GetBucketInventoryConfigurationResponse = GetBucketInventoryConfigurationResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.InventoryConfiguration] inside the given [block]
         */
        fun inventoryConfiguration(block: aws.sdk.kotlin.services.s3.model.InventoryConfiguration.Builder.() -> kotlin.Unit) {
            this.inventoryConfiguration = aws.sdk.kotlin.services.s3.model.InventoryConfiguration.invoke(block)
        }
    }
}