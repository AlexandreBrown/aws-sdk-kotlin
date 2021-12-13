// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Container for the transition rule that describes when noncurrent objects transition to
 * the STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING,
 * GLACIER_IR, GLACIER, or DEEP_ARCHIVE storage class. If your bucket is
 * versioning-enabled (or versioning is suspended), you can set this action to request that
 * Amazon S3 transition noncurrent object versions to the STANDARD_IA,
 * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER_IR, GLACIER, or
 * DEEP_ARCHIVE storage class at a specific period in the object's
 * lifetime.
 */
class NoncurrentVersionTransition private constructor(builder: Builder) {
    /**
     * Specifies how many noncurrent versions Amazon S3 will retain. If there are this many more recent
     * noncurrent versions, Amazon S3 will take the associated action. For more information about noncurrent
     * versions, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html">Lifecycle configuration elements
     * in the Amazon S3 User Guide.
     */
    val newerNoncurrentVersions: kotlin.Int = builder.newerNoncurrentVersions
    /**
     * Specifies the number of days an object is noncurrent before Amazon S3 can perform the
     * associated action. For information about the noncurrent days calculations, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations">How
     * Amazon S3 Calculates How Long an Object Has Been Noncurrent in the
     * Amazon S3 User Guide.
     */
    val noncurrentDays: kotlin.Int = builder.noncurrentDays
    /**
     * The class of storage used to store the object.
     */
    val storageClass: aws.sdk.kotlin.services.s3.model.TransitionStorageClass? = builder.storageClass

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.s3.model.NoncurrentVersionTransition = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("NoncurrentVersionTransition(")
        append("newerNoncurrentVersions=$newerNoncurrentVersions,")
        append("noncurrentDays=$noncurrentDays,")
        append("storageClass=$storageClass)")
    }

    override fun hashCode(): kotlin.Int {
        var result = newerNoncurrentVersions
        result = 31 * result + (noncurrentDays)
        result = 31 * result + (storageClass?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as NoncurrentVersionTransition

        if (newerNoncurrentVersions != other.newerNoncurrentVersions) return false
        if (noncurrentDays != other.noncurrentDays) return false
        if (storageClass != other.storageClass) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.s3.model.NoncurrentVersionTransition = Builder(this).apply(block).build()

    class Builder {
        /**
         * Specifies how many noncurrent versions Amazon S3 will retain. If there are this many more recent
         * noncurrent versions, Amazon S3 will take the associated action. For more information about noncurrent
         * versions, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html">Lifecycle configuration elements
         * in the Amazon S3 User Guide.
         */
        var newerNoncurrentVersions: kotlin.Int = 0
        /**
         * Specifies the number of days an object is noncurrent before Amazon S3 can perform the
         * associated action. For information about the noncurrent days calculations, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations">How
         * Amazon S3 Calculates How Long an Object Has Been Noncurrent in the
         * Amazon S3 User Guide.
         */
        var noncurrentDays: kotlin.Int = 0
        /**
         * The class of storage used to store the object.
         */
        var storageClass: aws.sdk.kotlin.services.s3.model.TransitionStorageClass? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.s3.model.NoncurrentVersionTransition) : this() {
            this.newerNoncurrentVersions = x.newerNoncurrentVersions
            this.noncurrentDays = x.noncurrentDays
            this.storageClass = x.storageClass
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.s3.model.NoncurrentVersionTransition = NoncurrentVersionTransition(this)
    }
}
