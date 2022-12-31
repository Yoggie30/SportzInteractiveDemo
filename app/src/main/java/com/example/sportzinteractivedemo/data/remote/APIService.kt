package com.example.sportzinteractivedemo.data.remote

import com.example.sportzinteractivedemo.data.model.MatchDetailResponse
import com.example.sportzinteractivedemo.util.Constants
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

import retrofit2.http.GET
import timber.log.Timber

interface APIService {
    @GET(Constants.PATH_MATCH_DETAIL)
    suspend fun fetchMatchDetails(): Response<MatchDetailResponse>
    //fun fetchMatchDetails(): Call<ResponseBody>
}