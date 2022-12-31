package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class FallOfWicketsResponse(

    @SerializedName("Batsman") val batsman : String,
    @SerializedName("Score") val score : String,
    @SerializedName("Overs") val overs : String

)
