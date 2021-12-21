// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the output of a GetItem operation.
 */
class GetItemResponse private constructor(builder: Builder) {
    /**
     * The capacity units consumed by the GetItem operation. The data returned
     * includes the total provisioned throughput consumed, along with statistics for the table
     * and any indexes involved in the operation. ConsumedCapacity is only
     * returned if the ReturnConsumedCapacity parameter was specified. For more
     * information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Read/Write Capacity Mode in the Amazon DynamoDB Developer
     * Guide.
     */
    val consumedCapacity: aws.sdk.kotlin.services.dynamodb.model.ConsumedCapacity? = builder.consumedCapacity
    /**
     * A map of attribute names to AttributeValue objects, as specified by
     * ProjectionExpression.
     */
    val item: Map<String, AttributeValue>? = builder.item

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.GetItemResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetItemResponse(")
        append("consumedCapacity=$consumedCapacity,")
        append("item=$item)")
    }

    override fun hashCode(): kotlin.Int {
        var result = consumedCapacity?.hashCode() ?: 0
        result = 31 * result + (item?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetItemResponse

        if (consumedCapacity != other.consumedCapacity) return false
        if (item != other.item) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.GetItemResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The capacity units consumed by the GetItem operation. The data returned
         * includes the total provisioned throughput consumed, along with statistics for the table
         * and any indexes involved in the operation. ConsumedCapacity is only
         * returned if the ReturnConsumedCapacity parameter was specified. For more
         * information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Read/Write Capacity Mode in the Amazon DynamoDB Developer
         * Guide.
         */
        var consumedCapacity: aws.sdk.kotlin.services.dynamodb.model.ConsumedCapacity? = null
        /**
         * A map of attribute names to AttributeValue objects, as specified by
         * ProjectionExpression.
         */
        var item: Map<String, AttributeValue>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.GetItemResponse) : this() {
            this.consumedCapacity = x.consumedCapacity
            this.item = x.item
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.GetItemResponse = GetItemResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.ConsumedCapacity] inside the given [block]
         */
        fun consumedCapacity(block: aws.sdk.kotlin.services.dynamodb.model.ConsumedCapacity.Builder.() -> kotlin.Unit) {
            this.consumedCapacity = aws.sdk.kotlin.services.dynamodb.model.ConsumedCapacity.invoke(block)
        }
    }
}