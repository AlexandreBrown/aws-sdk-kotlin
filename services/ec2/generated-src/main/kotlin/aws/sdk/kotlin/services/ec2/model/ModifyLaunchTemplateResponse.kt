// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyLaunchTemplateResponse private constructor(builder: Builder) {
    /**
     * Information about the launch template.
     */
    val launchTemplate: aws.sdk.kotlin.services.ec2.model.LaunchTemplate? = builder.launchTemplate

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyLaunchTemplateResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyLaunchTemplateResponse(")
        append("launchTemplate=$launchTemplate)")
    }

    override fun hashCode(): kotlin.Int {
        var result = launchTemplate?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyLaunchTemplateResponse

        if (launchTemplate != other.launchTemplate) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyLaunchTemplateResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the launch template.
         */
        var launchTemplate: aws.sdk.kotlin.services.ec2.model.LaunchTemplate? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyLaunchTemplateResponse) : this() {
            this.launchTemplate = x.launchTemplate
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyLaunchTemplateResponse = ModifyLaunchTemplateResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.LaunchTemplate] inside the given [block]
         */
        fun launchTemplate(block: aws.sdk.kotlin.services.ec2.model.LaunchTemplate.Builder.() -> kotlin.Unit) {
            this.launchTemplate = aws.sdk.kotlin.services.ec2.model.LaunchTemplate.invoke(block)
        }
    }
}
