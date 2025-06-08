package org.example

fun main() {

    var isAuthorizationSuccessful = false

    while (!isAuthorizationSuccessful) {
        println("Введите логин:")
        val inputLogin = readln()

        println("Введите пароль:")
        val inputPassword = readln()

        isAuthorizationSuccessful = validateInput(inputLogin, inputPassword)
    }
}

fun validateInput(inputLogin: String, inputPassword: String): Boolean {

    return if (inputLogin.length < MIN_LENGTH || inputPassword.length < MIN_LENGTH) {
        println("Ошибка! Логин или пароль содержат менее четырех символов")
        false
    } else {
        println("Успешная авторизация!")
        true
    }
}

const val MIN_LENGTH = 4