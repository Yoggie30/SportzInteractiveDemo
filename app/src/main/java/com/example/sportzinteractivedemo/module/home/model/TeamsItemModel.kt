package com.example.sportzinteractivedemo.module.home.model


data class TeamsItemModel(

    var nameFull: String? = null,
    var nameShort: String? = null,
    var players: PlayersModel? = PlayersModel()

)
