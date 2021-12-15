// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class EnableEbsEncryptionByDefaultResponse private constructor(builder: Builder) {
    /**
     * The updated status of encryption by default.
     */
    val ebsEncryptionByDefault: kotlin.Boolean? = builder.ebsEncryptionByDefault

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.EnableEbsEncryptionByDefaultResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("EnableEbsEncryptionByDefaultResponse(")
        append("ebsEncryptionByDefault=$ebsEncryptionByDefault)")
    }

    override fun hashCode(): kotlin.Int {
        var result = ebsEncryptionByDefault?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as EnableEbsEncryptionByDefaultResponse

        if (ebsEncryptionByDefault != other.ebsEncryptionByDefault) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.EnableEbsEncryptionByDefaultResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The updated status of encryption by default.
         */
        var ebsEncryptionByDefault: kotlin.Boolean? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.EnableEbsEncryptionByDefaultResponse) : this() {
            this.ebsEncryptionByDefault = x.ebsEncryptionByDefault
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.EnableEbsEncryptionByDefaultResponse = EnableEbsEncryptionByDefaultResponse(this)
    }
}
