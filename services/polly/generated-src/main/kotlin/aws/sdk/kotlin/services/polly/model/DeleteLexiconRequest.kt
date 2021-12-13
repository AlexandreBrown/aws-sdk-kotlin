// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.model



class DeleteLexiconRequest private constructor(builder: Builder) {
    /**
     * The name of the lexicon to delete. Must be an existing lexicon in
     * the region.
     */
    val name: kotlin.String? = builder.name

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.polly.model.DeleteLexiconRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteLexiconRequest(")
        append("name=$name)")
    }

    override fun hashCode(): kotlin.Int {
        var result = name?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteLexiconRequest

        if (name != other.name) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.polly.model.DeleteLexiconRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * The name of the lexicon to delete. Must be an existing lexicon in
         * the region.
         */
        var name: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.polly.model.DeleteLexiconRequest) : this() {
            this.name = x.name
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.polly.model.DeleteLexiconRequest = DeleteLexiconRequest(this)
    }
}
