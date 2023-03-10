package com.example.myecommerceapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class recent_adapter(private val recentlist:ArrayList<recent_data>):
    RecyclerView.Adapter<recent_adapter.recentViewHolder>() {

    class recentViewHolder(recentView: View):RecyclerView.ViewHolder(recentView){
        val imageView:ImageView = recentView.findViewById(R.id.imageviewrecent)
        val textView:TextView =recentView.findViewById(R.id.textviewrecent)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): recentViewHolder {
       val view =LayoutInflater.from(parent.context).inflate(R.layout.recent,parent,false)
        return recentViewHolder(view)
    }

    override fun onBindViewHolder(holder: recentViewHolder, position: Int) {
        val Recent =recentlist[position]
        holder.imageView.setImageResource(Recent.image)
        holder.textView.text= Recent.name
    }

    override fun getItemCount(): Int {
       return recentlist.size
    }
}