package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

class BatsmenCurrentResponse(

    @SerializedName("Batsman") val batsman: String,
    @SerializedName("Runs") val runs: String,
    @SerializedName("Balls") val balls: String


)