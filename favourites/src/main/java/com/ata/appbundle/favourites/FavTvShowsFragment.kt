package com.ata.appbundle.favourites

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ata.appbundle.core.ui.FavouriteAdapter
import com.ata.appbundle.view.DetailActivity
import kotlinx.android.synthetic.main.fragment_fav_tv_shows.*
import org.koin.android.viewmodel.ext.android.viewModel

class FavTvShowsFragment : Fragment() {
    private val viewModel: FavTvShowsViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fav_tv_shows, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity != null) {
            val filmAdapter = FavouriteAdapter()
            filmAdapter.onItemClick = {
                val detailActivity = Intent(activity, DetailActivity::class.java)
                var extras = Bundle()
                extras.putString(DetailActivity.EXTRA_TITLE, it.title)
                extras.putInt(DetailActivity.EXTRA_TYPE, it.type)
                detailActivity.putExtras(extras)
                startActivity(detailActivity)
            }
            progressBarFavTv.visibility = View.VISIBLE
            viewModel.setType(getString(R.string.tv_shows))
            viewModel.tvShows.observe(viewLifecycleOwner, { films ->
                if (films != null) {
                    progressBarFavTv.visibility = View.GONE
                    filmAdapter.setFilms(films)
                }
            })

            rv_tvShows.layoutManager = LinearLayoutManager(context)
            rv_tvShows.setHasFixedSize(true)
            rv_tvShows.adapter = filmAdapter
        }
    }
}