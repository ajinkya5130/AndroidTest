/*
 * Copyright (c) 26/8/20 11:05 PM  Ajinkya Kalaskar
 */

package com.ajinkya.axxesscodingapp.utils;

import com.ajinkya.axxesscodingapp.ApiUrls;
import com.ajinkya.axxesscodingapp.interfaces.ApiInterface;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public abstract class BaseViewModel {
    public ApiInterface requestInterface;

    public BaseViewModel() {
        loadData();
    }

    public abstract void onDestroy();

    private void loadData() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        requestInterface = new Retrofit.Builder()
                .baseUrl(ApiUrls.baseURL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build().create(ApiInterface.class);
    }
}
