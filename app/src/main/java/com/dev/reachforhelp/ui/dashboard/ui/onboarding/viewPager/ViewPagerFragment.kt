package com.dev.reachforhelp.ui.dashboard.ui.onboarding.viewPager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.dev.reachforhelp.R
import com.dev.reachforhelp.databinding.FragmentViewPagerBinding
import com.dev.reachforhelp.ui.dashboard.ui.onboarding.onboardingscreens.OnboardingOneFragment
import com.dev.reachforhelp.ui.dashboard.ui.onboarding.onboardingscreens.OnboardingThreeFragment
import com.dev.reachforhelp.ui.dashboard.ui.onboarding.onboardingscreens.OnboardingTwoFragment


class ViewPagerFragment : Fragment() {

    private lateinit var binding: FragmentViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentViewPagerBinding.inflate(layoutInflater)
      //  val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragList = arrayListOf<Fragment>(
            OnboardingOneFragment(),
            OnboardingTwoFragment(),
            OnboardingThreeFragment()
        )

        val adapter = ViewPagerAdapter(
            fragList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPager.adapter = adapter

        return binding.root
    }


}