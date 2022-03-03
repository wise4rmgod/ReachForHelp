package com.dev.reachforhelp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dev.reachforhelp.databinding.ListItemNotificationBinding
import com.dev.reachforhelp.model.NotificationData

class NotificationAdapter(private val notificationDataList: List<NotificationData>,
                          val context: Context):
    RecyclerView.Adapter<NotificationAdapter.NotificationVolderHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationVolderHolder {
        val binding = ListItemNotificationBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return NotificationVolderHolder(binding)
    }

    override fun onBindViewHolder(holder: NotificationVolderHolder, position: Int) {
       val caseData = notificationDataList[position]
        with (holder){
            with (notificationDataList[position]){
                binding.imgNotification.setImageResource(this.imageNote)
                binding.txtNotifyTitle.text = this.description
                binding.txtNotifyTime.text = this.time
            }
        }
    }

    override fun getItemCount(): Int = notificationDataList.size


    inner class NotificationVolderHolder(val binding: ListItemNotificationBinding):
    RecyclerView.ViewHolder(binding.root){

    }
}