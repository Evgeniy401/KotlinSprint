package org.example.lesson_7

fun main() {

    println("Введите время (в секундах):")
    val inputTime = readln().toInt()

    for (i in inputTime downTo 0) {
        if (i > 0) {
            println("Осталось секунд: $i")
        } else {
            println("Время вышло")
        }
        Thread.sleep(1000)
    }
}