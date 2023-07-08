package com.majid.conversionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val userUnit = arrayOf("Inch","Centimeter","Meter","Kilometer","Miles","Gram","Kilogram","Pound")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spinnerFrom = findViewById<Spinner>(R.id.convertSpinnerFrom)
        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,userUnit)
        spinnerFrom.adapter = arrayAdapter
        spinnerFrom.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(applicationContext,"Selected Unit is "+userUnit[position],Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(applicationContext,"Nothing Selected! Please select a unit",Toast.LENGTH_SHORT).show()
            }
        }
        val spinnerTo = findViewById<Spinner>(R.id.convertSpinnerTo)
        spinnerTo.adapter = arrayAdapter
        spinnerTo.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(applicationContext,"Selected Unit is "+userUnit[position],Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(applicationContext,"Nothing Selected! Please select a unit",Toast.LENGTH_SHORT).show()
            }
        }
    }

}