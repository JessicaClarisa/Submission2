package com.ata.appbundle.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ata.appbundle.view.MoviesFragment
import com.ata.appbundle.view.TvShowsFragment

class TabAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = 2
    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return MoviesFragment()
            1 -> return TvShowsFragment()
        }
        return MoviesFragment()
    }

}