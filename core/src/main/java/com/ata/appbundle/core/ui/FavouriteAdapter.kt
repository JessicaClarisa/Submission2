package com.ata.appbundle.core.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ata.appbundle.core.R
import com.ata.appbundle.core.domain.model.Film
import com.bumptech.glide.Glide

class FavouriteAdapter: RecyclerView.Adapter<FavouriteAdapter.ListViewHolder>() {
    private var listFilm = ArrayList<Film>()
    var onItemClick: ((Film) -> Unit)? = null

    fun setFilms(films: List<Film>?) {
        if (films == null) return
        listFilm.clear()
        listFilm.addAll(films)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_fav, viewGroup, false)
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
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name_fav)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail_fav)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo_fav)
    }


}