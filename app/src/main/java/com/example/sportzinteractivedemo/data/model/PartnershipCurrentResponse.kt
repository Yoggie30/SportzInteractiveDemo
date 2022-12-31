package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName


data class PartnershipCurrentResponse(

    @SerializedName("Runs") val runs: String,
    @SerializedName("Balls") val balls: String,
    @SerializedName("Batsmen") val batsmen: ArrayList<BatsmenCurrentResponse> = arrayListOf()

)
