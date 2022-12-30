package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class BowlersItemResponse(

    @SerializedName("Bowler") var bowler: String? = null,
    @SerializedName("Overs") var overs: String? = null,
    @SerializedName("Maidens") var maidens: String? = null,
    @SerializedName("Runs") var runs: String? = null,
    @SerializedName("Wickets") var wickets: String? = null,
    @SerializedName("Economyrate") var economyRate: String? = null,
    @SerializedName("Noballs") var noBalls: String? = null,
    @SerializedName("Wides") var wides: String? = null,
    @SerializedName("Dots") var dots: String? = null

)
