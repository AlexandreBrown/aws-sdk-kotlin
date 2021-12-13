// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a volume status operation code.
 */
class VolumeStatusAction private constructor(builder: Builder) {
    /**
     * The code identifying the operation, for example, enable-volume-io.
     */
    val code: kotlin.String? = builder.code
    /**
     * A description of the operation.
     */
    val description: kotlin.String? = builder.description
    /**
     * The ID of the event associated with this operation.
     */
    val eventId: kotlin.String? = builder.eventId
    /**
     * The event type associated with this operation.
     */
    val eventType: kotlin.String? = builder.eventType

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.VolumeStatusAction = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("VolumeStatusAction(")
        append("code=$code,")
        append("description=$description,")
        append("eventId=$eventId,")
        append("eventType=$eventType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = code?.hashCode() ?: 0
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (eventId?.hashCode() ?: 0)
        result = 31 * result + (eventType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as VolumeStatusAction

        if (code != other.code) return false
        if (description != other.description) return false
        if (eventId != other.eventId) return false
        if (eventType != other.eventType) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.VolumeStatusAction = Builder(this).apply(block).build()

    class Builder {
        /**
         * The code identifying the operation, for example, enable-volume-io.
         */
        var code: kotlin.String? = null
        /**
         * A description of the operation.
         */
        var description: kotlin.String? = null
        /**
         * The ID of the event associated with this operation.
         */
        var eventId: kotlin.String? = null
        /**
         * The event type associated with this operation.
         */
        var eventType: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.VolumeStatusAction) : this() {
            this.code = x.code
            this.description = x.description
            this.eventId = x.eventId
            this.eventType = x.eventType
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.VolumeStatusAction = VolumeStatusAction(this)
    }
}
