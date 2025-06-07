package org.example.lesson_10

fun main() {

    println("Бросить кубик? Введите \"да\" если готовы")
    val inputMove = readln()
    if (inputMove.equals(ACTIVATE_GAME, ignoreCase = true)) {
        println("Бросаю Zzz")
        Thread.sleep(3000)
        val resultUser = move()
        println("Ваш результат: $resultUser")

        println("Ход компьютера (зловещая пауза)")
        Thread.sleep(3000)
        val resultComputer = move()
        println("Результат компьютера: $resultComputer")

        when {
            resultUser > resultComputer -> println("Ура!! Человечество победило!")
            resultUser == resultComputer -> println("Напряженочка! Пока ничья.")
            else -> println("Восстание машин не за горами. Компьютер то победил.")
        }
    } else {
        println("Конец игры")
    }
}

fun move(): Int {
    val randomNumber = (1..6).random()
    return randomNumber
}

const val ACTIVATE_GAME = "да"