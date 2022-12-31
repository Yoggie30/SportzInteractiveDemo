package com.example.sportzinteractivedemo.module.home.model

data class InningsModel(
    val number: String,
    val battingTeam: String,
    val total: String,
    val wickets: String,
    val overs: String,
    val runRate: String,
    val byes: String,
    val legByes: String,
    val wides: String,
    val noBalls: String,
    val penalty: String,
    val allottedOvers: String,
    var batsmen: ArrayList<BatsmenModel> = arrayListOf(),
    var partnershipCurrent: PartnershipCurrentModel? = PartnershipCurrentModel(),
    var bowlers: ArrayList<BowlersModel> = arrayListOf(),
    var fallOfWickets: ArrayList<FallOfWicketsModel> = arrayListOf(),
    var powerPlay: PowerPlayModel? = PowerPlayModel()
)
