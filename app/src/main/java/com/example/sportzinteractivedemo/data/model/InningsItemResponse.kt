package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class InningsItemResponse(

    @SerializedName("Number") val number: String,
    @SerializedName("Battingteam") val battingTeam: Int,
    @SerializedName("Total") val total: Int,
    @SerializedName("Wickets") val wickets: Int,
    @SerializedName("Overs") val overs: Double,
    @SerializedName("Runrate") val runRate: Double,
    @SerializedName("Byes") val byes: Int,
    @SerializedName("Legbyes") val legByes: Int,
    @SerializedName("Wides") val wides: Int,
    @SerializedName("Noballs") val noBalls: Int,
    @SerializedName("Penalty") val penalty: Int,
    @SerializedName("AllottedOvers") val allottedOvers: Int,
    @SerializedName("Batsmen") val batsmen: List<BatsmenResponse>,
    @SerializedName("Partnership_Current") val partnershipCurrent: PartnershipCurrentResponse,
    @SerializedName("Bowlers") val bowlers: List<BowlersResponse>,
    @SerializedName("FallofWickets") val fallOfWickets: List<FallOfWicketsResponse>,
    @SerializedName("PowerPlay") val powerPlay: PowerPlayResponse

)
