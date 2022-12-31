package com.example.sportzinteractivedemo.module.home.model


data class PartnershipCurrentModel(
    var runs: String? = null,
    var balls: String? = null,
    var batsmen: ArrayList<BatsmenCurrentModel> = arrayListOf()
)
