package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class BatsmenItemResponse(

    @SerializedName("Batsman") var batsman: String? = null,
    @SerializedName("Runs") var runs: String? = null,
    @SerializedName("Balls") var balls: String? = null,
    @SerializedName("Fours") var fours: String? = null,
    @SerializedName("Sixes") var sixes: String? = null,
    @SerializedName("Dots") var dots: String? = null,
    @SerializedName("Strikerate") var strikeRate: String? = null,
    @SerializedName("Dismissal") var dismissal: String? = null,
    @SerializedName("Howout") var howOut: String? = null,
    @SerializedName("Bowler") var bowler: String? = null,
    @SerializedName("Fielder") var fielder: String? = null

)
