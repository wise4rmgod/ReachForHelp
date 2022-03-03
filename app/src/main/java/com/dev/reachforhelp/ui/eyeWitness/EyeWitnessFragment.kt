package com.dev.reachforhelp.ui.eyeWitness

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dev.reachforhelp.R
import com.dev.reachforhelp.databinding.EyeWitnessFragmentBinding

class EyeWitnessFragment : Fragment() {

//    companion object {
//        fun newInstance() = EyeWitnessFragment()
//    }

    private lateinit var viewModel: EyeWitnessViewModel
    private lateinit var binding: EyeWitnessFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = EyeWitnessFragmentBinding.inflate(layoutInflater)

        binding.eyewitinessVideoclip.setOnClickListener {
            findNavController().navigate(R.id.action_eyeWitnessFragment_to_videoClipFragment)
        }
        binding.voicenoteEyewitness.setOnClickListener {
            findNavController().navigate(R.id.action_eyeWitnessFragment_to_voiceNoteFragment)
        }
        return binding.root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(EyeWitnessViewModel::class.java)
        // TODO: Use the ViewModel
    }

}