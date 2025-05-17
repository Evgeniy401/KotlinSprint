package org.example.lesson_7

fun main() {

    println("Введите число:")
    val inputNumber = readln().toInt()

    val numbers = 2..inputNumber step 2

    for (i in numbers) {
        println(i)
    }
}