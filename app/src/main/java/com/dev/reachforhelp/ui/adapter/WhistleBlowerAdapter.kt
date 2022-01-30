package com.dev.reachforhelp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dev.reachforhelp.dataSource.model.HomeData
import com.dev.reachforhelp.databinding.ListItemGridBinding

class WhistleBlowerAdapter(private val whistleblowerList: List<HomeData>, val context: Context):
    RecyclerView.Adapter<WhistleBlowerAdapter.WhistleBlowerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WhistleBlowerViewHolder {
      val binding = ListItemGridBinding.inflate(
          LayoutInflater.from(parent.context), parent, false
      )
      return WhistleBlowerViewHolder(binding)
    }

    private var onItemClickListener: ((String?) -> Unit)? = null

    override fun onBindViewHolder(holder: WhistleBlowerViewHolder, position: Int) {
        val whistle = whistleblowerList[position]
        with(holder){
            with(whistleblowerList[position]){
                binding.imgWhisle.setImageResource(this.image)
                binding.txtWhistle.text = this.title


            }
        }



    }

    override fun getItemCount(): Int = whistleblowerList.size

    class WhistleBlowerViewHolder(val binding: ListItemGridBinding) :RecyclerView.ViewHolder(binding.root) {

    }

    fun setOnItemClickListener(listener: (String?) -> Unit) {
        onItemClickListener = listener
    }

}