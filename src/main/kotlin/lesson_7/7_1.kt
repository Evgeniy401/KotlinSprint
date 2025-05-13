package org.example.lesson_7

fun main() {

    val (num1, num3, num5) = List(3) { (1..9).random() }
    val (num2, num4, num6) = List(3) { ('a'..'z').random() }

    println("$num1$num2$num3$num4$num5$num6")

}