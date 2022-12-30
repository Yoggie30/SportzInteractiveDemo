package com.example.sportzinteractivedemo.module.home.model


data class MatchDetailDataModel(

    val teamHome: Int,
    val teamAway: Int,
    val match: MatchModel,
    val series: SeriesModel,
    val venue: VenueModel,
    val officials: OfficialsModel,
    val weather: String,
    val tossWonBy: Int,
    val status: String,
    val statusId: Int,
    val playerMatch: String,
    val result: String,
    val winningTeam: Int,
    val winMargin: String,
    val equation: String

)
