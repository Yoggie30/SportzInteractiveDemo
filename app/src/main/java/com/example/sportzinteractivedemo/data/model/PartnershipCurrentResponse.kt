package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName


data class PartnershipCurrentResponse(

    @SerializedName("Runs") val runs: Int,
    @SerializedName("Balls") val balls: Int,
    @SerializedName("Batsmen") val batsmen: List<BatsmenCurrentResponse> = arrayListOf()

)
