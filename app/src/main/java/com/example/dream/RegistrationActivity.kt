package com.example.dream

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        val login = findViewById<TextView>(R.id.login)
        login.setOnClickListener{
            val intent = Intent(this@RegistrationActivity,MainActivity::class.java)
            startActivity(intent)
        }

    }

}