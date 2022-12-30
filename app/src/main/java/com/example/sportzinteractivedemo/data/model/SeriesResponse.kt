package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName


data class SeriesResponse(

    @SerializedName("Id") val id : Int,
    @SerializedName("Name") val name : String,
    @SerializedName("Status") val status : String,
    @SerializedName("Tour") val tour : Int,
    @SerializedName("Tour_Name") val tourName : String

)
