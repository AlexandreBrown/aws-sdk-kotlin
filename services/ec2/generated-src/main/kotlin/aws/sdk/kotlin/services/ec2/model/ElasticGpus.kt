// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an Elastic Graphics accelerator.
 */
class ElasticGpus private constructor(builder: Builder) {
    /**
     * The Availability Zone in the which the Elastic Graphics accelerator resides.
     */
    val availabilityZone: kotlin.String? = builder.availabilityZone
    /**
     * The status of the Elastic Graphics accelerator.
     */
    val elasticGpuHealth: aws.sdk.kotlin.services.ec2.model.ElasticGpuHealth? = builder.elasticGpuHealth
    /**
     * The ID of the Elastic Graphics accelerator.
     */
    val elasticGpuId: kotlin.String? = builder.elasticGpuId
    /**
     * The state of the Elastic Graphics accelerator.
     */
    val elasticGpuState: aws.sdk.kotlin.services.ec2.model.ElasticGpuState? = builder.elasticGpuState
    /**
     * The type of Elastic Graphics accelerator.
     */
    val elasticGpuType: kotlin.String? = builder.elasticGpuType
    /**
     * The ID of the instance to which the Elastic Graphics accelerator is attached.
     */
    val instanceId: kotlin.String? = builder.instanceId
    /**
     * The tags assigned to the Elastic Graphics accelerator.
     */
    val tags: List<Tag>? = builder.tags

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ElasticGpus = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ElasticGpus(")
        append("availabilityZone=$availabilityZone,")
        append("elasticGpuHealth=$elasticGpuHealth,")
        append("elasticGpuId=$elasticGpuId,")
        append("elasticGpuState=$elasticGpuState,")
        append("elasticGpuType=$elasticGpuType,")
        append("instanceId=$instanceId,")
        append("tags=$tags)")
    }

    override fun hashCode(): kotlin.Int {
        var result = availabilityZone?.hashCode() ?: 0
        result = 31 * result + (elasticGpuHealth?.hashCode() ?: 0)
        result = 31 * result + (elasticGpuId?.hashCode() ?: 0)
        result = 31 * result + (elasticGpuState?.hashCode() ?: 0)
        result = 31 * result + (elasticGpuType?.hashCode() ?: 0)
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ElasticGpus

        if (availabilityZone != other.availabilityZone) return false
        if (elasticGpuHealth != other.elasticGpuHealth) return false
        if (elasticGpuId != other.elasticGpuId) return false
        if (elasticGpuState != other.elasticGpuState) return false
        if (elasticGpuType != other.elasticGpuType) return false
        if (instanceId != other.instanceId) return false
        if (tags != other.tags) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ElasticGpus = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Availability Zone in the which the Elastic Graphics accelerator resides.
         */
        var availabilityZone: kotlin.String? = null
        /**
         * The status of the Elastic Graphics accelerator.
         */
        var elasticGpuHealth: aws.sdk.kotlin.services.ec2.model.ElasticGpuHealth? = null
        /**
         * The ID of the Elastic Graphics accelerator.
         */
        var elasticGpuId: kotlin.String? = null
        /**
         * The state of the Elastic Graphics accelerator.
         */
        var elasticGpuState: aws.sdk.kotlin.services.ec2.model.ElasticGpuState? = null
        /**
         * The type of Elastic Graphics accelerator.
         */
        var elasticGpuType: kotlin.String? = null
        /**
         * The ID of the instance to which the Elastic Graphics accelerator is attached.
         */
        var instanceId: kotlin.String? = null
        /**
         * The tags assigned to the Elastic Graphics accelerator.
         */
        var tags: List<Tag>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ElasticGpus) : this() {
            this.availabilityZone = x.availabilityZone
            this.elasticGpuHealth = x.elasticGpuHealth
            this.elasticGpuId = x.elasticGpuId
            this.elasticGpuState = x.elasticGpuState
            this.elasticGpuType = x.elasticGpuType
            this.instanceId = x.instanceId
            this.tags = x.tags
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ElasticGpus = ElasticGpus(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.ElasticGpuHealth] inside the given [block]
         */
        fun elasticGpuHealth(block: aws.sdk.kotlin.services.ec2.model.ElasticGpuHealth.Builder.() -> kotlin.Unit) {
            this.elasticGpuHealth = aws.sdk.kotlin.services.ec2.model.ElasticGpuHealth.invoke(block)
        }
    }
}
