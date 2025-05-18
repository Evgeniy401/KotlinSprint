package org.example.lesson_7

fun main() {

    var code: Int
    var inputCode: Int

    do {
        code = (1000..9999).random()
        println("Ваш код авторизации N: $code")
        println("Введите код")
        inputCode = readln().toInt()

        if (inputCode == code) {
            println("Вы успешно авторизованы")

        } else {
            println("Неверный код, попробуйте ещё раз\n")
        }

    } while (inputCode != code)

}