package com.ata.appbundle.favourites

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ata.appbundle.favourites.di.favModules
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_favourite.*
import org.koin.core.context.loadKoinModules

class FavouriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourite)
        val actionbar = supportActionBar
        if (actionbar != null) {
            actionbar.title = resources.getString(R.string.fav)
            actionbar.setDisplayHomeAsUpEnabled(true)
        }

        loadKoinModules(favModules)

        initTabs()
    }

    private fun initTabs() {
        viewpagerFav.adapter = TabFavAdapter(this)
        TabLayoutMediator(tabsFav, viewpagerFav,
            TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                when (position) {
                    0 -> tab.text = resources.getString(R.string.movies)
                    1 -> tab.text = resources.getString(R.string.tv_shows)
                }
            }).attach()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}