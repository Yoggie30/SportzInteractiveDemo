package com.example.sportzinteractivedemo.module.home.model

data class InningsItemModel(

    val number: String,
    val battingTeam: Int,
    val total: Int,
    val wickets: Int,
    val overs: Double,
    val runRate: Double,
    val byes: Int,
    val legByes: Int,
    val wides: Int,
    val noBalls: Int,
    val penalty: Int,
    val allottedOvers: Int,
    var batsmen: ArrayList<BatsmenModel> = arrayListOf(),
    var partnershipCurrent: PartnershipCurrentModel? = PartnershipCurrentModel(),
    var bowlers: ArrayList<BowlersModel> = arrayListOf(),
    var fallOfWickets: ArrayList<FallOfWicketsModel> = arrayListOf(),
    var powerPlay: PowerPlayModel? = PowerPlayModel()


)
