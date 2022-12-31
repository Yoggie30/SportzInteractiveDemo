package com.example.sportzinteractivedemo.module.home.model


data class PlayersModel(
    val position: String,
    val nameFull: String,
    val IsCaptain: Boolean,
    val isKeeper: Boolean,
    val batting: BattingModel,
    val bowling: BowlingModel
)
