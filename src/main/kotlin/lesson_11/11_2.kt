package org.example.lesson_11

fun main() {

    val vasily = User2(1635131311, "vasily", "vre2357f", "vasily64626@gmail.com")

    vasily.userBio()
    vasily.changePassword()
    vasily.userInf()
}

class User2(val id: Int, val login: String, var password: String, var email: String, var bio: String = "homo sapiens") {

    fun userInf() {
        println(id)
        println(login)
        println(password)
        println(email)
        println(bio)
    }

    fun userBio() {
        println("Какакя ваша раса ?")
        bio = readln()
    }

    fun changePassword() {
        println("Введите текущий пароль:")
        val inputPassword = readln()
        if (inputPassword == password) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль успешно изменен")
        } else {
            println("Неверный пароль")
        }
    }
}