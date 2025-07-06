package org.example.lesson_12

fun main() {

    val day1 = Weather()
    val day2 = Weather()

    day1.printWeather()
    day2.printWeather()

    day1.dayTemperature = 30
    day1.nightTemperature = 21
    day1.precipitation = 1.2

    day2.dayTemperature = 29
    day2.nightTemperature = 17
    day2.precipitation = 5.2

}

class Weather() {
    var dayTemperature = 25
    var nightTemperature = 18
    var precipitation = 7.5

    fun printWeather() {
        println("Дневная температура: $dayTemperature°C")
        println("Ночная температура: $nightTemperature°C")
        println("Осадки: $precipitation мм")
        println()
    }
}