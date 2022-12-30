package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

class BatsmenCurrentItemResponse(

    @SerializedName("Batsman") var batsman: String? = null,
    @SerializedName("Runs") var runs: String? = null,
    @SerializedName("Balls") var balls: String? = null

)