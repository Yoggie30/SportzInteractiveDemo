package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName


data class PowerPlayResponse(

    @SerializedName("PP1") val pP1 : String,
    @SerializedName("PP2") val pP2 : String

)
