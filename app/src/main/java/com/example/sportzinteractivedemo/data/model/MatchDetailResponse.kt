package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class MatchDetailResponse(

    @SerializedName("Matchdetail") var matchdetail: MatchDetailDataResponse?,
    @SerializedName("Nuggets") var nuggets: ArrayList<String> = arrayListOf(),
    @SerializedName("Innings") var innings: ArrayList<InningsResponse>? = arrayListOf(),
    @SerializedName("Teams") var teams: Map<String, TeamsResponse>,
    @SerializedName("Notes") var notes: Map<String, ArrayList<String>>

)