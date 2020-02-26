package com.nvk.riotapitest.riot.dto

import com.google.gson.annotations.SerializedName

data class RuneDto(
    @SerializedName("runeId")
    val runeId: Int,

    @SerializedName("rank")
    val rank: Int
) {

}
