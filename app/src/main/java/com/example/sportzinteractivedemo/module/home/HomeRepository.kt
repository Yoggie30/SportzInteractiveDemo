package com.example.sportzinteractivedemo.module.home

import androidx.lifecycle.MutableLiveData
import com.example.sportzinteractivedemo.base.BaseRepository
import com.example.sportzinteractivedemo.data.mapper.assembleMatchDetailResponse
import com.example.sportzinteractivedemo.data.remote.RetrofitInstance
import com.example.sportzinteractivedemo.module.home.model.MatchDetailModel
import com.example.sportzinteractivedemo.util.NetworkHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber
import javax.inject.Inject

class HomeRepository @Inject constructor(
    private val networkHelper: NetworkHelper,
    private val apiHelper: RetrofitInstance
) : BaseRepository() {

    suspend fun fetchMatchDetails(): MutableLiveData<List<MatchDetailModel>> {
        return withContext(Dispatchers.IO) {
            val responseModel = MutableLiveData<List<MatchDetailModel>>()
            if (networkHelper.isNetworkConnected()) {
                val response = apiHelper.getAPIService().fetchMatchDetails().enqueue(object :
                    Callback<ResponseBody> {

                    override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                        Timber.e("onFailure--> ${t.message}")
                    }

                    override fun onResponse(
                        call: Call<ResponseBody>,
                        response: Response<ResponseBody>
                    ) {
                        val responseString = response.body()?.string() ?: ""
                        assembleMatchDetailResponse(responseString)
                    }
                })
                Timber.e("response --> $response}")
            } else {
                throw Exception("No Internet Connection")
            }
            responseModel
        }
    }

}