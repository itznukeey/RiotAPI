package com.nvk.riotapitest.riot.dto

/**
 * Reprezentace zapasu ve hre
 */
data class MatchDTO(

    val seasonId: Int,
    val queueId: Int,
    val gameId: Long,
    val gameVersion: String,
    val platformId: String,
    val gameMode: String,

    ) {

}