package com.dev.reachforhelp.ui.safetyguide

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dev.reachforhelp.R

class SafetyGuideFragment : Fragment() {

    companion object {
        fun newInstance() = SafetyGuideFragment()
    }

    private lateinit var viewModel: SafetyGuideViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.safety_guide_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SafetyGuideViewModel::class.java)
        // TODO: Use the ViewModel
    }

}