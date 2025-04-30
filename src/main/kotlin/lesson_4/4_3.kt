package org.example.lesson_4

fun main() {

    val favorableConditions: Boolean = isSunny && isAwningOpen && airHumidity == 20 && timeOfYear != "зима"

    println("Благоприятные условия для роста бобовых: $favorableConditions")

}

const val isSunny: Boolean = true
const val isAwningOpen: Boolean = true
const val airHumidity = 20
const val timeOfYear = "зима"