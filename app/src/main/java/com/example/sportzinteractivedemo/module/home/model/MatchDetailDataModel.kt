package com.example.sportzinteractivedemo.module.home.model


data class MatchDetailDataModel(

    var teamHome: String? = null,
    var teamAway: String? = null,
    var match: MatchModel? = MatchModel(),
    var series: SeriesModel? = SeriesModel(),
    var venue: VenueModel? = VenueModel(),
    var officials: OfficialsModel? = OfficialsModel(),
    var weather: String? = null,
    var tossWonBy: String? = null,
    var status: String? = null,
    var statusId: String? = null,
    var playerMatch: String? = null,
    var result: String? = null,
    var winningTeam: String? = null,
    var winMargin: String? = null,
    var equation: String? = null

)
