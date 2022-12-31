package com.example.sportzinteractivedemo.module.home

import androidx.lifecycle.MutableLiveData
import com.example.sportzinteractivedemo.base.BaseRepository
import com.example.sportzinteractivedemo.data.mapper.assembleMatchDetailResponse
import com.example.sportzinteractivedemo.data.remote.RetrofitInstance
import com.example.sportzinteractivedemo.module.home.model.MatchDetailModel
import com.example.sportzinteractivedemo.util.NetworkHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class HomeRepository @Inject constructor(
    private val networkHelper: NetworkHelper,
    private val apiHelper: RetrofitInstance
) : BaseRepository() {

    suspend fun fetchMatchDetails(): MutableLiveData<MatchDetailModel> {
        return withContext(Dispatchers.IO) {
            val responseModel = MutableLiveData<MatchDetailModel>()
            if (networkHelper.isNetworkConnected()) {
                val response = apiHelper.getAPIService().fetchMatchDetails()
                if (response.isSuccessful) {
                    val result = response.body()
                    result?.let { data ->
                        responseModel.postValue(assembleMatchDetailResponse(data))
                    }
                    //Timber.e("response --> $result}")
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