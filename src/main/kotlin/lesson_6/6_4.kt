package lesson_6

fun main() {

    var numberTry = 5
    val correctNumber = (1..9).random()

    while (numberTry >= ZERO) {
        println("Угадайте число")
        val inputNumber = readln().toInt()

        if (inputNumber == correctNumber) {
            println("Это была великолепная игра! Вы угадали число $correctNumber")
            break

        } else if (numberTry == ONE) {
            println("К сожалению, вы проиграли!")
            println("Правильное число было $correctNumber")
            break

        } else {
            numberTry--
            println("Неверно! Осталось попыток: $numberTry")
        }
    }
}

const val ZERO = 0
const val ONE = 1