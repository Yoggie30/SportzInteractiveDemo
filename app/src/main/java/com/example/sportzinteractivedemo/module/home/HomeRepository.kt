package com.example.sportzinteractivedemo.module.home

import androidx.lifecycle.MutableLiveData
import com.example.sportzinteractivedemo.base.BaseRepository
import com.example.sportzinteractivedemo.data.remote.RetrofitInstance
import com.example.sportzinteractivedemo.module.home.model.MatchDetailModel
import com.example.sportzinteractivedemo.util.NetworkHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
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
                val response = apiHelper.getAPIService().fetchMatchDetails()
                Timber.e("response headers--> ${response.headers()}")
                if (response.isSuccessful) {
                    val result = response.body()
                    Timber.e("response--> $result")
                    /*result?.let {
                        if (result.status) {
                            responseModel.postValue(result.data.platforms)
                        }
                    }*/
                } else {
                    throw Exception(errorHandling(response.code().toString()))
                }
            } else {
                throw Exception("No Internet Connection")
            }
            responseModel
        }
    }

}