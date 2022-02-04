package com.dev.reachforhelp.ui.dashboard.ui.frnds_family

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dev.reachforhelp.R

class Frnds_FamilyFragment : Fragment() {

    companion object {
        fun newInstance() = Frnds_FamilyFragment()
    }

    private lateinit var viewModel: FrndsFamilyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frnds__family_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FrndsFamilyViewModel::class.java)
        // TODO: Use the ViewModel
    }

}