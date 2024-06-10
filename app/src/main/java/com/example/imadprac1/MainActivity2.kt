package com.example.imadprac1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    private lateinit var edtDay: EditText
    private lateinit var tempHigh: EditText
    private lateinit var tempLow: EditText
    private lateinit var txtResults: TextView
    private lateinit var btnAdd: Button
    private lateinit var btnCalc: Button
    private lateinit var btnClear: Button
    private lateinit var btnNext2: Button
    private lateinit var btnEx: Button
    private var dayArray = mutableListOf<String>()
    private var highArray = mutableListOf<Int>()
    private var lowArray = mutableListOf<Int>()
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        edtDay = findViewById<EditText>(R.id.edtDay)
        tempHigh = findViewById<EditText>(R.id.tempHigh)
        tempLow = findViewById<EditText>(R.id.tempLow)
        txtResults = findViewById<TextView>(R.id.txtResults)
        btnAdd = findViewById<Button>(R.id.btnAdd)
        btnCalc = findViewById<Button>(R.id.btnCalc)
        btnClear = findViewById<Button>(R.id.btnClear)
        btnNext2 = findViewById<Button>(R.id.btnNext2)
        btnEx = findViewById<Button>(R.id.btnEx)


        btnAdd.setOnClickListener {                                                           //IIE.2024
            val input = edtDay.text.toString()                                                       //IIE.2024
            val hTemp = tempHigh.text.toString().toIntOrNull()                                       //IIE.2024
            val lTemp = tempLow.text.toString().toIntOrNull()                                        //IIE.2024
            if (input.isNotEmpty() && hTemp != null && lTemp != null) {                              //IIE.2024
                if (count < 7) {                                                                     //IIE.2024

                    dayArray.add(input)                                                             // Kotlin.V2.0.0, 2024
                    highArray.add(hTemp)                                                             // Kotlin.V2.0.0, 2024
                    lowArray.add(lTemp)                                                              // Kotlin.V2.0.0, 2024
                    count++
                } else
                    edtDay.setText(" ")
                tempHigh.text.clear()
                tempLow.text.clear()

            }
        }
        btnCalc.setOnClickListener {
            if (highArray.size == 7 && lowArray.size == 7) {
                val sumHigh = highArray.sum()                                                       //Christopher. 2018
                val sumLow = lowArray.sum()                                                         //Christopher. 2018
                val aveTemp = (sumHigh + sumLow) / 14
                txtResults.text = "The average temperature for the week is:${aveTemp} degrees"
            }


            btnClear.setOnClickListener {                                                    //IIE.2024
                edtDay.setText(" ")
                tempHigh.setText(" ")
                tempLow.setText(" ")
                txtResults.setText(" ")
                count--
            }

            btnNext2.setOnClickListener {                                                    //IIE.2024
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            }

            btnEx.setOnClickListener {                                                       //IIE.2024
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
//REFERANCE LIST
// The Independent Institute of education, introduction to mobile application development Module manual 2024.
// Stackoverflow, Christopher.2018. How can sum the elements in array in kotlin language? [online] available at:https://stackoverflow.com/questions/49885665/how-can-sum-the-elements-in-array-in-kotlin-language [accessed 10 june 2024]
// Kotlin.V2.0.0, 2024. [online] avaliable at: https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-mutable-set/add.html#:~:text=Adds%20the%20specified%20element%20to,already%20contained%20in%20the%20set.