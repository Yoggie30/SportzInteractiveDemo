package com.example.sportzinteractivedemo.data.remote

import com.example.sportzinteractivedemo.data.model.MatchDetailResponse
import com.example.sportzinteractivedemo.util.Constants
import retrofit2.Response
import retrofit2.http.GET

interface APIService {
    @GET(Constants.PATH_MATCH_DETAIL)
    suspend fun fetchMatchDetails(): Response<MatchDetailResponse>
}