package com.example.myecommerceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val new =findViewById<TextView>(R.id.textView2)

        new.setOnClickListener{

            startActivity(Intent(this,login::class.java))
        }
    }
}

