// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for DescribeReservedInstances.
 */
class DescribeReservedInstancesRequest private constructor(builder: Builder) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: kotlin.Boolean? = builder.dryRun
    /**
     * One or more filters.
     * availability-zone - The Availability Zone where the Reserved Instance can be used.
     * duration - The duration of the Reserved Instance (one year or three years), in seconds (31536000 | 94608000).
     * end - The time when the Reserved Instance expires (for example, 2015-08-07T11:54:42.000Z).
     * fixed-price - The purchase price of the Reserved Instance (for example, 9800.0).
     * instance-type - The instance type that is covered by the reservation.
     * scope - The scope of the Reserved Instance (Region or Availability Zone).
     * product-description - The Reserved Instance product platform
     * description. Instances that include (Amazon VPC) in the product platform
     * description will only be displayed to EC2-Classic account holders and are for use with
     * Amazon VPC (Linux/UNIX | Linux/UNIX (Amazon VPC) | SUSE
     * Linux | SUSE Linux (Amazon VPC) | Red Hat Enterprise
     * Linux | Red Hat Enterprise Linux (Amazon VPC) | Red Hat
     * Enterprise Linux with HA (Amazon VPC) | Windows | Windows
     * (Amazon VPC) | Windows with SQL Server Standard | Windows with
     * SQL Server Standard (Amazon VPC) | Windows with SQL Server Web |
     * Windows with SQL Server Web (Amazon VPC) | Windows with SQL Server
     * Enterprise | Windows with SQL Server Enterprise (Amazon
     * VPC)).
     * reserved-instances-id - The ID of the Reserved Instance.
     * start - The time at which the Reserved Instance purchase request was placed (for example, 2014-08-07T11:54:42.000Z).
     * state - The state of the Reserved Instance (payment-pending | active | payment-failed | retired).
     * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
     * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
     * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
     * usage-price - The usage price of the Reserved Instance, per hour (for example, 0.84).
     */
    val filters: List<Filter>? = builder.filters
    /**
     * Describes whether the Reserved Instance is Standard or Convertible.
     */
    val offeringClass: aws.sdk.kotlin.services.ec2.model.OfferingClassType? = builder.offeringClass
    /**
     * The Reserved Instance offering type. If you are using tools that predate the 2011-11-01 API
     * version, you only have access to the Medium Utilization Reserved Instance
     * offering type.
     */
    val offeringType: aws.sdk.kotlin.services.ec2.model.OfferingTypeValues? = builder.offeringType
    /**
     * One or more Reserved Instance IDs.
     * Default: Describes all your Reserved Instances, or only those otherwise specified.
     */
    val reservedInstancesIds: List<String>? = builder.reservedInstancesIds

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.DescribeReservedInstancesRequest = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeReservedInstancesRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("offeringClass=$offeringClass,")
        append("offeringType=$offeringType,")
        append("reservedInstancesIds=$reservedInstancesIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (offeringClass?.hashCode() ?: 0)
        result = 31 * result + (offeringType?.hashCode() ?: 0)
        result = 31 * result + (reservedInstancesIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as DescribeReservedInstancesRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (offeringClass != other.offeringClass) return false
        if (offeringType != other.offeringType) return false
        if (reservedInstancesIds != other.reservedInstancesIds) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.DescribeReservedInstancesRequest = Builder(this).apply(block).build()

    class Builder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: kotlin.Boolean? = null
        /**
         * One or more filters.
         * availability-zone - The Availability Zone where the Reserved Instance can be used.
         * duration - The duration of the Reserved Instance (one year or three years), in seconds (31536000 | 94608000).
         * end - The time when the Reserved Instance expires (for example, 2015-08-07T11:54:42.000Z).
         * fixed-price - The purchase price of the Reserved Instance (for example, 9800.0).
         * instance-type - The instance type that is covered by the reservation.
         * scope - The scope of the Reserved Instance (Region or Availability Zone).
         * product-description - The Reserved Instance product platform
         * description. Instances that include (Amazon VPC) in the product platform
         * description will only be displayed to EC2-Classic account holders and are for use with
         * Amazon VPC (Linux/UNIX | Linux/UNIX (Amazon VPC) | SUSE
         * Linux | SUSE Linux (Amazon VPC) | Red Hat Enterprise
         * Linux | Red Hat Enterprise Linux (Amazon VPC) | Red Hat
         * Enterprise Linux with HA (Amazon VPC) | Windows | Windows
         * (Amazon VPC) | Windows with SQL Server Standard | Windows with
         * SQL Server Standard (Amazon VPC) | Windows with SQL Server Web |
         * Windows with SQL Server Web (Amazon VPC) | Windows with SQL Server
         * Enterprise | Windows with SQL Server Enterprise (Amazon
         * VPC)).
         * reserved-instances-id - The ID of the Reserved Instance.
         * start - The time at which the Reserved Instance purchase request was placed (for example, 2014-08-07T11:54:42.000Z).
         * state - The state of the Reserved Instance (payment-pending | active | payment-failed | retired).
         * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
         * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
         * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
         * usage-price - The usage price of the Reserved Instance, per hour (for example, 0.84).
         */
        var filters: List<Filter>? = null
        /**
         * Describes whether the Reserved Instance is Standard or Convertible.
         */
        var offeringClass: aws.sdk.kotlin.services.ec2.model.OfferingClassType? = null
        /**
         * The Reserved Instance offering type. If you are using tools that predate the 2011-11-01 API
         * version, you only have access to the Medium Utilization Reserved Instance
         * offering type.
         */
        var offeringType: aws.sdk.kotlin.services.ec2.model.OfferingTypeValues? = null
        /**
         * One or more Reserved Instance IDs.
         * Default: Describes all your Reserved Instances, or only those otherwise specified.
         */
        var reservedInstancesIds: List<String>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.DescribeReservedInstancesRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.offeringClass = x.offeringClass
            this.offeringType = x.offeringType
            this.reservedInstancesIds = x.reservedInstancesIds
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.DescribeReservedInstancesRequest = DescribeReservedInstancesRequest(this)
    }
}