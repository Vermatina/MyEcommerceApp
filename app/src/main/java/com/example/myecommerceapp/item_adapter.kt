package com.example.myecommerceapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class item_adapter(private val itemlist : List<item>):RecyclerView.Adapter<item_adapter.itemViewHolder>() {

    class itemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val itemimageView :ImageView =itemView.findViewById(R.id.imageview)
        val itemname : TextView= itemView.findViewById(R.id.textview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        return itemViewHolder(view)
    }

    override fun onBindViewHolder(holder: itemViewHolder, position: Int) {
      val item1 =itemlist[position]
        holder.itemimageView.setImageResource(item1.itemimage)
        holder.itemname.text=item1.itemname
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }

}