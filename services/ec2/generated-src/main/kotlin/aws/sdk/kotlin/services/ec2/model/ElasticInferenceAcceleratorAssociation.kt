// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes the association between an instance and an elastic inference accelerator.
 */
class ElasticInferenceAcceleratorAssociation private constructor(builder: Builder) {
    /**
     * The Amazon Resource Name (ARN) of the elastic inference accelerator.
     */
    val elasticInferenceAcceleratorArn: kotlin.String? = builder.elasticInferenceAcceleratorArn
    /**
     * The ID of the association.
     */
    val elasticInferenceAcceleratorAssociationId: kotlin.String? = builder.elasticInferenceAcceleratorAssociationId
    /**
     * The state of the elastic inference accelerator.
     */
    val elasticInferenceAcceleratorAssociationState: kotlin.String? = builder.elasticInferenceAcceleratorAssociationState
    /**
     * The time at which the elastic inference accelerator is associated with an instance.
     */
    val elasticInferenceAcceleratorAssociationTime: aws.smithy.kotlin.runtime.time.Instant? = builder.elasticInferenceAcceleratorAssociationTime

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ElasticInferenceAcceleratorAssociation = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ElasticInferenceAcceleratorAssociation(")
        append("elasticInferenceAcceleratorArn=$elasticInferenceAcceleratorArn,")
        append("elasticInferenceAcceleratorAssociationId=$elasticInferenceAcceleratorAssociationId,")
        append("elasticInferenceAcceleratorAssociationState=$elasticInferenceAcceleratorAssociationState,")
        append("elasticInferenceAcceleratorAssociationTime=$elasticInferenceAcceleratorAssociationTime)")
    }

    override fun hashCode(): kotlin.Int {
        var result = elasticInferenceAcceleratorArn?.hashCode() ?: 0
        result = 31 * result + (elasticInferenceAcceleratorAssociationId?.hashCode() ?: 0)
        result = 31 * result + (elasticInferenceAcceleratorAssociationState?.hashCode() ?: 0)
        result = 31 * result + (elasticInferenceAcceleratorAssociationTime?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ElasticInferenceAcceleratorAssociation

        if (elasticInferenceAcceleratorArn != other.elasticInferenceAcceleratorArn) return false
        if (elasticInferenceAcceleratorAssociationId != other.elasticInferenceAcceleratorAssociationId) return false
        if (elasticInferenceAcceleratorAssociationState != other.elasticInferenceAcceleratorAssociationState) return false
        if (elasticInferenceAcceleratorAssociationTime != other.elasticInferenceAcceleratorAssociationTime) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ElasticInferenceAcceleratorAssociation = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Amazon Resource Name (ARN) of the elastic inference accelerator.
         */
        var elasticInferenceAcceleratorArn: kotlin.String? = null
        /**
         * The ID of the association.
         */
        var elasticInferenceAcceleratorAssociationId: kotlin.String? = null
        /**
         * The state of the elastic inference accelerator.
         */
        var elasticInferenceAcceleratorAssociationState: kotlin.String? = null
        /**
         * The time at which the elastic inference accelerator is associated with an instance.
         */
        var elasticInferenceAcceleratorAssociationTime: aws.smithy.kotlin.runtime.time.Instant? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ElasticInferenceAcceleratorAssociation) : this() {
            this.elasticInferenceAcceleratorArn = x.elasticInferenceAcceleratorArn
            this.elasticInferenceAcceleratorAssociationId = x.elasticInferenceAcceleratorAssociationId
            this.elasticInferenceAcceleratorAssociationState = x.elasticInferenceAcceleratorAssociationState
            this.elasticInferenceAcceleratorAssociationTime = x.elasticInferenceAcceleratorAssociationTime
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ElasticInferenceAcceleratorAssociation = ElasticInferenceAcceleratorAssociation(this)
    }
}