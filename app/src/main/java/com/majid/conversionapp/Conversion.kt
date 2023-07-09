package com.majid.conversionapp

class Conversion {
    // ConversionKit function which accepts userUnit
    fun conversionKit(userValue: CharSequence, convertFrom:String, convertTo:String):String{
        val userValueString = userValue.toString()
        val userValueDouble = userValueString.toDouble()

        //If null value is passed
        if(userValueDouble==null){
            return "Please Enter a Value!"
        }
        var convertedValue = 0.0
        var result = ""

        //if negative value is passed
        if (userValueDouble < 0) {
            result = "Please Enter a Positive Value"
        }
        // Conversion Kit to convert from every unit
        else{
            when (convertFrom){
                "Milimeter" -> {
                    when(convertTo){
                        "Centimeter" -> {convertedValue = userValueDouble * 0.1}
                        "Inch" -> {convertedValue = userValueDouble * 0.0393701}
                        "Meter" -> {convertedValue = userValueDouble * 0.001}
                        "Kilometer" -> {convertedValue = userValueDouble * 0.000001}
                        "Miles" -> {convertedValue = userValueDouble * 0.000000621371}
                        "Milimeter" -> {convertedValue = userValueDouble * 1}
                    }
                }
                "Centimeter" -> {
                    when(convertTo){
                        "Milimeter" -> {convertedValue = userValueDouble * 10}
                        "Inch" -> {convertedValue = userValueDouble * 0.393701}
                        "Meter" -> {convertedValue = userValueDouble * 0.01}
                        "Kilometer" -> {convertedValue = userValueDouble * 0.00001}
                        "Miles" -> {convertedValue = userValueDouble * 0.00000621371}
                        "Centimeter" -> {convertedValue = userValueDouble * 1}
                    }
                }
                "Inch" -> {
                    when(convertTo){
                        "Milimeter" -> {convertedValue = userValueDouble * 25.4}
                        "Centimeter" -> {convertedValue = userValueDouble * 2.54}
                        "Meter" -> {convertedValue = userValueDouble * 0.0254}
                        "Kilometer" -> {convertedValue = userValueDouble * 0.0000254}
                        "Miles" -> {convertedValue = userValueDouble * 0.00000157828}
                        "Inch" -> {convertedValue = userValueDouble * 1}
                    }
                }
                "Meter" -> {
                    when(convertTo){
                        "Milimeter" -> {convertedValue = userValueDouble * 1000}
                        "Centimeter" -> {convertedValue = userValueDouble * 100}
                        "Inch" -> {convertedValue = userValueDouble * 39.3701}
                        "Kilometer" -> {convertedValue = userValueDouble * 0.001}
                        "Miles" -> {convertedValue = userValueDouble * 0.000621371}
                        "Meter" -> {convertedValue = userValueDouble * 1}
                    }
                }
                "Kilometer" -> {
                    when(convertTo){
                        "Milimeter" -> {convertedValue = userValueDouble * 1000000}
                        "Centimeter" -> {convertedValue = userValueDouble * 100000}
                        "Inch" -> {convertedValue = userValueDouble * 39370.1}
                        "Meter" -> {convertedValue = userValueDouble * 1000}
                        "Miles" -> {convertedValue = userValueDouble * 0.621371}
                        "Kilometer" -> {convertedValue = userValueDouble * 1}
                    }
                }
                "Miles" -> {
                    when(convertTo){
                        "Milimeter" -> {convertedValue = userValueDouble * 1609344}
                        "Centimeter" -> {convertedValue = userValueDouble * 160934}
                        "Inch" -> {convertedValue = userValueDouble * 63360}
                        "Meter" -> {convertedValue = userValueDouble * 1609.34}
                        "Kilometer" -> {convertedValue = userValueDouble * 1.60934}
                        "Miles" -> {convertedValue = userValueDouble * 1}
                    }
                }
            }
            result = convertedValue.toString()
        }

        return result
    }
}