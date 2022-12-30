package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName


data class MatchResponse(

    @SerializedName("Livecoverage") val liveCoverage : String,
    @SerializedName("Id") val id : Int,
    @SerializedName("Code") val code : String,
    @SerializedName("League") val league : String,
    @SerializedName("Number") val number : String,
    @SerializedName("Type") val type : String,
    @SerializedName("Date") val date : String,
    @SerializedName("Time") val time : String,
    @SerializedName("Offset") val offset : String,
    @SerializedName("Daynight") val dayNight : String

)


