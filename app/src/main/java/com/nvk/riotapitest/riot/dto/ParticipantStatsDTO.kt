package com.nvk.riotapitest.riot.dto

import com.google.gson.annotations.SerializedName

class ParticipantStatsDTO(

    @SerializedName("firstBloodAssist")
    val firstBloodAssist: Boolean,

    @SerializedName("magicDamageDealtToChampions")
    val magicDamageDealtToChampions: Long,

    @SerializedName("damageDealtToObjectives")
    val damageDealtToObjectives: Long,

    @SerializedName("visionScore")
    val visionScore: Long,

    @SerializedName("totalTimeCrowdControlDealt")
    val totalTimeCrowdControlDealt: Int,

    @SerializedName("longestTimeSpentLiving")
    val longestTimeSpentLiving: Int,

    @SerializedName("tripleKills")
    val tripleKills: Int,

    @SerializedName("neutralMinionsKilled")
    val neutralMinionsKilled: Int,

    @SerializedName("damageDealtToTurrets")
    val damageDealtToTurrets: Long,

    @SerializedName("totalUnitsHealed")
    val totalUnitsHealed: Int,

    @SerializedName("wardsKilled")
    val wardsKilled: Int,

    @SerializedName("largestCriticalStrike")
    val largestCriticalStrike: Int,

    @SerializedName("largestKillingSpree")
    val largestKillingSpree: Int,

    @SerializedName("quadraKills")
    val quadraKills: Int,

    @SerializedName("magicDamageDealt")
    val magicDamageDealt: Long,

    @SerializedName("item0")
    val item0: Int,

    @SerializedName("item1")
    val item1: Int,

    @SerializedName("item2")
    val item2: Int,

    @SerializedName("item3")
    val item3: Int,

    @SerializedName("item4")
    val item4: Int,

    @SerializedName("item5")
    val item5: Int,

    @SerializedName("item6")
    val item6: Int,

    @SerializedName("perk0")
    val perk0: Int,

    @SerializedName("perk1")
    val perk1: Int,

    @SerializedName("perk2")
    val perk2: Int,

    @SerializedName("perk3")
    val perk3: Int,

    @SerializedName("perk4")
    val perk4: Int,

    @SerializedName("perk5")
    val perk5: Int,

    @SerializedName("damageSelfMitigated")
    val damageSelfMitigated: Long,

    @SerializedName("magicalDamageTaken")
    val magicalDamageTaken: Long,

    @SerializedName("firstInhibitorKill")
    val firstInhibitorKill: Boolean,

    @SerializedName("trueDamageTaken")
    val trueDamageTaken: Long,

    @SerializedName("assists")
    val assists: Int,

    @SerializedName("combatPlayerScore")
    val combatPlayerScore: Int,

    @SerializedName("perkPrimaryStyle")
    val perkPrimaryStyle: Int,

    @SerializedName("goldSpent")
    val goldSpent: Int,

    @SerializedName("trueDamageDealt")
    val trueDamageDealt: Long,

    @SerializedName("participantId")
    val participantId: Int,

    @SerializedName("totalDamageTaken")
    val totalDamageTaken: Long,

    @SerializedName("physicalDamageTaken")
    val physicalDamageTaken: Long,

    //# of pinks
    @SerializedName("sightWardsBoughtInGame")
    val sightWardsBoughtInGame: Int,

    @SerializedName("totalDamageDealtToChampions")
    val totalDamageDealtToChampions: Long,

    @SerializedName("totalPlayerScore")
    val totalPlayerScore: Int,

    @SerializedName("win")
    val win: Boolean,

    @SerializedName("objectivePlayerScore")
    val objectivePlayerScore: Int,

    @SerializedName("totalDamageDealt")
    val totalDamageDealt: Long,

    @SerializedName("neutralMinionsKilledEnemyJungle")
    val neutralMinionsKilledEnemyJungle: Int,

    @SerializedName("deaths")
    val deaths: Int,

    @SerializedName("wardsPlaced")
    val wardsPlaced: Int,

    @SerializedName("turretKills")
    val turretKills: Int,

    @SerializedName("firstBloodKill")
    val firstBloodKill: Int,

    @SerializedName("trueDamageDealtToChampions")
    val trueDamageDealtToChampions: Long,

    @SerializedName("goldEarned")
    val goldEarned: Int,

    @SerializedName("killingSprees")
    val killingSprees: Int,

    @SerializedName("firstTowerKill")
    val firstTowerKills: Boolean,

    @SerializedName("champLevel")
    val champLevel: Int,

    @SerializedName("doubleKills")
    val doubleKills: Int,

    @SerializedName("inhibitorKills")
    val inhibitorKills: Int,

    @SerializedName("pentaKills")
    val pentaKills: Int,

    @SerializedName("totalHeal")
    val totalHeal: Long,

    //CS
    @SerializedName("totalMinionsKilled")
    val totalMinionsKilled: Int,

    @SerializedName("timeCCingOthers")
    val timeCCingOthers: Long
) {

}
