// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the credit option for CPU usage of a burstable performance instance.
 */
class InstanceCreditSpecification private constructor(builder: Builder) {
    /**
     * The credit option for CPU usage of the instance. Valid values are
     * standard and unlimited.
     */
    val cpuCredits: kotlin.String? = builder.cpuCredits
    /**
     * The ID of the instance.
     */
    val instanceId: kotlin.String? = builder.instanceId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.InstanceCreditSpecification = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("InstanceCreditSpecification(")
        append("cpuCredits=$cpuCredits,")
        append("instanceId=$instanceId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cpuCredits?.hashCode() ?: 0
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as InstanceCreditSpecification

        if (cpuCredits != other.cpuCredits) return false
        if (instanceId != other.instanceId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.InstanceCreditSpecification = Builder(this).apply(block).build()

    class Builder {
        /**
         * The credit option for CPU usage of the instance. Valid values are
         * standard and unlimited.
         */
        var cpuCredits: kotlin.String? = null
        /**
         * The ID of the instance.
         */
        var instanceId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.InstanceCreditSpecification) : this() {
            this.cpuCredits = x.cpuCredits
            this.instanceId = x.instanceId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.InstanceCreditSpecification = InstanceCreditSpecification(this)
    }
}
