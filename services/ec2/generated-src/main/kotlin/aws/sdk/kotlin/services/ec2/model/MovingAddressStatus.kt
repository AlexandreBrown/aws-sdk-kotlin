// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the status of a moving Elastic IP address.
 */
class MovingAddressStatus private constructor(builder: Builder) {
    /**
     * The status of the Elastic IP address that's being moved to the EC2-VPC platform, or restored to the EC2-Classic platform.
     */
    val moveStatus: aws.sdk.kotlin.services.ec2.model.MoveStatus? = builder.moveStatus
    /**
     * The Elastic IP address.
     */
    val publicIp: kotlin.String? = builder.publicIp

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.MovingAddressStatus = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("MovingAddressStatus(")
        append("moveStatus=$moveStatus,")
        append("publicIp=$publicIp)")
    }

    override fun hashCode(): kotlin.Int {
        var result = moveStatus?.hashCode() ?: 0
        result = 31 * result + (publicIp?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as MovingAddressStatus

        if (moveStatus != other.moveStatus) return false
        if (publicIp != other.publicIp) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.MovingAddressStatus = Builder(this).apply(block).build()

    class Builder {
        /**
         * The status of the Elastic IP address that's being moved to the EC2-VPC platform, or restored to the EC2-Classic platform.
         */
        var moveStatus: aws.sdk.kotlin.services.ec2.model.MoveStatus? = null
        /**
         * The Elastic IP address.
         */
        var publicIp: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.MovingAddressStatus) : this() {
            this.moveStatus = x.moveStatus
            this.publicIp = x.publicIp
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.MovingAddressStatus = MovingAddressStatus(this)
    }
}