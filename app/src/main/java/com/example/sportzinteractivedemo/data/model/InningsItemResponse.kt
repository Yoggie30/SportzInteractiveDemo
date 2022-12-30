package com.example.sportzinteractivedemo.data.model

import com.google.gson.annotations.SerializedName

data class InningsItemResponse(

    @SerializedName("Number") var number: String? = null,
    @SerializedName("Battingteam") var battingTeam: String? = null,
    @SerializedName("Total") var total: String? = null,
    @SerializedName("Wickets") var wickets: String? = null,
    @SerializedName("Overs") var overs: String? = null,
    @SerializedName("Runrate") var runRate: String? = null,
    @SerializedName("Byes") var byes: String? = null,
    @SerializedName("Legbyes") var legByes: String? = null,
    @SerializedName("Wides") var wides: String? = null,
    @SerializedName("Noballs") var noBalls: String? = null,
    @SerializedName("Penalty") var penalty: String? = null,
    @SerializedName("AllottedOvers") var allottedOvers: String? = null,
    @SerializedName("Batsmen") var batsmen: ArrayList<BatsmenResponse> = arrayListOf(),
    @SerializedName("Partnership_Current") var partnershipCurrent: PartnershipCurrentResponse? = PartnershipCurrentResponse(),
    @SerializedName("Bowlers") var bowlers: ArrayList<BowlersResponse> = arrayListOf(),
    @SerializedName("FallofWickets") var fallOfWickets: ArrayList<FallOfWicketsResponse> = arrayListOf(),
    @SerializedName("PowerPlay") var powerPlay: PowerPlayResponse? = PowerPlayResponse()

)
