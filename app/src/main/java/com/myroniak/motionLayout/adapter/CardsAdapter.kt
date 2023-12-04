package com.myroniak.motionLayout.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.myroniak.motionLayout.R
import com.myroniak.motionLayout.model.Item

class CardsAdapter(
    private val list: List<Item>,
    private val onItemClick: (item: Item) -> Unit
) :
    RecyclerView.Adapter<CardsAdapter.ViewHolder>() {

    override
    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return ViewHolder(onItemClick, v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val type = list[position]
        holder.bindData(type)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(private val onItemClick: (item: Item) -> Unit, itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        private val title = itemView.findViewById<TextView>(R.id.title)
        private val description = itemView.findViewById<TextView>(R.id.description)

        fun bindData(item: Item) {
            title.text = item.title
            description.text = item.description

            itemView.setOnClickListener {
                onItemClick(item)
            }
        }
    }
}