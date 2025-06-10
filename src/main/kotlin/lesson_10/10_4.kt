package org.example.lesson_10

fun main() {
    println("Вы готовы к игре? Введите \"да\" если готовы")

    if (readln().equals(ACTIVATE, ignoreCase = true)) {
        var userWins = 0
        var computerWins = 0
        var draws = 0

        do {
            val result = round()
            when (result) {
                1 -> userWins++
                -1 -> computerWins++
                0 -> draws++
            }

            println("Бросить кости еще раз?")
        } while (readln().equals(ACTIVATE, ignoreCase = true))

        println("""
            Итоги игры:
            Ваши победы: $userWins
            Победы компьютера: $computerWins
            Ничьи: $draws
        """.trimIndent())
    } else {
        println("Конец игры")
    }
}

fun move(): Int = (1..6).random()

fun round(): Int {
    println("Бросаю Zzz")
    Thread.sleep(3000)
    val resultUser = move()
    println("Ваш результат: $resultUser")

    println("Ход компьютера (зловещая пауза)")
    Thread.sleep(3000)
    val resultComputer = move()
    println("Результат компьютера: $resultComputer")

    return when {
        resultUser > resultComputer -> {
            println("Ура!! Человечество победило!")
            1
        }
        resultUser == resultComputer -> {
            println("Напряженочка! Пока ничья.")
            0
        }
        else -> {
            println("Восстание машин не за горами. Компьютер то победил.")
            -1
        }
    }
}

const val ACTIVATE = "да"