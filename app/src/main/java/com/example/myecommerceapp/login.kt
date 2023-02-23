package com.example.myecommerceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_sign_up)

        val new1 =findViewById<TextView>(R.id.textView5)

        new1.setOnClickListener{

            startActivity(Intent(this,signup::class.java))
        }
    }
}