package com.example.myecommerceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class category : AppCompatActivity() {

    private lateinit var  recyclerView: RecyclerView
    private lateinit var catlist:ArrayList<cat>
    private lateinit var catAdapter: cat_adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)


        init3()

    }


    private fun init3(){

        recyclerView=findViewById(R.id.Recycle1)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        catlist=ArrayList()
        additem3()
        catAdapter=cat_adapter(catlist)
        recyclerView.adapter=catAdapter




    }

    private fun additem3(){
        catlist.add(cat(R.drawable.im4,"Mens Wear"))
        catlist.add(cat(R.drawable.im10,"Womens Wear"))
        catlist.add(cat(R.drawable.im11,"Kids Wear"))
        catlist.add(cat(R.drawable.im12,"Shoes"))
        catlist.add(cat(R.drawable.im15,"Handbags"))
       catlist.add(cat(R.drawable.im14,"Womens Tshirt"))



    }






}