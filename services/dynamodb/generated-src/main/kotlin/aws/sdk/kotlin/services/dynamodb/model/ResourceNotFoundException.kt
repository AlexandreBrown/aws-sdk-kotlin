// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import aws.smithy.kotlin.runtime.ServiceErrorMetadata

/**
 * The operation tried to access a nonexistent table or index. The resource might not
 * be specified correctly, or its status might not be ACTIVE.
 */
class ResourceNotFoundException private constructor(builder: Builder) : DynamoDbException() {

    /**
     * The resource which is being requested does not exist.
     */
    override val message: kotlin.String? = builder.message

    init {
        sdkErrorMetadata.attributes[ServiceErrorMetadata.ErrorType] = ErrorType.Client
    }

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.ResourceNotFoundException = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ResourceNotFoundException(")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = message?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ResourceNotFoundException

        if (message != other.message) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.ResourceNotFoundException = Builder(this).apply(block).build()

    class Builder {
        /**
         * The resource which is being requested does not exist.
         */
        var message: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.ResourceNotFoundException) : this() {
            this.message = x.message
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.ResourceNotFoundException = ResourceNotFoundException(this)
    }
}
