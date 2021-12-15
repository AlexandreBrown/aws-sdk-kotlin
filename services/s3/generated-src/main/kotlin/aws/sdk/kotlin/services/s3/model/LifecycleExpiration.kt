// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Container for the expiration for the lifecycle of the object.
 */
class LifecycleExpiration private constructor(builder: Builder) {
    /**
     * Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601
     * Format.
     */
    val date: aws.smithy.kotlin.runtime.time.Instant? = builder.date
    /**
     * Indicates the lifetime, in days, of the objects that are subject to the rule. The value
     * must be a non-zero positive integer.
     */
    val days: kotlin.Int = builder.days
    /**
     * Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set
     * to true, the delete marker will be expired; if set to false the policy takes no action.
     * This cannot be specified with Days or Date in a Lifecycle Expiration Policy.
     */
    val expiredObjectDeleteMarker: kotlin.Boolean = builder.expiredObjectDeleteMarker

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.LifecycleExpiration = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LifecycleExpiration(")
        append("date=$date,")
        append("days=$days,")
        append("expiredObjectDeleteMarker=$expiredObjectDeleteMarker)")
    }

    override fun hashCode(): kotlin.Int {
        var result = date?.hashCode() ?: 0
        result = 31 * result + (days)
        result = 31 * result + (expiredObjectDeleteMarker.hashCode())
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LifecycleExpiration

        if (date != other.date) return false
        if (days != other.days) return false
        if (expiredObjectDeleteMarker != other.expiredObjectDeleteMarker) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.LifecycleExpiration = Builder(this).apply(block).build()

    class Builder {
        /**
         * Indicates at what date the object is to be moved or deleted. Should be in GMT ISO 8601
         * Format.
         */
        var date: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * Indicates the lifetime, in days, of the objects that are subject to the rule. The value
         * must be a non-zero positive integer.
         */
        var days: kotlin.Int = 0
        /**
         * Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set
         * to true, the delete marker will be expired; if set to false the policy takes no action.
         * This cannot be specified with Days or Date in a Lifecycle Expiration Policy.
         */
        var expiredObjectDeleteMarker: kotlin.Boolean = false

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.LifecycleExpiration) : this() {
            this.date = x.date
            this.days = x.days
            this.expiredObjectDeleteMarker = x.expiredObjectDeleteMarker
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.LifecycleExpiration = LifecycleExpiration(this)
    }
}
