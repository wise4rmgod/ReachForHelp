package com.dev.reachforhelp.ui.dashboard.ui.onboarding.onboardingscreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.dev.reachforhelp.R
import com.dev.reachforhelp.databinding.FragmentOnboardingOneBinding


class OnboardingOneFragment : Fragment() {

    private lateinit var binding: FragmentOnboardingOneBinding
    private lateinit var viewpager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnboardingOneBinding.inflate(layoutInflater)

        binding.imgArrow.setOnClickListener {
            viewpager.currentItem = 1
        }

        return binding.root
    }


}