package com.example.sportzinteractivedemo.data.remote


import com.example.sportzinteractivedemo.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import timber.log.Timber


object RetrofitInstance {
    private val retrofit = Retrofit.Builder()
        .baseUrl(Constants.HOST)
        .client(UnsafeOkHttpClient.getUnsafeOkHttpClient().build())
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    fun getAPIService(): APIService {
        Timber.e("URL--> ${retrofit.baseUrl()}${Constants.PATH_MATCH_DETAIL}")
        return retrofit.create(APIService::class.java)
    }


}