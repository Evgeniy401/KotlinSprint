package org.example.lesson_12

fun main() {

    val day1 = Weather2(25, 12, true)
    day1.printWeather2()
}

class Weather2(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var precipitation: Boolean,
) {

    fun printWeather2() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Осадки: $precipitation ")
        println()
    }
}