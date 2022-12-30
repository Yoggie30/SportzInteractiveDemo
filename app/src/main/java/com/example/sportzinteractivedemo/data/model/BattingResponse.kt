package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class BattingResponse(

    @SerializedName("Style") val style : String,
    @SerializedName("Average") val average : Double,
    @SerializedName("Strikerate") val strikeRate : Double,
    @SerializedName("Runs") val runs : Int

)
