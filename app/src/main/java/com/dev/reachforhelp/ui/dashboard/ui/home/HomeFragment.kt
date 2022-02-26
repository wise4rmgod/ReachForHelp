package com.dev.reachforhelp.ui.dashboard.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.dev.reachforhelp.databinding.FragmentHomeBinding
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.dev.reachforhelp.R
import com.google.android.material.navigation.NavigationView


class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null
    private lateinit var navController: NavigationView

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity?)!!.supportActionBar?.hide()
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.whistleblowing.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_home_to_whistleBlowerFragment)
        }

        binding.eyewitness.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_home_to_eyeWitnessFragment)
        }
        binding.videoclip.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_home_to_videoClipFragment)
        }
        binding.voicenote.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_home_to_voiceNoteFragment)
        }

        binding.cardFamily.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_home_to_frnds_FamilyFragment)
        }

        binding.cardSafty.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_home_to_safetyGuideFragment)
        }

        binding.cardHumanRight.setOnClickListener {
            findNavController().navigate(R.id.action_navigation_home_to_safetyGuideFragment)
        }

        val root: View = binding.root

      /**  homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        }) **/


        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}