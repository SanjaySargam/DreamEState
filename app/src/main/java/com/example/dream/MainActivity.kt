package com.example.dream

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val signUp = findViewById<TextView>(R.id.SignUp)

        signUp.setOnClickListener {
            val intent = Intent(this@MainActivity,RegistrationActivity::class.java)
            startActivity(intent)
        }

        }



    }
