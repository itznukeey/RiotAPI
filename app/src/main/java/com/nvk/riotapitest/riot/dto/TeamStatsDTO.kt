package com.nvk.riotapitest.riot.dto

import com.google.gson.annotations.SerializedName

class TeamStatsDTO(

    @SerializedName("firstDragon")
    val firstDragon: Boolean,

    @SerializedName("firstInhibitor")
    val firstInhibitor: Boolean,

    @SerializedName("bans")
    val bans: List<TeamBansDTO>,

    @SerializedName("baronKills")
    val baronKills: Int,

    @SerializedName("firstRiftHerald")
    val firstRiftHerald: Boolean,

    @SerializedName("firstBaron")
    val firstBaron: Boolean,

    @SerializedName("riftHeraldKills")
    val riftHeraldKills: Int,

    @SerializedName("firstBlood")
    val firstBlood: Boolean,

    @SerializedName("teamId")
    val teamId: Int,

    @SerializedName("firstTower")
    val firstTower: Boolean,

    @SerializedName("vilemawKills")
    val vileMawKills: Int,

    @SerializedName("inhibitorKills")
    val inhibitorKills: Int,

    @SerializedName("towerKills")
    val towerKills: Int,

    @SerializedName("dominionVictoryScore")
    val dominionVictoryScore: Int,

    @SerializedName("win")
    val win: String,

    @SerializedName("dragonkills")
    val dragonKills: Int
) {

}
