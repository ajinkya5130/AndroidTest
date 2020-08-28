/*
 * Copyright (c) 26/8/20 11:05 PM  Ajinkya Kalaskar
 */

package com.ajinkya.axxesscodingapp

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.databinding.DataBindingUtil
import com.ajinkya.axxesscodingapp.database.DatabaseHelper
import com.ajinkya.axxesscodingapp.database.MyCart
import com.ajinkya.axxesscodingapp.databinding.ActivityMainBinding
import com.ajinkya.axxesscodingapp.models.Datum
import com.ajinkya.axxesscodingapp.utils.BaseActivity
import com.bumptech.glide.Glide
import com.valdesekamdem.library.mdtoast.MDToast


class SearchInfoActivity : BaseActivity() {
    var binding:ActivityMainBinding?=null
    var model: Datum? =null
    var databaseHelper:DatabaseHelper?=null
    private val TAG = "SearchInfoActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        model = intent.getParcelableExtra("val")
        binding!!.toolbarSearchInfo.setTitleTextColor(resources.getColor(R.color.colorWhite))
        binding!!.toolbarSearchInfo.setTitle(model!!.title)
        setSupportActionBar(binding!!.toolbarSearchInfo)
        //supportActionBar!!.setHomeButtonEnabled(true)
        //supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        databaseHelper = DatabaseHelper(this)

        setInfo();

        binding!!.button.setOnClickListener {
            if (binding!!.editTextTextPersonName.text.toString().isEmpty()){
                toast!!.show("Please type comment",MDToast.TYPE_ERROR)
            }else{
                val cart = MyCart()
                cart.id = model!!.id
                cart.setComment(binding!!.editTextTextPersonName.text.toString().trim())

                databaseHelper!!.insertData(cart)

            }
        }


        // Log.e(TAG, "onCreate: "+people!!.id )

    }

    private fun setInfo() {

        Glide.with(this)
            .load(model!!.getLink()).into(binding!!.imageView)
        val commecnt: String = databaseHelper!!.getComment(model!!.id)
        binding!!.editTextTextPersonName.setText(commecnt)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.getItemId()) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}