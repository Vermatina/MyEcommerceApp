package com.example.myecommerceapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class cat_adapter(private val catlist : List<cat>): RecyclerView.Adapter<cat_adapter.catViewHolder>() {

    class catViewHolder(catView: View): RecyclerView.ViewHolder(catView){
        val catimageView : ImageView =catView.findViewById(R.id.imageviewcat)
        val catname : TextView = catView.findViewById(R.id.textviewcat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): catViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.category,parent,false)
        return catViewHolder(view)
    }

    override fun onBindViewHolder(holder: catViewHolder, position: Int) {
        val item1 =catlist[position]
        holder.catimageView.setImageResource(item1.catimage)
        holder.catname.text=item1.catname
    }

    override fun getItemCount(): Int {
        return catlist.size
    }

}


























