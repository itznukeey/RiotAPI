package com.nvk.riotapitest.riot.dto

import com.google.gson.annotations.SerializedName

data class MasteryDTO(
    @SerializedName("masteryId")
    val masteryId: Int,

    @SerializedName("rank")
    val rank: Int
) {

}
