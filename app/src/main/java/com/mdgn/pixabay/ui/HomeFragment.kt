package com.mdgn.pixabay.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mdgn.pixabay.R
import com.mdgn.pixabay.ui.vm.PictureViewModel
import dagger.hilt.android.AndroidEntryPoint

//TODO Model - Api - Status - Resources - BaseRepository - Repository - ViewModel - Module

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

}