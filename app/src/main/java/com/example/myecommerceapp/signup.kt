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


class signup : AppCompatActivity() {

    lateinit var memail : EditText
    lateinit var mpass : EditText
    lateinit var text : TextView
    lateinit var signUp : Button
    lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        memail = findViewById(R.id.email)
        mpass = findViewById(R.id.password)
        text = findViewById(R.id.textView2)
        signUp = findViewById(R.id.SignUpbutton)
        auth = FirebaseAuth.getInstance()

        text.setOnClickListener {

            startActivity(Intent(this,login::class.java))
        }

        signUp.setOnClickListener {

            createuser()
        }
    }


    private fun createuser() {

        val email = memail.getText().toString()
        val pass = mpass.getText().toString()

        if(email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()){

            if(pass.isNotEmpty()){

                auth.createUserWithEmailAndPassword(email,pass)


                    .addOnCompleteListener {

                        if(it.isSuccessful){

                            Toast.makeText(this,"Registered Successfully", Toast.LENGTH_SHORT).show()

                            val intent = Intent(this,login::class.java)
                            startActivity(intent)
                        }
                        else{

                            Toast.makeText(this,it.exception.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }

                    .addOnFailureListener {

                        Toast.makeText(this, "Registration Error!! Try Again", Toast.LENGTH_SHORT)
                            .show()
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

