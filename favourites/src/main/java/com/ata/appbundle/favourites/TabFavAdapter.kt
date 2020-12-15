package com.ata.appbundle.favourites

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ata.appbundle.favourites.FavMoviesFragment
import com.ata.appbundle.favourites.FavTvShowsFragment

class TabFavAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = 2
    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return FavMoviesFragment()
            1 -> return FavTvShowsFragment()
        }
        return FavMoviesFragment()
    }

}