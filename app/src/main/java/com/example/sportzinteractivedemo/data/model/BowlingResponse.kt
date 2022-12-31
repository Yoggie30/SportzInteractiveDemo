package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class BowlingResponse(

    @SerializedName("Style") val style: String,
    @SerializedName("Average") val average: String,
    @SerializedName("Economyrate") val economyRate: String,
    @SerializedName("Wickets") val wickets: String

)
