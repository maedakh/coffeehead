package com.example.coffeehead

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_row_hero.view.*

class ListCoffeeAdapter(
    private val listCoffee: ArrayList<Coffee>, val context: Context
) : RecyclerView.Adapter<ListCoffeeAdapter.ViewHolder>() {

    private var onItemClickCallback: OnItemClickCallback? = null

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row_hero, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listCoffee[position])
    }

    override fun getItemCount(): Int {
        return listCoffee.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: Coffee) {
            with(itemView) {
                tv_item_name.text = data.name
                tv_item_detail.text = data.detail
                Glide.with(this)
                    .load(data.photo)
                    .into(img_item_photo)

                itemView.setOnClickListener { onItemClickCallback?.onItemClicked(data) }
            }
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Coffee)
    }
}