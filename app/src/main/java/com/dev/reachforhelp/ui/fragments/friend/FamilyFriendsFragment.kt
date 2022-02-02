package com.dev.reachforhelp.ui.fragments.friend

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dev.reachforhelp.R
import com.dev.reachforhelp.databinding.FragmentFamilyFriendsBinding
import com.dev.reachforhelp.databinding.FragmentHomeBinding


class FamilyFriendsFragment : Fragment() {

    private lateinit var binding: FragmentFamilyFriendsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFamilyFriendsBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}