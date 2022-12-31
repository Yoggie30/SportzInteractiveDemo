package com.example.sportzinteractivedemo.module.home

import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.sportzinteractivedemo.R
import com.example.sportzinteractivedemo.base.BaseActivity
import com.example.sportzinteractivedemo.databinding.ActivityHomeBinding
import com.example.sportzinteractivedemo.module.home.model.MatchDetailModel
import com.example.sportzinteractivedemo.util.Resource
import com.example.sportzinteractivedemo.util.toast
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class HomeActivity : BaseActivity() {
    private lateinit var binding: ActivityHomeBinding
    private val viewModel: HomeViewModel by viewModels()
    //private lateinit var matchDetailModel: MatchDetailModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        // setContentView(R.layout.activity_home)
        init()
    }

    override fun getLayoutResource() = R.layout.activity_home

    private fun init() {
        loadInitialData()
    }

    private fun loadInitialData() {
        callMatchDetailsService()
        viewModel.matchDetailModel.observe(this, Observer { data ->
            //setData(it)
            data.apply {
                matchDetail?.let { matchDetails ->
                    binding.tvMatchVenue.text =
                        "Date: ${matchDetails.match.date},${matchDetails.match.time}"
                    matchDetails.series.let { series ->
                        Timber.e("tourName: --> ${series.tourName}")
                        toast(series.tourName)
                        binding.tvSeries.text = series.tourName
                        //viewModel.setTourName(series.tourName)
                    }
                }
            }
        })
    }


    private fun callMatchDetailsService() {
        viewModel.callMatchDetailsAPI()
            .observe(this, Observer { resources ->
                when (resources.status) {
                    Resource.Status.LOADING -> {
                        showProgress()
                        resources.message?.let {
                            toast(it)
                        }
                    }
                    Resource.Status.SUCCESS -> {
                        hideProgress()
                        resources.data?.value?.let {
                            //matchDetailModel = it
                            viewModel.setMatchDetailModel(it)
                        }
                    }
                    Resource.Status.ERROR -> {
                        hideProgress()
                        resources.message?.let { it1 ->
                            Timber.e("callMatchDetailsService ERROR-->$it1")
                            showAlert(it1)
                        }
                    }
                }
            })
    }

    private fun setData(data: MatchDetailModel) {
        // if (::matchDetailModel.isInitialized) {
        Timber.e("MatchDetailModel Data : --> $data")
        data.apply {
            matchDetail?.let { matchDetails ->
                binding.tvMatchVenue.text =
                    "Date: ${matchDetails.match.date},${matchDetails.match.time}"
                matchDetails.series.let { series ->
                    Timber.e("tourName: --> ${series.tourName}")
                    toast(series.tourName)
                    binding.tvSeries.text = series.tourName
                    //viewModel.setTourName(series.tourName)
                }
            }
        }
        //}
    }
}