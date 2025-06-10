package org.example

fun main() {
    var isAuthorizationSuccessful = false

    while (!isAuthorizationSuccessful) {
        println("Введите логин:")
        val inputLogin = readln()

        println("Введите пароль:")
        val inputPassword = readln()

        isAuthorizationSuccessful = validateInput(inputLogin, inputPassword, MIN_LENGTH)
    }
}

fun validateInput(inputLogin: String, inputPassword: String, minLength: Int): Boolean {
    return if (inputLogin.length < minLength || inputPassword.length < minLength) {
        println("Ошибка! Логин или пароль содержат менее $minLength символов")
        false
    } else {
        println("Успешная авторизация!")
        true
    }
}

const val MIN_LENGTH = 4