// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The Amazon Web Services Site-to-Site VPN tunnel options to modify.
 */
class ModifyVpnTunnelOptionsSpecification private constructor(builder: Builder) {
    /**
     * The action to take after DPD timeout occurs. Specify restart to restart
     * the IKE initiation. Specify clear to end the IKE session.
     * Valid Values: clear | none | restart
     * Default: clear
     */
    val dpdTimeoutAction: kotlin.String? = builder.dpdTimeoutAction
    /**
     * The number of seconds after which a DPD timeout occurs.
     * Constraints: A value between 0 and 30.
     * Default: 30
     */
    val dpdTimeoutSeconds: kotlin.Int? = builder.dpdTimeoutSeconds
    /**
     * The IKE versions that are permitted for the VPN tunnel.
     * Valid values: ikev1 | ikev2
     */
    val ikeVersions: List<IkeVersionsRequestListValue>? = builder.ikeVersions
    /**
     * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for
     * phase 1 IKE negotiations.
     * Valid values: 2 | 14 | 15 | 16 |
     * 17 | 18 | 19 | 20 |
     * 21 | 22 | 23 | 24
     */
    val phase1DhGroupNumbers: List<Phase1DhGroupNumbersRequestListValue>? = builder.phase1DhGroupNumbers
    /**
     * One or more encryption algorithms that are permitted for the VPN tunnel for phase 1
     * IKE negotiations.
     * Valid values: AES128 | AES256 | AES128-GCM-16 |
     * AES256-GCM-16
     */
    val phase1EncryptionAlgorithms: List<Phase1EncryptionAlgorithmsRequestListValue>? = builder.phase1EncryptionAlgorithms
    /**
     * One or more integrity algorithms that are permitted for the VPN tunnel for phase 1 IKE
     * negotiations.
     * Valid values: SHA1 | SHA2-256 | SHA2-384 |
     * SHA2-512
     */
    val phase1IntegrityAlgorithms: List<Phase1IntegrityAlgorithmsRequestListValue>? = builder.phase1IntegrityAlgorithms
    /**
     * The lifetime for phase 1 of the IKE negotiation, in seconds.
     * Constraints: A value between 900 and 28,800.
     * Default: 28800
     */
    val phase1LifetimeSeconds: kotlin.Int? = builder.phase1LifetimeSeconds
    /**
     * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for
     * phase 2 IKE negotiations.
     * Valid values: 2 | 5 | 14 | 15 |
     * 16 | 17 | 18 | 19 |
     * 20 | 21 | 22 | 23 |
     * 24
     */
    val phase2DhGroupNumbers: List<Phase2DhGroupNumbersRequestListValue>? = builder.phase2DhGroupNumbers
    /**
     * One or more encryption algorithms that are permitted for the VPN tunnel for phase 2
     * IKE negotiations.
     * Valid values: AES128 | AES256 | AES128-GCM-16 |
     * AES256-GCM-16
     */
    val phase2EncryptionAlgorithms: List<Phase2EncryptionAlgorithmsRequestListValue>? = builder.phase2EncryptionAlgorithms
    /**
     * One or more integrity algorithms that are permitted for the VPN tunnel for phase 2 IKE
     * negotiations.
     * Valid values: SHA1 | SHA2-256 | SHA2-384 |
     * SHA2-512
     */
    val phase2IntegrityAlgorithms: List<Phase2IntegrityAlgorithmsRequestListValue>? = builder.phase2IntegrityAlgorithms
    /**
     * The lifetime for phase 2 of the IKE negotiation, in seconds.
     * Constraints: A value between 900 and 3,600. The value must be less than the value for
     * Phase1LifetimeSeconds.
     * Default: 3600
     */
    val phase2LifetimeSeconds: kotlin.Int? = builder.phase2LifetimeSeconds
    /**
     * The pre-shared key (PSK) to establish initial authentication between the virtual
     * private gateway and the customer gateway.
     * Constraints: Allowed characters are alphanumeric characters, periods (.), and
     * underscores (_). Must be between 8 and 64 characters in length and cannot start with
     * zero (0).
     */
    val preSharedKey: kotlin.String? = builder.preSharedKey
    /**
     * The percentage of the rekey window (determined by RekeyMarginTimeSeconds)
     * during which the rekey time is randomly selected.
     * Constraints: A value between 0 and 100.
     * Default: 100
     */
    val rekeyFuzzPercentage: kotlin.Int? = builder.rekeyFuzzPercentage
    /**
     * The margin time, in seconds, before the phase 2 lifetime expires, during which the
     * Amazon Web Services side of the VPN connection performs an IKE rekey. The exact time
     * of the rekey is randomly selected based on the value for
     * RekeyFuzzPercentage.
     * Constraints: A value between 60 and half of Phase2LifetimeSeconds.
     * Default: 540
     */
    val rekeyMarginTimeSeconds: kotlin.Int? = builder.rekeyMarginTimeSeconds
    /**
     * The number of packets in an IKE replay window.
     * Constraints: A value between 64 and 2048.
     * Default: 1024
     */
    val replayWindowSize: kotlin.Int? = builder.replayWindowSize
    /**
     * The action to take when the establishing the tunnel for the VPN connection. By
     * default, your customer gateway device must initiate the IKE negotiation and bring up the
     * tunnel. Specify start for Amazon Web Services to initiate the IKE
     * negotiation.
     * Valid Values: add | start
     * Default: add
     */
    val startupAction: kotlin.String? = builder.startupAction
    /**
     * The range of inside IPv4 addresses for the tunnel. Any specified CIDR blocks must be
     * unique across all VPN connections that use the same virtual private gateway.
     * Constraints: A size /30 CIDR block from the 169.254.0.0/16 range. The
     * following CIDR blocks are reserved and cannot be used:
     * 169.254.0.0/30
     * 169.254.1.0/30
     * 169.254.2.0/30
     * 169.254.3.0/30
     * 169.254.4.0/30
     * 169.254.5.0/30
     * 169.254.169.252/30
     */
    val tunnelInsideCidr: kotlin.String? = builder.tunnelInsideCidr
    /**
     * The range of inside IPv6 addresses for the tunnel. Any specified CIDR blocks must be
     * unique across all VPN connections that use the same transit gateway.
     * Constraints: A size /126 CIDR block from the local fd00::/8 range.
     */
    val tunnelInsideIpv6Cidr: kotlin.String? = builder.tunnelInsideIpv6Cidr

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.ModifyVpnTunnelOptionsSpecification = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyVpnTunnelOptionsSpecification(")
        append("dpdTimeoutAction=$dpdTimeoutAction,")
        append("dpdTimeoutSeconds=$dpdTimeoutSeconds,")
        append("ikeVersions=$ikeVersions,")
        append("phase1DhGroupNumbers=$phase1DhGroupNumbers,")
        append("phase1EncryptionAlgorithms=$phase1EncryptionAlgorithms,")
        append("phase1IntegrityAlgorithms=$phase1IntegrityAlgorithms,")
        append("phase1LifetimeSeconds=$phase1LifetimeSeconds,")
        append("phase2DhGroupNumbers=$phase2DhGroupNumbers,")
        append("phase2EncryptionAlgorithms=$phase2EncryptionAlgorithms,")
        append("phase2IntegrityAlgorithms=$phase2IntegrityAlgorithms,")
        append("phase2LifetimeSeconds=$phase2LifetimeSeconds,")
        append("preSharedKey=$preSharedKey,")
        append("rekeyFuzzPercentage=$rekeyFuzzPercentage,")
        append("rekeyMarginTimeSeconds=$rekeyMarginTimeSeconds,")
        append("replayWindowSize=$replayWindowSize,")
        append("startupAction=$startupAction,")
        append("tunnelInsideCidr=$tunnelInsideCidr,")
        append("tunnelInsideIpv6Cidr=$tunnelInsideIpv6Cidr)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dpdTimeoutAction?.hashCode() ?: 0
        result = 31 * result + (dpdTimeoutSeconds ?: 0)
        result = 31 * result + (ikeVersions?.hashCode() ?: 0)
        result = 31 * result + (phase1DhGroupNumbers?.hashCode() ?: 0)
        result = 31 * result + (phase1EncryptionAlgorithms?.hashCode() ?: 0)
        result = 31 * result + (phase1IntegrityAlgorithms?.hashCode() ?: 0)
        result = 31 * result + (phase1LifetimeSeconds ?: 0)
        result = 31 * result + (phase2DhGroupNumbers?.hashCode() ?: 0)
        result = 31 * result + (phase2EncryptionAlgorithms?.hashCode() ?: 0)
        result = 31 * result + (phase2IntegrityAlgorithms?.hashCode() ?: 0)
        result = 31 * result + (phase2LifetimeSeconds ?: 0)
        result = 31 * result + (preSharedKey?.hashCode() ?: 0)
        result = 31 * result + (rekeyFuzzPercentage ?: 0)
        result = 31 * result + (rekeyMarginTimeSeconds ?: 0)
        result = 31 * result + (replayWindowSize ?: 0)
        result = 31 * result + (startupAction?.hashCode() ?: 0)
        result = 31 * result + (tunnelInsideCidr?.hashCode() ?: 0)
        result = 31 * result + (tunnelInsideIpv6Cidr?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as ModifyVpnTunnelOptionsSpecification

        if (dpdTimeoutAction != other.dpdTimeoutAction) return false
        if (dpdTimeoutSeconds != other.dpdTimeoutSeconds) return false
        if (ikeVersions != other.ikeVersions) return false
        if (phase1DhGroupNumbers != other.phase1DhGroupNumbers) return false
        if (phase1EncryptionAlgorithms != other.phase1EncryptionAlgorithms) return false
        if (phase1IntegrityAlgorithms != other.phase1IntegrityAlgorithms) return false
        if (phase1LifetimeSeconds != other.phase1LifetimeSeconds) return false
        if (phase2DhGroupNumbers != other.phase2DhGroupNumbers) return false
        if (phase2EncryptionAlgorithms != other.phase2EncryptionAlgorithms) return false
        if (phase2IntegrityAlgorithms != other.phase2IntegrityAlgorithms) return false
        if (phase2LifetimeSeconds != other.phase2LifetimeSeconds) return false
        if (preSharedKey != other.preSharedKey) return false
        if (rekeyFuzzPercentage != other.rekeyFuzzPercentage) return false
        if (rekeyMarginTimeSeconds != other.rekeyMarginTimeSeconds) return false
        if (replayWindowSize != other.replayWindowSize) return false
        if (startupAction != other.startupAction) return false
        if (tunnelInsideCidr != other.tunnelInsideCidr) return false
        if (tunnelInsideIpv6Cidr != other.tunnelInsideIpv6Cidr) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.ModifyVpnTunnelOptionsSpecification = Builder(this).apply(block).build()

    class Builder {
        /**
         * The action to take after DPD timeout occurs. Specify restart to restart
         * the IKE initiation. Specify clear to end the IKE session.
         * Valid Values: clear | none | restart
         * Default: clear
         */
        var dpdTimeoutAction: kotlin.String? = null
        /**
         * The number of seconds after which a DPD timeout occurs.
         * Constraints: A value between 0 and 30.
         * Default: 30
         */
        var dpdTimeoutSeconds: kotlin.Int? = null
        /**
         * The IKE versions that are permitted for the VPN tunnel.
         * Valid values: ikev1 | ikev2
         */
        var ikeVersions: List<IkeVersionsRequestListValue>? = null
        /**
         * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for
         * phase 1 IKE negotiations.
         * Valid values: 2 | 14 | 15 | 16 |
         * 17 | 18 | 19 | 20 |
         * 21 | 22 | 23 | 24
         */
        var phase1DhGroupNumbers: List<Phase1DhGroupNumbersRequestListValue>? = null
        /**
         * One or more encryption algorithms that are permitted for the VPN tunnel for phase 1
         * IKE negotiations.
         * Valid values: AES128 | AES256 | AES128-GCM-16 |
         * AES256-GCM-16
         */
        var phase1EncryptionAlgorithms: List<Phase1EncryptionAlgorithmsRequestListValue>? = null
        /**
         * One or more integrity algorithms that are permitted for the VPN tunnel for phase 1 IKE
         * negotiations.
         * Valid values: SHA1 | SHA2-256 | SHA2-384 |
         * SHA2-512
         */
        var phase1IntegrityAlgorithms: List<Phase1IntegrityAlgorithmsRequestListValue>? = null
        /**
         * The lifetime for phase 1 of the IKE negotiation, in seconds.
         * Constraints: A value between 900 and 28,800.
         * Default: 28800
         */
        var phase1LifetimeSeconds: kotlin.Int? = null
        /**
         * One or more Diffie-Hellman group numbers that are permitted for the VPN tunnel for
         * phase 2 IKE negotiations.
         * Valid values: 2 | 5 | 14 | 15 |
         * 16 | 17 | 18 | 19 |
         * 20 | 21 | 22 | 23 |
         * 24
         */
        var phase2DhGroupNumbers: List<Phase2DhGroupNumbersRequestListValue>? = null
        /**
         * One or more encryption algorithms that are permitted for the VPN tunnel for phase 2
         * IKE negotiations.
         * Valid values: AES128 | AES256 | AES128-GCM-16 |
         * AES256-GCM-16
         */
        var phase2EncryptionAlgorithms: List<Phase2EncryptionAlgorithmsRequestListValue>? = null
        /**
         * One or more integrity algorithms that are permitted for the VPN tunnel for phase 2 IKE
         * negotiations.
         * Valid values: SHA1 | SHA2-256 | SHA2-384 |
         * SHA2-512
         */
        var phase2IntegrityAlgorithms: List<Phase2IntegrityAlgorithmsRequestListValue>? = null
        /**
         * The lifetime for phase 2 of the IKE negotiation, in seconds.
         * Constraints: A value between 900 and 3,600. The value must be less than the value for
         * Phase1LifetimeSeconds.
         * Default: 3600
         */
        var phase2LifetimeSeconds: kotlin.Int? = null
        /**
         * The pre-shared key (PSK) to establish initial authentication between the virtual
         * private gateway and the customer gateway.
         * Constraints: Allowed characters are alphanumeric characters, periods (.), and
         * underscores (_). Must be between 8 and 64 characters in length and cannot start with
         * zero (0).
         */
        var preSharedKey: kotlin.String? = null
        /**
         * The percentage of the rekey window (determined by RekeyMarginTimeSeconds)
         * during which the rekey time is randomly selected.
         * Constraints: A value between 0 and 100.
         * Default: 100
         */
        var rekeyFuzzPercentage: kotlin.Int? = null
        /**
         * The margin time, in seconds, before the phase 2 lifetime expires, during which the
         * Amazon Web Services side of the VPN connection performs an IKE rekey. The exact time
         * of the rekey is randomly selected based on the value for
         * RekeyFuzzPercentage.
         * Constraints: A value between 60 and half of Phase2LifetimeSeconds.
         * Default: 540
         */
        var rekeyMarginTimeSeconds: kotlin.Int? = null
        /**
         * The number of packets in an IKE replay window.
         * Constraints: A value between 64 and 2048.
         * Default: 1024
         */
        var replayWindowSize: kotlin.Int? = null
        /**
         * The action to take when the establishing the tunnel for the VPN connection. By
         * default, your customer gateway device must initiate the IKE negotiation and bring up the
         * tunnel. Specify start for Amazon Web Services to initiate the IKE
         * negotiation.
         * Valid Values: add | start
         * Default: add
         */
        var startupAction: kotlin.String? = null
        /**
         * The range of inside IPv4 addresses for the tunnel. Any specified CIDR blocks must be
         * unique across all VPN connections that use the same virtual private gateway.
         * Constraints: A size /30 CIDR block from the 169.254.0.0/16 range. The
         * following CIDR blocks are reserved and cannot be used:
         * 169.254.0.0/30
         * 169.254.1.0/30
         * 169.254.2.0/30
         * 169.254.3.0/30
         * 169.254.4.0/30
         * 169.254.5.0/30
         * 169.254.169.252/30
         */
        var tunnelInsideCidr: kotlin.String? = null
        /**
         * The range of inside IPv6 addresses for the tunnel. Any specified CIDR blocks must be
         * unique across all VPN connections that use the same transit gateway.
         * Constraints: A size /126 CIDR block from the local fd00::/8 range.
         */
        var tunnelInsideIpv6Cidr: kotlin.String? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.ModifyVpnTunnelOptionsSpecification) : this() {
            this.dpdTimeoutAction = x.dpdTimeoutAction
            this.dpdTimeoutSeconds = x.dpdTimeoutSeconds
            this.ikeVersions = x.ikeVersions
            this.phase1DhGroupNumbers = x.phase1DhGroupNumbers
            this.phase1EncryptionAlgorithms = x.phase1EncryptionAlgorithms
            this.phase1IntegrityAlgorithms = x.phase1IntegrityAlgorithms
            this.phase1LifetimeSeconds = x.phase1LifetimeSeconds
            this.phase2DhGroupNumbers = x.phase2DhGroupNumbers
            this.phase2EncryptionAlgorithms = x.phase2EncryptionAlgorithms
            this.phase2IntegrityAlgorithms = x.phase2IntegrityAlgorithms
            this.phase2LifetimeSeconds = x.phase2LifetimeSeconds
            this.preSharedKey = x.preSharedKey
            this.rekeyFuzzPercentage = x.rekeyFuzzPercentage
            this.rekeyMarginTimeSeconds = x.rekeyMarginTimeSeconds
            this.replayWindowSize = x.replayWindowSize
            this.startupAction = x.startupAction
            this.tunnelInsideCidr = x.tunnelInsideCidr
            this.tunnelInsideIpv6Cidr = x.tunnelInsideIpv6Cidr
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.ModifyVpnTunnelOptionsSpecification = ModifyVpnTunnelOptionsSpecification(this)
    }
}
