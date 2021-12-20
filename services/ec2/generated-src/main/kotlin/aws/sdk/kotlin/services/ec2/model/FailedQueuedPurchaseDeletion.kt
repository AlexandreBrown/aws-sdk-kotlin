// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a Reserved Instance whose queued purchase was not deleted.
 */
class FailedQueuedPurchaseDeletion private constructor(builder: Builder) {
    /**
     * The error.
     */
    val error: aws.sdk.kotlin.services.ec2.model.DeleteQueuedReservedInstancesError? = builder.error
    /**
     * The ID of the Reserved Instance.
     */
    val reservedInstancesId: kotlin.String? = builder.reservedInstancesId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.FailedQueuedPurchaseDeletion = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("FailedQueuedPurchaseDeletion(")
        append("error=$error,")
        append("reservedInstancesId=$reservedInstancesId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = error?.hashCode() ?: 0
        result = 31 * result + (reservedInstancesId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as FailedQueuedPurchaseDeletion

        if (error != other.error) return false
        if (reservedInstancesId != other.reservedInstancesId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.FailedQueuedPurchaseDeletion = Builder(this).apply(block).build()

    class Builder {
        /**
         * The error.
         */
        var error: aws.sdk.kotlin.services.ec2.model.DeleteQueuedReservedInstancesError? = null
        /**
         * The ID of the Reserved Instance.
         */
        var reservedInstancesId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.FailedQueuedPurchaseDeletion) : this() {
            this.error = x.error
            this.reservedInstancesId = x.reservedInstancesId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.FailedQueuedPurchaseDeletion = FailedQueuedPurchaseDeletion(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.DeleteQueuedReservedInstancesError] inside the given [block]
         */
        fun error(block: aws.sdk.kotlin.services.ec2.model.DeleteQueuedReservedInstancesError.Builder.() -> kotlin.Unit) {
            this.error = aws.sdk.kotlin.services.ec2.model.DeleteQueuedReservedInstancesError.invoke(block)
        }
    }
}