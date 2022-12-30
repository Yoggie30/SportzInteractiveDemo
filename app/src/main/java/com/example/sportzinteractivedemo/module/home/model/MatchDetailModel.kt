package com.example.sportzinteractivedemo.module.home.model


data class MatchDetailModel(

    var matchdetail: MatchDetailDataModel? = MatchDetailDataModel(),
    var nuggets: ArrayList<String> = arrayListOf(),
    var innings: ArrayList<InningsModel> = arrayListOf(),
    var teams: TeamsModel? = TeamsModel(),
    var notes: NotesModel? = NotesModel()

)