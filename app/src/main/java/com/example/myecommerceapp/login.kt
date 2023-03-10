package com.example.myecommerceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class login : AppCompatActivity() {

    lateinit var memail : EditText
    lateinit var mpass : EditText
    lateinit var auth : FirebaseAuth
    lateinit var login : Button
    lateinit var text : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_sign_up)

        memail = findViewById(R.id.email1)
        mpass = findViewById(R.id.password1)
        auth = FirebaseAuth.getInstance()

        login = findViewById(R.id.loginbutton)

        text = findViewById(R.id.textView5)

        login.setOnClickListener {

            LoginUser()
        }
        text.setOnClickListener {

            startActivity(Intent(this,signup::class.java))
        }
    }

    private fun LoginUser() {

        val email = memail.getText().toString()
        val pass = mpass.getText().toString()

        if(email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()){

            if(pass.isNotEmpty()){

                auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener {

                    if(it.isSuccessful){

                        Toast.makeText(this,"Login Successfully", Toast.LENGTH_SHORT).show()

                        val intent2 = Intent(this,account::class.java)
                        intent2.putExtra(account.account_status,"1")
                        intent2.putExtra(account.name,email)

                        startActivity(intent2)
                    }
                    else{

                        Toast.makeText(this,"Login Failed", Toast.LENGTH_SHORT).show()
                    }
                }

            }
            else{
                mpass.setError("Please Enter Your Password!")
            }
        }
        else if(email.isEmpty()){

            memail.setError("Please Enter Your Email")
        }
        else{
            memail.setError("Please Enter Your Correct Email")
        }
    }
}