package org.example.lesson_7

fun main() {

    while (true) {
        val code = (1000..9999).random()
        println("Ваш код авторизации: $code")

        println("\nВведите код из СМС для авторизации:")
        val inputCode = readln().toInt()

        if (inputCode == code) {
            println("Вы успешно авторизованы")
            break

        } else {
            println("Неверный код, попробуйте ещё раз\n")
        }
    }
}