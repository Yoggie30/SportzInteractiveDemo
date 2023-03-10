package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class TeamsResponse(

    @SerializedName("Name_Full") var nameFull: String? = null,
    @SerializedName("Name_Short") var nameShort: String? = null,
    @SerializedName("Players") var players:  Map<String, PlayersResponse>,

    )
