package com.example.sportzinteractivedemo.module.home.model


data class PartnershipCurrentModel(

    var runs: Int? = null,
    var balls: Int? = null,
    var batsmen: ArrayList<BatsmenCurrentModel> = arrayListOf()

)
