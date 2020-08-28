/*
 * Copyright (c) 26/8/20 11:05 PM  Ajinkya Kalaskar
 */

package com.ajinkya.axxesscodingapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.Observable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ajinkya.axxesscodingapp.adapters.RecyclerViewAdapter;
import com.ajinkya.axxesscodingapp.databinding.ActivitySearchBinding;
import com.ajinkya.axxesscodingapp.interfaces.CustomSearchItemListener;
import com.ajinkya.axxesscodingapp.models.Datum;
import com.ajinkya.axxesscodingapp.utils.BaseActivity;
import com.ajinkya.axxesscodingapp.viewModels.SearchActivityViewModel;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.valdesekamdem.library.mdtoast.MDToast;

import java.util.ArrayList;

public class SearchActivity extends BaseActivity implements CustomSearchItemListener {

    private static final String TAG = "SearchActivity";
    private int currentItems, totalItems, scrollOutItems;
    int view_thresHold = 20;
    int pageNo = 1;
    LinearLayoutManager layoutManager;
    GridLayoutManager gridLayoutManager;
    private boolean isScrolling = true;
    private ActivitySearchBinding binding;
    private SearchActivityViewModel viewModel;
    RecyclerViewAdapter adapter;
    ArrayList<Datum> arrayList;
    private String searchedText = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_search);
        init();


    }

    private void init() {
        arrayList = new ArrayList<>();
        viewModel = new SearchActivityViewModel(this, this);
        adapter = new RecyclerViewAdapter(this);
        viewModel.progressDialog.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                if (viewModel.progressDialog.get())
                    progressDialog.show();
                else
                    progressDialog.dismiss();
            }
        });
        layoutManager = new LinearLayoutManager(this);
        gridLayoutManager = new GridLayoutManager(this, 3);
        binding.rvSearchedAllList.setLayoutManager(gridLayoutManager);
        binding.rvSearchedAllList.setAdapter(adapter);
        adapter.setListsner(this);
        setSupportActionBar(binding.toolbarSearch);
        binding.searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {
                binding.searchView.setQuery(searchedText, false);

            }

            @Override
            public void onSearchViewClosed() {

            }
        });
        //binding.searchView.showSearch(false);
        binding.searchView.hideKeyboard(binding.searchView);
        binding.searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return searchFunction(query);

            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // return searchFunction(newText);
                return false;
            }
        });

        if(binding.rvSearchedAllList.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            binding.rvSearchedAllList.setLayoutManager(new GridLayoutManager(this, 3));
        } else if (binding.rvSearchedAllList.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            binding.rvSearchedAllList.setLayoutManager(new GridLayoutManager(this, 4));
        }

        binding.rvSearchedAllList.addOnScrollListener(new RecyclerView.OnScrollListener() {

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                currentItems = gridLayoutManager.getChildCount(); //visibleItemCount
                totalItems = gridLayoutManager.getItemCount();    //totalItemCount
                scrollOutItems = gridLayoutManager.findFirstVisibleItemPosition();//pastVisibleItems
                if (dy > 0) {
                    if (isScrolling && (currentItems + scrollOutItems == totalItems)) {
                        pageNo++;
                        viewModel.searchProduct(searchedText);
                        //viewModel.getSearchResult();
                        isScrolling = false;

                    }
                }
            }
        });


        viewModel.getSearchResult().observe(this, searchedData -> {
            Log.e(TAG, "onChanged: " + searchedData.size());
            arrayList.addAll(searchedData);
            adapter.addData(searchedData);
        });


    }

    private Boolean searchFunction(String query) {
        if (query.length() < 3) {
            toast.show("Please type at least 3 characters.", MDToast.TYPE_INFO);
            return true;
        } else {
            pageNo = 1;
            if (!searchedText.equals(query)) {
                adapter.clearData();
            }
            searchedText = query;
            viewModel.searchProduct(searchedText);
            return false;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_search_menu, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        binding.searchView.setMenuItem(item);
        return true;


    }

    @Override
    public void onBackPressed() {
        if (binding.searchView.isSearchOpen()) {
            binding.searchView.closeSearch();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public int pageNo() {
        return pageNo;
    }

    @Override
    public void itemClicked(int adapterPosition) {
        Log.e(TAG, "itemClicked: "+arrayList.get(adapterPosition).getId() );
        Intent intent = new Intent(this,SearchInfoActivity.class);
        intent.putExtra("val",arrayList.get(adapterPosition));
        startActivity(intent);

    }

    @Override
    public void errorMessage(String message) {
        toast.show(message, MDToast.TYPE_WARNING);
        Log.e(TAG, "errorMessage: " + message);

    }

    @Override
    public String getSearchText() {
        return searchedText;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putParcelableArrayList("key", arrayList);
        super.onSaveInstanceState(outState);

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        arrayList = savedInstanceState.getParcelableArrayList("key");
        adapter.addData(arrayList);

    }
}