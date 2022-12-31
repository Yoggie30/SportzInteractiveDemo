package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class InningsResponse(

    @SerializedName("Number") val number: String,
    @SerializedName("Battingteam") val battingTeam: String,
    @SerializedName("Total") val total: String,
    @SerializedName("Wickets") val wickets: String,
    @SerializedName("Overs") val overs: String,
    @SerializedName("Runrate") val runRate: String,
    @SerializedName("Byes") val byes: String,
    @SerializedName("Legbyes") val legByes: String,
    @SerializedName("Wides") val wides: String,
    @SerializedName("Noballs") val noBalls: String,
    @SerializedName("Penalty") val penalty: String,
    @SerializedName("AllottedOvers") val allottedOvers: String,
    @SerializedName("Batsmen") val batsmen: ArrayList<BatsmenResponse>,
    @SerializedName("Partnership_Current") val partnershipCurrent: PartnershipCurrentResponse,
    @SerializedName("Bowlers") val bowlers: ArrayList<BowlersResponse>,
    @SerializedName("FallofWickets") val fallOfWickets: ArrayList<FallOfWicketsResponse>,
    @SerializedName("PowerPlay") val powerPlay: PowerPlayResponse

)
