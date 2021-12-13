// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the credit option for CPU usage of a T2, T3, or T3a instance.
 */
class CreditSpecification private constructor(builder: Builder) {
    /**
     * The credit option for CPU usage of a T2, T3, or T3a instance. Valid values are
     * standard and unlimited.
     */
    val cpuCredits: kotlin.String? = builder.cpuCredits

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.CreditSpecification = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("CreditSpecification(")
        append("cpuCredits=$cpuCredits)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cpuCredits?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as CreditSpecification

        if (cpuCredits != other.cpuCredits) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.CreditSpecification = Builder(this).apply(block).build()

    class Builder {
        /**
         * The credit option for CPU usage of a T2, T3, or T3a instance. Valid values are
         * standard and unlimited.
         */
        var cpuCredits: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.CreditSpecification) : this() {
            this.cpuCredits = x.cpuCredits
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.CreditSpecification = CreditSpecification(this)
    }
}
