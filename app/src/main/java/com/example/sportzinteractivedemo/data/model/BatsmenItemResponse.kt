package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class BatsmenItemResponse(

    @SerializedName("Batsman") val batsman: Int,
    @SerializedName("Runs") val runs: Int,
    @SerializedName("Balls") val balls: Int,
    @SerializedName("Fours") val fours: Int,
    @SerializedName("Sixes") val sixes: Int,
    @SerializedName("Dots") val dots: Int,
    @SerializedName("Strikerate") val strikeRate: Double,
    @SerializedName("Dismissal") val dismissal: String,
    @SerializedName("Howout") val howOut: String,
    @SerializedName("Bowler") val bowler: Int,
    @SerializedName("Fielder") val fielder: Int

)
