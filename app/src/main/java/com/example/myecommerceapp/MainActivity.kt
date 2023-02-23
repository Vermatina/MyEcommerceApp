package com.example.myecommerceapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var  recyclerView1: RecyclerView
    private lateinit var itemlist:ArrayList<item>
    private lateinit var itemAdapter: item_adapter
    private lateinit var acc : LinearLayout
    private lateinit var  recyclerView2: RecyclerView
    private lateinit var offerlist:ArrayList<offer>
    private lateinit var offerAdapter: offer_adapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init1()
        init2()

        acc = findViewById(R.id.account_button)
        acc.setOnClickListener {
            val intent = Intent(this,account::class.java)
            startActivity(intent)
        }

    }


    private fun init1(){

        recyclerView1=findViewById(R.id.Recycle)
        recyclerView1.setHasFixedSize(true)
        recyclerView1.layoutManager= LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        itemlist=ArrayList()
        additem1()
        itemAdapter=item_adapter(itemlist)
        recyclerView1.adapter=itemAdapter


    }

    private fun additem1(){
        itemlist.add(item(R.drawable.im4,"Mens Wear"))
        itemlist.add(item(R.drawable.im10,"Womens Wear"))
        itemlist.add(item(R.drawable.im11,"Kids Wear"))
        itemlist.add(item(R.drawable.im12,"Shoes"))
        itemlist.add(item(R.drawable.im15,"Handbags"))
        itemlist.add(item(R.drawable.im14,"Womens Tshirt"))



    }




    private fun init2(){

        recyclerView2=findViewById(R.id.Recycle2)
        recyclerView2.setHasFixedSize(true)
        recyclerView2.layoutManager= LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        offerlist=ArrayList()
        additem2()
        offerAdapter=offer_adapter(offerlist)
        recyclerView2.adapter=offerAdapter


    }

    private fun additem2(){
       offerlist.add(offer(R.drawable.im4))
        offerlist.add(offer(R.drawable.im4))

    }
}