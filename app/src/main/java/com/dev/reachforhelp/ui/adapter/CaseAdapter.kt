package com.dev.reachforhelp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dev.reachforhelp.databinding.ListItemCaseBinding
import com.dev.reachforhelp.model.CaseData

class CaseAdapter(private val caseList: List<CaseData>, val context: Context):
RecyclerView.Adapter<CaseAdapter.CaseViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CaseViewHolder {
       val binding = ListItemCaseBinding.inflate(
           LayoutInflater.from(parent.context), parent, false
       )
        return CaseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CaseViewHolder, position: Int) {
        val caseData = caseList[position]
        with(holder){
            with(caseList[position]){
                binding.apply {
                    imgCase
                    textCaseDate
                    caseTitle
                    txtCaseNewRecord
                    txtCaseTime
                    caseTapToplay
                    caseStatus
                }
            }
//                binding.imgCase.setImageResource(this.imageCase)
//                binding.textCaseDate.text = this.date
//                binding.caseTitle.text = this.newRecord
//                binding.txtCaseNewRecord.text = this.record
//                binding.txtCaseTime.text = this.time
//                binding.caseTapToplay.text = this.play
//                binding.caseStatus.text = this.status
//            }
        }
    }

    override fun getItemCount(): Int = caseList.size

    inner class CaseViewHolder( val binding: ListItemCaseBinding):
        RecyclerView.ViewHolder(binding.root) {

    }
}