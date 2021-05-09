package com.mdgn.pixabay.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.mdgn.pixabay.R
import com.mdgn.pixabay.ui.vm.PictureViewModel
import com.mdgn.pixabay.util.Constant
import com.mdgn.pixabay.util.Status
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    private val viewmodel : PictureViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewmodel.getPictureData(Constant.API_KEY,"blue")


        Log.e("PictureData","OnCreate")

        viewmodel.pictureData.observe(this, Observer {
            when(it.status){

                Status.LOADING -> {
                    Log.e("PictureData","Loading")
                }

                Status.SUCCESS -> {
                    Log.e("PictureData","Success")
                    Log.e("PictureData", it.data.toString())
                }

                Status.ERROR -> {
                    Log.e("PictureData","Error")
                }

            }
        })


    }
}