package org.example

fun main() {
        // Fill in the code.
    }


    fun printFinalTemperature(
        initialMeasurement: Double,
        initialUnit: String,
        finalUnit: String,
        conversionFormula: (Double) -> Double
    ) {
        val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
        println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
    }