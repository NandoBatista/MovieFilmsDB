package com.batista.filmsmoviedb.presentation.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.batista.filmsmoviedb.R
import com.batista.filmsmoviedb.domain.model.ResultMovie
import com.bumptech.glide.Glide

class HomeAdapter(val itemList: List<ResultMovie>): RecyclerView.Adapter<HomeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie,
            parent, false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val resultMovie = itemList[position]
        holder.bindItem(resultMovie)
    }


    override fun getItemCount(): Int {
        return itemList.size
    }
}

class HomeViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {

    private val imageView = itemView.findViewById<ImageView>(R.id.img_movie_item)

    fun bindItem(item: ResultMovie) {
        Glide.with(itemView.context)
            .load(item.poster_path)
            .into(imageView)
    }
}