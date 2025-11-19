package com.example.ca1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            val user = findViewById<EditText>(R.id.username)
            val pass = findViewById<EditText>(R.id.password)
        val result = findViewById<TextView>(R.id.result)
            val btnSub = findViewById<Button>(R.id.btn)

        btnSub.setOnClickListener {
            val username = user.text.toString()
            val password = pass.text.toString()
            result.text = "Username: $username and Password: $password"
        }

    }
}
