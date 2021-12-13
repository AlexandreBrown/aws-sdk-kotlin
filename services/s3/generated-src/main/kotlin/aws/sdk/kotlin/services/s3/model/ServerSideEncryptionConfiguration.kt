// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Specifies the default server-side-encryption configuration.
 */
class ServerSideEncryptionConfiguration private constructor(builder: Builder) {
    /**
     * Container for information about a particular server-side encryption configuration
     * rule.
     */
    val rules: List<ServerSideEncryptionRule>? = builder.rules

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.ServerSideEncryptionConfiguration = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ServerSideEncryptionConfiguration(")
        append("rules=$rules)")
    }

    override fun hashCode(): kotlin.Int {
        var result = rules?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ServerSideEncryptionConfiguration

        if (rules != other.rules) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.ServerSideEncryptionConfiguration = Builder(this).apply(block).build()

    class Builder {
        /**
         * Container for information about a particular server-side encryption configuration
         * rule.
         */
        var rules: List<ServerSideEncryptionRule>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.ServerSideEncryptionConfiguration) : this() {
            this.rules = x.rules
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.ServerSideEncryptionConfiguration = ServerSideEncryptionConfiguration(this)
    }
}
