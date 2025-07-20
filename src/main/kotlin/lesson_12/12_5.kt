package org.example.lesson_12
import kotlin.random.Random

fun main() {
    val monthlyTemperature: MutableList<Weather5> = mutableListOf()
    var numberDay = 0

    for (i in 1..30) {
        numberDay++
        val currentDay = Weather5(
            dayTemperatureKelvin = (295..301).random(),
            nightTemperatureKelvin = (287..294).random(),
            precipitation = Random.nextBoolean()
        )
        monthlyTemperature.add(currentDay)
    }

    val dayTemperature = monthlyTemperature.map { it.dayTemperatureCelsius }
    val nightTemperature = monthlyTemperature.map { it.nightTemperatureCelsius }
    val daysWithPrecipitation = monthlyTemperature.count { it.precipitation }

    println("Средняя дневная температура: %.1f°C".format(dayTemperature.average()))
    println("Средняя ночная температура: %.1f°C".format(nightTemperature.average()))
    println("Дни с осадками: $daysWithPrecipitation")
}

class Weather5(
    val dayTemperatureKelvin: Int,
    val nightTemperatureKelvin: Int,
    val precipitation: Boolean,
) {
    val dayTemperatureCelsius = dayTemperatureKelvin - 273
    val nightTemperatureCelsius = nightTemperatureKelvin - 273

}