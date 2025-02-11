package com.example.cashmap

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val buttonChangeBank = findViewById<Button>(R.id.button_ChangeBank)
        val buttonMap = findViewById<Button>(R.id.button_Map)

        buttonChangeBank.setOnClickListener {
            val intent = Intent(this, OnBoarding::class.java)
            startActivity(intent)
        }

        buttonMap.setOnClickListener {
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }

    }
}