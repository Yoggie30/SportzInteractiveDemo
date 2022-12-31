package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class BatsmenResponse(

    @SerializedName("Batsman") val batsman: String,
    @SerializedName("Runs") val runs: String,
    @SerializedName("Balls") val balls: String,
    @SerializedName("Fours") val fours: String,
    @SerializedName("Sixes") val sixes: String,
    @SerializedName("Dots") val dots: String,
    @SerializedName("Strikerate") val strikeRate: String,
    @SerializedName("Dismissal") val dismissal: String,
    @SerializedName("Howout") val howOut: String,
    @SerializedName("Bowler") val bowler: String,
    @SerializedName("Fielder") val fielder: String

)
