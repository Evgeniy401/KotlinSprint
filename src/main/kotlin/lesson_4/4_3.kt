package org.example.lesson_4

fun main() {

    val sunnyWeather: Boolean = true
    val openAwning: Boolean = true
    val airHumidity = 20
    val timeOfYear = "зима"
    val isWinter: Boolean = timeOfYear == "зима"

    val favorableConditions: Boolean = sunnyWeather == true && openAwning == true && airHumidity == 20 && isWinter == false

    println("Благоприятные условия для роста бобовых: $favorableConditions")

}