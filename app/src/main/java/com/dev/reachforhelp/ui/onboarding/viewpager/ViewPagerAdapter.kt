package com.dev.reachforhelp.ui.onboarding.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter (list:ArrayList<Fragment>, fm: FragmentManager, lifecycle: Lifecycle):
    FragmentStateAdapter(fm, lifecycle) {

    val fragList: ArrayList<Fragment> = list


    override fun getItemCount(): Int = fragList.size


    override fun createFragment(position: Int): Fragment {
        return fragList[position]
    }
}