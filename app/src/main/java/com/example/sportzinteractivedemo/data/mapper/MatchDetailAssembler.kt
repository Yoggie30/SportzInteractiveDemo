package com.example.sportzinteractivedemo.data.mapper

import androidx.lifecycle.MutableLiveData
import com.example.sportzinteractivedemo.module.home.model.MatchDetailModel
import org.json.JSONObject
import timber.log.Timber

fun assembleMatchDetailResponse(
    response: String
): MutableLiveData<MatchDetailModel> {
    val responseModel = MutableLiveData<MatchDetailModel>()
    val json = JSONObject(response)
    Timber.e("json Response --> $json")
    //responseModel.postValue(json)
    return responseModel
}

