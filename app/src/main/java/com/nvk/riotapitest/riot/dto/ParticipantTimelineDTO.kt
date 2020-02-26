package com.nvk.riotapitest.riot.dto

import com.google.gson.annotations.SerializedName

class ParticipantTimelineDTO(
    // (Legal values: MID, MIDDLE, TOP, JUNGLE, BOT, BOTTOM)
    @SerializedName("lane")
    val lane: String,

    @SerializedName("participantId")
    val participantId: Int,

    @SerializedName("csDiffPerMinDeltas")
    val csDiffPerMinDeltas: Map<String, Double>,

    @SerializedName("goldPerMinDeltas")
    val goldPerMinDeltas: Map<String, Double>,

    @SerializedName("xpDiffPerMinDeltas")
    val xpDiffPerMinDeltas: Map<String, Double>,

    @SerializedName("creepsPerMinDeltas")
    val creepsPerMinDeltas: Map<String, Double>,

    @SerializedName("xpPerMinDeltas")
    val xpPerMinDeltas: Map<String, Double>,

    // (Legal values: DUO, NONE, SOLO, DUO_CARRY, DUO_SUPPORT)
    @SerializedName("role")
    val role: String,

    @SerializedName("damageTakenDiffPerMinDeltas")
    val damageTakenDiffPerMinDeltas: Map<String, Double>,

    @SerializedName("damageTakenPerMinDeltas")
    val damageTakenPerMinDeltas: Map<String, Double>

) {

}
