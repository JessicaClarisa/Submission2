package com.ata.appbundle.view

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.text.Layout
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ata.appbundle.R
import com.ata.appbundle.core.data.Resource
import com.ata.appbundle.viewmodel.DetailViewModel
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*
import org.koin.android.viewmodel.ext.android.viewModel

class DetailActivity : AppCompatActivity(), View.OnClickListener {
    private var status: Boolean? = false
    private val viewModel: DetailViewModel by viewModel()

    companion object {
        const val EXTRA_TITLE = "selected_title"
        const val EXTRA_TYPE = "selected_type"
    }

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val extras = intent.extras
        if (extras != null) {
            val title = extras.getString(EXTRA_TITLE)
            val type = extras.getInt(EXTRA_TYPE)

            val actionbar = supportActionBar
            if (actionbar != null) {
                actionbar.title = title
                actionbar.setDisplayHomeAsUpEnabled(true)
            }

            if (title != null) {
                viewModel.setTitle(title)
                viewModel.setType(type)

                progressBar.visibility = View.VISIBLE
                ln1.visibility = View.GONE
                ln2.visibility = View.GONE
                viewModel.detail.observe(this, { film ->
                    if (film != null) {
                        when (film) {
                            is Resource.Loading -> progressBar.visibility = View.VISIBLE
                            is Resource.Success -> {
                                progressBar.visibility = View.GONE
                                ln1.visibility = View.VISIBLE
                                ln2.visibility = View.VISIBLE
                                Glide.with(applicationContext)
                                    .load(film.data?.poster)
                                    .into(findViewById(R.id.poster))

                                titleDetail.text = film.data?.title
                                genre.text = film.data?.genre
                                running_time.text = film.data?.running_time
                                original_lang.text = film.data?.original_language
                                overview.text = film.data?.overview

                                status = film.data?.status
                                setFav(status)
                            }
                            is Resource.Error -> {
                                progressBar.visibility = View.GONE
                                Toast.makeText(applicationContext, resources.getString(R.string.error), Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        overview.justificationMode = Layout.JUSTIFICATION_MODE_INTER_WORD
                    }
                })
            }
        }

        button_favorite.setOnClickListener(this)
    }

    private fun setFav(status: Boolean?) {
        if (status == true)
            button_favorite.setImageResource(R.drawable.ic_favorite_black_24dp)
        else
            button_favorite.setImageResource(R.drawable.ic_favorite_border_black_24dp)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_favorite) {
            if (status == true) {
                button_favorite.setImageResource(R.drawable.ic_favorite_border_black_24dp)
                Toast.makeText(this, resources.getString(R.string.del_fav), Toast.LENGTH_SHORT).show()
            } else {
                button_favorite.setImageResource(R.drawable.ic_favorite_black_24dp)
                Toast.makeText(this, resources.getString(R.string.in_fav), Toast.LENGTH_SHORT).show()
            }
            val film = viewModel.setFav()
            println("UPDATED DATA: $film")
        }
    }
}