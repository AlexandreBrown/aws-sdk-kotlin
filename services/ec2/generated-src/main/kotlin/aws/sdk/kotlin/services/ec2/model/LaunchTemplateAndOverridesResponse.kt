// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a launch template and overrides.
 */
class LaunchTemplateAndOverridesResponse private constructor(builder: Builder) {
    /**
     * The launch template.
     */
    val launchTemplateSpecification: aws.sdk.kotlin.services.ec2.model.FleetLaunchTemplateSpecification? = builder.launchTemplateSpecification
    /**
     * Any parameters that you specify override the same parameters in the launch
     * template.
     */
    val overrides: aws.sdk.kotlin.services.ec2.model.FleetLaunchTemplateOverrides? = builder.overrides

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.LaunchTemplateAndOverridesResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("LaunchTemplateAndOverridesResponse(")
        append("launchTemplateSpecification=$launchTemplateSpecification,")
        append("overrides=$overrides)")
    }

    override fun hashCode(): kotlin.Int {
        var result = launchTemplateSpecification?.hashCode() ?: 0
        result = 31 * result + (overrides?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as LaunchTemplateAndOverridesResponse

        if (launchTemplateSpecification != other.launchTemplateSpecification) return false
        if (overrides != other.overrides) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.LaunchTemplateAndOverridesResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The launch template.
         */
        var launchTemplateSpecification: aws.sdk.kotlin.services.ec2.model.FleetLaunchTemplateSpecification? = null
        /**
         * Any parameters that you specify override the same parameters in the launch
         * template.
         */
        var overrides: aws.sdk.kotlin.services.ec2.model.FleetLaunchTemplateOverrides? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.LaunchTemplateAndOverridesResponse) : this() {
            this.launchTemplateSpecification = x.launchTemplateSpecification
            this.overrides = x.overrides
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.LaunchTemplateAndOverridesResponse = LaunchTemplateAndOverridesResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.FleetLaunchTemplateSpecification] inside the given [block]
         */
        fun launchTemplateSpecification(block: aws.sdk.kotlin.services.ec2.model.FleetLaunchTemplateSpecification.Builder.() -> kotlin.Unit) {
            this.launchTemplateSpecification = aws.sdk.kotlin.services.ec2.model.FleetLaunchTemplateSpecification.invoke(block)
        }

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.FleetLaunchTemplateOverrides] inside the given [block]
         */
        fun overrides(block: aws.sdk.kotlin.services.ec2.model.FleetLaunchTemplateOverrides.Builder.() -> kotlin.Unit) {
            this.overrides = aws.sdk.kotlin.services.ec2.model.FleetLaunchTemplateOverrides.invoke(block)
        }
    }
}
