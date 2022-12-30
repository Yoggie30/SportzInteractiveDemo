package com.example.sportzinteractivedemo.module.home

import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.sportzinteractivedemo.R
import com.example.sportzinteractivedemo.base.BaseActivity
import com.example.sportzinteractivedemo.databinding.ActivityHomeBinding
import com.example.sportzinteractivedemo.util.Resource
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class HomeActivity : BaseActivity() {
    private lateinit var binding: ActivityHomeBinding
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        // setContentView(R.layout.activity_home)
        init()
        loadInitialData()
    }

    override fun getLayoutResource() = R.layout.activity_home

    private fun init() {

    }

    private fun loadInitialData() {
        callMatchDetailsService()
    }

    private fun callMatchDetailsService() {
        viewModel.callMatchDetailsAPI()
            .observe(this, Observer { resources ->
                when (resources.status) {
                    Resource.Status.SUCCESS -> {
                        hideProgress()
                        showAlert("SUCCESS")
                        resources.data?.value?.let {
                            //fetchDataListFromDB()
                        }
                    }
                    Resource.Status.ERROR -> {

                        hideProgress()
                        resources.message?.let { it1 ->
                            Timber.e("callMatchDetailsService ERROR-->$it1")
                            showAlert(it1)
                        }
                    }
                    Resource.Status.LOADING -> {
                        Timber.e("callMatchDetailsService Status-->LOADING")
                        showProgress()
                    }
                }
            })
    }

}