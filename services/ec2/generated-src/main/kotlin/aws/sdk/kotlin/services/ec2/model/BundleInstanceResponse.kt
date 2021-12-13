// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the output of BundleInstance.
 */
class BundleInstanceResponse private constructor(builder: Builder) {
    /**
     * Information about the bundle task.
     */
    val bundleTask: aws.sdk.kotlin.services.ec2.model.BundleTask? = builder.bundleTask

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.BundleInstanceResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("BundleInstanceResponse(")
        append("bundleTask=$bundleTask)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bundleTask?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as BundleInstanceResponse

        if (bundleTask != other.bundleTask) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.BundleInstanceResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the bundle task.
         */
        var bundleTask: aws.sdk.kotlin.services.ec2.model.BundleTask? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.BundleInstanceResponse) : this() {
            this.bundleTask = x.bundleTask
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.BundleInstanceResponse = BundleInstanceResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.BundleTask] inside the given [block]
         */
        fun bundleTask(block: aws.sdk.kotlin.services.ec2.model.BundleTask.Builder.() -> kotlin.Unit) {
            this.bundleTask = aws.sdk.kotlin.services.ec2.model.BundleTask.invoke(block)
        }
    }
}
