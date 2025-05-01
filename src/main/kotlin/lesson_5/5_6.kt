package lesson_5

import kotlin.math.pow

fun main() {

    println("Введите ваш вес в килограммах, не стесняйтесь!")
    val weight: Float = readln().toFloat()

    println("Введите ваш рост в сантиметрах!")
    val height: Float = readln().toFloat()

    val imt = weight / ((height * ONE_METER).pow(SQUARE))
    val imtFormatted = "%.2f".format(imt)

    println(
        when {
            imtFormatted < UNDERWEIGHT.toString() -> "$PREFIX $imtFormatted \nНедостаточная масса тела"
            imtFormatted < NORMAL_WEIGHT.toString() -> "$PREFIX $imtFormatted \nНормальная масса тела"
            imtFormatted < EXCESSIVE_WEIGHT.toString() -> "$PREFIX $imtFormatted \nИзбыточная масса тела"
            else -> "$PREFIX $imtFormatted \nОжирение"
        }
    )

}

const val ONE_METER = 0.01
const val SQUARE = 2
const val PREFIX = "Ваш персональный индекс массы тела:"

const val UNDERWEIGHT = 18.5
const val NORMAL_WEIGHT = 25
const val EXCESSIVE_WEIGHT = 30



