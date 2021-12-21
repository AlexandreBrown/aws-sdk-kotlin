// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class GetSpotPlacementScoresResponse private constructor(builder: Builder) {
    /**
     * The token for the next set of results.
     */
    val nextToken: kotlin.String? = builder.nextToken
    /**
     * The Spot placement score for the top 10 Regions or Availability Zones, scored on a scale
     * from 1 to 10. Each score  reflects how likely it is that each Region or Availability Zone
     * will succeed at fulfilling the specified target capacity  at the time of the Spot
     * placement score request. A score of 10 means that your Spot
     * capacity request is highly likely to succeed in that Region or Availability Zone.
     * If you request a Spot placement score for Regions, a high score assumes that your fleet
     * request will be configured to use all Availability Zones and the
     * capacity-optimized allocation strategy. If you request a Spot placement
     * score for Availability Zones, a high score assumes that your fleet request will be
     * configured to use a single Availability Zone and the capacity-optimized
     * allocation strategy.
     * Different  Regions or Availability Zones might return the same score.
     * The Spot placement score serves as a recommendation only. No score guarantees that your
     * Spot request will be fully or partially fulfilled.
     */
    val spotPlacementScores: List<SpotPlacementScore>? = builder.spotPlacementScores

    companion object {
        operator fun invoke(block: Builder.() -> kotlin.Unit): aws.sdk.kotlin.services.ec2.model.GetSpotPlacementScoresResponse = Builder().apply(block).build()
    }

    override fun toString(): kotlin.String = buildString {
        append("GetSpotPlacementScoresResponse(")
        append("nextToken=$nextToken,")
        append("spotPlacementScores=$spotPlacementScores)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (spotPlacementScores?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as GetSpotPlacementScoresResponse

        if (nextToken != other.nextToken) return false
        if (spotPlacementScores != other.spotPlacementScores) return false

        return true
    }

    inline fun copy(block: Builder.() -> kotlin.Unit = {}): aws.sdk.kotlin.services.ec2.model.GetSpotPlacementScoresResponse = Builder(this).apply(block).build()

    class Builder {
        /**
         * The token for the next set of results.
         */
        var nextToken: kotlin.String? = null
        /**
         * The Spot placement score for the top 10 Regions or Availability Zones, scored on a scale
         * from 1 to 10. Each score  reflects how likely it is that each Region or Availability Zone
         * will succeed at fulfilling the specified target capacity  at the time of the Spot
         * placement score request. A score of 10 means that your Spot
         * capacity request is highly likely to succeed in that Region or Availability Zone.
         * If you request a Spot placement score for Regions, a high score assumes that your fleet
         * request will be configured to use all Availability Zones and the
         * capacity-optimized allocation strategy. If you request a Spot placement
         * score for Availability Zones, a high score assumes that your fleet request will be
         * configured to use a single Availability Zone and the capacity-optimized
         * allocation strategy.
         * Different  Regions or Availability Zones might return the same score.
         * The Spot placement score serves as a recommendation only. No score guarantees that your
         * Spot request will be fully or partially fulfilled.
         */
        var spotPlacementScores: List<SpotPlacementScore>? = null

        internal constructor()
        @PublishedApi
        internal constructor(x: aws.sdk.kotlin.services.ec2.model.GetSpotPlacementScoresResponse) : this() {
            this.nextToken = x.nextToken
            this.spotPlacementScores = x.spotPlacementScores
        }

        @PublishedApi
        internal fun build(): aws.sdk.kotlin.services.ec2.model.GetSpotPlacementScoresResponse = GetSpotPlacementScoresResponse(this)
    }
}