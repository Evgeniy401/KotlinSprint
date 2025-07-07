package org.example.lesson_12

fun main() {

    val day1 = Weather2(25, 12, 7.5)
    day1.printWeather2()
}

class Weather2(var dayTemperature: Int, var nightTemperature: Int, var precipitation: Double) {

    fun printWeather2() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Осадки: $precipitation мм")
        println()
    }
}