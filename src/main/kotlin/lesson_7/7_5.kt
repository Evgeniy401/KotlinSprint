package org.example.lesson_7

fun main() {

    val chars = 'a'..'z'
    val charsCapitals = 'A'..'Z'
    val digits = '0'..'9'

    val variant = arrayOf(chars, charsCapitals, digits)
    var password = ""
    var sizePassword: Int

    do {
        println("Введите размер пароля:")
        sizePassword = readln().toInt()

        if (sizePassword < 6) {
            println("Пароль должен содержать не менее шести символов")
        } else {
            repeat(sizePassword) {
                val randomArray = variant.random()
                val randomChar = randomArray.random()
                password += randomChar
            }
            println("Ваш пароль: $password")
        }
    } while (sizePassword < 6)
}