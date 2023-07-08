package com.majid.conversionapp
fun main(){
    val con = Conversion()
    println(con.conversionKit("123444", "Milimeter","Centimeter"))
}

class Conversion {
    fun conversionKit(userUnit: CharSequence, convertFrom:String, convertTo:String):String{
        val userUnitString = userUnit.toString()
        val userUnitInt = userUnitString.toDouble()
        var convertedValue = 0.0
        var result = ""
        if (userUnitInt < 0) {
            result = "Please Enter a Positive Value"
        }
        else{
            when (convertFrom){
                "Milimeter" -> {
                    when(convertTo){
                        "Centimeter" -> {convertedValue = userUnitInt * 0.1}
                        "Inch" -> {convertedValue = userUnitInt * 0.0393701}
                        "Meter" -> {convertedValue = userUnitInt * 0.001}
                        "Kilometer" -> {convertedValue = userUnitInt * 0.000001}
                        "Miles" -> {convertedValue = userUnitInt * 0.000000621371}
                        "Milimeter" -> {convertedValue = userUnitInt * 1}
                    }
                }
                "Centimeter" -> {
                    when(convertTo){
                        "Milimeter" -> {convertedValue = userUnitInt * 10}
                        "Inch" -> {convertedValue = userUnitInt * 0.393701}
                        "Meter" -> {convertedValue = userUnitInt * 0.01}
                        "Kilometer" -> {convertedValue = userUnitInt * 0.00001}
                        "Miles" -> {convertedValue = userUnitInt * 0.00000621371}
                        "Centimeter" -> {convertedValue = userUnitInt * 1}
                    }
                }
                "Inch" -> {
                    when(convertTo){
                        "Milimeter" -> {convertedValue = userUnitInt * 25.4}
                        "Centimeter" -> {convertedValue = userUnitInt * 2.54}
                        "Meter" -> {convertedValue = userUnitInt * 0.0254}
                        "Kilometer" -> {convertedValue = userUnitInt * 0.0000254}
                        "Miles" -> {convertedValue = userUnitInt * 0.00000157828}
                        "Inch" -> {convertedValue = userUnitInt * 1}
                    }
                }
                "Meter" -> {
                    when(convertTo){
                        "Milimeter" -> {convertedValue = userUnitInt * 1000}
                        "Centimeter" -> {convertedValue = userUnitInt * 100}
                        "Inch" -> {convertedValue = userUnitInt * 39.3701}
                        "Kilometer" -> {convertedValue = userUnitInt * 0.001}
                        "Miles" -> {convertedValue = userUnitInt * 0.000621371}
                        "Meter" -> {convertedValue = userUnitInt * 1}
                    }
                }
                "Kilometer" -> {
                    when(convertTo){
                        "Milimeter" -> {convertedValue = userUnitInt * 1000000}
                        "Centimeter" -> {convertedValue = userUnitInt * 100000}
                        "Inch" -> {convertedValue = userUnitInt * 39370.1}
                        "Meter" -> {convertedValue = userUnitInt * 1000}
                        "Miles" -> {convertedValue = userUnitInt * 0.621371}
                        "Kilometer" -> {convertedValue = userUnitInt * 1}
                    }
                }
                "Miles" -> {
                    when(convertTo){
                        "Milimeter" -> {convertedValue = userUnitInt * 1609344}
                        "Centimeter" -> {convertedValue = userUnitInt * 160934}
                        "Inch" -> {convertedValue = userUnitInt * 63360}
                        "Meter" -> {convertedValue = userUnitInt * 1609.34}
                        "Kilometer" -> {convertedValue = userUnitInt * 1.60934}
                        "Miles" -> {convertedValue = userUnitInt * 1}
                    }
                }
            }
            result = convertedValue.toString()
        }

        return result
    }
}