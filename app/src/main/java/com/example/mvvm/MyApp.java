package com.example.mvvm;

import android.app.Application;

import com.example.mvvm.api.ApiCall;
import com.example.mvvm.api.ApiService;


public class MyApp extends Application {


    private static MyApp app;
    private static ApiCall apiCall;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;

    }

    public static MyApp getApp(){
        return app;
    }


    public static ApiCall getApiCall(){
        if (apiCall != null){
            return apiCall;
        }else {
            return ApiService.createService(ApiCall.class);
        }

    }



}
