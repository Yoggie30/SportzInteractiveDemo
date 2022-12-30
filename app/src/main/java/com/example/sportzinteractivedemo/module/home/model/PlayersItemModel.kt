package com.example.sportzinteractivedemo.module.home.model

data class PlayersItemModel(

    var position: String? = null,
    var nameFull: String? = null,
    var isKeeper: Boolean? = null,
    var batting: BattingModel? = BattingModel(),
    var bowling: BowlingModel? = BowlingModel()

)
