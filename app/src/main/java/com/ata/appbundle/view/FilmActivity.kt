package com.ata.appbundle.view

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.ata.appbundle.R
import com.ata.appbundle.adapter.TabAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_film.*

class FilmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film)
        initTabs()
    }

    private fun initTabs() {
        viewpager2.adapter = TabAdapter(this)
        TabLayoutMediator(tabs, viewpager2,
            TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                when (position) {
                    0 -> tab.text = resources.getString(R.string.movies)
                    1 -> tab.text = resources.getString(R.string.tv_shows)
                }
            }).attach()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.favouriteMenu -> {
                val uri = Uri.parse("appbundle://favourites")
                startActivity(Intent(Intent.ACTION_VIEW, uri))
                true
            }
            else -> true
        }
    }
}