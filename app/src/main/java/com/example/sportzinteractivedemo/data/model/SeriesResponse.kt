package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName


data class SeriesResponse(

    @SerializedName("Id") var id: String? = null,
    @SerializedName("Name") var name: String? = null,
    @SerializedName("Status") var status: String? = null,
    @SerializedName("Tour") var tour: String? = null,
    @SerializedName("Tour_Name") var tourName: String? = null

)
