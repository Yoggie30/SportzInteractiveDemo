package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName


data class PowerPlayResponse(

    @SerializedName("PP1") var PP1: String? = null,
    @SerializedName("PP2") var PP2: String? = null

)
