package com.example.sportzinteractivedemo.module.home.model

data class MatchModel(
    val liveCoverage: String,
    val id: String,
    val code: String,
    val league: String,
    val number: String,
    val type: String,
    val date: String,
    val time: String,
    val offset: String,
    val dayNight: String
)
