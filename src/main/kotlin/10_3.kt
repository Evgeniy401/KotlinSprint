package org.example

fun main() {
    println("Введите количество символов, которое должен содержать пароль:")
    val inputLengthPassword = readln().toInt()

    val password = generatePassword(inputLengthPassword)
    println("Ваш пароль: $password")
}

fun generatePassword(passwordLength: Int): String {
    val digits = '0'..'9'
    val specialSymbols = listOf('!', ',', '\"', '#', '\$', '%', '&', '\'', '(', ')', '*', '+', '.', '-', '/', ' ')
    val password: MutableList<Char> = mutableListOf()

    while (password.size < passwordLength) {
        password.add(digits.random())
        if (password.size < passwordLength) {
            password.add(specialSymbols.random())
        }
    }
    return password.joinToString("")
}
