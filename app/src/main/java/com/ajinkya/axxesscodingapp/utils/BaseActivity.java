/*
 * Copyright (c) 27/8/20 6:09 PM  Ajinkya Kalaskar
 */

package com.ajinkya.axxesscodingapp.utils;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ajinkya.axxesscodingapp.ApiUrls;
import com.ajinkya.axxesscodingapp.interfaces.ApiInterface;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseActivity extends AppCompatActivity {
    public ToastUtils toast  ;
    public ProgressDialogUtils progressDialog;
    public ApiInterface requestInterface;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        toast = new ToastUtils(this);
        progressDialog = new ProgressDialogUtils(this);
        loadData();
    }

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
