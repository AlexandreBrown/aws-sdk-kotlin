// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * A container specifying replication metrics-related settings enabling replication
 * metrics and events.
 */
class Metrics private constructor(builder: Builder) {
    /**
     * A container specifying the time threshold for emitting the
     * s3:Replication:OperationMissedThreshold event.
     */
    val eventThreshold: aws.sdk.kotlin.services.s3.model.ReplicationTimeValue? = builder.eventThreshold
    /**
     * Specifies whether the replication metrics are enabled.
     */
    val status: aws.sdk.kotlin.services.s3.model.MetricsStatus? = builder.status

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.Metrics = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("Metrics(")
        append("eventThreshold=$eventThreshold,")
        append("status=$status)")
    }

    override fun hashCode(): kotlin.Int {
        var result = eventThreshold?.hashCode() ?: 0
        result = 31 * result + (status?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Metrics

        if (eventThreshold != other.eventThreshold) return false
        if (status != other.status) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.Metrics = Builder(this).apply(block).build()

    class Builder {
        /**
         * A container specifying the time threshold for emitting the
         * s3:Replication:OperationMissedThreshold event.
         */
        var eventThreshold: aws.sdk.kotlin.services.s3.model.ReplicationTimeValue? = null
        /**
         * Specifies whether the replication metrics are enabled.
         */
        var status: aws.sdk.kotlin.services.s3.model.MetricsStatus? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.Metrics) : this() {
            this.eventThreshold = x.eventThreshold
            this.status = x.status
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.Metrics = Metrics(this)

        /**
         * construct an [aws.sdk.kotlin.services.s3.model.ReplicationTimeValue] inside the given [block]
         */
        fun eventThreshold(block: aws.sdk.kotlin.services.s3.model.ReplicationTimeValue.Builder.() -> kotlin.Unit) {
            this.eventThreshold = aws.sdk.kotlin.services.s3.model.ReplicationTimeValue.invoke(block)
        }
    }
}