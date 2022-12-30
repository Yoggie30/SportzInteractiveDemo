package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName


data class OfficialsResponse(

    @SerializedName("Umpires") var umpires: String? = null,
    @SerializedName("Referee") var referee: String? = null

)
