package com.trash2money.listafilmes.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.trash2money.listafilmes.R
import com.trash2money.listafilmes.model.Filmes
import kotlinx.android.synthetic.main.filme_item.view.*

class FilmesAdapter(val filmes: MutableList<Filmes>) :
    RecyclerView.Adapter<FilmesAdapter.FilmesViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.filme_item, parent, false)
        return FilmesViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilmesViewHolder, position: Int) {
        holder.bind(filmes[position])
    }

    override fun getItemCount(): Int = filmes.size


    inner class FilmesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(filmes: Filmes) {
            with(filmes) {
                itemView.img_filmes.setImageResource(filmes.img)

            }
        }
    }
}