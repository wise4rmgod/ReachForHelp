package com.dev.reachforhelp.ui.onboarding.Screens

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dev.reachforhelp.R
import com.dev.reachforhelp.databinding.FragmentSplashScreenBinding

class SplashScreenFragment : Fragment() {

    private lateinit var binding: FragmentSplashScreenBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        Handler().postDelayed({
            if (onBoardingFinished()) {

                findNavController().navigate(R.id.action_splashScreenFragment_to_navigation_home)
            }else{
                findNavController().navigate(R.id.action_splashScreenFragment_to_viewPagerFragment)
            }
        }, 3000)

        binding = FragmentSplashScreenBinding.inflate(layoutInflater )

        return  binding.root
    }

    private fun onBoardingFinished(): Boolean {
      //  val Context_MODE_PRIVATE = 0
        val  sharedPreference = requireActivity().getSharedPreferences("onboarding", Context.MODE_PRIVATE)
        return sharedPreference.getBoolean("Finished", false)
    }



}


