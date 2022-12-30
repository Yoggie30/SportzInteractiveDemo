package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName


data class VenueResponse(

    @SerializedName("Id") val id : Int,
    @SerializedName("Name") val name : String

)
