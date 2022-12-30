package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class BowlingResponse(

    @SerializedName("Style") val style: String,
    @SerializedName("Average") val average: Double,
    @SerializedName("Economyrate") val economyRate: Double,
    @SerializedName("Wickets") val wickets: Int

)
