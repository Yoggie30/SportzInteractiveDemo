package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class PlayersItemResponse(

    @SerializedName("Position") val position: Int,
    @SerializedName("Name_Full") val nameFull: String,
    @SerializedName("Iskeeper") val isKeeper: Boolean,
    @SerializedName("Batting") val batting: BattingResponse,
    @SerializedName("Bowling") val bowling: BowlingResponse

)
