package org.example

fun main() {
    var isAuthorizationSuccessful = false

    while (!isAuthorizationSuccessful) {
        println("Введите логин:")
        val inputLogin = readln()

        println("Введите пароль:")
        val inputPassword = readln()

        isAuthorizationSuccessful = validateInput(inputLogin) && validateInput(inputPassword)
        if (!isAuthorizationSuccessful) {
            println("Ошибка! Логин или пароль содержат менее $MIN_LENGTH символов")
        } else {
            println("Успешная авторизация!")
        }
    }
}

fun validateInput(input: String): Boolean {
    return input.length >= MIN_LENGTH
}

const val MIN_LENGTH = 4