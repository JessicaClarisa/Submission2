package com.ata.appbundle.core.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ata.appbundle.core.R
import com.ata.appbundle.core.domain.model.Film
import com.bumptech.glide.Glide

class FilmAdapter(type: Int) : RecyclerView.Adapter<FilmAdapter.ListViewHolder>() {
    private var listFilm = ArrayList<Film>()
    private val filmType = type
    var onItemClick: ((Film) -> Unit)? = null

    fun setFilms(films: List<Film>?) {
        if (films == null) return
        listFilm.clear()
        listFilm.addAll(films)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_film, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listFilm.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val film = listFilm[position]
        Glide.with(holder.itemView.context)
            .load(film.poster)
            .into(holder.imgPhoto)
        holder.tvName.text = film.title
        holder.tvDetail.text = film.genre

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(listFilm[position])
        }
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }


}