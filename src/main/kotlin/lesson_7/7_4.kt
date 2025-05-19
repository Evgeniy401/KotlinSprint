package org.example.lesson_7

fun main() {

    println("Введите время (в секундах):")
    val inputTime = readln().toInt()

    for (i in inputTime downTo 1) {
        println("Осталось секунд: $i")
        Thread.sleep(1000)
    }
    println("Время вышло")
}