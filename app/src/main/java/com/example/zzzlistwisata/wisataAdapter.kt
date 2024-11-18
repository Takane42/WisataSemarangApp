package com.example.zzzlistwisata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class wisataAdapter(
    private val wisataList: List<wisataData>,
    private val onItemClick: (wisataData) -> Unit
) : RecyclerView.Adapter<wisataAdapter.WisataViewHolder>() {
    inner class WisataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView: ImageView = itemView.findViewById(R.id.imageWisata)
        private val titleView: TextView = itemView.findViewById(R.id.titleWisata)
        private val descView: TextView = itemView.findViewById(R.id.descSingkatWisata)

        fun bind(wisata: wisataData) {
            imageView.setImageResource(wisata.imageResId)
            titleView.text = wisata.title
            descView.text = wisata.description

            itemView.setOnClickListener {
                onItemClick(wisata)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WisataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.wisata_card, parent, false)
        return WisataViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: WisataViewHolder,
        position: Int,
    ) {
        holder.bind(wisataList[position])
    }

    override fun getItemCount(): Int {
        return wisataList.size
    }
}