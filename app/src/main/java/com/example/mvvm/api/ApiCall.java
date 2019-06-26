package com.example.mvvm.api;

import com.google.gson.JsonObject;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;


public interface ApiCall {


    @GET("api")
    Call<JsonObject> login(@Query("username")String name,@Query("password")String asd);


}
