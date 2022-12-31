package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName


data class MatchDetailDataResponse(

    @SerializedName("Team_Home") val teamHome : String,
    @SerializedName("Team_Away") val teamAway : String,
    @SerializedName("Match") val match : MatchResponse,
    @SerializedName("Series") val series : SeriesResponse,
    @SerializedName("Venue") val venue : VenueResponse,
    @SerializedName("Officials") val officials : OfficialsResponse,
    @SerializedName("Weather") val weather : String,
    @SerializedName("Tosswonby") val tossWonBy : String,
    @SerializedName("Status") val status : String,
    @SerializedName("Status_Id") val statusId : String,
    @SerializedName("Player_Match") val playerMatch : String,
    @SerializedName("Result") val result : String,
    @SerializedName("Winningteam") val winningTeam : String,
    @SerializedName("Winmargin") val winMargin : String,
    @SerializedName("Equation") val equation : String

)
