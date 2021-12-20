// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * A container specifying the time value for S3 Replication Time Control (S3 RTC) and replication metrics
 * EventThreshold.
 */
class ReplicationTimeValue private constructor(builder: Builder) {
    /**
     * Contains an integer specifying time in minutes.
     * Valid value: 15
     */
    val minutes: kotlin.Int = builder.minutes

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.ReplicationTimeValue = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ReplicationTimeValue(")
        append("minutes=$minutes)")
    }

    override fun hashCode(): kotlin.Int {
        var result = minutes
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ReplicationTimeValue

        if (minutes != other.minutes) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.ReplicationTimeValue = Builder(this).apply(block).build()

    class Builder {
        /**
         * Contains an integer specifying time in minutes.
         * Valid value: 15
         */
        var minutes: kotlin.Int = 0

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.ReplicationTimeValue) : this() {
            this.minutes = x.minutes
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.ReplicationTimeValue = ReplicationTimeValue(this)
    }
}