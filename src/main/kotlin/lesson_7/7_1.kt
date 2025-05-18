package org.example.lesson_7

fun main() {

    var password = ""

    val chars: CharRange = 'a'..'z'
    val ints: IntRange = 0..9

    for (i in 1..6) {
        password += if (i % 2 == 0) {
            chars.random()
        } else {
            ints.random()
        }
    }

    println(password)
}