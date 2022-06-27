package com.example.w

import android.app.Application
import com.example.w.network.PixabayApi
import com.example.w.network.RetrofitService

class App:Application() {
    companion object{
        lateinit var api: PixabayApi
    }
    override fun onCreate() {
        super.onCreate()
        val retrofitService = RetrofitService()
        api = retrofitService.api
    }
}