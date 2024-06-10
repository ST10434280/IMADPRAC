package com.example.imadprac1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val txtDay = findViewById<TextView>(R.id.txtDay)
        val txtMin = findViewById<TextView>(R.id.txtMin)
        val txtMax = findViewById<TextView>(R.id.txtMax)
        val txtCondition = findViewById<TextView>(R.id.txtCondition)
        val btnEx2 = findViewById<Button>(R.id.btnEx2)

        btnEx2.setOnClickListener {                                                             //IIE.2024
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }





    }
}