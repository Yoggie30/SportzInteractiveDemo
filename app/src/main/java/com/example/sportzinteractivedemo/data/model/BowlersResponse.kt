package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class BowlersResponse(

    @SerializedName("Bowler") val bowler: String,
    @SerializedName("Overs") val overs: String,
    @SerializedName("Maidens") val maidens: String,
    @SerializedName("Runs") val runs: String,
    @SerializedName("Wickets") val wickets: String,
    @SerializedName("Economyrate") val economyRate: String,
    @SerializedName("Noballs") val noBalls: String,
    @SerializedName("Wides") val wides: String,
    @SerializedName("Dots") val dots: String

)
