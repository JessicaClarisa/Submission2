package com.ata.appbundle.view

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ata.appbundle.R
import com.ata.appbundle.core.data.Resource
import com.ata.appbundle.core.ui.FilmAdapter
import com.ata.appbundle.viewmodel.TvShowsViewModel
import kotlinx.android.synthetic.main.fragment_tv_shows.*
import org.koin.android.viewmodel.ext.android.viewModel

class TvShowsFragment : Fragment() {
    private val viewModel: TvShowsViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tv_shows, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity != null) {
            val filmAdapter = FilmAdapter(2)
            filmAdapter.onItemClick = {
                val detailActivity = Intent(activity, DetailActivity::class.java)
                var extras = Bundle()
                extras.putString(DetailActivity.EXTRA_TITLE, it.title)
                extras.putInt(DetailActivity.EXTRA_TYPE, 2)
                detailActivity.putExtras(extras)
                startActivity(detailActivity)
            }
            progressBar.visibility = View.VISIBLE
            viewModel.setType(getString(R.string.tv_shows))
            viewModel.tvShows.observe(this, { films ->
                if (films != null) {
                    when (films) {
                        is Resource.Loading -> {
                            progressBar.visibility = View.VISIBLE
                        }
                        is Resource.Success -> {
                            progressBar.visibility = View.GONE
                            filmAdapter.setFilms(films.data)
                        }
                        is Resource.Error -> {
                            progressBar.visibility = View.GONE
                            Toast.makeText(context, resources.getString(R.string.error), Toast.LENGTH_SHORT).show()
                        }
                    }
                }
            })

            with(rv_tvShows) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = filmAdapter
            }
        }
    }
}