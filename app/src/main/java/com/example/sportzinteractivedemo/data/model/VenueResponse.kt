package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName


data class VenueResponse(

    @SerializedName("Id") var id: String? = null,
    @SerializedName("Name") var name: String? = null

)
