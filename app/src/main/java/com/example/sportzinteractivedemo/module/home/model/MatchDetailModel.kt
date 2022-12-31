package com.example.sportzinteractivedemo.module.home.model


data class MatchDetailModel(
    var matchDetail: MatchDetailDataModel?,
    var nuggets: ArrayList<String> = arrayListOf(),
    var innings: ArrayList<InningsModel> = arrayListOf(),
    var teams: HashMap<String,TeamsModel>,
    var notes: HashMap<String, ArrayList<String>>
)