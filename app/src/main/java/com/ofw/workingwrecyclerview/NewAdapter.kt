package com.ofw.workingwrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewAdapter(val items:ArrayList<String>): RecyclerView.Adapter<NewViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return NewViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewViewHolder, position: Int) {
        val currentItem=items[position]
        holder.titleView.text=currentItem
    }

    override fun getItemCount(): Int {
        return items.size
     }
}
class NewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
val titleView:TextView=itemView.findViewById(R.id.item_title)
}