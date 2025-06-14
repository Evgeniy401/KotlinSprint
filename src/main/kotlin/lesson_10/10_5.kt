package org.example.lesson_10

fun main() {

    println("Введите логин:")
    val inputLogin = readln()
    println("Введите пароль:")
    val inputPassword = readln()

    getBasket(userVerification(inputLogin, inputPassword))

}

fun userVerification(login: String, password: String): String =
    if (login == LOGIN && password == PASSWORD) tokenGeneration() else "0"

fun tokenGeneration(): String {
    val chars = 'a'..'z'
    val charsCapitals = 'A'..'Z'
    val digits = '0'..'9'
    val allVariants = (chars + charsCapitals + digits)
    val tokenList: MutableList<Char> = mutableListOf()

    for (i in 1..30)
        tokenList.add(allVariants.random())

    val token = tokenList.joinToString("")
    return token
}

fun getBasket(tokenVerification: String) {

    val basket = listOf("холодильник", "телефон", "кроссовки", "мяч", "стойка", "стул", "блокнот")

    if (tokenVerification == INVALID_TOKEN) {
        println("Неверный логин или пароль")
    } else {
        println(basket.joinToString(", "))
    }
}

const val LOGIN = "Hero of the sofa troops"
const val PASSWORD = "qW9@kP7pOvE2!"
const val INVALID_TOKEN = "0"