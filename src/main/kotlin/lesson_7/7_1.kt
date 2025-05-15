package org.example.lesson_7

fun main() {

    var password = ""

    for (i in 1..6) {
        val symbol = when (i) {
            1, 3, 5 -> (1..9).random().toString()
            2, 4, 6 -> ('a'..'z').random().toString()
            else -> ""
        }
        password += symbol
    }

    println(password)
}