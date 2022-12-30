package com.example.sportzinteractivedemo.data.remote


import com.example.sportzinteractivedemo.util.Constants
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
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
        return retrofit.create(APIService::class.java)
    }

    fun getMatchDetailsResponse(): Response<ResponseBody>? {
        Timber.e("URL--> ${retrofit.baseUrl()}${Constants.PATH_MATCH_DETAIL}")
        var responseString = ""
        var result: Response<ResponseBody>? = null
        getAPIService().fetchMatchDetails().enqueue(object : Callback<ResponseBody> {
            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                Timber.e("onFailure--> ${t.message}")
            }

            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                result = response
                Timber.e("onResponse result--> $result")
                responseString = response.body()?.string() ?: ""
            }
        })
        return result
    }


}