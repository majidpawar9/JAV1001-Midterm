package com.majid.conversionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import com.majid.conversionapp.databinding.ActivityMainBinding

////////////////////////
// SpinnerFrom is used to define the unit it is being converted FROM
// SpinnerTo is used to define the unit it is being converted TO
////////////////////////
class MainActivity : AppCompatActivity() {
    //Units array
    private val userUnit =
        arrayOf("Milimeter", "Centimeter", "Inch", "Meter", "Kilometer", "Miles")

    //used lateinit to keep to property from being initialized
    private lateinit var spinnerFrom:Spinner
    private lateinit var spinnerTo:Spinner
    private lateinit var convertButton: Button
    private lateinit var answerText: TextView
    private lateinit var binding: ActivityMainBinding

    //Main function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayAdapter =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, userUnit)


        var convertFromString:String = ""
        var convertToString:String = ""

        // Defining the spinner dropdown using arrayAdapter and assigning it the values of userUnit Array
        spinnerFrom = findViewById<Spinner>(R.id.convertSpinnerFrom)
        spinnerFrom.adapter = arrayAdapter
        spinnerFrom.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // When user selects a unit a toast message will be shown
                Toast.makeText(
                    applicationContext,
                    "Selected Unit is " + userUnit[position],
                    Toast.LENGTH_SHORT
                ).show()
                convertFromString = userUnit[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(
                    applicationContext,
                    "Nothing Selected! Please select a unit",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        // Defining the spinner dropdown using arrayAdapter and assigning it the values of userUnit Array
        spinnerTo = findViewById<Spinner>(R.id.convertSpinnerTo)
        spinnerTo.adapter = arrayAdapter
        spinnerTo.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // When user selects a unit a toast message will be shown
                Toast.makeText(
                    applicationContext,
                    "Selected Unit is " + userUnit[position],
                    Toast.LENGTH_SHORT
                ).show()
                convertToString = userUnit[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(
                    applicationContext,
                    "Nothing Selected! Please select a unit",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        // Getting the userInput and converting it to array of Characters
        var userInput = findViewById<TextView>(R.id.userInput)
        var userValue = userInput.getText()

        // Object of Conversion Class
        val con = Conversion()

        //
        answerText = findViewById(R.id.outputText)
        convertButton = findViewById(R.id.convertButton)

        convertButton.setOnClickListener {
            //Calling function of conversion class
            var result = con.conversionKit(userValue,convertFromString,convertToString)

            // Setting the result from conversionKit function to answerText
            answerText.setText(result)
        }
    }
}