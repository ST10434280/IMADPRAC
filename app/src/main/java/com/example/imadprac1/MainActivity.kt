package com.example.imadprac1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNext = findViewById<Button>(R.id.btnNext)                                            //IIE.2024
        btnNext.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
             startActivity(intent)
        }
    }
}