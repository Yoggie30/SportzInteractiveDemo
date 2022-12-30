package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

class BatsmenCurrentItemResponse(

    @SerializedName("Batsman") val batsman: Int,
    @SerializedName("Runs") val runs: Int,
    @SerializedName("Balls") val balls: Int


)