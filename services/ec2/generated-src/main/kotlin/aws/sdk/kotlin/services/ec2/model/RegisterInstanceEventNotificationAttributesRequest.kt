// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class RegisterInstanceEventNotificationAttributesRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * Information about the tag keys to register.
     */
    val instanceTagAttribute: aws.sdk.kotlin.services.ec2.model.RegisterInstanceTagAttributeRequest? = builder.instanceTagAttribute

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.RegisterInstanceEventNotificationAttributesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("RegisterInstanceEventNotificationAttributesRequest(")
        append("dryRun=$dryRun,")
        append("instanceTagAttribute=$instanceTagAttribute)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (instanceTagAttribute?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as RegisterInstanceEventNotificationAttributesRequest

        if (dryRun != other.dryRun) return false
        if (instanceTagAttribute != other.instanceTagAttribute) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.RegisterInstanceEventNotificationAttributesRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * Information about the tag keys to register.
         */
        var instanceTagAttribute: aws.sdk.kotlin.services.ec2.model.RegisterInstanceTagAttributeRequest? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.RegisterInstanceEventNotificationAttributesRequest) : this() {
            this.dryRun = x.dryRun
            this.instanceTagAttribute = x.instanceTagAttribute
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.RegisterInstanceEventNotificationAttributesRequest = RegisterInstanceEventNotificationAttributesRequest(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.RegisterInstanceTagAttributeRequest] inside the given [block]
         */
        fun instanceTagAttribute(block: aws.sdk.kotlin.services.ec2.model.RegisterInstanceTagAttributeRequest.Builder.() -> kotlin.Unit) {
            this.instanceTagAttribute = aws.sdk.kotlin.services.ec2.model.RegisterInstanceTagAttributeRequest.invoke(block)
        }
    }
}