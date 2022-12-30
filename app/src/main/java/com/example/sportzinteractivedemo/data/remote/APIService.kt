package com.example.sportzinteractivedemo.data.remote

import com.example.sportzinteractivedemo.util.Constants
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

import retrofit2.http.GET
import timber.log.Timber

interface APIService {
    @GET(Constants.PATH_MATCH_DETAIL)
    fun fetchMatchDetails(): Call<ResponseBody>
}