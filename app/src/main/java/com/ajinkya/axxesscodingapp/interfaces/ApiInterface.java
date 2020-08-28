/*
 * Copyright (c) 26/8/20 11:05 PM  Ajinkya Kalaskar
 */

/*
 * Copyright (c) 2020. Ajinkya K. Android Dev. EncureIT
 */

package com.ajinkya.axxesscodingapp.interfaces;

import com.ajinkya.axxesscodingapp.ApiUrls;
import com.ajinkya.axxesscodingapp.models.SearchPojo;
import com.google.gson.JsonElement;

import io.reactivex.Single;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiInterface {

    @Headers({
            "Accept: application/json",
            "Content-Type: application/json"
    })
    @GET(ApiUrls.SEARCH_ITEMS)
    Call<JsonElement> searchItems(@Header("Authorization") String string, @Query("page") int pageNo, @Query("q") String searchFoodText);
    //Call<ResponseBody> searchItems(@Header("Authorization") String string, @Query("q") String searchFoodText);

   /* @Headers({
            "Accept: application/json",
            "Content-Type: application/json"
    })
    @POST(ApiUrls.loginAPI)
    Call<LoginResponseModel> login(@Body JsonObject jsonObject);

    @Headers({
            "Accept: application/json",
            "Content-Type: application/json"
    })
    @POST(ApiUrls.jobSeekerJobSaveAppliedJobs)
    Single<ResponseBody> jobSeekerJobSaveAppliedJobs(@Header("access_token") String string, @Body JsonObject jsonObject);

    @Headers({
            "Accept: application/json",
            "Content-Type: application/json"
    })
    @POST(ApiUrls.jobSeekerJobMyAppliedJobs)
    Single<JobSearchPojo> jobSeekerJobMyAppliedJobs(@Header("access_token") String string, @Body JsonObject jsonObject);

    @Headers({
            "Accept: application/json",
            "Content-Type: application/json"
    })
    @POST(ApiUrls.workExperience)
    Single<List<BasicDataModel>> workExperience(@Header("access_token") String string, @Body JsonObject jsonObject);
*/}
