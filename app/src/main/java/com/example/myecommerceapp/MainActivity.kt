package com.example.myecommerceapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
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
    private lateinit var cat: LinearLayout
    private lateinit var recyclerView3: RecyclerView
    private lateinit var recentlist:ArrayList<recent_data>
    private lateinit var recentAdapter: recent_adapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init1()
        init2()
        init4()

        acc = findViewById(R.id.account_button)
        cat =findViewById(R.id.category_button)
        acc.setOnClickListener {
            val intent = Intent(this,account::class.java)
            startActivity(intent)
        }

        cat.setOnClickListener{
            val intent1 = Intent(this,category::class.java)
            startActivity(intent1)
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
       offerlist.add(offer(R.drawable.im20))
        offerlist.add(offer(R.drawable.im18))
        offerlist.add(offer(R.drawable.im17))

    }



    private fun init4(){
        recyclerView3=findViewById(R.id.Recycle3)
        recyclerView3.setHasFixedSize(true)
        recyclerView3.layoutManager=  GridLayoutManager(this,2)
        recentlist = ArrayList()
        additem4()
        recentAdapter=recent_adapter(recentlist)
        recyclerView3.adapter=recentAdapter

    }

    private fun additem4(){

        recentlist.add(recent_data(R.drawable.im4,"Rs.500"))
        recentlist.add(recent_data(R.drawable.im10,"Rs.800"))
        recentlist.add(recent_data(R.drawable.im11,"Rs.400"))
        recentlist.add(recent_data(R.drawable.im12,"Rs.1200"))
        recentlist.add(recent_data(R.drawable.im15,"Rs.1500"))
        recentlist.add(recent_data(R.drawable.im14,"Rs.250"))

    }
}