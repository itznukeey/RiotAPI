package com.nvk.riotapitest.riot.dto

import java.time.LocalDateTime

data class SummonerDTO(
    val name: String,
    val summonerLevel: Long,
    val accountId: String,
    val profileIconId: Int,
    val revisionDate: LocalDateTime
) {

}