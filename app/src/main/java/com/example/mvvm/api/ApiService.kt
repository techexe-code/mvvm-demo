package com.example.mvvm.api

import android.app.Application
import android.content.Context

import com.example.mvvm.BuildConfig
import com.example.mvvm.utils.Urls
import com.google.gson.Gson
import com.google.gson.GsonBuilder

import java.util.concurrent.TimeUnit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiService {

    private var httpClient: OkHttpClient.Builder? = null

    private var builder: Retrofit.Builder? = null

    private val mContext: Context? = null

    private val apiCall: ApiCall? = null


    fun <S> createService(serviceClass: Class<S>): S {
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        httpClient = OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.MINUTES)
                .readTimeout(5, TimeUnit.MINUTES)
        if (BuildConfig.DEBUG) {
            httpClient!!.addInterceptor(logging)
        }
        val gson = GsonBuilder()
                .setLenient()
                .create()
        builder = Retrofit.Builder()
                .baseUrl(Urls.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))

        val client = httpClient!!.build()

        val retrofit = builder!!.client(client).build()
        return retrofit.create(serviceClass)
    }
}
