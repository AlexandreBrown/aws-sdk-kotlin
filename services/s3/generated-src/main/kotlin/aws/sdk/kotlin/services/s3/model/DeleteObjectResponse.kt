// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class DeleteObjectResponse private constructor(builder: Builder) {
    /**
     * Specifies whether the versioned object that was permanently deleted was (true) or was
     * not (false) a delete marker.
     */
    val deleteMarker: kotlin.Boolean = builder.deleteMarker
    /**
     * If present, indicates that the requester was successfully charged for the
     * request.
     */
    val requestCharged: aws.sdk.kotlin.services.s3.model.RequestCharged? = builder.requestCharged
    /**
     * Returns the version ID of the delete marker created as a result of the DELETE
     * operation.
     */
    val versionId: kotlin.String? = builder.versionId

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.DeleteObjectResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteObjectResponse(")
        append("deleteMarker=$deleteMarker,")
        append("requestCharged=$requestCharged,")
        append("versionId=$versionId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = deleteMarker.hashCode()
        result = 31 * result + (requestCharged?.hashCode() ?: 0)
        result = 31 * result + (versionId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteObjectResponse

        if (deleteMarker != other.deleteMarker) return false
        if (requestCharged != other.requestCharged) return false
        if (versionId != other.versionId) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.DeleteObjectResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Specifies whether the versioned object that was permanently deleted was (true) or was
         * not (false) a delete marker.
         */
        var deleteMarker: kotlin.Boolean = false
        /**
         * If present, indicates that the requester was successfully charged for the
         * request.
         */
        var requestCharged: aws.sdk.kotlin.services.s3.model.RequestCharged? = null
        /**
         * Returns the version ID of the delete marker created as a result of the DELETE
         * operation.
         */
        var versionId: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.DeleteObjectResponse) : this() {
            this.deleteMarker = x.deleteMarker
            this.requestCharged = x.requestCharged
            this.versionId = x.versionId
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.DeleteObjectResponse = DeleteObjectResponse(this)
    }
}
