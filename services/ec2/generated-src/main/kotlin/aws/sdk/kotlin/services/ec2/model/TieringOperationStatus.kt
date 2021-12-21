// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class TieringOperationStatus {

    abstract val value: kotlin.String

    object ArchivalCompleted : aws.sdk.kotlin.services.ec2.model.TieringOperationStatus() {
        override val value: kotlin.String = "archival-completed"
        override fun toString(): kotlin.String = value
    }

    object ArchivalFailed : aws.sdk.kotlin.services.ec2.model.TieringOperationStatus() {
        override val value: kotlin.String = "archival-failed"
        override fun toString(): kotlin.String = value
    }

    object ArchivalInProgress : aws.sdk.kotlin.services.ec2.model.TieringOperationStatus() {
        override val value: kotlin.String = "archival-in-progress"
        override fun toString(): kotlin.String = value
    }

    object PermanentRestoreCompleted : aws.sdk.kotlin.services.ec2.model.TieringOperationStatus() {
        override val value: kotlin.String = "permanent-restore-completed"
        override fun toString(): kotlin.String = value
    }

    object PermanentRestoreFailed : aws.sdk.kotlin.services.ec2.model.TieringOperationStatus() {
        override val value: kotlin.String = "permanent-restore-failed"
        override fun toString(): kotlin.String = value
    }

    object PermanentRestoreInProgress : aws.sdk.kotlin.services.ec2.model.TieringOperationStatus() {
        override val value: kotlin.String = "permanent-restore-in-progress"
        override fun toString(): kotlin.String = value
    }

    object TemporaryRestoreCompleted : aws.sdk.kotlin.services.ec2.model.TieringOperationStatus() {
        override val value: kotlin.String = "temporary-restore-completed"
        override fun toString(): kotlin.String = value
    }

    object TemporaryRestoreFailed : aws.sdk.kotlin.services.ec2.model.TieringOperationStatus() {
        override val value: kotlin.String = "temporary-restore-failed"
        override fun toString(): kotlin.String = value
    }

    object TemporaryRestoreInProgress : aws.sdk.kotlin.services.ec2.model.TieringOperationStatus() {
        override val value: kotlin.String = "temporary-restore-in-progress"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.TieringOperationStatus() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.TieringOperationStatus = when(str) {
            "archival-completed" -> ArchivalCompleted
            "archival-failed" -> ArchivalFailed
            "archival-in-progress" -> ArchivalInProgress
            "permanent-restore-completed" -> PermanentRestoreCompleted
            "permanent-restore-failed" -> PermanentRestoreFailed
            "permanent-restore-in-progress" -> PermanentRestoreInProgress
            "temporary-restore-completed" -> TemporaryRestoreCompleted
            "temporary-restore-failed" -> TemporaryRestoreFailed
            "temporary-restore-in-progress" -> TemporaryRestoreInProgress
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.TieringOperationStatus> = listOf(
            ArchivalCompleted,
            ArchivalFailed,
            ArchivalInProgress,
            PermanentRestoreCompleted,
            PermanentRestoreFailed,
            PermanentRestoreInProgress,
            TemporaryRestoreCompleted,
            TemporaryRestoreFailed,
            TemporaryRestoreInProgress
        )
    }
}