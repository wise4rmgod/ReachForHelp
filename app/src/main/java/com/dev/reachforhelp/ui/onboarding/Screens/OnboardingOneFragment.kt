package com.dev.reachforhelp.ui.onboarding.Screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dev.reachforhelp.R
import com.dev.reachforhelp.databinding.FragmentOnboardingOneBinding


class OnboardingOneFragment : Fragment() {

    private lateinit var binding: FragmentOnboardingOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnboardingOneBinding.inflate(layoutInflater)


        return binding.root
    }


}