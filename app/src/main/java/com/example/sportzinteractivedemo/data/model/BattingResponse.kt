package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class BattingResponse(

    @SerializedName("Style") var style: String? = null,
    @SerializedName("Average") var average: String? = null,
    @SerializedName("Strikerate") var strikerate: String? = null,
    @SerializedName("Runs") var runs: String? = null

)
