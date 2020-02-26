package com.nvk.riotapitest.riot.dto

import com.google.gson.annotations.SerializedName

/**
 * Reprezentace jedne hry
 */
data class MatchDTO(

    @SerializedName("seasonId")
    val seasonId: Int,

    @SerializedName("queueId")
    val queueId: Int,

    @SerializedName("gameId")
    val gameId: Long,

    @SerializedName("gameVersion")
    val gameVersion: String,

    @SerializedName("platformId")
    val platformId: String,

    @SerializedName("gameMode")
    val gameMode: String,

    @SerializedName("gameType")
    val gameType: String,

    @SerializedName("teams")
    val teams: List<TeamStatsDTO>,

    @SerializedName("participants")
    val participants: List<ParticipantDTO>,

    @SerializedName("gameDuration")
    val gameDuration: Long,

    @SerializedName("gameCreation")
    val gameCreation: Long
) {

}