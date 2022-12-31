package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class BattingResponse(

    @SerializedName("Style") val style : String,
    @SerializedName("Average") val average : String,
    @SerializedName("Strikerate") val strikeRate : String,
    @SerializedName("Runs") val runs : String

)
