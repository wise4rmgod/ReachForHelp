package com.dev.reachforhelp.ui.fragments.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import android.widget.LinearLayout.HORIZONTAL
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.dev.reachforhelp.R
import com.dev.reachforhelp.dataSource.model.HomeData
import com.dev.reachforhelp.databinding.FragmentHomeBinding
import com.dev.reachforhelp.ui.adapter.HumanRightAdapter
import com.dev.reachforhelp.ui.adapter.WhistleBlowerAdapter


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)

        //dummy data
        var humanRightList = listOf(
            HomeData(R.drawable.human_right, "Human Right BookLet"),
            HomeData(R.drawable.safety, "Safety Guide BookLet"),
            HomeData(R.drawable.friends, "Friends & Family")
        )

        var whistleBlowerList = listOf(
            HomeData(R.drawable.whistle_b, "Whistleblowing"),
            HomeData(R.drawable.voice_note,"Voice Note"),
            HomeData(R.drawable.video_clip, "Video Clip"),
            HomeData(R.drawable.eye_witness, "Eye Witness")
        )
        //Initialize both recyclerview
        binding.recyclerViewLinear.layoutManager = LinearLayoutManager( requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.recyclerViewLinear.adapter = HumanRightAdapter(humanRightList, requireContext())

        binding.recyclerViewGride.layoutManager = StaggeredGridLayoutManager( 2, StaggeredGridLayoutManager.VERTICAL)
        binding.recyclerViewGride.adapter = WhistleBlowerAdapter(whistleBlowerList, requireContext())

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)



    }





}