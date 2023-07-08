package com.majid.conversionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import androidx.core.view.get

class MainActivity : AppCompatActivity() {
    private val userUnit =
        arrayOf("Inch", "Centimeter", "Meter", "Kilometer", "Miles", "Gram", "Kilogram", "Pound")
    private lateinit var spinnerFrom:Spinner
    private lateinit var spinnerTo:Spinner
    private lateinit var convertButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayAdapter =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, userUnit)

        spinnerFrom = findViewById<Spinner>(R.id.convertSpinnerFrom)
        spinnerFrom.adapter = arrayAdapter
        spinnerFrom.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(
                    applicationContext,
                    "Selected Unit is " + userUnit[position],
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(
                    applicationContext,
                    "Nothing Selected! Please select a unit",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        spinnerTo = findViewById<Spinner>(R.id.convertSpinnerTo)
        spinnerTo.adapter = arrayAdapter
        spinnerTo.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(
                    applicationContext,
                    "Selected Unit is " + userUnit[position],
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(
                    applicationContext,
                    "Nothing Selected! Please select a unit",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        convertButton = findViewById(R.id.convertButton)
        convertButton.setOnClickListener {
            Toast.makeText(
                this,
                "Unit is " + spinnerTo.selectedItem.toString(),
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}