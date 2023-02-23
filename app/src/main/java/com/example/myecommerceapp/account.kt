package com.example.myecommerceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class account : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val sin = findViewById<Button>(R.id.sign_in_button)

        sin.setOnClickListener{

            startActivity(Intent(this,signup::class.java))
        }
    }
}