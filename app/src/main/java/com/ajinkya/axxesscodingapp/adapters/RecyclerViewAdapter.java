/*
 * Copyright (c) 27/8/20 11:30 PM  Ajinkya Kalaskar
 */

package com.ajinkya.axxesscodingapp.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.ajinkya.axxesscodingapp.R;
import com.ajinkya.axxesscodingapp.SearchActivity;
import com.ajinkya.axxesscodingapp.databinding.CustomLayoutBinding;
import com.ajinkya.axxesscodingapp.interfaces.CustomSearchItemListener;
import com.ajinkya.axxesscodingapp.models.Datum;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    CustomSearchItemListener listener;
    List<Datum> list;
    public RecyclerViewAdapter(Context context) {
        list = new ArrayList<>();
        mContext = context;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        CustomLayoutBinding binding = DataBindingUtil.inflate(inflater, R.layout.custom_layout,parent,false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Glide.with(mContext)
                .load(list.get(position).getLink())
                .override(100,100)
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        holder.binding.progressCircular.setVisibility(View.GONE);
                        holder.binding.ivSearch.setImageDrawable(mContext.getDrawable(R.drawable.ic_image_search));
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        holder.binding.progressCircular.setVisibility(View.GONE);
                        return false;
                    }
                })
                .thumbnail(0.9f)
                .into(holder.binding.ivSearch);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void addData(List<Datum> searchedData) {
        list.addAll(searchedData);
        notifyDataSetChanged();
    }

    public void clearData() {
        list.clear();
        notifyDataSetChanged();
    }

    public void setListsner(CustomSearchItemListener cus) {
        listener = cus;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        CustomLayoutBinding binding;
        public MyViewHolder(@NonNull CustomLayoutBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
            binding.ivSearch.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.itemClicked(getAdapterPosition());
        }
    }
}
