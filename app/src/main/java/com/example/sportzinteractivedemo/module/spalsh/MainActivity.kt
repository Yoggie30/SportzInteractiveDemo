package com.example.sportzinteractivedemo.module.spalsh


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.sportzinteractivedemo.R
import com.example.sportzinteractivedemo.base.BaseActivity
import com.example.sportzinteractivedemo.databinding.ActivityMainBinding
import com.example.sportzinteractivedemo.module.home.HomeActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding
    private val splashTimeOut = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
       // setContentView(getLayoutResource())
        loadSplash()
    }

    override fun getLayoutResource() = R.layout.activity_main

    private fun loadSplash() {
        Handler().postDelayed(Runnable {
            val i = Intent(this, HomeActivity::class.java)
            startActivity(i)
            finish()
        }, splashTimeOut.toLong())

        val myanim: Animation = AnimationUtils.loadAnimation(this, R.anim.splashanimation)
        binding.splashLogo.startAnimation(myanim)
    }
}