package org.example.lesson_12

fun main() {

    val day1 = Weather3(-248, -261, 7.5)
    day1.printWeather3()
}

class Weather3(dayTemperatureCalvin: Int, nightTemperatureCalvin: Int, precipitation: Double) {

    var dayTemperatureCelsius = dayTemperatureCalvin + 273
    var nightTemperatureCelsius = nightTemperatureCalvin + 273
    var precipitation: Double = precipitation

    fun printWeather3() {
        println("Дневная температура: $dayTemperatureCelsius°C")
        println("Ночная температура: $nightTemperatureCelsius°C")
        println("Осадки: $precipitation мм")
        println()
    }
}