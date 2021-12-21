// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Specifies the encryption algorithm for the VPN tunnel for phase 2 IKE
 * negotiations.
 */
class Phase2EncryptionAlgorithmsRequestListValue private constructor(builder: Builder) {
    /**
     * The encryption algorithm.
     */
    val value: kotlin.String? = builder.value

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.Phase2EncryptionAlgorithmsRequestListValue = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("Phase2EncryptionAlgorithmsRequestListValue(")
        append("value=$value)")
    }

    override fun hashCode(): kotlin.Int {
        var result = value?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Phase2EncryptionAlgorithmsRequestListValue

        if (value != other.value) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.Phase2EncryptionAlgorithmsRequestListValue = Builder(this).apply(block).build()

    class Builder {
        /**
         * The encryption algorithm.
         */
        var value: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.Phase2EncryptionAlgorithmsRequestListValue) : this() {
            this.value = x.value
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.Phase2EncryptionAlgorithmsRequestListValue = Phase2EncryptionAlgorithmsRequestListValue(this)
    }
}