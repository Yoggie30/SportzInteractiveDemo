package com.example.sportzinteractivedemo.module.home.model


data class PlayersItemModel(

    val position: Int,
    val nameFull: String,
    val isKeeper: Boolean,
    val batting: BattingModel,
    val bowling: BowlingModel

)
