package com.dev.reachforhelp.ui.humanright

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dev.reachforhelp.R

class HumanRightFragment : Fragment() {

    companion object {
        fun newInstance() = HumanRightFragment()
    }

    private lateinit var viewModel: HumanRightViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.human_right_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HumanRightViewModel::class.java)
        // TODO: Use the ViewModel
    }

}