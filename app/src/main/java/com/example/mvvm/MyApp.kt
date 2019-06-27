package com.example.mvvm

import android.app.Application

import com.example.mvvm.api.ApiCall
import com.example.mvvm.api.ApiService


class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        app = this

    }

    companion object {


        var app: MyApp? = null
            private set
        private val apiCall: ApiCall? = null


        fun getApiCall(): ApiCall {
            return apiCall ?: ApiService.createService(ApiCall::class.java)

        }
    }


}
