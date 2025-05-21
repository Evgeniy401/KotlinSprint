package org.example.lesson_7

fun main() {

    val chars = 'a'..'z'
    val charsCapitals = 'A'..'Z'
    val digits = '0'..'9'

    val allVariants = (chars + charsCapitals + digits)
    val password: MutableList<Char> = mutableListOf()

    println("Введите размер пароля:")
    var sizePassword = readln().toInt()

    if (sizePassword < 6) {
        sizePassword = MINIMAL_SIZE
    }

    password.add(chars.random())
    password.add(charsCapitals.random())
    password.add(digits.random())

    while (password.size < sizePassword) {
        password.add(allVariants.random())
    }

    password.shuffle()
    val result = password.joinToString("")
    println("Ваш пароль: $result")

}

const val MINIMAL_SIZE = 6