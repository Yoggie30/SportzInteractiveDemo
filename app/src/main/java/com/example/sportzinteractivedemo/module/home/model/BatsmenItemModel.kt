package com.example.sportzinteractivedemo.module.home.model


data class BatsmenItemModel(

    val batsman: Int,
    val runs: Int,
    val balls: Int,
    val fours: Int,
    val sixes: Int,
    val dots: Int,
    val strikeRate: Double,
    val dismissal: String,
    val howOut: String,
    val bowler: Int,
    val fielder: Int

)
