package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class PlayersResponse(

    @SerializedName("Position") val position: String,
    @SerializedName("Name_Full") val nameFull: String,
    @SerializedName("Iscaptain") val IsCaptain: Boolean,
    @SerializedName("Iskeeper") val isKeeper: Boolean,
    @SerializedName("Batting") val batting: BattingResponse,
    @SerializedName("Bowling") val bowling: BowlingResponse

)
