package com.example.mvvm.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel

import com.example.mvvm.MyApp
import com.google.gson.JsonObject

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by Jaimin Patel
 */
class VMMain(application: Application) : AndroidViewModel(application) {


    fun apicall() {
        MyApp.getApiCall().login("sdf", "asd").enqueue(object : Callback<JsonObject> {
            override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {

            }

            override fun onFailure(call: Call<JsonObject>, t: Throwable) {

            }
        })

    }
}
