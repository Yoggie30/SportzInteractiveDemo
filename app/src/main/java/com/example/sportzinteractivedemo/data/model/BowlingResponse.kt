package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class BowlingResponse(

    @SerializedName("Style") var style: String? = null,
    @SerializedName("Average") var average: String? = null,
    @SerializedName("Economyrate") var economyRate: String? = null,
    @SerializedName("Wickets") var wickets: String? = null

)
