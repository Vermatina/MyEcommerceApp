package com.example.myecommerceapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class offer_adapter(private val offerlist : List<offer>): RecyclerView.Adapter<offer_adapter.offerViewHolder>() {

    class offerViewHolder(offerView: View) : RecyclerView.ViewHolder(offerView) {
        val offerimageView: ImageView = offerView.findViewById(R.id.imageview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): offerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.offer,parent,false)
        return offer_adapter.offerViewHolder(view)
    }

    override fun onBindViewHolder(holder: offerViewHolder, position: Int) {
        val item2 =offerlist[position]
        holder.offerimageView.setImageResource(item2.offerimage)

    }

    override fun getItemCount(): Int {
        return offerlist.size
    }
}