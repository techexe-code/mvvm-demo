package com.example.mvvm.api

import com.google.gson.JsonObject

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap


interface ApiCall {


    @GET("api")
    fun login(@Query("username") name: String, @Query("password") asd: String): Call<JsonObject>


}
