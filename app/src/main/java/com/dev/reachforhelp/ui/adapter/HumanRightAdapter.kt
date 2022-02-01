package com.dev.reachforhelp.ui.adapter

import android.content.Context
import android.content.Intent
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

    private var onItemClickListener: ((HomeData) -> Unit)? = null

    override fun onBindViewHolder(holder: HumanRightViewHolder, position: Int) {
        val humanRight = humanRightList[position]
        with(holder){
            with(humanRightList[position]){
                binding.imgHumanR.setImageResource(this.image)
                binding.txtHumanRight.text = this.title

                binding.cardHumanR.setOnClickListener {
                    onItemClickListener?.invoke(humanRightList[adapterPosition])
                }

//                with(holder.binding){
//                    holder.binding.cardHumanRight.setOnClickListener {
//                        when(adapterPosition){
//                            0 -> {
//                                val intent = Intent(context, HumanRightActivity::class.java)
//                                intent.putExtra("Title", title)
//                                intent.putExtra("Image", image)
//                                context.startActivity(intent)
//                            }
//                        }
//                    }
//                }
            }
        }
    }

    override fun getItemCount(): Int = humanRightList.size

    inner class HumanRightViewHolder(val binding: ListItemHorizontalBinding): RecyclerView.ViewHolder(binding.root){

    }

       fun setOnItemClickListener(listener: (String?) -> Unit) {
           onItemClickListener
       }


}