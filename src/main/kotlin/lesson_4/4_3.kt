package org.example.lesson_4

fun main() {

    val isSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val airHumidity = 20
    val isWinter = true

    val favorableConditions: Boolean = (isSunny == isSunnyFavorableConditions) && (isAwningOpen == isAwningOpenFavorableConditions)
        && (airHumidity == airHumidityFavorableConditions) && (isWinter == isWinterFavorableConditions)

    println("Благоприятные условия для роста бобовых: $favorableConditions")

}

const val isSunnyFavorableConditions: Boolean = true
const val isAwningOpenFavorableConditions: Boolean = true
const val airHumidityFavorableConditions = 20
const val isWinterFavorableConditions: Boolean = false


