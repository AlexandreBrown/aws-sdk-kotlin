// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.model



sealed class SpeechMarkType {

    abstract val value: kotlin.String

    object Sentence : aws.sdk.kotlin.services.polly.model.SpeechMarkType() {
        override val value: kotlin.String = "sentence"
        override fun toString(): kotlin.String = value
    }

    object Ssml : aws.sdk.kotlin.services.polly.model.SpeechMarkType() {
        override val value: kotlin.String = "ssml"
        override fun toString(): kotlin.String = value
    }

    object Viseme : aws.sdk.kotlin.services.polly.model.SpeechMarkType() {
        override val value: kotlin.String = "viseme"
        override fun toString(): kotlin.String = value
    }

    object Word : aws.sdk.kotlin.services.polly.model.SpeechMarkType() {
        override val value: kotlin.String = "word"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.polly.model.SpeechMarkType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.polly.model.SpeechMarkType = when(str) {
            "sentence" -> Sentence
            "ssml" -> Ssml
            "viseme" -> Viseme
            "word" -> Word
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.polly.model.SpeechMarkType> = listOf(
            Sentence,
            Ssml,
            Viseme,
            Word
        )
    }
}