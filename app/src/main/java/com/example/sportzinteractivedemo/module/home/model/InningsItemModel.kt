package com.example.sportzinteractivedemo.module.home.model


data class InningsItemModel(

    var number: String? = null,
    var battingTeam: String? = null,
    var total: String? = null,
    var wickets: String? = null,
    var overs: String? = null,
    var runRate: String? = null,
    var byes: String? = null,
    var legByes: String? = null,
    var wides: String? = null,
    var noBalls: String? = null,
    var penalty: String? = null,
    var allottedOvers: String? = null,
    var batsmen: ArrayList<BatsmenModel> = arrayListOf(),
    var partnershipCurrent: PartnershipCurrentModel? = PartnershipCurrentModel(),
    var bowlers: ArrayList<BowlersModel> = arrayListOf(),
    var fallOfWickets: ArrayList<FallOfWicketsModel> = arrayListOf(),
    var powerPlay: PowerPlayModel? = PowerPlayModel()

)
