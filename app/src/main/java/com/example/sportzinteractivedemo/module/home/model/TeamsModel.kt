package com.example.sportzinteractivedemo.module.home.model


data class TeamsModel(
    var nameFull: String? = null,
    var nameShort: String? = null,
    var players: HashMap<String, PlayersModel>,
)
