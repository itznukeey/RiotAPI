package com.nvk.riotapitest.riot.dto

import com.google.gson.annotations.SerializedName

data class ParticipantDTO(
    @SerializedName("stats")
    val stats: ParticipantStatsDTO,

    @SerializedName("participantId")
    val participantId: Int,

    @SerializedName("runes")
    val runes: List<RuneDto>,

    @SerializedName("timeline")
    val timeline: ParticipantTimelineDTO,

    @SerializedName("teamId")
    val teamId: Int,

    @SerializedName("spell1Id")
    val spell1Id: Int,

    @SerializedName("spell2Id")
    val spell2Id: Int,

    @SerializedName("masteries")
    val masteries: List<MasteryDTO>,

    @SerializedName("highestAchievedSeasonTier")
    val highestAchievedSeasonTier: String,

    @SerializedName("championId")
    val championId: Int
    ) {

}
