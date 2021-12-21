// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyInstanceMetadataOptionsResponse private constructor(builder: Builder) {
    /**
     * The ID of the instance.
     */
    val instanceId: kotlin.String? = builder.instanceId
    /**
     * The metadata options for the instance.
     */
    val instanceMetadataOptions: aws.sdk.kotlin.services.ec2.model.InstanceMetadataOptionsResponse? = builder.instanceMetadataOptions

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyInstanceMetadataOptionsResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyInstanceMetadataOptionsResponse(")
        append("instanceId=$instanceId,")
        append("instanceMetadataOptions=$instanceMetadataOptions)")
    }

    override fun hashCode(): kotlin.Int {
        var result = instanceId?.hashCode() ?: 0
        result = 31 * result + (instanceMetadataOptions?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyInstanceMetadataOptionsResponse

        if (instanceId != other.instanceId) return false
        if (instanceMetadataOptions != other.instanceMetadataOptions) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyInstanceMetadataOptionsResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The ID of the instance.
         */
        var instanceId: kotlin.String? = null
        /**
         * The metadata options for the instance.
         */
        var instanceMetadataOptions: aws.sdk.kotlin.services.ec2.model.InstanceMetadataOptionsResponse? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyInstanceMetadataOptionsResponse) : this() {
            this.instanceId = x.instanceId
            this.instanceMetadataOptions = x.instanceMetadataOptions
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyInstanceMetadataOptionsResponse = ModifyInstanceMetadataOptionsResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.InstanceMetadataOptionsResponse] inside the given [block]
         */
        fun instanceMetadataOptions(block: aws.sdk.kotlin.services.ec2.model.InstanceMetadataOptionsResponse.Builder.() -> kotlin.Unit) {
            this.instanceMetadataOptions = aws.sdk.kotlin.services.ec2.model.InstanceMetadataOptionsResponse.invoke(block)
        }
    }
}