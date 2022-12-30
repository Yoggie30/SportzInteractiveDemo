package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class FallOfWicketsItemResponse(

    @SerializedName("Batsman") val batsman : Int,
    @SerializedName("Score") val score : Int,
    @SerializedName("Overs") val overs : Double

)
