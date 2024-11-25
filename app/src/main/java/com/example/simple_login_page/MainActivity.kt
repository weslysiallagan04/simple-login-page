package com.example.simple_login_page

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    lateinit var username: EditText
    lateinit var password: EditText
    lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        loginButton = findViewById(R.id.buttonLogin)

        loginButton.setOnClickListener{
            val usernamelogin = username.text.toString()
            val passwordlogin = password.text.toString()
            Log.i("Testing Login", "Username : $usernamelogin and password : $passwordlogin")
        }

    }
}