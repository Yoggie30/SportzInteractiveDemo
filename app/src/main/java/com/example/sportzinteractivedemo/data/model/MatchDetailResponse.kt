package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class MatchDetailResponse(

    @SerializedName("Matchdetail") var matchdetail: MatchDetailDataResponse? = MatchDetailDataResponse(),
    @SerializedName("Nuggets") var nuggets: ArrayList<String> = arrayListOf(),
    @SerializedName("Innings") var innings: ArrayList<HashMap<Int, InningsItemResponse>>? = arrayListOf(),
    @SerializedName("Teams") var teams: ArrayList<HashMap<Int, TeamsItemResponse>>? = arrayListOf(),
    @SerializedName("Notes") var notes: ArrayList<HashMap<Int, ArrayList<String>>>? = arrayListOf()

)