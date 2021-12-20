// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteSubnetCidrReservationResponse private constructor(builder: Builder) {
    /**
     * Information about the deleted subnet CIDR reservation.
     */
    val deletedSubnetCidrReservation: aws.sdk.kotlin.services.ec2.model.SubnetCidrReservation? = builder.deletedSubnetCidrReservation

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DeleteSubnetCidrReservationResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteSubnetCidrReservationResponse(")
        append("deletedSubnetCidrReservation=$deletedSubnetCidrReservation)")
    }

    override fun hashCode(): kotlin.Int {
        var result = deletedSubnetCidrReservation?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DeleteSubnetCidrReservationResponse

        if (deletedSubnetCidrReservation != other.deletedSubnetCidrReservation) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DeleteSubnetCidrReservationResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * Information about the deleted subnet CIDR reservation.
         */
        var deletedSubnetCidrReservation: aws.sdk.kotlin.services.ec2.model.SubnetCidrReservation? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DeleteSubnetCidrReservationResponse) : this() {
            this.deletedSubnetCidrReservation = x.deletedSubnetCidrReservation
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DeleteSubnetCidrReservationResponse = DeleteSubnetCidrReservationResponse(this)

        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.SubnetCidrReservation] inside the given [block]
         */
        fun deletedSubnetCidrReservation(block: aws.sdk.kotlin.services.ec2.model.SubnetCidrReservation.Builder.() -> kotlin.Unit) {
            this.deletedSubnetCidrReservation = aws.sdk.kotlin.services.ec2.model.SubnetCidrReservation.invoke(block)
        }
    }
}