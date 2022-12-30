package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName


data class MatchResponse(

    @SerializedName("Livecoverage") var liveCoverage: String? = null,
    @SerializedName("Id") var id: String? = null,
    @SerializedName("Code") var code: String? = null,
    @SerializedName("League") var league: String? = null,
    @SerializedName("Number") var number: String? = null,
    @SerializedName("Type") var type: String? = null,
    @SerializedName("Date") var date: String? = null,
    @SerializedName("Time") var time: String? = null,
    @SerializedName("Offset") var offset: String? = null,
    @SerializedName("Daynight") var dayNight: String? = null

)
