package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class PlayersItemResponse(

    @SerializedName("Position"  ) var position : String?  = null,
    @SerializedName("Name_Full" ) var nameFull : String?  = null,
    @SerializedName("Iskeeper"  ) var isKeeper : Boolean? = null,
    @SerializedName("Batting"   ) var batting  : BattingResponse? = BattingResponse(),
    @SerializedName("Bowling"   ) var bowling  : BowlingResponse? = BowlingResponse()

)
