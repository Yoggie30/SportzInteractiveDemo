package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName


data class PartnershipCurrentResponse(

    @SerializedName("Runs") var runs: String? = null,
    @SerializedName("Balls") var balls: String? = null,
    @SerializedName("Batsmen") var batsmen: ArrayList<BatsmenCurrentResponse> = arrayListOf()

)
