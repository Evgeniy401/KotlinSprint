package org.example.lesson_12

fun main() {
    val day1 = Weather3(261, 248, 7.5)
    day1.printWeather3()
}

class Weather3(
    dayTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    precipitation: Double,
) {

    val dayTemperatureCelsius = dayTemperatureKelvin - 273
    val nightTemperatureCelsius = nightTemperatureKelvin - 273
    val precipitation: Double = precipitation

    fun printWeather3() {
        println("Дневная температура: $dayTemperatureCelsius°C")
        println("Ночная температура: $nightTemperatureCelsius°C")
        println("Осадки: $precipitation мм")
        println()
    }
}