package com.example.myecommerceapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var  recyclerView: RecyclerView
    private lateinit var itemlist:ArrayList<item>
    private lateinit var itemAdapter: item_adapter
    private lateinit var acc : LinearLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        acc = findViewById(R.id.account_button)
        acc.setOnClickListener {
            val intent = Intent(this,account::class.java)
            startActivity(intent)
        }

    }


    private fun init(){

        recyclerView=findViewById(R.id.Recycle)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager= LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        itemlist=ArrayList()
        additem()
        itemAdapter=item_adapter(itemlist)
        recyclerView.adapter=itemAdapter


    }

    private fun additem(){
        itemlist.add(item(R.drawable.im4,"Mens Wear"))
        itemlist.add(item(R.drawable.im4,"Mens Wear"))
        itemlist.add(item(R.drawable.im4,"Mens Wear"))
        itemlist.add(item(R.drawable.im4,"Mens Wear"))
        itemlist.add(item(R.drawable.im4,"Mens Wear"))
        itemlist.add(item(R.drawable.im4,"Mens Wear"))
    }
}