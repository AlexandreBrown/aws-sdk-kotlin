// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The Spot Instance replacement strategy to use when Amazon EC2 emits a signal that your
 * Spot Instance is at an elevated risk of being interrupted. For more information, see
 * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-fleet-configuration-strategies.html#spot-fleet-capacity-rebalance">Capacity rebalancing in the Amazon EC2 User Guide for Linux Instances.
 */
class SpotCapacityRebalance private constructor(builder: Builder) {
    /**
     * The replacement strategy to use. Only available for fleets of type
     * maintain.
     * launch - Spot Fleet launches a new replacement Spot Instance when a
     * rebalance notification is emitted for an existing Spot Instance in the fleet. Spot Fleet
     * does not terminate the instances that receive a rebalance notification. You can
     * terminate the old instances, or you can leave them running. You are charged for all
     * instances while they are running.
     * launch-before-terminate - Spot Fleet launches a new replacement Spot
     * Instance when a rebalance notification is emitted for an existing Spot Instance in the
     * fleet, and then, after a delay that you specify (in TerminationDelay),
     * terminates the instances that received a rebalance notification.
     */
    val replacementStrategy: aws.sdk.kotlin.services.ec2.model.ReplacementStrategy? = builder.replacementStrategy
    /**
     * The amount of time (in seconds) that Amazon EC2 waits before terminating the old Spot
     * Instance after launching a new replacement Spot Instance.
     * Valid only when ReplacementStrategy is set to launch-before-terminate.
     * Valid values: Minimum value of 120 seconds. Maximum value of 7200 seconds.
     */
    val terminationDelay: kotlin.Int? = builder.terminationDelay

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.SpotCapacityRebalance = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("SpotCapacityRebalance(")
        append("replacementStrategy=$replacementStrategy,")
        append("terminationDelay=$terminationDelay)")
    }

    override fun hashCode(): kotlin.Int {
        var result = replacementStrategy?.hashCode() ?: 0
        result = 31 * result + (terminationDelay ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as SpotCapacityRebalance

        if (replacementStrategy != other.replacementStrategy) return false
        if (terminationDelay != other.terminationDelay) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.SpotCapacityRebalance = Builder(this).apply(block).build()

    class Builder {
        /**
         * The replacement strategy to use. Only available for fleets of type
         * maintain.
         * launch - Spot Fleet launches a new replacement Spot Instance when a
         * rebalance notification is emitted for an existing Spot Instance in the fleet. Spot Fleet
         * does not terminate the instances that receive a rebalance notification. You can
         * terminate the old instances, or you can leave them running. You are charged for all
         * instances while they are running.
         * launch-before-terminate - Spot Fleet launches a new replacement Spot
         * Instance when a rebalance notification is emitted for an existing Spot Instance in the
         * fleet, and then, after a delay that you specify (in TerminationDelay),
         * terminates the instances that received a rebalance notification.
         */
        var replacementStrategy: aws.sdk.kotlin.services.ec2.model.ReplacementStrategy? = null
        /**
         * The amount of time (in seconds) that Amazon EC2 waits before terminating the old Spot
         * Instance after launching a new replacement Spot Instance.
         * Valid only when ReplacementStrategy is set to launch-before-terminate.
         * Valid values: Minimum value of 120 seconds. Maximum value of 7200 seconds.
         */
        var terminationDelay: kotlin.Int? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.SpotCapacityRebalance) : this() {
            this.replacementStrategy = x.replacementStrategy
            this.terminationDelay = x.terminationDelay
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.SpotCapacityRebalance = SpotCapacityRebalance(this)
    }
}
