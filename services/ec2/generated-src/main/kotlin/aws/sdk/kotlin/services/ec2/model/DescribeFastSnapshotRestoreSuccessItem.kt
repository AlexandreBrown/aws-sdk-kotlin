// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes fast snapshot restores for a snapshot.
 */
class DescribeFastSnapshotRestoreSuccessItem private constructor(builder: Builder) {
    /**
     * The Availability Zone.
     */
    val availabilityZone: kotlin.String? = builder.availabilityZone
    /**
     * The time at which fast snapshot restores entered the disabled state.
     */
    val disabledTime: aws.smithy.kotlin.runtime.time.Instant? = builder.disabledTime
    /**
     * The time at which fast snapshot restores entered the disabling state.
     */
    val disablingTime: aws.smithy.kotlin.runtime.time.Instant? = builder.disablingTime
    /**
     * The time at which fast snapshot restores entered the enabled state.
     */
    val enabledTime: aws.smithy.kotlin.runtime.time.Instant? = builder.enabledTime
    /**
     * The time at which fast snapshot restores entered the enabling state.
     */
    val enablingTime: aws.smithy.kotlin.runtime.time.Instant? = builder.enablingTime
    /**
     * The time at which fast snapshot restores entered the optimizing state.
     */
    val optimizingTime: aws.smithy.kotlin.runtime.time.Instant? = builder.optimizingTime
    /**
     * The Amazon Web Services owner alias that enabled fast snapshot restores on the snapshot. This is intended for future use.
     */
    val ownerAlias: kotlin.String? = builder.ownerAlias
    /**
     * The ID of the Amazon Web Services account that enabled fast snapshot restores on the snapshot.
     */
    val ownerId: kotlin.String? = builder.ownerId
    /**
     * The ID of the snapshot.
     */
    val snapshotId: kotlin.String? = builder.snapshotId
    /**
     * The state of fast snapshot restores.
     */
    val state: aws.sdk.kotlin.services.ec2.model.FastSnapshotRestoreStateCode? = builder.state
    /**
     * The reason for the state transition. The possible values are as follows:
     * Client.UserInitiated - The state successfully transitioned to enabling or
     * disabling.
     * Client.UserInitiated - Lifecycle state transition - The state successfully transitioned
     * to optimizing, enabled, or disabled.
     */
    val stateTransitionReason: kotlin.String? = builder.stateTransitionReason

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeFastSnapshotRestoreSuccessItem = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeFastSnapshotRestoreSuccessItem(")
        append("availabilityZone=$availabilityZone,")
        append("disabledTime=$disabledTime,")
        append("disablingTime=$disablingTime,")
        append("enabledTime=$enabledTime,")
        append("enablingTime=$enablingTime,")
        append("optimizingTime=$optimizingTime,")
        append("ownerAlias=$ownerAlias,")
        append("ownerId=$ownerId,")
        append("snapshotId=$snapshotId,")
        append("state=$state,")
        append("stateTransitionReason=$stateTransitionReason)")
    }

    override fun hashCode(): kotlin.Int {
        var result = availabilityZone?.hashCode() ?: 0
        result = 31 * result + (disabledTime?.hashCode() ?: 0)
        result = 31 * result + (disablingTime?.hashCode() ?: 0)
        result = 31 * result + (enabledTime?.hashCode() ?: 0)
        result = 31 * result + (enablingTime?.hashCode() ?: 0)
        result = 31 * result + (optimizingTime?.hashCode() ?: 0)
        result = 31 * result + (ownerAlias?.hashCode() ?: 0)
        result = 31 * result + (ownerId?.hashCode() ?: 0)
        result = 31 * result + (snapshotId?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (stateTransitionReason?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeFastSnapshotRestoreSuccessItem

        if (availabilityZone != other.availabilityZone) return false
        if (disabledTime != other.disabledTime) return false
        if (disablingTime != other.disablingTime) return false
        if (enabledTime != other.enabledTime) return false
        if (enablingTime != other.enablingTime) return false
        if (optimizingTime != other.optimizingTime) return false
        if (ownerAlias != other.ownerAlias) return false
        if (ownerId != other.ownerId) return false
        if (snapshotId != other.snapshotId) return false
        if (state != other.state) return false
        if (stateTransitionReason != other.stateTransitionReason) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeFastSnapshotRestoreSuccessItem = Builder(this).apply(block).build()

    class Builder {
        /**
         * The Availability Zone.
         */
        var availabilityZone: kotlin.String? = null
        /**
         * The time at which fast snapshot restores entered the disabled state.
         */
        var disabledTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The time at which fast snapshot restores entered the disabling state.
         */
        var disablingTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The time at which fast snapshot restores entered the enabled state.
         */
        var enabledTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The time at which fast snapshot restores entered the enabling state.
         */
        var enablingTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The time at which fast snapshot restores entered the optimizing state.
         */
        var optimizingTime: aws.smithy.kotlin.runtime.time.Instant? = null
        /**
         * The Amazon Web Services owner alias that enabled fast snapshot restores on the snapshot. This is intended for future use.
         */
        var ownerAlias: kotlin.String? = null
        /**
         * The ID of the Amazon Web Services account that enabled fast snapshot restores on the snapshot.
         */
        var ownerId: kotlin.String? = null
        /**
         * The ID of the snapshot.
         */
        var snapshotId: kotlin.String? = null
        /**
         * The state of fast snapshot restores.
         */
        var state: aws.sdk.kotlin.services.ec2.model.FastSnapshotRestoreStateCode? = null
        /**
         * The reason for the state transition. The possible values are as follows:
         * Client.UserInitiated - The state successfully transitioned to enabling or
         * disabling.
         * Client.UserInitiated - Lifecycle state transition - The state successfully transitioned
         * to optimizing, enabled, or disabled.
         */
        var stateTransitionReason: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeFastSnapshotRestoreSuccessItem) : this() {
            this.availabilityZone = x.availabilityZone
            this.disabledTime = x.disabledTime
            this.disablingTime = x.disablingTime
            this.enabledTime = x.enabledTime
            this.enablingTime = x.enablingTime
            this.optimizingTime = x.optimizingTime
            this.ownerAlias = x.ownerAlias
            this.ownerId = x.ownerId
            this.snapshotId = x.snapshotId
            this.state = x.state
            this.stateTransitionReason = x.stateTransitionReason
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeFastSnapshotRestoreSuccessItem = DescribeFastSnapshotRestoreSuccessItem(this)
    }
}
