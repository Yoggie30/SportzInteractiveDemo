package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName


data class MatchDetailDataResponse(

    @SerializedName("Team_Home") var teamHome: Int? = null,
    @SerializedName("Team_Away") var teamAway: Int? = null,
    @SerializedName("Match") var match: MatchResponse? = MatchResponse(),
    @SerializedName("Series") var series: SeriesResponse? = SeriesResponse(),
    @SerializedName("Venue") var venue: VenueResponse? = VenueResponse(),
    @SerializedName("Officials") var officials: OfficialsResponse? = OfficialsResponse(),
    @SerializedName("Weather") var weather: String? = null,
    @SerializedName("Tosswonby") var tossWonBy: String? = null,
    @SerializedName("Status") var status: String? = null,
    @SerializedName("Status_Id") var statusId: String? = null,
    @SerializedName("Player_Match") var playerMatch: String? = null,
    @SerializedName("Result") var result: String? = null,
    @SerializedName("Winningteam") var winningTeam: String? = null,
    @SerializedName("Winmargin") var winMargin: String? = null,
    @SerializedName("Equation") var equation: String? = null

)
