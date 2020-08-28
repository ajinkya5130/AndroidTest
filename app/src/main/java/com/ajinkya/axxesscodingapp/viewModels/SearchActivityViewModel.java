/*
 * Copyright (c) 27/8/20 6:03 PM  Ajinkya Kalaskar
 */

package com.ajinkya.axxesscodingapp.viewModels;

import android.content.Context;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.ajinkya.axxesscodingapp.ApiUrls;
import com.ajinkya.axxesscodingapp.interfaces.CustomSearchItemListener;
import com.ajinkya.axxesscodingapp.models.Datum;
import com.ajinkya.axxesscodingapp.utils.BaseViewModel;
import com.google.gson.JsonElement;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchActivityViewModel extends BaseViewModel {
    private CustomSearchItemListener listener;
    private Context mContext;
    public ObservableBoolean progressDialog;
    private MutableLiveData<List<Datum>> searchedList;
    private List<Datum> list;

    public SearchActivityViewModel(Context context, CustomSearchItemListener searchItemListener) {
        mContext = context;
        listener = searchItemListener;
        progressDialog = new ObservableBoolean();
        list = new ArrayList<>();

    }

    @Override
    public void onDestroy() {

    }

    public void searchProduct(String searchedText) {

        progressDialog.set(true);


        requestInterface.searchItems(ApiUrls.CLIENT_ID,listener.pageNo(), searchedText).enqueue(new Callback<JsonElement>() {
            @Override
            public void onResponse(Call<JsonElement> call, Response<JsonElement> response) {
                if (response != null) {
                    try {
                        JSONObject json = (JSONObject) new JSONTokener(response.body().toString()).nextValue();
                        if (json.getBoolean("success")) {
                            JSONArray mObjData = json.getJSONArray("data");
                            for (int i = 0; i < mObjData.length(); i++) {
                                if (mObjData.getJSONObject(i).has("images")) {
                                    JSONArray mObjData1 = mObjData.getJSONObject(i).getJSONArray("images");
                                    String title = mObjData.getJSONObject(i).getString("title");

                                    for (int i1 = 0; i1 < mObjData1.length(); i1++) {
                                        String val = mObjData1.getJSONObject(i1).getString("link");
                                        String id = mObjData1.getJSONObject(i1).getString("id");
                                        Datum model = new Datum();
                                        model.setLink(val);
                                        model.setId(id);
                                        model.setTitle(title);
                                        list.add(model);

                                    }
                                }
                            }
                            searchedList.setValue(list);

                        }

                    } catch (JSONException e) {
                        e.printStackTrace();
                        //searchedList.setValue(list);
                    }
                    progressDialog.set(false);
                        /*SearchPojo entity = gson.fromJson(responseBody.string(), SearchPojo.class);
                        searchedList.setValue(responseBody.string());*/
                } else {
                    listener.errorMessage("No data");
                    progressDialog.set(false);
                }
            }

            @Override
            public void onFailure(Call<JsonElement> call, Throwable t) {
                listener.errorMessage(t.getMessage());
                progressDialog.set(false);
            }
        });


    }

    public LiveData<List<Datum>> getSearchResult() {
        //if the list is null
        if (searchedList == null) {
            searchedList = new MutableLiveData<>();
            //we will load it asynchronously from server in this method
            if (!listener.getSearchText().isEmpty())
                searchProduct(listener.getSearchText());
        }

        //finally we will return the list
        return searchedList;
    }
}
