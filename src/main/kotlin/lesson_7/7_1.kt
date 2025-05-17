package org.example.lesson_7

fun main() {

    var password = ""

    var numbers = (0..9).random()
    var symbol = ('a'..'z').random()

    for (i in 1..6) {
        password += if (i % 2 == 1) {
            symbol++.toString()
        } else {
            numbers++.toString()
        }
    }

    println(password)
}