// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the output of a BatchGetItem operation.
 */
class BatchGetItemResponse private constructor(builder: Builder) {
    /**
     * The read capacity units consumed by the entire BatchGetItem
     * operation.
     * Each element consists of:
     * TableName - The table that consumed the provisioned
     * throughput.
     * CapacityUnits - The total number of capacity units consumed.
     */
    val consumedCapacity: List<ConsumedCapacity>? = builder.consumedCapacity
    /**
     * A map of table name to a list of items. Each object in Responses consists
     * of a table name, along with a map of attribute data consisting of the data type and
     * attribute value.
     */
    val responses: Map<String, List<Map<String, AttributeValue>>>? = builder.responses
    /**
     * A map of tables and their respective keys that were not processed with the current
     * response. The UnprocessedKeys value is in the same form as
     * RequestItems, so the value can be provided directly to a subsequent
     * BatchGetItem operation. For more information, see
     * RequestItems in the Request Parameters section.
     * Each element consists of:
     * Keys - An array of primary key attribute values that define
     * specific items in the table.
     * ProjectionExpression - One or more attributes to be retrieved from
     * the table or index. By default, all attributes are returned. If a requested
     * attribute is not found, it does not appear in the result.
     * ConsistentRead - The consistency of a read operation. If set to
     * true, then a strongly consistent read is used; otherwise, an
     * eventually consistent read is used.
     * If there are no unprocessed keys remaining, the response contains an empty
     * UnprocessedKeys map.
     */
    val unprocessedKeys: Map<String, KeysAndAttributes>? = builder.unprocessedKeys

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.dynamodb.model.BatchGetItemResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("BatchGetItemResponse(")
        append("consumedCapacity=$consumedCapacity,")
        append("responses=$responses,")
        append("unprocessedKeys=$unprocessedKeys)")
    }

    override fun hashCode(): kotlin.Int {
        var result = consumedCapacity?.hashCode() ?: 0
        result = 31 * result + (responses?.hashCode() ?: 0)
        result = 31 * result + (unprocessedKeys?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as BatchGetItemResponse

        if (consumedCapacity != other.consumedCapacity) return false
        if (responses != other.responses) return false
        if (unprocessedKeys != other.unprocessedKeys) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.dynamodb.model.BatchGetItemResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The read capacity units consumed by the entire BatchGetItem
         * operation.
         * Each element consists of:
         * TableName - The table that consumed the provisioned
         * throughput.
         * CapacityUnits - The total number of capacity units consumed.
         */
        var consumedCapacity: List<ConsumedCapacity>? = null
        /**
         * A map of table name to a list of items. Each object in Responses consists
         * of a table name, along with a map of attribute data consisting of the data type and
         * attribute value.
         */
        var responses: Map<String, List<Map<String, AttributeValue>>>? = null
        /**
         * A map of tables and their respective keys that were not processed with the current
         * response. The UnprocessedKeys value is in the same form as
         * RequestItems, so the value can be provided directly to a subsequent
         * BatchGetItem operation. For more information, see
         * RequestItems in the Request Parameters section.
         * Each element consists of:
         * Keys - An array of primary key attribute values that define
         * specific items in the table.
         * ProjectionExpression - One or more attributes to be retrieved from
         * the table or index. By default, all attributes are returned. If a requested
         * attribute is not found, it does not appear in the result.
         * ConsistentRead - The consistency of a read operation. If set to
         * true, then a strongly consistent read is used; otherwise, an
         * eventually consistent read is used.
         * If there are no unprocessed keys remaining, the response contains an empty
         * UnprocessedKeys map.
         */
        var unprocessedKeys: Map<String, KeysAndAttributes>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.dynamodb.model.BatchGetItemResponse) : this() {
            this.consumedCapacity = x.consumedCapacity
            this.responses = x.responses
            this.unprocessedKeys = x.unprocessedKeys
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.dynamodb.model.BatchGetItemResponse = BatchGetItemResponse(this)
    }
}