package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName


data class OfficialsResponse(

    @SerializedName("Umpires") val umpires : String,
    @SerializedName("Referee") val referee : String

)
