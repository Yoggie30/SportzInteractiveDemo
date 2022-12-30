package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class BowlersItemResponse(

    @SerializedName("Bowler") val bowler: Int,
    @SerializedName("Overs") val overs: Int,
    @SerializedName("Maidens") val maidens: Int,
    @SerializedName("Runs") val runs: Int,
    @SerializedName("Wickets") val wickets: Int,
    @SerializedName("Economyrate") val economyRate: Double,
    @SerializedName("Noballs") val noBalls: Int,
    @SerializedName("Wides") val wides: Int,
    @SerializedName("Dots") val dots: Int

)
