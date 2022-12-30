package com.example.sportzinteractivedemo.module.home

import android.content.Context
import androidx.lifecycle.liveData
import com.example.sportzinteractivedemo.base.BaseViewModel
import com.example.sportzinteractivedemo.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: HomeRepository
) : BaseViewModel() {

    fun callMatchDetailsAPI() = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
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