package com.example.sportzinteractivedemo.module.home.model


data class MatchDetailDataModel(

    val teamHome: String,
    val teamAway: String,
    val match: MatchModel,
    val series: SeriesModel,
    val venue: VenueModel,
    val officials: OfficialsModel,
    val weather: String,
    val tossWonBy: String,
    val status: String,
    val statusId: String,
    val playerMatch: String,
    val result: String,
    val winningTeam: String,
    val winMargin: String,
    val equation: String

)
