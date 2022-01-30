package com.dev.reachforhelp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dev.reachforhelp.dataSource.model.HomeData
import com.dev.reachforhelp.databinding.ListItemHorizontalBinding

class HumanRightAdapter(private val humanRightList: List<HomeData>, val context: Context):
    RecyclerView.Adapter<HumanRightAdapter.HumanRightViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HumanRightViewHolder {
        val binding = ListItemHorizontalBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return HumanRightViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HumanRightViewHolder, position: Int) {
        val humanRight = humanRightList[position]
        with(holder){
            with(humanRightList[position]){
                binding.imgHumanR.setImageResource(this.image)
                binding.txtHumanRight.text = this.title
            }
        }
    }

    override fun getItemCount(): Int = humanRightList.size

    inner class HumanRightViewHolder(val binding: ListItemHorizontalBinding): RecyclerView.ViewHolder(binding.root){

    }
}