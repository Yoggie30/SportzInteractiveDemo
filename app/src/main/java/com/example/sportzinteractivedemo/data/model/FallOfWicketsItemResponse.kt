package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class FallOfWicketsItemResponse(

    @SerializedName("Batsman") var batsman: String? = null,
    @SerializedName("Score") var score: String? = null,
    @SerializedName("Overs") var overs: String? = null

)
