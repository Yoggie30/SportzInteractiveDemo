package com.example.sportzinteractivedemo.module.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.liveData
import com.example.sportzinteractivedemo.base.BaseViewModel
import com.example.sportzinteractivedemo.module.home.model.MatchDetailModel
import com.example.sportzinteractivedemo.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: HomeRepository
) : BaseViewModel() {


    private val _matchDetailModel = MutableLiveData<MatchDetailModel>()
    val matchDetailModel: LiveData<MatchDetailModel>
        get() = _matchDetailModel

    fun setMatchDetailModel(data: MatchDetailModel) {
        _matchDetailModel.value = data
    }

    fun callMatchDetailsAPI() =
        liveData(Dispatchers.IO) {
            emit(Resource.loading(message = "Fetching Data", data = null))
            try {
                emit(Resource.success(data = repository.fetchMatchDetails()))
            } catch (exception: Exception) {
                emit(
                    Resource.error(
                        data = null, message = exception.message
                            ?: "Error Occurred!"
                    )
                )
            }
        }
}